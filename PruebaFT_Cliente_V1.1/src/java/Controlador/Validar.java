/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.ProfesorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicios.Profesor;
import java.util.logging.Logger;



@WebServlet(name = "Validar", urlPatterns = {"/Validar"})
public class Validar extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(Validar.class.getName());
    Profesor profesor = new Profesor();
    ProfesorService profesorService = new ProfesorService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
         String accion = req.getParameter("accion");
        LOGGER.info(accion);
        if (accion.equals("Ingresar")){
            String user = req.getParameter("txtuser"); //se obtienen los datos de ingreso del usuario
            String pass = req.getParameter("txtpass");
            LOGGER.info("Usuario: " + user + ", Contrasena: " + pass);
            profesor = profesorService.validar(user,pass);
            if (profesor.getIDProfesor()!=null){
                req.setAttribute("Usuario",profesor); //se envian los datos a mostrar en el archivo Principal.jsp
                req.getRequestDispatcher("Controlador?menu=Principal").forward(req,resp); //si el usuario existe se redirecciona al controlador
                LOGGER.info("Se encuentra el usuario y contraseña en BD");
            }else{
                req.getRequestDispatcher("index.jsp").forward(req,resp); //si no existe se direcciona a la misma página de login
                LOGGER.info("No se encuentra el usuario y contraseña en BD");
            }
        }
        else{req.getRequestDispatcher("index.jsp").forward(req,resp);}//si se presiona algún otro botón retorna a la misma página
    }
}
