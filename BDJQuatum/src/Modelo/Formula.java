/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author BRYAM TERRONES FIGUEROA
 * Version: 1.0
 */
public class Formula {
    private int id;
    private String nombre;
    private String expresion;

    public Formula(int id, String nombre, String expresion) {
        this.id = id;
        this.nombre = nombre;
        this.expresion = expresion;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("%d: %s - %s ", id, nombre, expresion);
    }
    
    
}
