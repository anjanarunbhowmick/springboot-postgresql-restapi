# springboot-postgresql-restapi
This is a demo project for Spring Boot API with PostgreSQL

### API Details ###
** Update employee resource **
/api/v1/employees/{id} - * PUT *
** Delete employee resource **
/api/v1/employees/{id} - * DELETE *
** Create a new phone number for an employee **
/api/v1/employees/phone - * POST *
** Update a phone number for an employee **
/api/v1/employees/phone/{id} - * PUT *
** Delete a phone number for an employee **
/api/v1/employees/phone/{id} - * DELETE *

### Important Point ###
** Install Docker and execute below commands to install PostgreSQL DB **
- docker pull postgres
- docker run -d --name mypostgres -p 5432:5432 -e POSTGRES_PASSWORD=<yourpassword> postgres
- docker exec -it mypostgres bash
- psql -h localhost -U postgres -W
- CREATE DATABASE employees;
- \c employees
- Import Postman project (postman/RestAPI.postman_collection.json) in Postman App
