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
public class Berat_ideal extends Frame implements ActionListener{
    Label lNim, lNama, lBerat, lTinggi, showName, showNim, showText;
    TextField tNim, tNama, tBerat, tTinggi;
    Button btnHitung;
    
    Berat_ideal(){
        //LABEL
        lNim = new Label("NIM: ");
        lNim.setBounds(50, 50, 80, 20);
        
        lNama = new Label("Nama: ");
        lNama.setBounds(50, 100, 80, 20);
        
        lBerat = new Label("Berat (kg): ");
        lBerat.setBounds(50, 150, 80, 20);
        
        lTinggi = new Label("Tinggi (m): ");
        lTinggi.setBounds(50, 200, 80, 20);
        
        //TEXTFIELD
        tNim = new TextField();
        tNim.setBounds(130, 50, 200, 20);
        
        tNama = new TextField();
        tNama.setBounds(130, 100, 200, 20);
        
        tBerat = new TextField();
        tBerat.setBounds(130, 150, 200, 20);
        
        tTinggi = new TextField();
        tTinggi.setBounds(130, 200, 200, 20);
        
        //BUTTON
        btnHitung = new Button("Hitung");
        btnHitung.setBounds(170, 250, 70, 35);
           
        //LABEL FOR RESULT
        showNim = new Label();
        showNim.setBounds(70, 330, 200, 20);
        
        showName = new Label();
        showName.setBounds(70, 350, 200, 20);
        
        showText = new Label();
        showText.setBounds(70, 370, 200, 20);
        
        add(lNim); add(lNama); add(lBerat); add(lTinggi);
        add(tNim); add(tNama); add(tBerat); add(tTinggi);
        add(showNim); add(showName); add(showText);
        add(btnHitung);
        
        btnHitung.addActionListener(this);
        
        setTitle("Menghitung Berat Ideal");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        setSize(400,600);
        setLayout(null);
        setVisible(true);
        
    }
    


    public void actionPerformed(ActionEvent e){ 
        int bb = Integer.parseInt(tBerat.getText());
        double tb = Double.parseDouble(tTinggi.getText());
        double tb_kuadrat;
        double hasil = 0;
        String teks = null;
        
        if(e.getSource()==btnHitung){
            tb_kuadrat = Math.pow(tb,2);
            hasil = bb/tb_kuadrat;
            if(hasil > 18.5 && hasil < 22.9){
                teks = "Berat Anda sudah ideal";
            } else{
                teks = "Berat Anda belum ideal";
            }
        }
        
        String result = String.valueOf(hasil);
        
        
        showName.setText(tNama.getText());
        showNim.setText(tNim.getText());
//        showText.setText(result);
        showText.setText(teks);
    
    }
    
    public static void main(String[] args) {
        new Berat_ideal();
    }
}