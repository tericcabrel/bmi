# Body Mass Index Calculator

This is a Web application to calculate you body mass index built with Spring Boot


## Prerequisites
* JDK 8+
* Apache Maven 3.5+
* Node.js 12+

## Tech stack
* Spring Boot 2.6.7
* Thymeleaf 2.6.7
* Tailwind CSS 3.0.24

## Setup
Install Maven dependencies
```shell
mvn install
```

Install the Node dependencies for Tailwind CSS
```shell
yarn install #or npm install
```

Run Tailwind CSS watcher to generate the CSS required by the HTML page
```shell
yarn css
```

Run the application
```shell
mvn spring-boot:run
```
Navigate to the URL `http://localhost:8000` and enjoy

Run the tests
```shell
mvn test
```

## Packaging
Package the application to a .jar file
```shell
mvn clean package
```

Run the generated .jar file in the target folder
```shell
java -jar target/bmi-1.0.jar
```
