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
public interface CRUD_Asignatura {
    public List read();
    public Asignatura listarID(String id);
    public String create (Asignatura asignatura);
    public String update(String id_Asignatura, String nombre, String departamento);
    public String delete(String id);
    public Asignatura buscar(String id);
}
