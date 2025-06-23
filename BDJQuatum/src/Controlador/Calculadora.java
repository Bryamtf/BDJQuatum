/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import FactoryMethod.FormulaAccion;
import FactoryMethod.FormulaCreator;
import FactoryMethod.FormulaRegistry;
import Modelo.Formula;
import Strategy.OperacionContexto;

/**
 *
 * @author BRYAM TERRONES
 * Version: 1.0
 */
public class Calculadora {
    private OperacionContexto contexto;
    
    public String calular(String exp){
         if(contexto == null){
             throw new IllegalStateException("No se configuró ninguna operación");
         }
         return contexto.resolver(exp);
    }
    
    public void cargarFormula(int id){
        System.out.println("Cargando formula" + id);
    }
    
    public FormulaAccion obtenerFormula(String tipo) {
        FormulaCreator creador = FormulaRegistry.obtenerCreador(tipo);
        if (creador != null) {
            return creador.crearFormula();
        }
        return null;
    }

    public String[] listarFormulasDisponibles() {
        return FormulaRegistry.listarFormulas();
    }
    
    public void guardarOperacion(){
        System.out.println("Guardando operacion");
    }
}
