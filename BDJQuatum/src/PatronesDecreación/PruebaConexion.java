/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronesDecreación;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class PruebaConexion {
    public static void main(String[] args) {
        try {
            Connection bd = BDConexion.getInstancia().getConexion();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Conexion establecida");

    }
    
}
