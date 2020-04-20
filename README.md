# REST Demo for OmniLatam

## How to run:

```shell script
./gradlew bootRun
```

Runs by default on port `8080`

## Structure:

`config` contains a small config change in serialization to pickup a time module.

`model` contains the JPA Entities with the relationships expressed as annotations.

`repository` contains a set of interfaces that Spring will pickup and use to generate repositories that access the data.

This project uses HAL and HATEOAS for the REST interface.

The available endpoints are 

* `/api/v1/users` : Operations on User (GET, POST PUT, DELETE)
* `/api/v1/products`: Operaitons on Product
* `/api/v1/categories`: Operations on Categories
* `/api/v1/users/{id}/products`: Operations on Products belonging to a User
* `/api/v1/products/{id}/categories`: Operations on Categories of a product
