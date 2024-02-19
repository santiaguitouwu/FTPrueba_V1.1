/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import servicios.Estudiante;

/**
 *
 * @author M
 */
public class EstudianteService {

    public java.util.List<servicios.Estudiante> read() {
        servicios.ServicioCRUD_Service service = new servicios.ServicioCRUD_Service();
        servicios.ServicioCRUD port = service.getServicioCRUDPort();
        return port.read();
    }

   public String create(java.lang.String idEstudiante, java.lang.String nombre, java.lang.String apellido, java.lang.String telefono, java.lang.String pais) {
        servicios.ServicioCRUD_Service service = new servicios.ServicioCRUD_Service();
        servicios.ServicioCRUD port = service.getServicioCRUDPort();
        return port.create(idEstudiante, nombre, apellido, telefono, pais);
    }

    public Estudiante listarID(java.lang.String id) {
        servicios.ServicioCRUD_Service service = new servicios.ServicioCRUD_Service();
        servicios.ServicioCRUD port = service.getServicioCRUDPort();
        return port.listarID(id);
    }

    public Estudiante buscar(java.lang.String idEstudiante) {
        servicios.ServicioCRUD_Service service = new servicios.ServicioCRUD_Service();
        servicios.ServicioCRUD port = service.getServicioCRUDPort();
        return port.buscar(idEstudiante);
    }

    public java.util.List<java.lang.String> listarPaises() {
        servicios.ServicioCRUD_Service service = new servicios.ServicioCRUD_Service();
        servicios.ServicioCRUD port = service.getServicioCRUDPort();
        return port.listarPaises();
    }

    public String deleteEstudiante(java.lang.String idEstudiante) {
        servicios.ServicioCRUD_Service service = new servicios.ServicioCRUD_Service();
        servicios.ServicioCRUD port = service.getServicioCRUDPort();
        return port.deleteEstudiante(idEstudiante);
    }

    public String updateEstudiante(java.lang.String idEstudiante, java.lang.String nombre, java.lang.String apellido, java.lang.String telefono) {
        servicios.ServicioCRUD_Service service = new servicios.ServicioCRUD_Service();
        servicios.ServicioCRUD port = service.getServicioCRUDPort();
        return port.updateEstudiante(idEstudiante, nombre, apellido, telefono);
    }

 
}
