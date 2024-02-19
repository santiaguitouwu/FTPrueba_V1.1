/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Servicios;

import Modelo.AsignarMateria;
import Modelo.AsignarMateriaDAO;
import java.util.List;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author M
 */
@WebService(serviceName = "ServicioAsignarMateria")
public class ServicioAsignarMateria {
    AsignarMateriaDAO asignarMateriaDAO = new AsignarMateriaDAO();
    private static final Logger LOGGER = Logger.getLogger(ServicioAsignarMateria.class.getName());
    
    @WebMethod(operationName = "CreateAsignarMateria")
    public int CreateAsignarMateria(@WebParam(name = "idEstudiante") String idEstudiante, @WebParam(name = "idMateria") String idMateria) {
        int respuesta = asignarMateriaDAO.create(idEstudiante, idMateria);
        return respuesta;
    }

    @WebMethod(operationName = "readXestudiante")
    public List<AsignarMateria> readXestudiante(@WebParam(name = "id") String id) {
        List<AsignarMateria> lista = asignarMateriaDAO.readXestudiante(id);
        return lista;
    }

    @WebMethod(operationName = "readXasignatura")
    public List<AsignarMateria> readXasignatura(@WebParam(name = "id") String id) {
        List<AsignarMateria> lista = asignarMateriaDAO.readXasignatura(id);
        return lista;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteAsignarMateria")
    public int delete(@WebParam(name = "id_estudiante") String id_estudiante, @WebParam(name = "id_materia") String id_materia) {
        int respuesta = asignarMateriaDAO.delete(id_estudiante, id_materia);
        return respuesta;
    }
    
}
