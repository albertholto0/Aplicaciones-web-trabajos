package com.mycompany.ejemploservletdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter();
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd", "user", "pass");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")) {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            out.println("<h1>Lista de Usuarios</h1>");
            out.println("<ul>");
            
            while(rs.next()) {
                out.println("<li>" + rs.getString("nombre") + "</li>");
            }
            
            out.println("</ul>");
            
        } catch (ClassNotFoundException | SQLException e) {
            throw new ServletException("Error de base de datos", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}