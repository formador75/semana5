/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.proyectofinal;

import com.misiontic.controlador.Producto;
import com.misiontic.modelo.MysqlProducto;
import com.misiontic.modelo.SqliteProducto;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class ProyectoFinal {

    public static void main(String[] args) {
    
      
        
       Producto p = new Producto("dristan", 5, 35, 35000); 
        
       MysqlProducto db = new MysqlProducto();
       db.insertarProducto(p);
       
    }
}
