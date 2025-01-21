<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Spring MVC</title>
  </head>
  <body>
    <h1>${message}</h1>
    <ul>
      <%
        // Generate numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
      %>
        <li>Message <%= i %></li>
      <%
        }
      %>
    </ul>
  </body>
</html>
