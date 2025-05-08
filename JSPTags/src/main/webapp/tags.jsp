<%-- 
    Document   : tags
    Created on : 5/05/2025, 10:25:27 AM
    Author     : albertholto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<%--
    Página HTML para mostrar el catálogo de productos
--%>  
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi primer JSP</title>
    </head>
    <body>
        <h1>Ejemplo Scriptest</h1>
        <%
            String titulo = "Lista de Productos";
            List<String> catalogo = new ArrayList();
            catalogo.add("Laptop");
            catalogo.add("Impresora");
            catalogo.add("Escaner");
        %>
        <h2><%=titulo%></h2>
        <select name="producto" multiple>
            <%
                for(String producto : catalogo){
                    out.println("<option>"+producto+"</option>");
                }
            %>
        </select>
    </body>
</html>
