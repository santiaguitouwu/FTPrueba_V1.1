package Modelo;

import servicios.Asignatura;


public class AsignaturaService {

    public Asignatura buscarAsignatura(java.lang.String idAsignatura) {
        servicios.ServicioAsignaturaCRUD_Service service = new servicios.ServicioAsignaturaCRUD_Service();
        servicios.ServicioAsignaturaCRUD port = service.getServicioAsignaturaCRUDPort();
        return port.buscarAsignatura(idAsignatura);
    }

    public String createAsignatura(java.lang.String idAsignatura, java.lang.String nombre, java.lang.String departamento) {
        servicios.ServicioAsignaturaCRUD_Service service = new servicios.ServicioAsignaturaCRUD_Service();
        servicios.ServicioAsignaturaCRUD port = service.getServicioAsignaturaCRUDPort();
        return port.createAsignatura(idAsignatura, nombre, departamento);
    }

    
    public Asignatura listarAsignatura(java.lang.String id) {
        servicios.ServicioAsignaturaCRUD_Service service = new servicios.ServicioAsignaturaCRUD_Service();
        servicios.ServicioAsignaturaCRUD port = service.getServicioAsignaturaCRUDPort();
        return port.listarAsignatura(id);
    }

    public String deleteAsignatura(java.lang.String idAsignatura) {
        servicios.ServicioAsignaturaCRUD_Service service = new servicios.ServicioAsignaturaCRUD_Service();
        servicios.ServicioAsignaturaCRUD port = service.getServicioAsignaturaCRUDPort();
        return port.deleteAsignatura(idAsignatura);
    }

    public String updateAsignatura(java.lang.String idAsignatura, java.lang.String nombre, java.lang.String departamento) {
        servicios.ServicioAsignaturaCRUD_Service service = new servicios.ServicioAsignaturaCRUD_Service();
        servicios.ServicioAsignaturaCRUD port = service.getServicioAsignaturaCRUDPort();
        return port.updateAsignatura(idAsignatura, nombre, departamento);
    }

    public java.util.List<servicios.Asignatura> readAsignatura() {
        servicios.ServicioAsignaturaCRUD_Service service = new servicios.ServicioAsignaturaCRUD_Service();
        servicios.ServicioAsignaturaCRUD port = service.getServicioAsignaturaCRUDPort();
        return port.readAsignatura();
    }
}
