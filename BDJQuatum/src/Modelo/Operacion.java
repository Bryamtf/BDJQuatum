/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author BRYAM TERRONES 
 * Version: 1.0
 */
public class Operacion {
    private int id;
    private String expresion;
    private String resultado;
    private LocalDate fecha;

    public Operacion(int id, String expresion, String resultado, LocalDate fecha) {
        this.id = id;
        this.expresion = expresion;
        this.resultado = resultado;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return String.format("%d: %s - %s - %s", id, expresion, resultado, fecha);
    }
    
    
    
}
