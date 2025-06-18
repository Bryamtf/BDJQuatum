/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;
import org.matheclipse.core.eval.ExprEvaluator;
/**
 *
 * @author Suyon Niño Diego Alonso
 */
public class LogaritmoStrategy implements OperacionStrategy{

    @Override
    public String resolver(String expresion) {
        ExprEvaluator evaluator = new ExprEvaluator();
        try {
            String comando = "Log["+expresion+"]";
            return evaluator.eval(comando).toString();
        } catch (Exception e) {
            return "Error al calcular el logaritmo: " + e.getMessage();
        }
    }

}
