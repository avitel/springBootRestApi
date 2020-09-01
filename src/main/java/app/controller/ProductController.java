package app.controller;

import app.entity.Product;
import app.exceptions.ResourceNotFoundException;
import app.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductRepository repository;

    @Autowired
    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/{id}")
    public Product find(@PathVariable("id") Long id) {
        return repository.findById(id).orElseThrow(()->new ResourceNotFoundException("id " + id + " not found"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody @Valid Product product) {
        Product savedProduct = repository.save(product);
        return savedProduct.getId();
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) Long id, @RequestBody Product product) {
        repository.findById(id).orElseThrow(()->new ResourceNotFoundException("id " + id + " not found"));
        product.setId(id);
        repository.save(product);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        repository.findById(id).orElseThrow(()->new ResourceNotFoundException("id " + id + " not found"));
        repository.deleteById(id);
    }
}
