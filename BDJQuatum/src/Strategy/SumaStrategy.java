/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import org.matheclipse.core.eval.ExprEvaluator;
/**
 *
 * @author Suyon Niño Diego Alonso version 1
 */
public class SumaStrategy implements OperacionStrategy {

    @Override
    public String resolver(String expresion) {
        ExprEvaluator evaluator = new ExprEvaluator();
        try {
            return evaluator.eval(expresion).toString();
        } catch (Exception e) {
            return "Error al evaluar la suma: " + e.getMessage();
        }
    }
    
}
