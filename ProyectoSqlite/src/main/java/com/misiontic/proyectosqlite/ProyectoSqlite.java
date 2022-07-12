/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.misiontic.proyectosqlite;

import java.sql.*;

/**
 *
 * @author jorge
 */
public class ProyectoSqlite {

    public static void main(String[] args) {
       
        SqliteClass s = new SqliteClass();
        s.crearConexion();
        s.crearTabla();
        
        
    }
}
