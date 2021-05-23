/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Praktik;

import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author abdil
 */
public class Kalkulator extends Frame implements ActionListener{
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;
    Label l1,l2,l3;
    
    Kalkulator() {  
        //LABEL
        l1 = new Label("Angka Pertama");
        l1.setBounds(50, 50, 100, 20);
        
        l2 = new Label("Angka Kedua");
        l2.setBounds(50, 100, 100, 20);
        
        l3 = new Label("Hasil");
        l3.setBounds(50, 150, 50, 20);
                    
        //TEXT FIELD
        t1 = new TextField();
        t1.setBounds(150, 50, 50, 20);

        t2 = new TextField();
        t2.setBounds(150, 100, 50, 20);
        
        t3 = new TextField();
        t3.setBounds(150, 150, 50, 20);
        
        //BUTTON
        b1 = new Button("+");
        b1.setBounds(50, 200, 50, 50);
        
        b2 = new Button("-");
        b2.setBounds(120, 200, 50, 50);
        
        b3 = new Button("X");
        b3.setBounds(50, 270, 50, 50);
        
        b4 = new Button(":");
        b4.setBounds(120, 270, 50, 50);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
               
        add(l1); add(l2); add(l3);
        add(t1); add(t2); add(t3);
        add(b1); add(b2); add(b3); add(b4);
        setSize(260, 400);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        })
        setLayout(null);
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent e){
        String s1 = t1.getText();
        String s2 = t2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        
        if(e.getSource()==b1){
            c = a+b;
        }
        else if(e.getSource()==b2){
            c = a-b;
        }
        else if(e.getSource()==b3){
            c = a*b;
        }
        else if(e.getSource()==b4){
            c = a/b;
        }
        
        String result = String.valueOf(c);
        t3.setText(result);
    }
    
    public static void main(String[] args) {
        new Kalkulator();
    }

}
