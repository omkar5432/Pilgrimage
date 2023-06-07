<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
     <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  <title>Payment</title>
  <style type="text/css">
  .container {
  width: 400px;
  margin: 0 auto;
  padding: 20px;
  background-color: #f0f0f0;
  border-radius: 5px;
}

h1 {
  text-align: center;
}

.form-group {
  margin-bottom: 15px;
}

label {
  display: block;
  font-weight: bold;
}

input[type="text"] {
  width: 100%;
  padding: 10px;
  border-radius: 3px;
  border: 1px solid #ccc;
}

button[type="submit"] {
  width: 100%;
  padding: 10px;
  background-color: #007bff;
  color: #fff;
  border: none;
  border-radius: 3px;
  cursor: pointer;
}

button[type="submit"]:hover {
  background-color: #0069d9;
}
  
  </style>
</head>
<body>
  <div class="container">
    <h1>Payment</h1>
    <form action="payment" method="post">
      <div class="form-group">
        <label for="card-number">Card Number</label>
        <input type="text" id="card-number" name="card-number" placeholder="Enter your card number">
      </div>
      <div class="form-group">
        <label for="card-name">Cardholder Name</label>
        <input type="text" id="card-name" name="card-name" placeholder="Enter the cardholder's name">
      </div>
      <div class="form-group">
        <label for="expiry-date">Expiry Date</label>
        <input type="text" id="expiry-date" name="expiry-date" placeholder="MM/YY">
      </div>
      <div class="form-group">
        <label for="cvv">CVV</label>
        <input type="text" id="cvv" name="cvv" placeholder="Enter the CVV">
      </div>
      <button type="submit">Pay Now</button>
    </form>
  </div>
</body>
</html>