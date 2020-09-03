create database restapitest;

\c restapitest;

create table product ( id bigserial, name varchar(100), price money, date date );

INSERT INTO product ( name, date, price) VALUES ('Madol Duwa', '1980-11-01', '90.00'), ('Gamperaliya', '2000-11-01', '10.00');