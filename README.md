# PrivatePOSBack

## Description/Descripción

### English
The present repository is the back end of a POS 
(Point of Sale) application. It is essentially 
the cash register application, so to speak. 
All documentation will be in English and Spanish. 
More endpoints can be created as needed.


### Spanish
El presente repositorio es el back end de una 
aplicación POS (Point of sale. Punto de venta). 
Es la apliación de la caja registradora, por 
así decirlo. Toda la documentación estará en 
inglés y castellano. Se pueden crear más 
endpoints a medida que se van necesitando.

## Index / Índice
*. [Category](#category)
*. [Company](#company)
1. [Customer / Cliente](#customerController)
2. [Payment Type / Método de Pago](#paymentTypeController)
4. [Owner](#owner)
6. [Product](#product)
7. [Sale](#sale)
8. [SaleItem](#saleitem)
9. [Stock](#stock)
10. [Tax](#tax)
11. [User](#user)


## CustomerController

### English


### Customer
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

---

#### Endpoints
- **GET /customers**
  - Retrieves all customers.
- **GET /customers/{id}**
  - Retrieves a specific customer by ID.
- **POST /customers**
  - Creates a new customer.
- **PUT /customers**
  - Updates an existing customer.
- **DELETE /customers/{id}**
  - Deletes a customer by ID.

### Spanish

### Cliente
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
  - `Owner owner:` Relación muchos-a-uno con Owner, que indica el dueño del cliente en el sistema.


#### Puntos de entrada
- **GET /customers**
  - Recupera todos los clientes.
- **GET /customers/{id}**
  - Recupera un cliente específico por ID.
- **POST /customers**
  - Crea un nuevo cliente.
- **PUT /customers**
  - Actualiza un cliente existente.
- **DELETE /customers/{id}**
  - Elimina un cliente por ID.

---

## PaymentTypeController

### English
### Payment Method
**Table**: `payment_methods`

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

---



#### Description
This controller manages payment method-related operations.

#### Endpoints
- **GET /paymenttypes**
  - Retrieves all payment methods.
- **GET /paymenttypes/{id}**
  - Retrieves a specific payment method by ID.
- **POST /paymenttypes**
  - Creates a new payment method.
- **PUT /paymenttypes/{id}**
  - Updates an existing payment method.
- **DELETE /paymenttypes/{id}**
  - Deletes a payment method by ID.

### Spanish

### Método de Pago
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

---



#### Puntos de entrada
- **GET /paymenttypes**
  - Recupera todos los métodos de pago.
- **GET /paymenttypes/{id}**
  - Recupera un método de pago específico por ID.
- **POST /paymenttypes**
  - Crea un nuevo método de pago.
- **PUT /paymenttypes/{id}**
  - Actualiza un método de pago existente.
- **DELETE /paymenttypes/{id}**
  - Elimina un método de pago por ID.

---

## ProductController

### English

#### Description
This controller manages product-related operations.

#### Endpoints
- **POST /products/getListFast**
  - Retrieves a fake list very quickly, 
ideal for front-end development, 
as it does not take time to fetch 
from the database but instead sends 
a hardcoded fake list.
- **POST /products/create**
  - Creates a new product.
- **POST /products/getListFast**
  - Retrieves a predefined list of products for testing.
- **POST /products/getList**
  - Retrieves a limited list of products.
- **POST /products/getAll**
  - Retrieves all products.
- **GET /products/getByCodeBar**
  - Retrieves a product by its barcode.
- **GET /products/getByName**
  - Retrieves products by name.
- **POST /products/borrar**
  - Deletes products with IDs greater than 520.

### Spanish

#### Descripción
Este controlador gestiona las operaciones relacionadas con los productos.

#### Puntos de entrada
- **POST /products/getListFast**
  - Obtiene una lista falsa muy rápido, 
ideal como para el desarrollo front, 
porque no demora en fetchear, al no 
buscar en la Base de Datos, si no enviar
una lista falsa Hard codeada.
- **POST /products/create**
  - Crea un nuevo producto.
- **POST /products/getListFast**
  - Recupera una lista predefinida de productos para pruebas.
- **POST /products/getList**
  - Recupera una lista limitada de productos.
- **POST /products/getAll**
  - Recupera todos los productos.
- **GET /products/getByCodeBar**
  - Recupera un producto por su código de barras.
- **GET /products/getByName**
  - Recupera productos por nombre.
- **POST /products/borrar**
  - Elimina productos con ID superiores a 520.

---

## SalesController

### English

#### Description
This controller manages sales-related operations.

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

### Spanish

#### Descripción
Este controlador gestiona las operaciones relacionadas con las ventas.

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