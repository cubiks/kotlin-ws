# Springboot w/ Kotlin

## Run

````
mvn clean install
mvn spring-boot:run

curl -iS localhost:8080/hello
HTTP/1.1 200
Content-Type: text/plain;charset=UTF-8
Content-Length: 11
Date: Sat, 23 Jun 2018 21:16:55 GMT

hello world
````