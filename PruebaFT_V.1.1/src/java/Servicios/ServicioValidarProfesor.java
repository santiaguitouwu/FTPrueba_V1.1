/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Servicios;

import Modelo.Profesor;
import Modelo.ProfesorDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author M
 */
@WebService(serviceName = "ServicioValidarProfesor")
public class ServicioValidarProfesor {
    ProfesorDAO profesorDAO = new ProfesorDAO();
    @WebMethod(operationName = "Validar")
    public Profesor Validar(@WebParam(name = "ID_Profesor") String id_Profesor, @WebParam(name="contrasena") String contrasena) {
        Profesor profesor = profesorDAO.validar(id_Profesor, contrasena);
    return profesor;
    }
}
