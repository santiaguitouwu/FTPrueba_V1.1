/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class MapeoErrores {
    String mensaje;
    String error;
    
    public MapeoErrores(){
    }
    
    public String validarErrorEstudiante(String error){
        switch(error){
            case "23503":
                mensaje = "El estudiante cuenta con asignaturas asignadas";
                break;
                
            case "23514":
                mensaje = "No se aceptan caracteres especiales o números en los datos a ingresar";
                break;
            
            case "23505":
                mensaje = "El ID del Estudiante ya se encuentra registrado";
                break;
                
            default:
                mensaje = "Ha ocurrido un error inesperado, por favor comunicarse con el administrador";
                break;
        }
        return mensaje;
    }
    public String validarErrorAsignatura(String error){
        switch(error){
            case "23503":
                mensaje = "La asignatura cuenta con estudiantes asignados";
                break;
                
            case "23514":
                mensaje = "No se aceptan caracteres especiales o números en los datos a ingresar";
                break;
            
            case "23505":
                mensaje = "El ID de la Asignatura ya se encuentra registrado";
                break;
                
            default:
                mensaje = "Ha ocurrido un error inesperado, por favor comunicarse con el administrador";
                break;
        }
        return mensaje;
    }
    
}
