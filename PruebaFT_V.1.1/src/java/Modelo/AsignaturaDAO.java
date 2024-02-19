/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AsignaturaDAO implements CRUD_Asignatura{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta;
    String mensaje; 
    private static final Logger LOGGER = Logger.getLogger(AsignaturaDAO.class.getName());
    
    @Override
    public List<Asignatura> read(){
        String sql = "SELECT * FROM materia";
        List <Asignatura> lista;
        lista = new ArrayList<>();
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Asignatura asignatura = new Asignatura();
                asignatura.setId_Asignatura(rs.getString(1));
                asignatura.setNombre(rs.getString(2));
                asignatura.setDepartamento(rs.getString(3));
                lista.add(asignatura);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    @Override
    public String create(Asignatura asignatura){
        String sql = "INSERT INTO materia(id_materia, nombre, departamento) VALUES(?,?,?)";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,asignatura.getId_Asignatura());
            ps.setString(2,asignatura.getNombre());
            ps.setString(3,asignatura.getDepartamento());
            respuesta = ps.executeUpdate();
            if(respuesta==1){
                mensaje = "EXITOSO"; 
            } else{
                mensaje = "Error";
            }
        } catch (SQLException e) {
            mensaje = e.getSQLState();
        }
        return mensaje;
    }

    @Override
    public Asignatura listarID(String id){
        Asignatura asignatura = new Asignatura();
        String sql = "SELECT * FROM materia WHERE id_materia ="+ "'"+id +"'";
        LOGGER.info("consulta " +sql);
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                asignatura.setId_Asignatura(rs.getString(1));
                asignatura.setNombre(rs.getString(2));
                asignatura.setDepartamento(rs.getString(3));
            }
        return asignatura;
        } catch (SQLException e){
              
        }
        return asignatura;
    }
    
    @Override
    public String update(String id_Asignatura, String nombre, String departamento){
        String sql = "UPDATE materia SET Nombre=?, departamento=? WHERE id_materia = ?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setString(2,departamento);
            ps.setString(3,id_Asignatura);
            respuesta = ps.executeUpdate();
            if(respuesta == 1 ){
                mensaje = "EXITOSO";
            }
        } catch (SQLException e) {
            mensaje = e.getSQLState();
        }
        return mensaje;
    }
    
    @Override
    public String delete(String id){
        String sql = "DELETE FROM materia WHERE id_materia = ?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            respuesta = ps.executeUpdate();
            if(respuesta == 1){
                mensaje = "EXITOSO";
            }
        } catch (SQLException e) {
            mensaje = e.getSQLState();
        }
        return mensaje; 
    }
    @Override
    public Asignatura buscar(String id){
        String sql = "SELECT * FROM materia WHERE id_materia=" + "'"+id +"'";
        Asignatura asignatura = new Asignatura();
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                asignatura.setId_Asignatura(rs.getString(1));
                asignatura.setNombre(rs.getString(2));
                asignatura.setDepartamento(rs.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return asignatura;
    }
}
