# springboot-postgresql-restapi
This is a demo project for Spring Boot API with PostgreSQL

### API Details ###
**Update employee resource** <br>
/api/v1/employees/{id} - *PUT* <br><br>
**Delete employee resource** <br>
/api/v1/employees/{id} - *DELETE* <br><br>
**Create a new phone number for an employee** <br>
/api/v1/employees/phone - *POST*<br><br>
**Update a phone number for an employee**<br>
/api/v1/employees/phone/{id} - *PUT*<br><br>
**Delete a phone number for an employee**<br>
/api/v1/employees/phone/{id} - *DELETE*

### Important Point ###
**Install Docker and execute below commands to install PostgreSQL DB**
- docker pull postgres
- docker run -d --name mypostgres -p 5432:5432 -e POSTGRES_PASSWORD=*yourpassword* postgres
- docker exec -it mypostgres bash
- psql -h localhost -U postgres -W
- CREATE DATABASE employees;
- \c employees
- Import Postman project (postman/RestAPI.postman_collection.json) in Postman App
