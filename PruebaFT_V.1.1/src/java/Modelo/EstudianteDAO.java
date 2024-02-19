package Modelo;

import Config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class EstudianteDAO implements CRUD_Estudiante{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta;
    String mensaje;
    Email email = new Email();
    Estudiante estudiante = new Estudiante();
    
    private static final Logger LOGGER = Logger.getLogger(Estudiante.class.getName());
    @Override
    public List<Estudiante> read(){
        String sql = "SELECT * FROM estudiante";
        List <Estudiante> lista = new ArrayList<>();
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Estudiante estudiante = new Estudiante();
                estudiante.setID_Estudiante(rs.getString(1));
                estudiante.setNombre(rs.getString(2));
                estudiante.setApellido(rs.getString(3));
                estudiante.setTelefono(rs.getString(4));
                estudiante.setEmail(rs.getString(5));
                lista.add(estudiante);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

    @Override 
    public String create(Estudiante estudiante){
        String sql = "INSERT INTO estudiante(id_estudiante, nombre, apellido, telefono, email) VALUES(?,?,?,?,?)";
        try {
            String pais = estudiante.getPais();
            String nombre = estudiante.getNombre();
            String apellido = estudiante.getApellido();
            String emailGenerado=email.generarEmail(nombre, apellido, pais);
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,estudiante.getID_Estudiante());
            ps.setString(2,estudiante.getNombre());
            ps.setString(3,estudiante.getApellido());
            ps.setString(4,estudiante.getTelefono());
            ps.setString(5,emailGenerado);
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
    public Estudiante listarID(String id) {
            Estudiante estudiante = new Estudiante();
            String sql = "SELECT * FROM estudiante WHERE ID_Estudiante ="+ "'"+id +"'";
            LOGGER.info("consulta " +sql);
            try {
                con = cn.conexion();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()){
                    estudiante.setID_Estudiante(rs.getString(1));
                    estudiante.setNombre(rs.getString(2));
                    estudiante.setApellido(rs.getString(3));
                    estudiante.setTelefono(rs.getString(4));
                    estudiante.setEmail(rs.getString(5));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        return estudiante;
    }
    @Override
    public String update(String id_Estudiante, String nombre, String apellido, String telefono){
        String sql = "UPDATE estudiante SET Nombre=?, Apellido=?, Telefono=? WHERE ID_Estudiante = ?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setString(2,apellido);
            ps.setString(3,telefono);
            ps.setString(4, id_Estudiante);
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
    public String delete(String id){
        String sql = "DELETE FROM estudiante WHERE ID_Estudiante = ?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            respuesta = ps.executeUpdate();
            if(respuesta ==1){
                mensaje = "EXITOSO";
            }
        } catch (SQLException e) {
            mensaje = e.getSQLState();
        }
        return mensaje;
    }
    @Override
    public Estudiante buscar(String id){
        String sql = "SELECT * FROM estudiante WHERE id_estudiante=" + "'"+id +"'";
        Estudiante estudiante = new Estudiante();
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                estudiante.setID_Estudiante(rs.getString(1));
                estudiante.setNombre(rs.getString(2));
                estudiante.setApellido(rs.getString(3));
                estudiante.setTelefono(rs.getString(4));
                estudiante.setEmail(rs.getString(5));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return estudiante;
    }

 
}
