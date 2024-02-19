/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Servicios;

import Modelo.Asignatura;
import Modelo.AsignaturaDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServicioAsignaturaCRUD")
public class ServicioAsignaturaCRUD {
    AsignaturaDAO asignaturaDAO = new AsignaturaDAO();
    Asignatura asignatura = new Asignatura();

    @WebMethod(operationName = "readAsignatura")
    public List<Asignatura> readAsignatura() {
        List listaAsignatura = asignaturaDAO.read();
        return listaAsignatura;
    }
    
    @WebMethod(operationName = "createAsignatura")
    public String createAsignatura(@WebParam(name = "ID_Asignatura") String ID_Asignatura, @WebParam(name = "nombre") String nombre, @WebParam(name = "departamento") String departamento) {
        asignatura.setNombre(nombre);
        asignatura.setId_Asignatura(ID_Asignatura);
        asignatura.setDepartamento(departamento);
        String mensaje = asignaturaDAO.create(asignatura);
        return mensaje;
    }

    @WebMethod(operationName = "listarAsignatura")
    public Asignatura listarAsignatura(@WebParam(name = "id") String id) {
        asignatura = asignaturaDAO.listarID(id);
        return asignatura;
    }

    @WebMethod(operationName = "updateAsignatura")
    public String updateAsignatura(@WebParam(name = "ID_Asignatura") String ID_Asignatura, @WebParam(name = "nombre") String nombre, @WebParam(name = "departamento") String departamento) {
        String respuesta = asignaturaDAO.update(ID_Asignatura, nombre, departamento);
        return respuesta;
    }

    @WebMethod(operationName = "deleteAsignatura")
    public String deleteAsignatura(@WebParam(name = "ID_Asignatura") String ID_Asignatura) {
        String respuesta = asignaturaDAO.delete(ID_Asignatura);
        return respuesta;
    }

    @WebMethod(operationName = "buscarAsignatura")
    public Asignatura buscarAsignatura(@WebParam(name = "ID_Asignatura") String ID_Asignatura) {
        asignatura = asignaturaDAO.buscar(ID_Asignatura);
        return asignatura;
    }
    
}
