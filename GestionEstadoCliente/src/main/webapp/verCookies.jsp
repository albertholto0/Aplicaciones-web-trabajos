<%-- 
    Document   : verCookies
    Created on : 30/04/2025, 10:43:12 AM
    Author     : albertholto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ver Cookies</title>
    </head>
    <body>
        <h2>Cookies recibidas:</h2>
        <%
            Cookie[] cookies = request.getCookies();
            if(cookies != null){
                for(Cookie c : cookies){
                    out.println("Nombre: " + c.getName() + "<br>");
                    out.println("Valor " + c.getValue() + "<br><br>");
                }
            } else {
                out.println("No hay Cookies");
            }
        %>
    </body>
</html>
