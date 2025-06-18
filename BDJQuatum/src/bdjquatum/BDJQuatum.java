/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bdjquatum;

import Strategy.DerivadaStrategy;
import Strategy.LogaritmoStrategy;
import Strategy.OperacionContexto;
import Strategy.SumaStrategy;
import Strategy.TrigonometricaStrategy;

/**
 *
 * @author HP
 */
public class BDJQuatum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionContexto contexto = new OperacionContexto();

        contexto.setEstrategia(new TrigonometricaStrategy("Sin"));
        System.out.println(contexto.resolver("Pi/2")); // 1

    }
    
}
