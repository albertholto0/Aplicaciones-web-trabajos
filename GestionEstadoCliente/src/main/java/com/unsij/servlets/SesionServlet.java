package com.unsij.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SesionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession(true);
        String usuario = (String) sesion.getAttribute("usuario");
        
        if (usuario == null) {
            sesion.setAttribute("usuario", "Martin");
            response.getWriter().println("<h2>Usuario en sesión: Martin</h2>"+"<br>");
        } else {
            response.getWriter().println("<h2>Usuario en sesion: "+usuario+"</h2>"+"<br>");
        }
        response.getWriter().println("<a href = 'index.jsp'>Volver</a>");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
