package com.mycompany.servlet01;
/**
 *
 * @author albertholto
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HolaMundo extends HttpServlet{
    @Override
    /*
    Método que se ejecuta cuando se recibe una petición HTTP GET
    */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ejecutando metodo doGet");
    }
    
    
    /*
    Método que se ejecuta cuando se recibe una petición HTTP POST
    */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ejecutando metodo doPost");
    }
}
