# Task Manager CRUD API

## Overview

Task Manager is a REST API built using Spring Boot that allows users to manage tasks efficiently. The application supports complete CRUD (Create, Read, Update, Delete) operations and stores data in a MySQL database.

## Features

* Create a new task
* View all tasks
* Update an existing task
* Delete a task
* Store task data in MySQL
* Test APIs using Postman

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Postman

## Project Structure

```text
src/main/java
│
├── controller
│     └── TaskController
│
├── service
│     └── TaskService
│
├── repository
│     └── TaskRepository
│
├── entity
│     └── Task
│
└── TaskmanagerApplication
```

## API Endpoints

### Create Task

```http
POST /tasks
```

Request Body:

```json
{
  "title": "Learn Spring Boot",
  "description": "Build CRUD Project",
  "completed": false
}
```

### Get All Tasks

```http
GET /tasks
```

### Update Task

```http
PUT /tasks/{id}
```

Request Body:

```json
{
  "title": "Updated Task",
  "description": "Updated Description",
  "completed": true
}
```

### Delete Task

```http
DELETE /tasks/{id}
```

## Database Configuration

Configure the following properties in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## How to Run

1. Clone the repository.
2. Create a MySQL database named `taskdb`.
3. Update database credentials in `application.properties`.
4. Run the Spring Boot application.
5. Test APIs using Postman.

## Learning Outcomes

Through this project, I learned:

* REST API development
* Spring Boot fundamentals
* Spring Data JPA and Hibernate
* MySQL integration
* Layered architecture (Controller-Service-Repository)
* API testing with Postman
* CRUD operations implementation

## Future Enhancements

* Get Task by ID
* Search Task by Title
* Task Priority
* Due Date Management
* User Authentication and Authorization

## Author

Rachana Shinde
Computer Engineering Student
Aspiring Backend Developer
