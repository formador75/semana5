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
    
    private int id;
    private String nombre;
    private double temperatura;
    private double valorBase;

    public Producto() {
    }

    public Producto(String nombre, double temperatura, double valorBase) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
    }

    public Producto(int id, String nombre, double temperatura, double valorBase) {
        this.id = id;
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.valorBase = valorBase;
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
        return this.getClass().getName() + "{" + "id=" + id + ", nombre=" + nombre + ", temperatura=" + temperatura + ", valorBase=" + valorBase + '}';
    }
    
    
    
}
