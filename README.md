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

 ```bash
cd matrix-fibonacci

mvn clean package
```
## Running the APP

1. Start the server
 ```bash
java -jar target/SpringTestAPI-0.0.1-SNAPSHOT.jar`
 ```

## API Documentation

### /authenticate
This endpoint is used to authenticate with the server and obtain a JWT token.


```css
POST /authenticate HTTP/1.1
Content-Type: application/json

{
"username": "your-username",
"password": "your-password"
}
```
```css
HTTP/1.1 200 OK
Content-Type: application/json

{
"jwt": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ5b3VyLXVzZXJuYW1lIiwiaWF0IjoxNTE2MjM5MDIyLCJleHAiOjE1MTYyNDM4MjJ9.8UPsLs48QZcLlZ3qJRL43BVLv97GwtprcbxrtT-AwFM"
}
```
The response contains a JWT token that can be used to authenticate subsequent API requests.

## /spiral
This endpoint generates a spiral matrix of Fibonacci numbers. The size of rows and cols for the matrix is specified as a query parameter in the API request.

#### Request
```css
GET /spiral?row=5&col=5
Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ5b3VyLXVzZXJuYW1lIiwiaWF0IjoxNTE2MjM5MDIyLCJleHAiOjE1MTYyNDM4MjJ9.8UPsLs48QZcLlZ3qJRL43BVLv97GwtprcbxrtT-AwFM
```
#### Response
```javascript
{"matrix":[[0,1,1,2,3],[610,987,1597,2584,5],[377,28657,46368,4181,8],[233,17711,10946,6765,13],[144,89,55,34,21]]}
```

## Frontend Client

A sample HTML file that uses jQuery to consume the Fibonacci Spiral API is provided in the frontend directory. 
To use the frontend client, open the `frontend/index.html` file in your web browser and follow the instructions.


## Running with Docker

1. Build the Docker image:
```bash
cd matrix-fibonacci
docker build -t fibonacci-spiral-matrix .
```

2. Run the docker container
```bash
   docker run -p 8080:8080 fibonacci-spiral-matrix
```
