/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class FormulaRegistry {
    private static final Map<String, FormulaCreator> formulasRegistradas = new HashMap<>();

    public static void registrar (String nombre, FormulaCreator creador){
        formulasRegistradas.put(nombre, creador);
    }
    
    public static FormulaCreator obtenerCreador (String nombre){
        return formulasRegistradas.get(nombre);
    }
    
    public static String[] listarFormulas(){
        return formulasRegistradas.keySet().toArray(new String [0]);
    }
    
    
}
