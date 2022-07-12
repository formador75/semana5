/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.mavenproject12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jorge
 */
public class MysqlTest {
    
    public void metodo(){
      try{  
    Class.forName("com.mysql.cj.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://ls-53e57f4d75bf71d903bb375e09cf1110731bc2f1.coljj43ys5jl.us-east-1.rds.amazonaws.com:3306/misiontic","dbmasteruser","`|L0S?W(0$-j8QH+FA^k>7{HG?d;hjXL");  
    //here sonoo is database name, root is username and password  
    Statement stmt2=con.createStatement();  
    ResultSet rs=stmt2.executeQuery("select * from tripulantes");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
    
    }
    
}
