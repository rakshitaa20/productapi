Product REST API

This is a simple Spring Boot backend application that manages products using in-memory storage.

Features:
- Add a new product
- Get product by ID
- Input validation for product fields

Technology Stack:
- Java
- Spring Boot
- REST API
- Maven

How to run the project:
1. Clone the repository
2. Open the project in IDE
3. Run the main class: ProductapiApplication
4. Server will start at: http://localhost:8080

API Endpoints:

1. Add Product
POST /products

Request body:
{
  "name": "Product name",
  "price": 1000,
  "description": "Product description"
}

2. Get Product by ID
GET /products/{id}

Example:
GET /products/1

Note:
This application uses in-memory storage, so data will be lost when the server restarts.
