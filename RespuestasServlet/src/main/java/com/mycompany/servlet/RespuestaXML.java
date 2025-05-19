package com.mycompany.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que genera una respuesta XML estática con información de un CD musical
 * Proporciona datos en formato XML para ser consumidos por clientes
 */
public class RespuestaXML extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        out.println("<CATALOG>");
        out.println("<CD>");
        out.println("<TITLE>Ultimas noticias</TITLE>");
        out.println("<ARTIST>El poder del norte</ARTIST>");
        out.println("<COUNTRY>Mexico</COUNTRY>");
        out.println("<COMPANY>Universal Music Mexico</COMPANY>");
        out.println("<PRICE>5.99</PRICE>");
        out.println("<YEAR>2008</YEAR>");
        out.println("</CD>");
        out.println("</CATALOG>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
