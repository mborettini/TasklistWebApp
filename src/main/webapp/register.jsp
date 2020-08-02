<%--
  Created by IntelliJ IDEA.
  User: MBORETTINI
  Date: 02.08.2020
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/register" method ="post">
    <label for="username">Username: </label>
    <input id="username" type ="text" name="username"/>
    <br/><br/>
    <label for="password">Password: </label>
    <input id="password" type ="password" name="password"/>
    <br/><br/>
    <label for="repeatPassword">Repeat password: </label>
    <input id="repeatPassword" type ="password" name="repeatPassword"/>
    <br/><br/>
    <input type="submit" value="Register"/>
</form>
</body>
</html>