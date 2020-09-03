This is simple example of storage with REST API. It can do CRUD operations with proper answers.
Project is based on Spring Boot and Hibernate.
Project is built on Gradle.
How to run:
1. Install docker
1. Load images from directory "/dockerImages" postgres.tar and springboot.tar to docker.
2. In directory "/dockerImages" run command docker-compose up
4. Test REST api on localhost:8080/product/  . Database contains records with ids 1 to 3. 

     