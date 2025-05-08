<%-- 
    Document   : index.jsp
    Created on : 6/05/2025, 10:48:19 AM
    Author     : albertholto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <form action="login" method="post">
            Name: <input type="text" name="name"><br>
            Apellido: <input type="text" name="apellido"><br>
            Edad: <input type="number" name="edad"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" value="login">
        </form>
    </body>
</html>
