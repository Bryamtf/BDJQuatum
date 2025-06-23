/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bdjquatum;

import Controlador.Calculadora;
import FactoryMethod.FormulaAccion;
import FactoryMethod.FormulaRegistry;
import FactoryMethod.PitagorasFormulaCreator;
import FactoryMethod.TaylorFormulaCreator;
import Strategy.DerivadaStrategy;
import Strategy.LogaritmoStrategy;
import Strategy.OperacionContexto;
import Strategy.SumaStrategy;
import Strategy.TrigonometricaStrategy;

/**
 *
 * @author BRYAM TERRONES
 * Version 1.0
 */
public class BDJQuatum {

    public static void main(String[] args) {
//        OperacionContexto contexto = new OperacionContexto();
//
//        contexto.setEstrategia(new TrigonometricaStrategy("Sin"));
//        System.out.println(contexto.resolver("Pi/2")); // 1
        
        new TaylorFormulaCreator();
        new PitagorasFormulaCreator();

        Calculadora calc = new Calculadora();

        System.out.println("Fórmulas disponibles:");
        for (String nombre : calc.listarFormulasDisponibles()) {
            System.out.println("- " + nombre);
        }

        System.out.println();

        // Obtener una fórmula específica
        FormulaAccion formula = calc.obtenerFormula("Taylor");
        if (formula != null) {
            System.out.println("Nombre: " + formula.getNombre());
            System.out.println("Expresión: " + formula.getExpresion());

        }
        
        calc.listarFormulasDisponibles();
        
        
    
    }
}
