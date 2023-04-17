# Fibonacci Spiral Matrix


This project generates a spiral matrix with Fibonacci numbers and provides a REST API and a frontend client to display the matrix.

The API uses JWT token-based authentication to secure the API endpoints. Before making API calls, you need to authenticate with the server and obtain a JWT token.

## Prerequisites

- Java 11 or later
- Maven 3.6 or later
- Docker

## Building the Project

1. Clone the repository:

`git clone https://github.com/padagoal/matrix-fibonacci`

2. Build the project using Maven:

`cd fibonacci-spiral-matrix`

`mvn clean package`

## Running the APP

1. Start the server

`java -jar target/SpringTestAPI-0.0.1-SNAPSHOT.jar`





## API Documentation

### /authenticate
This endpoint is used to authenticate with the server and obtain a JWT token.


`POST /authenticate HTTP/1.1
Content-Type: application/json

{
"username": "your-username",
"password": "your-password"
}`

Frontend Client

A sample HTML file that uses jQuery to consume the Fibonacci Spiral API is provided in the frontend directory. 
To use the frontend client, open the `frontend/index.html` file in your web browser and follow the instructions.
