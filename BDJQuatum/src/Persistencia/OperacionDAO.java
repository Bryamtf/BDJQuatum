/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Operacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BRYAM TERRONES FIGUEROA
 * Versión: 1.0
 */
public class OperacionDAO {
   
    public void Guardar(Operacion operacion){
        System.out.println("Haciendo la guardacion");
    }
    public List<Operacion> listar(){
        System.out.println("Listando");
        return new ArrayList<>();
    }
}
