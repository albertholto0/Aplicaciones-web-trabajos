package com.unsij.controller;

import com.unsij.model.LoginBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String apellido = request.getParameter("apellido");
        String edad = request.getParameter("edad");
        
        LoginBean bean = new LoginBean();
        bean.setName(name);
        bean.setPassword(password);
        bean.setApellido(apellido);
        bean.setEdad(edad);     
        
        // Se realiza la logica del negocio
        boolean status = bean.validate();
        
        // Compartimos el objeto para poder usarlo en la vista
        request.setAttribute("user", bean);
        
        if(status){
            RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
        
    }
}
