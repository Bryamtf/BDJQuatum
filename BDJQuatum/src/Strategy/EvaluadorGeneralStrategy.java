/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IExpr;

/**
 *
 * @author LENOVO
 */
public class EvaluadorGeneralStrategy implements OperacionStrategy {

    @Override
    public String resolver(String expresion) {
        try {
            F.initSymbols();
            ExprEvaluator evaluator = new ExprEvaluator();
            IExpr resultado = evaluator.eval(expresion);
            
            return resultado.toString();
        } catch (Exception e) {
            return "Error al evaluar: " + e.getMessage();
        }
    }
    
}
