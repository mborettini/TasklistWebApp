<%--
  Created by IntelliJ IDEA.
  User: magda
  Date: 02.08.2020
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/login" method ="post">
    <label for="username">Username: </label>
    <input id="username" type ="text" name="username"/>
    <br/><br/>
    <label for="password">Password: </label>
    <input id="password" type ="password" name="password"/>
    <br/><br/>
    <input type="submit" value="Login"/>
</form>
</body>
</html>
