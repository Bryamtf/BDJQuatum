/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;


/**
 *
 * @author LENOVO
 */
public class TaylorFormula implements FormulaAccion {
    
    @Override
    public String getNombre() {
        return "Serie de Taylor";
    }
    
    @Override
    public String getExpresion() {
        return "f(x) ≈ f(a) + f'(a)(x - a) + f''(a)(x - a)^2 / 2!";
    }
}
