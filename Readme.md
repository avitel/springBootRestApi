This is simple example of storage with REST API. It can do CRUD operations with proper answers.
Project is based on Spring Boot and Hibernate.
How to run:
1. run postgres on port 5432 with user=postgres and pass=admin
2. run scripts

create database restapitest

create table product
   (
     id bigserial,
     name varchar(100),
     price money,
     date date
   );
   
INSERT INTO product (
      name, date, price)
   VALUES ('Madol Duwa', '1980-11-01', '90.00'),
          ('Gamperaliya', '2000-11-01', '10.00');
          
3. run Application
4. test REST api on localhost:8080/product/  

     