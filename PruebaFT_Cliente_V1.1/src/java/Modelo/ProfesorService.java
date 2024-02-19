/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import servicios.Profesor;

public class ProfesorService {

    public Profesor validar(java.lang.String idProfesor, java.lang.String contrasena) {
        servicios.ServicioValidarProfesor_Service service = new servicios.ServicioValidarProfesor_Service();
        servicios.ServicioValidarProfesor port = service.getServicioValidarProfesorPort();
        return port.validar(idProfesor, contrasena);
    }
    
}
