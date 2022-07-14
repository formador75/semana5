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
           
          stmt = c.createStatement();
         int id = p.getId();
         String nombre = p.getNombre();
         double temperatura = p.getTemperatura();
         double valorbase = p.getValorBase();
         
         String sql = "insert into productos(id,nombre,temperatura, valorbase) VALUES ('"+ id +"','"+ nombre +"','"+ temperatura +"',' "+ valorbase  +"')"; 
           stmt.executeUpdate(sql);
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": " + e.getMessage() );
       } 
    }
  
    
     public Producto buscarProducto(int id){
      Producto p = new Producto();
       try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:database.db"); 
          stmt = c.createStatement();
               
         String sql = "select * from productos where id=" + id;
           ResultSet rs  = stmt.executeQuery(sql);
          while (rs.next()){
           p.setId(rs.getInt("id"));
           p.setNombre(rs.getString("nombre"));
           p.setTemperatura(rs.getDouble("temperatura"));
           p.setValorBase(rs.getDouble("valorBase"));
          
          }
        
         
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": " + e.getMessage() );
       } 
     
         return p ;
     }
    
    
     public List<Producto> leerProductos(){ 
          List<Producto> listaProductos = new ArrayList();
       try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:database.db");     

         stmt = c.createStatement();
         String sql = "select * from productos"; 
          
           ResultSet rs  = stmt.executeQuery(sql);
           
           while (rs.next()){
           int id = rs.getInt("id");
           String nombre = rs.getString("nombre");
            double temperatura = rs.getDouble("temperatura");
           double valorbase = rs.getDouble("valorbase");
           
           Producto p = new Producto(id, nombre, temperatura, valorbase);
           
           listaProductos.add(p);   
          
           
           }
           
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": falta la clase " + e.getMessage() );
       } 
    
       return listaProductos;
    }
    
     
      public int actualizarDatos(Producto p, int id){
    int resultado=-1;
           try {
        Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:database.db");    
           
          stmt = c.createStatement();
          
         String nombre = p.getNombre();
         double temperatura = p.getTemperatura();
         double valorBase = p.getValorBase();
         
         String sql = "update productos set nombre='" + nombre + "',temperatura="+ temperatura + ",valorBase=" + valorBase + " where id=" + id;
       
         resultado = stmt.executeUpdate(sql);
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": " + e.getMessage() );
       } 
    
          return resultado;
    
    }
      
      
       public int borrarDatos(int id){
    
             int resultado=-1;
           try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:database.db");    
           
          stmt = c.createStatement();
         
         String sql = "delete from productos where id=" + id;
      
         resultado = stmt.executeUpdate(sql);
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": " + e.getMessage() );
       } 
    
          return resultado;
    
    
    
    }
    
    
    
    
}
