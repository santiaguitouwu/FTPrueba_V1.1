/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author M
 */
public interface CRUD_Estudiante {
    public List read();
    public Estudiante listarID(String id);
    public String create(Estudiante estudiante);
    public String update(String id_Estudiante, String nombre, String apellido, String telefono);
    public String delete(String id);
    public Estudiante buscar(String id);
}
