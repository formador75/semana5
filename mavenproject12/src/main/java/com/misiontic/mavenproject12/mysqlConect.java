/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.mavenproject12;


import java.sql.*;

 
/**
 *
 * @author jorge
 */
public class mysqlConect {
    
    
      static final String DB_URL = "jdbc:mysql://ls-53e57f4d75bf71d903bb375e09cf1110731bc2f1.coljj43ys5jl.us-east-1.rds.amazonaws.com:3306/misiontic";
   static final String USER = "dbmasteruser";
   static final String PASS = "`|L0S?W(0$-j8QH+FA^k>7{HG?d;hjXL";
   static final String QUERY = "SELECT id, nombre, apellido FROM tripulantes";
    
    public void metodo(){
    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", nombre: " + rs.getString("nombre"));
            System.out.println(", Apellido: " + rs.getString("apellido"));
         }
          conn.close();  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
    
    
    }
}
