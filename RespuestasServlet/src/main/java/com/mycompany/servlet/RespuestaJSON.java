package com.mycompany.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author albertholto
 */

public class RespuestaJSON extends HttpServlet {

   @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("application/json");
    PrintWriter out = response.getWriter();
    
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
