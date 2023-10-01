# Project Name
Order App (Weekly Test)

# Frameworks and Language Used
**Spring Boot** 3.1.4
**Java** 17
**Maven** 3.8.1

# Data Flow


_**Controller:**_ The controller has endpoints for adding a user, product, address, order , get user by id, get order by id, get product by category, delete product based on id. The @PostMapping annotation is used for the addUser, addProduct, addAddress, addOrder endpoint to handle HTTP POST requests with a JSON request body containing a user object. 
```
```
```
```
```
```
```
```

The @GetMapping annotation is used for the get/all/userby/id/{Id}, get/all/product/by/category/{category} and get/order/by/id/{Id} endpoints to handle HTTP GET requests with and without a path variable for the userId, productCategory, orderId. The @PathVariable annotation is used to extract the user ID, order ID from the request URL and pass it to the GetUserById and GetOrderById method.

The @DeleteMapping annotation is used for the delete/product/by/id/{Id} endpoint to handle HTTP DELETE requests with a path variable for the product ID.

The controller class also has an autowired instance of the UserService, ProductService, AddressService, OrderService interface to handle business logic for the Order App.

This implementation demonstrates a basic setup for a REST API controller in Spring Boot, but it can be expanded upon and customized based on specific requirements for the Order App.


_**Services**:_ The services layer contains the business logic of the application. It receives requests from the controller, performs necessary computations or data manipulations, and interacts with the repository layer to access data.

_**Repository:**_ The repository layer is responsible for interacting with the database. It uses Spring Data JPA to perform CRUD (create, read, update, delete) operations on entities.

In the application.properties all the text required for connection with h2 database are written.

# Database Structure Used
I have used MySQL as DataBase.

# Project Summary
In this project i have create different endpoints and used mappings between models like @OneToOne, @ManyToOne and @ManyToMany.
