# Spring Boot Product API

## Setup Instructions

1. Clone the repository:
    * git clone https://github.com/ashenbgy/springboot-product-api.git
    * cd springboot-product-api

2. Build and run the project

3. Access the H2 Console:
   * URL: http://localhost:8080/h2-console
   * JDBC URL: jdbc:h2:mem:testdb
   * Username: sa
   * Password:

4. Test the API:

   * Example Request for Save [POST /products]:
      > http://localhost:8080/products/save-product
   
      > {
         "name": "Sample Product",
         "price": 20.00
      }

   * Example Request for Get Products List with Pagination and Sorting:
      > http://localhost:8080/products/get-products?pageNo=0&pageSize=2&sortBy=name&asc=false
   
   * Example Request for Get Products List within a Price Range:
      > http://localhost:8080/products/get-price-range?startingPrice=1000&endPrice=2000
  
5. Dependencies
   * Spring Boot 3.x
   * H2 Database
   * Maven/Gradle

Notes
  * Ensure Java 17+ is installed to run this application.
