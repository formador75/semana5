/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misiontic.mavenproject1;

import javax.swing.*;

/**
 *
 * @author jorge
 */
public class Formulario extends JFrame {
    private JLabel label1,label2; 
    
    public Formulario(){
    label1=new JLabel("Digite los datos del usuario."); 
    label1.setBounds(5,50,300,15); 
    add(label1); 
    label2=new JLabel("Version 0.0.1");
label2.setBounds(5,150,150,15);
add(label2);
    }
    
    
    
}
