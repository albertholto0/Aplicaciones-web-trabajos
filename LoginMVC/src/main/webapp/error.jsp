<%-- 
    Document   : error
    Created on : 6/05/2025, 10:46:12 AM
    Author     : albertholto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1>Error</h1>
        <p>Disculpa! usuario o contraseña incorrecta</p>
        <%@ include file = "index.jsp"%>
        <a href="index.jsp">
            <input type="button" value="Volver a iniciar sesión">
        </a>
    </body>
</html>
