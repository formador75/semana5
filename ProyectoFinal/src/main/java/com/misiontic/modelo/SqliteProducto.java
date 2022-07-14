/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.modelo;

import com.misiontic.controlador.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class SqliteProducto {
     Connection c = null;
       Statement stmt = null;
    
    public void insertarProducto(Producto p){
     
       try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:database.db");
           System.out.println("La conexion fue un exito");
         
         stmt = c.createStatement();
         int id = p.getId();
         String nombre = p.getNombre();
         double temperatura = p.getTemperatura();
         double valorbase = p.getValorBase();
         
         String sql = "insert into productos(nombre,id,temperatura, valorbase) VALUES ('"+ nombre +"','"+ id +"','"+ temperatura +"',' "+ valorbase  +"')"; 
       
         //PreparedStatement stmt = connection.prepareStatement("insert into test (firstname, lastname) values (?, ?");
//stmt.setString(1, name);
//stmt.setString(2, lname);
//stmt.executeUpdate();
         stmt.executeUpdate(sql);
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": " + e.getMessage() );
       } 
    
       
    }
  
    
     public List<Producto> llamarDatos(){ 
         List<Producto> listaProductos = new ArrayList();
         
           Connection c = null;
       Statement stmt = null;
       try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:database.db");
           System.out.println("La conexion fue un exito");
           
           
           
           
         stmt = c.createStatement();
         String sql = "select * from productos"; 
          

         
           ResultSet rs  = stmt.executeQuery(sql);
           
           while (rs.next()){
            int id = rs.getInt("id");
           String nombre = rs.getString("nombre");
            double temperatura = rs.getDouble("temperatura");
           double valorbase = rs.getDouble("valorbase");
           
           Producto p = new Producto(nombre, id, temperatura, valorbase);
           
           listaProductos.add(p);   
           }
           
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": falta la clase " + e.getMessage() );
       } 
    
     
      return listaProductos;
    
    
    }
    
     
      public void actualizarDatos(){
    
    
    
    }
      
      
       public void borrarDatos(){
    
    
    
    }
    
    
}
