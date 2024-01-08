
# API with spring

This project is an API for restaurant reservations. you can create a user to have access to reservations, once registered you can make a reservation with the user authentication on a desired date and time and also include the number of guests. later you can update or delete the reservation.

This project is still in progress since there are still some details missing, such as validating date and time for booking, as well as including a payment method such as Paypal, among others.

## What can you do?

 - Create a user.
 - Log in.
 - View your reservations.
 - Create reservations.
 - Update or delete reservations.

## Necessary tools 

- Java 17
- IDE (IntelliJ IDEA)
- Database manager (Postgresql)

## Results in postman

#### Sing up 
```http
  http://localhost:8090/reserva/api/user/signup
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `name, rol, emai, cellphone, password` | `JSON` |  create user |

Result

```bash
  {
    "clientId": 48,
    "name": "your_name",
    "email": "your_email@gmail.com",
    "cellphone": "xxxxxxxxx",
    "password": "$2a$10$WzZ/nCjOtQM/OUq3OSUSc..v1lzp61OiqdNwVCGcCL.400gBXn1GO",
    "rol": "Costum"
}
```

#### Log in 
```http
  http://localhost:8090/reserva/api/user/login
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `emai, password` | `JSON` |  Login |

Result

```bash
  {
    "message": "Login exitoso",
    "email": "your_email@gmail.com",
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJ5b3VyX2VtYWlsQGdtYWlsLmNvbSIsImlzcyI6IlRoZUJicVBsYWNlIiwiaWF0IjoxNzA0NzU2MDQxLCJleHAiOjE3MDYwNTIwNDF9.2vduEaP2APGqTSQyDFLX3wwezlhizx5Shww1ca4YXAg"
}
```
