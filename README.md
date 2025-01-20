# Programming Tutor

## Overview
Programming Tutor is a Spring Boot application designed to provide a platform for users to register, authenticate, and manage their profiles. The application leverages Spring Security for authentication and authorization, and it uses a relational database for storing user information.

## Features
- User Registration
- User Authentication
- Profile Management
- Secure Password Storage

## Technologies Used
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database (for development)
- MySQL (for production)
- Maven

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6.0 or higher
- MySQL (for production)

### Installation

1. **Clone the repository:**
    ```sh
    git clone https://github.com/yourusername/programming-tutor.git
    cd programming-tutor
    ```

2. **Configure the database:**
    Update the [application.properties](http://_vscodecontentref_/0) file with your database credentials.

    For H2 (development):
    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    ```

    For MySQL (production):
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
    spring.datasource.username=your_database_username
    spring.datasource.password=your_database_password
    spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
    ```

3. **Build the project:**
    ```sh
    ./mvnw clean install
    ```

4. **Run the application:**
    ```sh
    ./mvnw spring-boot:run
    ```

5. **Access the application:**
    Open your browser and navigate to `http://localhost:8080`.

## Running Tests
To run the tests, use the following command:
```sh
./mvnw test
```