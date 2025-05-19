package com.mycompany.servlet;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet que maneja la respuesta de imágenes JPEG
 * Busca y sirve una imagen estática desde el directorio de despliegue
 */
public class RespuestaImagen extends HttpServlet {
    /*
     * Procesa solicitudes GET para devolver una imagen JPEG
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Configura el tipo de contenido como imagen JPEG
        response.setContentType("image/jpeg");
        // Obtiene la ruta base del directorio de despliegue web
        String pathToWeb = getServletContext().getRealPath(File.separator);
        System.out.println(pathToWeb); // Debug: muestra ruta en consola
        // Crea referencia al archivo de imagen (ruta relativa al directorio web)
        File f = new File(pathToWeb + "images/ultimas_noticias.jpeg");
        // Lee la imagen en memoria
        BufferedImage bi = ImageIO.read(f);
        // Obtiene el stream de salida y escribe la imagen
        OutputStream out = response.getOutputStream();
        ImageIO.write(bi, "jpeg", out);
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
