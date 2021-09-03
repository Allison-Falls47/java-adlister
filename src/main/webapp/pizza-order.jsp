<%--
  Created by IntelliJ IDEA.
  User: allison.falls
  Date: 9/3/21
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Order Form</title>
  </head>
  <body>
  <form method="POST" action="/pizza-order">

      <select name="crust">
          <option value="Rising">Rising Crust</option>
          <option value="Thin">Thin Crust</option>
          <option value="Stuffed">Stuffed Crust</option>
      </select>

      <select name="size">
          <option value="small">Small</option>
          <option value="medium">Medium</option>
          <option value="large">Large</option>
      </select>

      <select name="sauce">
          <option value="Tomato">Tomato Sauce</option>
          <option value="Buffalo">Buffalo Sauce</option>
          <option value="Alfredo">Alfredo Sauce</option>
      </select>

      <label for="pepperoni">
          Pepperoni <input id="pepperoni" type="checkbox" name="toppings" value="pepperoni">
      </label>
      <br>
      <label for="ham">
          Ham <input id="ham" type="checkbox" name="toppings" value="ham">
      </label>
<br>
      <label for="pineapple">
          Pineapple <input id="pineapple" type="checkbox" name="toppings" value="pineapple">
      </label>
      <br>
      <label for = "address">
      <input type = "text"  id ="address" name="address" value = "address">
      </label>
      <input type="submit">
  </form>
  </body>
</html>
