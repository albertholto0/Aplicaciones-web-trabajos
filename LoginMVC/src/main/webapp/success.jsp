<%-- 
    Document   : succes
    Created on : 6/05/2025, 10:46:04 AM
    Author     : albertholto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenida</title>
    </head>
    <body>
        <h1>Bienvenido ${user.name}</h1>
        <br>
        <h4>Información del usuario</h4>
        <table border="1" cellpadding="8" cellspacing="0" width="50%">
            <thead>
                <tr bgcolor="#f2f2f2">
                    <th width="33%">Nombre</th>
                    <th width="33%">Apellido</th>
                    <th width="33%">Edad</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td align="center">${user.name}</td>
                    <td align="center">${user.apellido}</td>
                    <td align="center">${user.edad}</td>
                </tr>
            </tbody>
        </table>
    </body>
</html>