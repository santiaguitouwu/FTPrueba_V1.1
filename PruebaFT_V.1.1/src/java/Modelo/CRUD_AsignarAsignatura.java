/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.List;

public interface CRUD_AsignarAsignatura {
    int create(String idEstudiante, String idMateria);
    List<AsignarMateria> readXestudiante(String id);
    List<AsignarMateria> readXasignatura(String id);
    int delete(String id_estudiante, String id_materia); 
}
