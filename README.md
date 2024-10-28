# PrivatePOSBack

## Description/Descripción

### English
The present repository is the back end of a POS 
(Point of Sale) application. It is essentially 
the cash register application, so to speak. 
All documentation will be in English and Spanish. 
More endpoints can be created as needed.

### Castellano
El presente repositorio es el back end de una 
aplicación POS (Point of sale, Punto de venta). 
Es la aplicación de la caja registradora, por 
así decirlo. 
Toda la documentación estará en 
inglés y castellano. Se pueden crear más 
endpoints a medida que se van necesitando.

## Index / Índice
1. [Customer / Cliente](#customercontroller)
2. [Payment Type / Método de Pago](#paymenttypecontroller)
3. [Products / Productos](#productcontroller)
4. [Sales / Ventas](#salescontroller)
5. [SalesItem / Detalles de Venta](#salesitemcontroller)
6. [Stock](#stockcontroller)
7. [Category / Categoría](#categorycontroller)

---

## CustomerController

### English
**Table**: `customers`

#### Description
This controller manages customer-related operations.  
The `Customer` entity contains client data, including personal information and contact details.

- **Attributes**:
  - `id`: Unique identifier.
  - `firstName`, `lastName`: First name and last name.
  - `address`, `streetName`, `postalCode`, `city`: Address and location details.
  - `email`, `phoneNumber`: Contact information.
  - `isEnabled`: Indicates if the customer is enabled.
  - `idNumber`, `taxNumber`: Tax identification numbers.
- **Relationships**:
  - `List<Sale> sales`: One-to-many relationship with `Sale`.
  - `Owner owner`: Many-to-one relationship with `Owner`, indicating the owner of the customer in the system.

#### Endpoints
- **GET /customers**
  - Retrieves all customers.
- **GET /customers/get/{id}**
  - Retrieves a specific customer by ID.
- **POST /customers/create**
  - Creates a new customer.
- **PUT /customers/modify/{id}**
  - Updates an existing customer.
- **DELETE /customers/delete/{id}**
  - Deletes a customer by ID.

---

### Castellano
**Tabla**: `customers`

#### Descripción
Este controlador gestiona las operaciones relacionadas con los clientes.  
La entidad `Customer` contiene datos del cliente, incluyendo información personal y detalles de contacto.

- **Atributos**:
  - `id:` Identificador único.
  - `firstName, lastName:` Nombre y apellido.
  - `address, streetName, postalCode, city:` Dirección y ubicación.
  - `email, phoneNumber:` Contacto.
  - `isEnabled:` Estado de habilitación del cliente.
  - `idNumber, taxNumber:` Identificaciones fiscales.
- **Relaciones**:
  - `List<Sale> sales:` Relación uno-a-muchos con `Sale`.
  - `Owner owner:` Relación muchos-a-uno con `Owner`, que indica el dueño del cliente en el sistema.

#### Puntos de entrada
- **GET /customers**
  - Recupera todos los clientes.
- **GET /customers/get/{id}**
  - Recupera un cliente específico por ID.
- **POST /customers/create**
  - Crea un nuevo cliente.
- **PUT /customers/modify/{id}**
  - Actualiza un cliente existente.
- **DELETE /customers/delete/{id}**
  - Elimina un cliente por ID.

---

## PaymentTypeController

### English
**Table**: `payment_methods`

#### Description
Defines the payment methods accepted by the company (cash, card, etc.).

- **Attributes**:
  - `id`: Unique identifier.
  - `name`: Name of the payment method.
  - `code`: Optional code.
  - `shortcutKey`: Shortcut key.
  - `ordinal`: Priority within the payment system.
  - `isEnabled`: Indicates if the payment method is enabled.
- **Relationships**:
  - `Owner owner`: Many-to-one relationship with `Owner`.

#### Endpoints
- **GET /paymenttypes**
  - Retrieves all payment methods.
- **GET /paymenttypes/get/{id}**
  - Retrieves a specific payment method by ID.
- **POST /paymenttypes/create**
  - Creates a new payment method.
- **PUT /paymenttypes/modify/{id}**
  - Updates an existing payment method.
- **DELETE /paymenttypes/delete/{id}**
  - Deletes a payment method by ID.

---

### Castellano
**Tabla**: `payment_methods`

#### Descripción
Define los métodos de pago que la empresa acepta (efectivo, tarjeta, etc.).

- **Atributos**:
  - `id`: Identificador único.
  - `name`: Nombre del método de pago.
  - `code`: Código opcional.
  - `shortcutKey`: Tecla de acceso directo.
  - `ordinal`: Prioridad en el sistema de pagos.
  - `isEnabled`: Estado de habilitación.
- **Relaciones**:
  - `Owner owner`: Relación muchos-a-uno con `Owner`.

#### Puntos de entrada
- **GET /paymenttypes**
  - Recupera todos los métodos de pago.
- **GET /paymenttypes/get/{id}**
  - Recupera un método de pago específico por ID.
- **POST /paymenttypes/create**
  - Crea un nuevo método de pago.
- **PUT /paymenttypes/modify/{id}**
  - Actualiza un método de pago existente.
- **DELETE /paymenttypes/delete/{id}**
  - Elimina un método de pago por ID.

---

## ProductController

### English
**Table**: `products`

#### Description
This controller manages operations related to `products`.  
The `Product` entity represents the products the company sells.

- **Attributes**:
  - `id_product`: Unique identifier.
  - `product_number`, `codeBar`: Product number and barcode.
  - `name`, `description`: Name and description.
  - `cost`, `price`, `profit_margin`: Cost, price, and profit margin.
- **Relationships**:
  - `Category category`: Many-to-one relationship with `Category`.
  - `Company company`: Many-to-one relationship with `Company`.
  - `Stock stock`: One-to-one relationship with `Stock`.
  - `Owner owner`: Many-to-one relationship with `Owner`.

#### Endpoints
- **POST /products/getListFast**
  - Retrieves a predefined list of products for testing.
- **POST /products/create**
  - Creates a new product.
- **POST /products/getList**
  - Retrieves a limited list of products.
- **POST /products/getAll**
  - Retrieves all products.
- **GET /products/getByCodeBar**
  - Retrieves a product by its barcode.
- **GET /products/getByName**
  - Retrieves products by name.
- **POST /products/deleteAll**
  - Deletes all products with IDs greater than 520.

---

### Castellano
**Tabla**: `products`

#### Descripción
Este controlador gestiona las operaciones relacionadas con los `productos`.  
La entidad `Product` representa los productos que la empresa vende.

- **Atributos**:
  - `id_product`: Identificador único.
  - `product_number`, `codeBar`: Código de barras y número de producto.
  - `name`, `description`: Nombre y descripción.
  - `cost`, `price`, `profit_margin`: Costo, precio y margen de beneficio.
- **Relaciones**:
  - `Category category`: Relación muchos-a-uno con `Category`.
  - `Company company`: Relación muchos-a-uno con `Company`.
  - `Stock stock`: Relación uno-a-uno con `Stock`.
  - `Owner owner`: Relación muchos-a-uno con `Owner`.

#### Puntos de entrada
- **POST /products/getListFast**
  - Recupera una lista predefinida de productos para pruebas.
- **POST /products/create**
  - Crea un nuevo producto.
- **POST /products/getList**
  - Recupera una lista limitada de productos.
- **POST /products/getAll**
  - Recupera todos los productos.
- **GET /products/getByCodeBar**
  - Recupera un producto por su código de barras.
- **GET /products/getByName**
  - Recupera productos por nombre.
- **POST /products/deleteAll**
  - Elimina todos los productos con ID superiores a 520.

---

## SalesController

### English
**Table**: `sales`

#### Description
This controller manages sales-related operations.  
The `Sale` entity represents a complete sales transaction.

- **Attributes**:
  - `id`: Unique identifier.
  - `sale_number`: Sale number.
  - `status`: Sale status.
  - `totalAmount`: Total amount.
- **Relationships**:
  - `List<SaleItem> saleItems`: One-to-many relationship with `SaleItem`.
  - `Customer customer`: Many-to-one relationship with `Customer`.
  - `User seller`: Many-to-one relationship with `User`.
  - `Owner owner`: Many-to-one relationship with `Owner`.

#### Endpoints
- **GET /sales**
  - Retrieves all sales.
- **GET /sales/{id}**
  - Retrieves a specific sale by ID.
- **POST /sales/doSale**
  - Creates a new sale.
- **PUT /sales**
  - Updates an existing sale.
- **DELETE /sales/{id}**
  - Deletes a sale by ID.

---

### Castellano
**Tabla**: `sales`

#### Descripción
Este controlador gestiona las operaciones relacionadas con `ventas`.  
La entidad `Sale` representa una transacción de venta completa.

- **Atributos**:
  - `id`: Identificador único.
  - `sale_number`: Número de venta.
  - `status`: Estado de la venta.
  - `totalAmount`: Monto total.
- **Relaciones**:
  - `List<SaleItem> saleItems`: Relación uno-a-muchos con `SaleItem`.
  - `Customer customer`: Relación muchos-a-uno con `Customer`.
  - `User seller`: Relación muchos-a-uno con `User`.
  - `Owner owner`: Relación muchos-a-uno con `Owner`.

#### Puntos de entrada
- **GET /sales**
  - Recupera todas las ventas.
- **GET /sales/{id}**
  - Recupera una venta específica por ID.
- **POST /sales/doSale**
  - Crea una nueva venta.
- **PUT /sales**
  - Actualiza una venta existente.
- **DELETE /sales/{id}**
  - Elimina una venta por ID.

---

# SalesItemController

### English

## Description
The `SalesItemController` manages individual sale item operations, allowing CRUD operations on sales items, linking them to specific sales records, and ensuring accurate sale details.

## Endpoints
### `GET /sales-items`
- **Description**: Retrieves a list of all sales items.
- **Response**: A JSON array of sales items.

### `GET /sales-items/{id}`
- **Description**: Fetches details of a specific sales item by its ID.
- **Parameters**: 
  - `id`: The ID of the sales item.
- **Response**: A JSON object representing the sales item.

### `POST /sales-items`
- **Description**: Creates a new sales item.
- **Request Body**: A JSON object representing the new sales item.
- **Response**: The created sales item object.

### `PUT /sales-items/{id}`
- **Description**: Updates an existing sales item.
- **Parameters**: 
  - `id`: The ID of the sales item to update.
- **Request Body**: A JSON object with updated details.
- **Response**: The updated sales item object.

### `DELETE /sales-items/{id}`
- **Description**: Deletes a specific sales item.
- **Parameters**: 
  - `id`: The ID of the sales item to delete.
- **Response**: A success message or status.

---

### Castellano

## Descripción
El `SalesItemController` gestiona las operaciones individuales de los elementos de venta, permitiendo operaciones CRUD en los artículos de venta, vinculándolos a registros de venta específicos y asegurando detalles precisos de las ventas.

## Endpoints
### `GET /sales-items`
- **Descripción**: Recupera una lista de todos los elementos de venta.
- **Respuesta**: Un arreglo JSON de artículos de venta.

### `GET /sales-items/{id}`
- **Descripción**: Obtiene los detalles de un artículo de venta específico por su ID.
- **Parámetros**: 
  - `id`: El ID del artículo de venta.
- **Respuesta**: Un objeto JSON que representa el artículo de venta.

### `POST /sales-items`
- **Descripción**: Crea un nuevo artículo de venta.
- **Cuerpo de la solicitud**: Un objeto JSON que representa el nuevo artículo de venta.
- **Respuesta**: El objeto del artículo de venta creado.

### `PUT /sales-items/{id}`
- **Descripción**: Actualiza un artículo de venta existente.
- **Parámetros**: 
  - `id`: El ID del artículo de venta a actualizar.
- **Cuerpo de la solicitud**: Un objeto JSON con detalles actualizados.
- **Respuesta**: El objeto del artículo de venta actualizado.

### `DELETE /sales-items/{id}`
- **Descripción**: Elimina un artículo de venta específico.
- **Parámetros**: 
  - `id`: El ID del artículo de venta a eliminar.
- **Respuesta**: Un mensaje de éxito o estado.

---

# StockController

### English

## Description
The `StockController` is responsible for managing inventory levels, including adding new stock, updating existing stock quantities, and retrieving current stock information.

## Endpoints
### `GET /stocks`
- **Description**: Retrieves a list of all stock items.
- **Response**: A JSON array of stock items.

### `GET /stocks/{id}`
- **Description**: Fetches details of a specific stock item by its ID.
- **Parameters**: 
  - `id`: The ID of the stock item.
- **Response**: A JSON object representing the stock item.

### `POST /stocks`
- **Description**: Adds new stock to inventory.
- **Request Body**: A JSON object representing the new stock item.
- **Response**: The created stock item object.

### `PUT /stocks/{id}`
- **Description**: Updates stock quantity for an existing item.
- **Parameters**: 
  - `id`: The ID of the stock item to update.
- **Request Body**: A JSON object with updated stock details.
- **Response**: The updated stock item object.

### `DELETE /stocks/{id}`
- **Description**: Removes a specific stock item from inventory.
- **Parameters**: 
  - `id`: The ID of the stock item to delete.
- **Response**: A success message or status.

---

### Castellano

## Descripción
El `StockController` es responsable de gestionar los niveles de inventario, incluyendo agregar nuevo stock, actualizar cantidades de stock existentes y recuperar información actual de inventario.

## Endpoints
### `GET /stocks`
- **Descripción**: Recupera una lista de todos los elementos de stock.
- **Respuesta**: Un arreglo JSON de elementos de stock.

### `GET /stocks/{id}`
- **Descripción**: Obtiene los detalles de un elemento de stock específico por su ID.
- **Parámetros**: 
  - `id`: El ID del elemento de stock.
- **Respuesta**: Un objeto JSON que representa el elemento de stock.

### `POST /stocks`
- **Descripción**: Agrega nuevo stock al inventario.
- **Cuerpo de la solicitud**: Un objeto JSON que representa el nuevo elemento de stock.
- **Respuesta**: El objeto del elemento de stock creado.

### `PUT /stocks/{id}`
- **Descripción**: Actualiza la cantidad de stock para un elemento existente.
- **Parámetros**: 
  - `id`: El ID del elemento de stock a actualizar.
- **Cuerpo de la solicitud**: Un objeto JSON con detalles de stock actualizados.
- **Respuesta**: El objeto del elemento de stock actualizado.

### `DELETE /stocks/{id}`
- **Descripción**: Elimina un elemento de stock específico del inventario.
- **Parámetros**: 
  - `id`: El ID del elemento de stock a eliminar.
- **Respuesta**: Un mensaje de éxito o estado.

---

# CategoryController

### English

## Description
The `CategoryController` manages product categories, allowing you to create, view, update, and delete product categories for better inventory organization.

## Endpoints
### `GET /categories`
- **Description**: Retrieves a list of all product categories.
- **Response**: A JSON array of categories.

### `GET /categories/{id}`
- **Description**: Fetches details of a specific category by its ID.
- **Parameters**: 
  - `id`: The ID of the category.
- **Response**: A JSON object representing the category.

### `POST /categories`
- **Description**: Creates a new product category.
- **Request Body**: A JSON object representing the new category.
- **Response**: The created category object.

### `PUT /categories/{id}`
- **Description**: Updates an existing product category.
- **Parameters**: 
  - `id`: The ID of the category to update.
- **Request Body**: A JSON object with updated category details.
- **Response**: The updated category object.

### `DELETE /categories/{id}`
- **Description**: Deletes a specific product category.
- **Parameters**: 
  - `id`: The ID of the category to delete.
- **Response**: A success message or status.

---

### Castellano

## Descripción
El `CategoryController` gestiona las categorías de productos, permitiendo crear, ver, actualizar y eliminar categorías de productos para una mejor organización del inventario.

## Endpoints
### `GET /categories`
- **Descripción**: Recupera una lista de todas las categorías de productos.
- **Respuesta**: Un arreglo JSON de categorías.

### `GET /categories/{id}`
- **Descripción**: Obtiene los detalles de una categoría específica por su ID.
- **Parámetros**: 
  - `id`: El ID de la categoría.
- **Respuesta**: Un objeto JSON que representa la categoría.

### `POST /categories`
- **Descripción**: Crea una nueva categoría de producto.
- **Cuerpo de la solicitud**: Un objeto JSON que representa la nueva categoría.
- **Respuesta**: El objeto de la categoría creada.

### `PUT /categories/{id}`
- **Descripción**: Actualiza una categoría de producto existente.
- **Parámetros**: 
  - `id`: El ID de la categoría a actualizar.
- **Cuerpo de la solicitud**: Un objeto JSON con detalles de la categoría actualizados.
- **Respuesta**: El objeto de la categoría actualizada.

### `DELETE /categories/{id}`
- **Descripción**: Elimina una categoría de producto específica.
- **Parámetros**: 
  - `id`: El ID de la categoría a eliminar.
- **Respuesta**: Un mensaje de éxito o estado.

---
