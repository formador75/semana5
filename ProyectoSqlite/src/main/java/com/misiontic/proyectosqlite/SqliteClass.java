/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.proyectosqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author jorge
 */
public class SqliteClass {
    
    
    public void crearConexion(){
    
        Connection c = null;
       try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:test.db");
           System.out.println("La conexion fue un exito");
          c.close();
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": falta la clase " + e.getMessage() );
       } 

    }
    
    
    public void crearTabla(){
       Connection c = null;
       Statement stmt = null;
       try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:test.db");
           System.out.println("La conexion fue un exito");
           
         stmt = c.createStatement();
         String sql = "CREATE TABLE COMPANY " +
                        "(ID INT PRIMARY KEY     NOT NULL," +
                        " NAME           TEXT    NOT NULL, " + 
                        " AGE            INT     NOT NULL, " + 
                        " ADDRESS        CHAR(50), " + 
                        " SALARY         REAL)"; 
           stmt.executeUpdate(sql);
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": falta la clase " + e.getMessage() );
       } 
    
       System.out.println("se creo la tabla");
    }
    
    public void insertDatos(){
          Connection c = null;
       Statement stmt = null;
       try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:test.db");
           System.out.println("La conexion fue un exito");
           
         stmt = c.createStatement();
         String sql = "insert into COMPANY(ID, NAME, AGE, ADDRESS, SALARY) VALUES (2, 'carlos', 33 ,'cll 7 # 11-22', 10000000 )"; 
           stmt.executeUpdate(sql);
           stmt.close();
           c.close();
           
       }catch (Exception e){
       System.err.println(e.getClass().getName() + ": falta la clase " + e.getMessage() );
       } 
    
       System.out.println("se inserto el dato en la tabla");
    }
  
    
     public void llamarDatos(){ 
           Connection c = null;
       Statement stmt = null;
       try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:test.db");
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
