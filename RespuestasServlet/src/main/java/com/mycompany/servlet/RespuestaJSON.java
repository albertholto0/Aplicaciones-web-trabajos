package com.mycompany.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que genera una respuesta en formato JSON con datos de empleados
 * Implementa el método doGet para responder con datos estructurados
 */
public class RespuestaJSON extends HttpServlet {

   @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    // Configura el tipo de contenido JSON
    response.setContentType("application/json");
    // Obtiene el writer para enviar la respuesta
    PrintWriter out = response.getWriter();
    
    // Escribe manualmente el JSON estructurado
    out.println("{\"employees\":["
        + "{\"firstName\":\"John\", \"lastName\":\"Joe\"},"
        + "{\"firstName\":\"Anna\", \"lastName\":\"Smith\"},"
        + "{\"firstName\":\"Peter\", \"lastName\":\"Jones\"},"
        + "{\"firstName\":\"Elton\", \"lastName\":\"Hernández\"},"
        + "{\"firstName\":\"Eden\", \"lastName\":\"Casarrubia\"}"
        + "]}");
}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
