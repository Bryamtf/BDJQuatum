/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;



/**
 *
 * @author LENOVO
 */
public class PitagorasFormulaCreator implements FormulaCreator{

    @Override
    public FormulaAccion crearFormula() {
        return new PitagorasFormula();
    }

    
    
}
