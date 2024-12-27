# Spring Boot Product API

## Setup Instructions

1. Clone the repository:
   git clone https://github.com/ashenbgy/springboot-product-api.git
   cd springboot-product-api

2. Build and run the project

3. Access the H2 Console:

  URL: http://localhost:8080/h2-console
  JDBC URL: jdbc:h2:mem:testdb
  Username: sa
  Password:

4. Test the API:

Endpoint: [POST /products]
http://localhost:8080/products/save-product

  Example Request:
  
    {
      "name": "Sample Product",
      "price": 20.00
    }
    
  Response:
    
    {
      "id": 1,
      "name": "Sample Product",
      "price": 20.00,
      "createdAt": "2024-12-27T10:00:00"
    }
  
5. Dependencies
   * Spring Boot 3.x
   * H2 Database
   * Maven/Gradle

Notes
  * Ensure Java 17+ is installed to run this application.
