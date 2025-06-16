/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author LENOVO
 */
public class OperacionContexto {
    private OperacionStrategy estrategia;
    
    public void setEstrategia(OperacionStrategy estrategia) {
        this.estrategia = estrategia;
    }
    
    public String resolver(String expresion) {
        if (estrategia == null) {
            throw new IllegalStateException("No se ha definido una estrategia de operación.");
        }
        return estrategia.resolver(expresion);
    }
}
