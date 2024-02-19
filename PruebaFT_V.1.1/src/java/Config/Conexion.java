/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Conexion {
    Connection con;
    String url = "jdbc:postgresql://localhost:5432/PTFT";
    String user = "postgres";
    String pass = "1193101605";
    private static final Logger LOGGER = Logger.getLogger(Conexion.class.getName());
    
    public Connection conexion() throws SQLException{
        LOGGER.info("Comenzara el proceso de conexion a BD");
        try {
            // Cargar el controlador JDBC
            Class.forName("org.postgresql.Driver");
            try  {
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection(url,user,pass); //se realiza la conexion a BD
                System.out.println("Conexión a BD Exitosa");
                LOGGER.info("Conexion exitosa");
            } catch (SQLException e) {
                LOGGER.info("Error al establecer la conexión: " + e.getMessage());
                System.out.println("Error al establecer la conexión: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            LOGGER.info("Error al cargar el controlador JDBC: " + e.getMessage());
            System.out.println("Error al cargar el controlador JDBC: " + e.getMessage());
        }
        return con; //se retorna la conexion
    }
}
