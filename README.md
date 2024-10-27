API Documentation
Customers API
Get All Customers
Endpoint: GET /customers
Description: Retrieve a list of all customers.
Response: 200 OK, JSON array of customer objects.
Get Customer By ID
Endpoint: GET /customers/{id}
Description: Retrieve a customer by ID.
Parameters:
id (Long) - Customer ID.
Response: 200 OK, JSON of the customer object or 404 Not Found if not found.
Create Customer
Endpoint: POST /customers
Description: Create a new customer.
Body: JSON of the customer object.
Response: 201 Created, JSON of the created customer.
Update Customer
Endpoint: PUT /customers
Description: Update an existing customer.
Body: JSON of the customer object with updated fields.
Response: 200 OK, JSON of the updated customer.
Delete Customer
Endpoint: DELETE /customers/{id}
Description: Delete a customer by ID.
Parameters:
id (Long) - Customer ID.
Response: 204 No Content.
Payment Types API
Get All Payment Types
Endpoint: GET /paymenttypes
Description: Retrieve a list of all payment types.
Response: 200 OK, JSON array of payment method objects.
Get Payment Type By ID
Endpoint: GET /paymenttypes/{id}
Description: Retrieve a payment type by ID.
Parameters:
id (Long) - Payment Type ID.
Response: 200 OK, JSON of the payment type object or 404 Not Found.
Create Payment Type
Endpoint: POST /paymenttypes
Description: Create a new payment type.
Body: JSON of the payment type object.
Response: 201 Created, JSON of the created payment type.
Update Payment Type
Endpoint: PUT /paymenttypes/{id}
Description: Update an existing payment type by ID.
Parameters:
id (Long) - Payment Type ID.
Body: JSON of the updated payment type object.
Response: 200 OK, JSON of the updated payment type.
Delete Payment Type
Endpoint: DELETE /paymenttypes/{id}
Description: Delete a payment type by ID.
Parameters:
id (Long) - Payment Type ID.
Response: 204 No Content.
Products API
Create Product
Endpoint: POST /products/create
Description: Create a new product.
Parameters:
name (String) - Product name.
description (String) - Product description.
price (Double) - Product price.
stockQuantity (Integer) - Initial stock quantity.
codeBar (String) - Product barcode.
Response: 200 OK, message "producto creado".
Get List of Products for Testing
Endpoint: POST /products/getListFast
Description: Retrieve a predefined list of products for testing.
Response: 200 OK, JSON array of product DTOs.
Get List of Products
Endpoint: POST /products/getList
Description: Retrieve a list of products from the database, limited to 25.
Response: 200 OK, JSON array of product DTOs.
Get All Products
Endpoint: POST /products/getAll
Description: Retrieve a full list of products.
Response: 200 OK, JSON array of product objects.
Get Product By Code Bar
Endpoint: GET /products/getByCodeBar
Parameters:
codeBar (String) - Product barcode.
Response: 200 OK, JSON of the product DTO or 404 Not Found.
Get Products By Name
Endpoint: GET /products/getByName
Parameters:
name (String) - Partial name of the product to search for.
Response: 200 OK, JSON array of product DTOs or 404 Not Found.
Delete Products By Condition
Endpoint: POST /products/borrar
Description: Delete products with id_product greater than 520 and return a summary.
Response: 200 OK, summary message with the number of products deleted and remaining.
Sales API
Get All Sales
Endpoint: GET /sales
Description: Retrieve a list of all sales.
Response: 200 OK, JSON array of sale objects.
Get Sale By ID
Endpoint: GET /sales/{id}
Description: Retrieve a sale by ID.
Parameters:
id (Long) - Sale ID.
Response: 200 OK, JSON of the sale object or 404 Not Found.
Create Sale
Endpoint: POST /sales/doSale
Description: Create a new sale.
Body: JSON of the sale object.
Response: 201 Created, JSON of the created sale.
Update Sale
Endpoint: PUT /sales
Description: Update an existing sale.
Body: JSON of the sale object with updated fields.
Response: 200 OK, JSON of the updated sale.
Delete Sale
Endpoint: DELETE /sales/{id}
Description: Delete a sale by ID.
Parameters:
id (Long) - Sale ID.
Response: 204 No Content.