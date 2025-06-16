/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bdjquatum;

import Strategy.DerivadaStrategy;
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
        OperacionContexto contexto = new OperacionContexto();
        contexto.setEstrategia(new TrigonometricaStrategy());

        String resultado = contexto.resolver("90");
        System.out.println("Resultado: " + resultado);
    }
    
}
