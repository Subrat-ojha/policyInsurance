# Policy Insurance Project

A Spring Boot-based Policy Insurance application with RESTful APIs for customer management.

## Features

- **RESTful API Endpoints**:
  - Welcome endpoint with session ID
  - Customer management (add, list)
  - CSRF token retrieval

- **Security**:
  - Spring Security integration
  - CSRF protection

- **API Documentation**:
  - Swagger/OpenAPI documentation
  - Interactive API testing through Swagger UI

## Technology Stack

- **Backend**: 
  - Spring Boot 4.0.0
  - Spring Security
  - Spring Web MVC

- **Documentation**:
  - SpringDoc OpenAPI 2.2.0
  - Swagger UI

- **Build Tool**: Maven

## API Documentation

After starting the application, access the following:

- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **OpenAPI JSON**: http://localhost:8080/v3/api-docs

## Available Endpoints

- `GET /api/` - Welcome message with session ID
- `POST /api/cust` - Add a new customer
- `GET /api/custall` - Get all customers
- `GET /api/csrftoken` - Get CSRF token

## Getting Started

1. **Prerequisites**:
   - Java 17 or higher
   - Maven 3.6.3 or higher

2. **Build and Run**:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

3. **Access the Application**:
   - Application will be available at: http://localhost:8080

## Project Structure

```
src/
├── main/
│   ├── java/com/nexx/policyinsurance/
│   │   ├── config/
│   │   │   └── OpenAPIConfig.java
│   │   └── controller/
│   │       ├── HomeController.java
│   │       └── Customer.java
│   └── resources/
└── test/
```

## Contact

For support, please contact: iamsubratojha@gmail.com

## License

This project is licensed under the Apache 2.0 License - see the [LICENSE](LICENSE) file for details.
