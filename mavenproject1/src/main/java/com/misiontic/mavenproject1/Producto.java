/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.mavenproject1;

/**
 *
 * @author jorge
 */
public class Producto {
    
    
    private String nombre;
    private String  codigo;
    private String categoria;
    private String  laboratorio;
    private boolean cotizante;

    public Producto(String nombre, String codigo, String categoria, String laboratorio, boolean cotizante) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.laboratorio = laboratorio;
        this.cotizante = cotizante;
    }
    
    public float costo(){
    float costo;
    
    if (cotizante){
        costo = 3500;
    }else{
    costo=14000;
    }
        
        return costo;
    
    }
    
    
    public void info() {
     System.out.println("[Producto]:");   	 
     System.out.println("Nombre:" +this.nombre);
     System.out.println("Codigo: " + this.codigo);
     System.out.println("Categoria: " + this.categoria);
     System.out.println("Laboratorio: " + this.laboratorio);
     System.out.println("Precio: " + this.costo());
    }
    
    
    
}
