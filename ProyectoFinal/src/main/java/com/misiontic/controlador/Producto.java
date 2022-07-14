/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.controlador;

/**
 *
 * @author jorge
 */
public class Producto {
    
    private String nombre;
    private int id;
    private double temperatura;
    private double valorBase;

    public Producto() {
    }

    public Producto(String nombre, int id, double temperatura, double valorBase) {
        this.nombre = nombre;
        this.id = id;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    
    @Override
    public String toString() {
        return this.getClass().getName() + "{" + "nombre=" + nombre + ", id=" + id + ", temperatura=" + temperatura + ", valorBase=" + valorBase + '}';
    }
  
    
    
}
