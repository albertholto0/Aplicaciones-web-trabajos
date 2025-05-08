package com.unsij.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Crear una cookie
        Cookie cookie = new Cookie("usuario","admin");
        cookie.setMaxAge(60 * 60); // 1 hora de vida
        response.addCookie(cookie); // Agregar al response
        
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<h2>Cookie creada <a></a></h2>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
