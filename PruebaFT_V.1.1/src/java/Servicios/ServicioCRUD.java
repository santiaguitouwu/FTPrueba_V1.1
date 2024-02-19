/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Servicios;

import Modelo.Estudiante;
import Modelo.EstudianteDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Modelo.Email;
import java.sql.SQLException;
import java.util.ArrayList;

@WebService(serviceName = "ServicioCRUD")
public class ServicioCRUD {
    EstudianteDAO estudianteDAO = new EstudianteDAO();
    Estudiante estudiante = new Estudiante();
    Email email = new Email();
    
    @WebMethod(operationName = "read")
    public List<Estudiante> read(){
        List estudiantes = estudianteDAO.read();
        return estudiantes;
    }
    @WebMethod(operationName = "create")
    public String create(@WebParam(name = "ID_Estudiante") String ID_Estudiante, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "telefono") String telefono, @WebParam(name = "pais") String pais){
        estudiante.setID_Estudiante(ID_Estudiante);
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setTelefono(telefono);
        estudiante.setPais(pais);
        String mensaje = estudianteDAO.create(estudiante);
        return mensaje; 
    }
    
    @WebMethod(operationName = "listarID")
    public Estudiante listarID(@WebParam(name = "id") String id) {
        estudiante = estudianteDAO.listarID(id);
        return estudiante;
    }

    @WebMethod(operationName = "updateEstudiante")
    public String updateEstudiante(@WebParam(name = "id_estudiante") String id_estudiante, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "telefono") String telefono) {
        String respuesta = estudianteDAO.update(id_estudiante, nombre, apellido, telefono); 
        return respuesta;
    }

    @WebMethod(operationName = "deleteEstudiante")
    public String deleteEstudiante(@WebParam(name = "idEstudiante") String idEstudiante) {
        String respuesta = estudianteDAO.delete(idEstudiante);
        return respuesta;
    }

    @WebMethod(operationName = "buscar")
    public Estudiante buscar(@WebParam(name = "id_estudiante") String id_estudiante) {
        estudiante = estudianteDAO.buscar(id_estudiante);
        return estudiante;
    }

    @WebMethod(operationName = "listarPaises")
    public List<String> listarPaises() {
        List <String> listaPaises = new ArrayList<>();
        listaPaises = email.read();
        return listaPaises;
    }

   
    
}
