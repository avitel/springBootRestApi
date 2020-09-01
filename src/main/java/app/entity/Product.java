package app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product {
    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("name")
    @Column(name="name")
    @NotBlank(message = "name can't be blank")
    private String name;

    @JsonProperty("date")
    @Column(name="date")
    private Date date;

    @JsonProperty("price")
    @Column(name="price")
    private BigDecimal price;

    public Product() {
    }

    public Product(Long id, String name, Date date, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPrice(String price) {
        this.price = new BigDecimal(price);
    }

    public void setId(Long id) {
        this.id = id;
    }
}
