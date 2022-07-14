/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.modelo;

import com.misiontic.controlador.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jorge
 */
public class MysqlProducto {
    
     
    public void insertarProducto(Producto p){
          Connection c = null;
       Statement stmt = null;
       try {
       Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection(  
    "jdbc:mysql://ls-53e57f4d75bf71d903bb375e09cf1110731bc2f1.coljj43ys5jl.us-east-1.rds.amazonaws.com:3306/farmacia","dbmasteruser","`|L0S?W(0$-j8QH+FA^k>7{HG?d;hjXL");
           System.out.println("La conexion fue un exito");
           
          stmt = c.createStatement();
         int id = p.getId();
         String nombre = p.getNombre();
         double temperatura = p.getTemperatura();
         double valorbase = p.getValorBase();
         
         String sql = "insert into productos(nombre,id,temperatura, valorbase) VALUES ('"+ nombre +"','"+ id +"','"+ temperatura +"',' "+ valorbase  +"')"; 
           stmt.executeUpdate(sql);
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": " + e.getMessage() );
       } 
    }
  
    
     public void llamarDatos(){ 
           Connection c = null;
       Statement stmt = null;
       try {
       Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection(  
    "jdbc:mysql://ls-53e57f4d75bf71d903bb375e09cf1110731bc2f1.coljj43ys5jl.us-east-1.rds.amazonaws.com:3306/misiontic","dbmasteruser","`|L0S?W(0$-j8QH+FA^k>7{HG?d;hjXL");
           System.out.println("La conexion fue un exito");
    
           
         stmt = c.createStatement();
         String sql = "select * from COMPANY"; 
          
           ResultSet rs  = stmt.executeQuery(sql);
           
           while (rs.next()){
           int id = rs.getInt("ID");
           String name = rs.getString("NAME");
           int age = rs.getInt("AGE");
           String address = rs.getString("ADDRESS");
           float salary = rs.getFloat("SALARY");
           System.out.println("id=" + id);
           System.out.println("name=" + name);
           System.out.println("age=" + age);
           System.out.println("address=" + address);
           System.out.println("salary=" + salary);
           
           }
           
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": falta la clase " + e.getMessage() );
       } 
    
     
      
    
    
    }
    
     
      public void actualizarDatos(){
    
    
    
    }
      
      
       public void borrarDatos(){
    
    
    
    }
    
    
    
}
