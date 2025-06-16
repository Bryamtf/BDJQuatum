/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDecreación;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LENOVO
 */
public class BDConexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_algoritmo";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    
    private static BDConexion instancia;
    private Connection conexion;
    
    private BDConexion() throws SQLException {
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException ex) {
            throw new SQLException("Nose encontro el driver JDBC de MySQL");
        }
    }
    
    public static BDConexion getInstancia() throws SQLException {
        if(instancia == null || instancia.getConexion().isClosed()){
            instancia = new BDConexion();
        }
        return instancia;
    }
    public Connection getConexion(){
        return conexion;
    }
}
