/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.AsignarAsignaturaService;
import Modelo.AsignaturaService;
import Modelo.EstudianteService;
import Modelo.MapeoErrores;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicios.AsignarMateria;
import servicios.Asignatura;
import servicios.Estudiante;
/**
 *
 * @author M
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {
    EstudianteService estudianteService = new EstudianteService();
    AsignaturaService asignaturaService = new AsignaturaService();
    AsignarAsignaturaService asignarService = new AsignarAsignaturaService();
    List<AsignarMateria> listaAsignar = new ArrayList<>();
    List<AsignarMateria> listaConsultada = new ArrayList<>();
    MapeoErrores mapeoErrores = new MapeoErrores();
            
    Estudiante estudiante = new Estudiante();
    Asignatura asignatura = new Asignatura();
    AsignarAsignaturaService asignarAsignatura = new AsignarAsignaturaService(); 
        
    String idEstudiante;
    String idAsignatura;
    int respuesta;
    String tipoFormulario;
    String errorEnviar; 
    
    private static final Logger LOGGER = Logger.getLogger(Controlador.class.getName());
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        String tipoConsulta = request.getParameter("tipoConsulta");
        
        
        LOGGER.info("La acción es: "+accion);
        LOGGER.info("el menu es: " +menu);
        if (menu.equals("Principal")){
            LOGGER.info("Entra a Principal");
            request.getRequestDispatcher("Principal.jsp").forward(request,response);
        }
         if (menu.equals("AdmonEstudiantes")){
            LOGGER.info("Entra a AdmonEstudiantes");
            switch(accion){
                case "READ":
                    LOGGER.info("Comenzara el proceso de consulta (READ)");
                    List<Estudiante> lista = estudianteService.read();
                    List<String> listaPaises = estudianteService.listarPaises();
                    LOGGER.info("se envia la lista"+lista);
                    LOGGER.info("se envia la lista"+listaPaises);
                    request.setAttribute("estudiantes", lista);
                    request.setAttribute("listaPaises", listaPaises);
                    break;
                case "CREATE":
                    LOGGER.info("Entra a CREATE");
                    String ID_Estudiante = request.getParameter("textID_estudiante");
                    String Nombre = request.getParameter("textNombre");
                    String Apellido = request.getParameter("textApellido");
                    String Telefono = request.getParameter("textTelefono");
                    String Pais = request.getParameter("paisSeleccionado");
                    LOGGER.info("El pais seleccionado es: "+ Pais);
                    String mensaje = estudianteService.create(ID_Estudiante, Nombre, Apellido, Telefono, Pais);
                    if ("EXITOSO".equals(mensaje)) {
                        LOGGER.info("Estudiante creado correctamente");
                        String operacion = "Estudiante creado exitosamente";
                        request.setAttribute("operacion", operacion);
                    } else {
                        LOGGER.info("Error "+ mensaje);
                        errorEnviar = mapeoErrores.validarErrorEstudiante(mensaje);
                        LOGGER.info("Error: "+ errorEnviar);
                        request.setAttribute("error", errorEnviar);
                    }
                    request.getRequestDispatcher("Controlador?menu=AdmonEstudiantes&accion=READ").forward(request,response);
                    break;
                    
                case "EDIT":
                    LOGGER.info("Entra al EDIT");
                    String ID_Estu = request.getParameter("id");
                    LOGGER.info("el ID a modificar es "+ ID_Estu);
                    estudiante = estudianteService.listarID(ID_Estu);
                    if (estudiante != null){
                        LOGGER.info("Se obtiene algo de la consulta");
                        LOGGER.info("ID: "+ ID_Estu);
                    } else {LOGGER.info("no se obtienen nada");}
                    LOGGER.info("Estudiante:" + estudiante);
                    tipoFormulario = "EDIT";
                    LOGGER.info("Se envia el tipo de formulario: " + tipoFormulario);
                    request.setAttribute("tipoFormulario", tipoFormulario);
                    request.setAttribute("Estudiante", estudiante);
                    request.getRequestDispatcher("Controlador?menu=AdmonEstudiantes&accion=READ").forward(request,response);
                break;
                
                case "UPDATE":
                LOGGER.info("Entra a UPDATE");
                    String ID_Estudiante1 = request.getParameter("textID_estudiante");
                    String Nombre1 = request.getParameter("textNombre");
                    String Apellido1 = request.getParameter("textApellido");
                    String Telefono1 = request.getParameter("textTelefono");
                    LOGGER.info("Estudiante a actualizar " + ID_Estudiante1);
                    mensaje = estudianteService.updateEstudiante(ID_Estudiante1, Nombre1, Apellido1, Telefono1);
                    if (mensaje.equals("EXITOSO")){
                        LOGGER.info("Se actualiza el usuario exitosamente " + mensaje);
                        String operacion = "Estudiante modificado exitosamente";
                        request.setAttribute("operacion", operacion);
                    } else{
                        LOGGER.info("Error "+ mensaje);
                        errorEnviar = mapeoErrores.validarErrorEstudiante(mensaje);
                        LOGGER.info("Error: "+ errorEnviar);
                        request.setAttribute("operacion", errorEnviar);
                    }
                    request.getRequestDispatcher("Controlador?menu=AdmonEstudiantes&accion=READ").forward(request,response);
                    break;
                    
                case "DELETE":
                    LOGGER.info("Entra al DELETE");
                    ID_Estu = request.getParameter("id");
                    LOGGER.info("el ID a eliminar es "+ ID_Estu);
                    mensaje = estudianteService.deleteEstudiante(ID_Estu);
                    if (mensaje.equals("EXITOSO")){
                        LOGGER.info("Se elimina el usuario exitosamente " + mensaje);
                        String operacion = "Estudiante eliminado exitosamente";
                        request.setAttribute("operacion", operacion);
                    } else{
                        LOGGER.info("Error "+ mensaje);
                        errorEnviar = mapeoErrores.validarErrorEstudiante(mensaje);
                        LOGGER.info("Error: "+ errorEnviar);
                        request.setAttribute("error", errorEnviar);
                    }
                    request.getRequestDispatcher("Controlador?menu=AdmonEstudiantes&accion=READ").forward(request,response);
                    break;
            }
            request.getRequestDispatcher("AdmonEstudiantes.jsp").forward(request,response);
         }
         if (menu.equals("AdmonAsignaturas")){
            LOGGER.info("Entra a AdmonAsignaturas");
            switch (accion){
                case "CREATE":
                    LOGGER.info("Entra a CREATE");
                    String ID_Asignatura = request.getParameter("textID_asignatura");
                    String Nombre = request.getParameter("textNombre");
                    String Departamento = request.getParameter("textDepartamento");
                    String mensaje = asignaturaService.createAsignatura(ID_Asignatura, Nombre, Departamento);
                    if ("EXITOSO".equals(mensaje)) {
                        LOGGER.info("Estudiante creado correctamente");
                        String operacion = "Asignatura creada exitosamente";
                        request.setAttribute("operacion", operacion);
                    } else {
                        LOGGER.info("Error "+ mensaje);
                        errorEnviar = mapeoErrores.validarErrorAsignatura(mensaje);
                        LOGGER.info("Error: "+ errorEnviar);
                        request.setAttribute("error", errorEnviar);
                    }
                    request.getRequestDispatcher("Controlador?menu=AdmonAsignaturas&accion=READ").forward(request,response);
                    break;
                    
                case "READ":
                    LOGGER.info("Comenzara el proceso de consulta (READ)");
                    List<Asignatura> listaAsignatura = asignaturaService.readAsignatura();
                    LOGGER.info("se envia la lista "+listaAsignatura);
                    request.setAttribute("asignaturas", listaAsignatura);
                    break;
                    
                case "EDIT":
                    LOGGER.info("Entra al EDIT");
                    String ID_Asignatura1 = request.getParameter("id");
                    LOGGER.info("el ID a modificar es "+ ID_Asignatura1);
                    asignatura = asignaturaService.listarAsignatura(ID_Asignatura1);
                    if (estudiante != null){
                        LOGGER.info("Se obtiene algo de la consulta");
                        LOGGER.info("ID: "+ ID_Asignatura1);
                    } else {LOGGER.info("no se obtienen nada");}
                    tipoFormulario = "EDIT";
                    LOGGER.info("Se envia el tipo de formulario: " + tipoFormulario);
                    request.setAttribute("tipoFormulario", tipoFormulario);
                    LOGGER.info("Asignatura: " + asignatura);
                    
                    tipoFormulario = "EDIT";
                    request.setAttribute("Asignatura", asignatura);
                    request.setAttribute("tipoFormulario", tipoFormulario);
                    LOGGER.info("Tipo formulario---------------------------- " + tipoFormulario);
                    request.getRequestDispatcher("Controlador?menu=AdmonAsignaturas&accion=READ").forward(request,response);
                    break;
                    
                case "UPDATE":
                    LOGGER.info("Entra a UPDATE");
                    String ID_Asignatura2 = request.getParameter("textID_asignatura");
                    String Nombre1 = request.getParameter("textNombre");
                    String Departamento1 = request.getParameter("textDepartamento");
                    LOGGER.info("Asignatura a actualizar " + ID_Asignatura2 + Nombre1 + Departamento1);
                    mensaje = asignaturaService.updateAsignatura(ID_Asignatura2, Nombre1, Departamento1);
                    if (mensaje.equals("EXITOSO")){
                        LOGGER.info("Se actualiza el usuario exitosamente " + mensaje);
                        LOGGER.info("Estudiante creado correctamente");
                        String operacion = "Asignatura modificada exitosamente";
                        request.setAttribute("operacion", operacion);
                    } else{
                        LOGGER.info("Error "+ mensaje);
                        errorEnviar = mapeoErrores.validarErrorAsignatura(mensaje);
                        LOGGER.info("Error: "+ errorEnviar);
                        request.setAttribute("error", errorEnviar);
                    }
                    request.getRequestDispatcher("Controlador?menu=AdmonAsignaturas&accion=READ").forward(request,response);
                    break;
                    
                case "DELETE":
                    LOGGER.info("Entra al DELETE");
                    ID_Asignatura = request.getParameter("id");
                    LOGGER.info("el ID a eliminar es "+ ID_Asignatura);
                    mensaje = asignaturaService.deleteAsignatura(ID_Asignatura);
                    if (mensaje.equals("EXITOSO")){
                        LOGGER.info("se elimina la asignatura correctamente " + mensaje);
                        LOGGER.info("Estudiante creado correctamente");
                        String operacion = "Asignatura eliminada exitosamente";
                        request.setAttribute("operacion", operacion);
                    } else{
                        LOGGER.info("Error "+ mensaje);
                        errorEnviar = mapeoErrores.validarErrorAsignatura(mensaje);
                        LOGGER.info("Error: "+ errorEnviar);
                        request.setAttribute("error", errorEnviar);
                    }
                    request.getRequestDispatcher("Controlador?menu=AdmonAsignaturas&accion=READ").forward(request,response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("AdmonAsignaturas.jsp").forward(request,response);
        }
        if (menu.equals("Asignar_Asignaturas")) {
            LOGGER.info("Entra a Asignar_Asignaturas");
            switch (accion){
                case "BuscarEstudiante":
                    LOGGER.info("Entra a BuscarCliente");
                    idEstudiante = request.getParameter("id_estudiante");
                    LOGGER.info("Recibe el id de estudiante: "+ idEstudiante);
                    estudiante = estudianteService.buscar(idEstudiante);
                    LOGGER.info("Se envia el dato: " + estudiante.getNombre());
                    request.setAttribute("Estudiante",estudiante);
                    request.setAttribute("listaAsignatura",listaAsignar);
                    break;
                    
                case "BuscarAsignatura":
                    request.setAttribute("Estudiante",estudiante);
                    LOGGER.info("Entra a BuscarAsignatura");
                    idAsignatura = request.getParameter("id_asignatura");
                    LOGGER.info("Recibe el id de estudiante: "+ idAsignatura);
                    asignatura.setIdAsignatura(idAsignatura);
                    asignatura = asignaturaService.buscarAsignatura(idAsignatura);
                    LOGGER.info("Se envia el dato: " + asignatura.getNombre());
                    request.setAttribute("Asignatura",asignatura);
                    request.setAttribute("listaAsignatura",listaAsignar);
                    break;
                    
                case "Agregar":
                    request.setAttribute("Estudiante",estudiante);
                    String nombreEstudiante = request.getParameter("nombreEstudiante");
                    String nombreAsignatura = request.getParameter("nombreAsignatura");

                    asignatura.setIdAsignatura(idAsignatura);
                    asignatura=asignaturaService.buscarAsignatura(idAsignatura); 

                    estudiante.setIDEstudiante(idEstudiante);
                    estudiante=estudianteService.buscar(idEstudiante);
                    LOGGER.info("Se reciben los datos: " + asignatura.getIdAsignatura()+ asignatura.getNombre()+estudiante.getIDEstudiante());
                    
                    AsignarMateria asignarMateria = new AsignarMateria();
                    asignarMateria.setIDAsignatura(asignatura.getIdAsignatura());
                    asignarMateria.setNombreAsignatura(asignatura.getNombre());
                    asignarMateria.setNombreDepartamento(asignatura.getDepartamento());
                    asignarMateria.setIDEstudiante(estudiante.getIDEstudiante());
                    asignarMateria.setNombreEstudiante(estudiante.getNombre());
                    asignarMateria.setApellidoEstudiante(estudiante.getApellido());
                    listaAsignar.add(asignarMateria);
                    request.setAttribute("listaAsignatura",listaAsignar);
                    break;
                    
                case "Matricular":
                    LOGGER.info("Entra a Matricular");
                    for (AsignarMateria materia:
                         listaAsignar) {
                        LOGGER.info("La materia es:" + materia.getIDEstudiante() + materia.getIDAsignatura());
                        String idEstudiante = materia.getIDEstudiante();
                        String idAsignatura = materia.getIDAsignatura();
                        asignarAsignatura.createAsignarMateria(idEstudiante, idAsignatura);
                        LOGGER.info("Se ha matriculado la materia con éxito");
                        String operacion = "Matricula realizada correctamente";
                        request.setAttribute("operacion", operacion);
                    }
                    listaAsignar = new ArrayList<>();
                    
                case "Cancelar":
                    listaAsignar = new ArrayList<>();
                    
            }
            request.getRequestDispatcher("AsignarAsignatura.jsp").forward(request, response);
        }
        if(menu.equals("AdmonMatricula")){
            LOGGER.info("la accion es "+ accion);
            LOGGER.info("la consulta es de tipo "+ tipoConsulta);
            switch (accion){
                case "Consultar":
                    if (tipoConsulta.equals("Xmateria")){
                        idAsignatura = request.getParameter("id");
                        LOGGER.info("Se consultara el ID: " + idAsignatura);
                        LOGGER.info("Comenzara el proceso de consulta por ID_Materia");
                        listaConsultada = asignarAsignatura.readXasignatura(idAsignatura);
                        request.setAttribute("listaAsignatura", listaConsultada);
                        request.setAttribute("tipoConsulta", tipoConsulta);
                        LOGGER.info("se envia la lista"+listaConsultada);
                        break;
                    }
                    if (tipoConsulta.equals("Xestudiante")){
                        idEstudiante = request.getParameter("id");
                        LOGGER.info("Se consultara el ID: " + idEstudiante);
                        LOGGER.info("Comenzara el proceso de consulta por ID_Estudiante");
                        listaConsultada = asignarAsignatura.readXestudiante(idEstudiante);
                        request.setAttribute("listaAsignatura", listaConsultada);
                        request.setAttribute("tipoConsulta", tipoConsulta);
                        LOGGER.info("se envia la lista"+listaConsultada);
                        LOGGER.info("se envia la consulta: " + tipoConsulta);
                        break;
                    }
                case "DELETE":
                    LOGGER.info("Entra al DELETE");
                    idAsignatura = request.getParameter("id_asignatura");
                    idEstudiante = request.getParameter("id_estudiante");
                    LOGGER.log(Level.INFO, "el ID a eliminar es {0} y {1}", new Object[]{idAsignatura, idEstudiante});
                    asignarAsignatura.deleteAsignarMateria(idEstudiante, idAsignatura);
                    listaConsultada = asignarAsignatura.readXestudiante(idEstudiante);
                    String operacion = "Asignatura desasignada exitosamente";
                    request.setAttribute("operacion", operacion);
                    request.setAttribute("listaAsignatura", listaConsultada);
                    break;

            }
            request.getRequestDispatcher("AdmonMatricula.jsp").forward(request, response);
        }
    }
}
