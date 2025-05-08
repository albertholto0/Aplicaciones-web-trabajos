/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsij.model;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author albertholto
 */
public class LoginBean implements Serializable {
    
   private String name;
   private String password;
   private String apellido;
   private String edad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
   public boolean validate(){
       if(name.equals("admin") && password.equals("1234")){
           return true;
       } else {
           return false;
       }
   }
    
}
