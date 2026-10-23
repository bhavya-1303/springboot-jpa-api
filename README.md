# Spring Boot JPA Employee Management API

## Project Overview

This project is a RESTful Employee Management API developed using Java and Spring Boot. It uses Spring Data JPA, Hibernate, and MySQL to perform CRUD (Create, Read, Update, Delete) operations on employee records.

## Features

- Create employee records
- Retrieve all employees
- Retrieve an employee by ID
- Update employee details
- Delete employee records
- Validate employee input
- Handle API exceptions
- Persist employee data in MySQL

## Technologies Used

- Java 17
- Spring Boot 3.4.12
- Spring Web
- Spring Data JPA
- Hibernate ORM
- MySQL 8
- Maven
- Git and GitHub

## Project Structure

```text
springboot-jpa-api/
├── src/
│   ├── main/
│   │   ├── java/com/business/api/
│   │   │   ├── controller/
│   │   │   ├── entity/
│   │   │   ├── exception/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── SpringbootJpaApiApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── .gitignore
├── pom.xml
└── README.md
```

## Database Setup

Create the database in MySQL:

```sql
CREATE DATABASE business_db;
```

The application connects to the `business_db` database. Configure your MySQL password using the `DB_PASSWORD` environment variable.

## How to Run

### 1. Clone the repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
cd springboot-jpa-api
```

Replace `YOUR_GITHUB_REPOSITORY_URL` with your actual GitHub repository URL.

### 2. Set the database password

In Windows PowerShell:

```powershell
$env:DB_PASSWORD = Read-Host "Enter your MySQL password"
```

### 3. Compile the project

```bash
mvn clean compile
```

### 4. Start the application

```bash
mvn spring-boot:run
```

The application runs at:

`http://localhost:8080`

## API Endpoints

| HTTP Method | Endpoint              | Description                |
| ----------- | --------------------- | -------------------------- |
| GET         | `/api/employees`      | Retrieve all employees     |
| GET         | `/api/employees/{id}` | Retrieve an employee by ID |
| POST        | `/api/employees`      | Create a new employee      |
| PUT         | `/api/employees/{id}` | Update an employee         |
| DELETE      | `/api/employees/{id}` | Delete an employee         |

## Sample Request

Use a POST request to `/api/employees` with this JSON body:

```json
{
  "name": "Bhavya",
  "email": "bhavya@example.com",
  "department": "IT",
  "salary": 35000
}
```

You can test the endpoints using Postman or PowerShell.

## Learning Outcomes

- Building RESTful APIs using Spring Boot
- Implementing layered application architecture
- Working with Spring Data JPA and Hibernate
- Integrating Java applications with MySQL
- Implementing CRUD operations
- Applying input validation and exception handling
- Using Git for version control

## Author

Bhavya
