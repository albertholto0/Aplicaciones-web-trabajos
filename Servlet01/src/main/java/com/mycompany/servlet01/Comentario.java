package com.mycompany.servlet01;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que maneja tanto peticiones GET como POST para un sistema de comentarios
 * con diferentes funcionalidades según el tipo de usuario (admin o normal)
 */
public class Comentario extends HttpServlet {
    @Override
    /* Se manejan las peticiones GET */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
            // Se obtienen los parametros de la URL
        String nombre = req.getParameter("name");
        String perfil = req.getParameter("perfil");
        String id = req.getParameter("id");
            
        // Se muestran los datos recibidos
        System.out.println("Datos GET recibidos:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Perfil: " + perfil);
        System.out.println("ID: " + id);
        
        // Esto configura el tipo de respuesta
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        
        // Verifica si el usuario es admin para mostrar lo siguiente
        if ("admin".equals(perfil)) {
            // Construye una respuesta para administradores
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Área Admin</title></head>");
            out.println("<body>");
            out.println("<h1>Bienvenido admin!</h1>");
            out.println("<p>Nombre: " + nombre + "</p>");
            out.println("<p>ID: " + id + "</p>");
            out.println("<a href='index.html'>Volver al formulario</a>");
            out.println("</body>");
            out.println("</html>");
        } else {
            // Envia un error 404 si el user no es admin
            resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Página no encontrada");
        }
    }

    
    /* Se manejan las peticiones POST */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        // Procesar parámetros del formulario
        String nombre = req.getParameter("nombre");
        String email = req.getParameter("email");
        String grado = req.getParameter("grado");
        String comentarios = req.getParameter("comentarios");
        
        // Muestra datos recibidos en consola del servidor
        System.out.println("Datos POST recibidos:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Grado: " + grado);
        System.out.println("Comentarios: " + comentarios);
        
        // Generar respuesta HTML
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        // Construye la página de confirmacion
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Gracias por tus comentarios</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 40px; }");
        out.println("h1 { color: #2c3e50; }");
        out.println(".container { max-width: 600px; margin: 0 auto; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>¡Gracias por tus comentarios, " + nombre + "!</h1>");
        out.println("<p>Hemos recibido tu mensaje correctamente:</p>");
        out.println("<ul>");
        out.println("<li><strong>Email:</strong> " + email + "</li>");
        out.println("<li><strong>Grado académico:</strong> " + grado + "</li>");
        out.println("<li><strong>Comentarios:</strong> " + comentarios + "</li>");
        out.println("</ul>");
        out.println("<p>Nos pondremos en contacto contigo pronto.</p>");
        out.println("<a href='index.html'>Volver al formulario</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}