
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


#### Log in 
```http
  http://localhost:8090/reserva/api/user/login
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `emai, password` | `JSON` |  Login |
