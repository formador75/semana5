/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.proyectofinal;

import com.misiontic.controlador.Producto;
import com.misiontic.modelo.MysqlProducto;
import com.misiontic.modelo.SqliteProducto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class ProyectoFinal {

    public static void main(String[] args) {
     MysqlProducto db = new MysqlProducto();
      
     Producto p = new Producto(2, "dolex3", 25, 3000);
     db.insertarProducto(p);
       System.out.println(db.leerProductos());
       
    }
}
