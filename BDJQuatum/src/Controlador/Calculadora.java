/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author BRYAM TERRONES
 * Version: 1.0
 */
public class Calculadora {
    private OperacionContexto contexto;
    
    public void calular(String exp){
        System.out.println("Calculando");
    }
    
    public void cargarFormula(int id){
        System.out.println("Cargando formula" + id);
    }
    
    public void guardarOperacion(){
        System.out.println("Guardando operacion");
    }
}
