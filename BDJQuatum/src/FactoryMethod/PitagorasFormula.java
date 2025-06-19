/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;


/**
 *
 * @author LENOVO
 */
public class PitagorasFormula implements FormulaAccion{

    @Override
    public String getExpresion() {
        return "a^2 + b^2 = c^2";
    }

    @Override
    public String getNombre() {
        return "Teorema de Pitágoras";
    }
    
}
