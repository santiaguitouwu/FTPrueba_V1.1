/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author M
 */
public class AsignarAsignaturaService {

    public int createAsignarMateria(java.lang.String idEstudiante, java.lang.String idMateria) {
        servicios.ServicioAsignarMateria_Service service = new servicios.ServicioAsignarMateria_Service();
        servicios.ServicioAsignarMateria port = service.getServicioAsignarMateriaPort();
        return port.createAsignarMateria(idEstudiante, idMateria);
    }

    public java.util.List<servicios.AsignarMateria> readXasignatura(java.lang.String id) {
        servicios.ServicioAsignarMateria_Service service = new servicios.ServicioAsignarMateria_Service();
        servicios.ServicioAsignarMateria port = service.getServicioAsignarMateriaPort();
        return port.readXasignatura(id);
    }

    public java.util.List<servicios.AsignarMateria> readXestudiante(java.lang.String id) {
        servicios.ServicioAsignarMateria_Service service = new servicios.ServicioAsignarMateria_Service();
        servicios.ServicioAsignarMateria port = service.getServicioAsignarMateriaPort();
        return port.readXestudiante(id);
    }

    public int deleteAsignarMateria(java.lang.String idEstudiante, java.lang.String idMateria) {
        servicios.ServicioAsignarMateria_Service service = new servicios.ServicioAsignarMateria_Service();
        servicios.ServicioAsignarMateria port = service.getServicioAsignarMateriaPort();
        return port.deleteAsignarMateria(idEstudiante, idMateria);
    }

   
    
}
