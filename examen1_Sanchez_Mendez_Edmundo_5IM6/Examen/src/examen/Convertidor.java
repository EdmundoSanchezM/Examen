/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Alumno
 */

public class Convertidor extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1583724102189855698L;
    JTextField poner;
    JPanel numeritos,botoncitos;
    JButton botonnum,botonnum1,botonnum2,botonnum3,botonnum4,botonnum5,botonnum6,botonnum7,botonnum8,botonnum9,botonnump,borrar,convertir;
    public Convertidor(){
       configurarVentana();
       iniciarComponentes();
    }
    private void configurarVentana() {
        setTitle("Convertidor");
        setSize(315,275);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setBackground(new Color(220,216,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void iniciarComponentes() {
        poner= new JTextField();
        poner.setBounds(0, 0, 315, 35);
	poner.setFont(new Font("Arial", Font.BOLD, 25));
        poner.setHorizontalAlignment(JTextField.CENTER);
	poner.setEditable(false);
        add(poner);
        poner.setVisible(true);
        
       numeritos = new JPanel();
       numeritos.setLayout(new GridLayout(4, 3));
       numeritos.setBorder(new EmptyBorder(4, 4, 4, 4));
       
       botonnum = new JButton("0");
       botonnum.setBounds(10, 40, 50, 50);
	botonnum.setFont(new Font("Arial", Font.BOLD, 25));
        botonnum.setHorizontalAlignment(JTextField.CENTER);
        botonnum.addActionListener(this);
        add(botonnum);
        botonnum.setVisible(true);
        
        botonnum1 = new JButton("1");
       botonnum1.setBounds(60, 40, 50, 50);
	botonnum1.setFont(new Font("Arial", Font.BOLD, 25));
        botonnum1.setHorizontalAlignment(JTextField.CENTER);
        botonnum1.addActionListener(this);
        add(botonnum1);
        botonnum1.setVisible(true);
        
        botonnum2 = new JButton("2");
       botonnum2.setBounds(110, 40, 50, 50);
	botonnum2.setFont(new Font("Arial", Font.BOLD, 25));
        botonnum2.setHorizontalAlignment(JTextField.CENTER);
        botonnum2.addActionListener(this);
        add(botonnum2);
        botonnum2.setVisible(true);
        
        botonnum3 = new JButton("3");
       botonnum3.setBounds(10, 90, 50, 50);
	botonnum3.setFont(new Font("Arial", Font.BOLD, 25));
        botonnum3.setHorizontalAlignment(JTextField.CENTER);
        botonnum3.addActionListener(this);
        add(botonnum3);
        botonnum3.setVisible(true);
        
        botonnum4 = new JButton("4");
       botonnum4.setBounds(60, 90, 50, 50);
	botonnum4.setFont(new Font("Arial", Font.BOLD, 25));
        botonnum4.setHorizontalAlignment(JTextField.CENTER);
        botonnum4.addActionListener(this);
        add(botonnum4);
        botonnum4.setVisible(true);
        
        botonnum5 = new JButton("5");
       botonnum5.setBounds(110, 90, 50, 50);
	botonnum5.setFont(new Font("Arial", Font.BOLD, 25));
        botonnum5.setHorizontalAlignment(JTextField.CENTER);
        botonnum5.addActionListener(this);
        add(botonnum5);
        botonnum5.setVisible(true);
         
        botonnum6= new JButton("6");
       botonnum6.setBounds(10, 140, 50, 50);
	botonnum6.setFont(new Font("Arial", Font.BOLD, 25));
        botonnum6.setHorizontalAlignment(JTextField.CENTER);
        botonnum6.addActionListener(this);
        add(botonnum6);
        botonnum6.setVisible(true);
        
        botonnum7 = new JButton("7");
       botonnum7.setBounds(60, 140, 50, 50);
	botonnum7.setFont(new Font("Arial", Font.BOLD, 25));
        botonnum7.setHorizontalAlignment(JTextField.CENTER);
        botonnum7.addActionListener(this);
        add(botonnum7);
        botonnum7.setVisible(true);
        
        botonnum8 = new JButton("8");
       botonnum8.setBounds(110, 140, 50, 50);
	botonnum8.setFont(new Font("Arial", Font.BOLD, 25));
        botonnum8.setHorizontalAlignment(JTextField.CENTER);
        botonnum8.addActionListener(this);
        add(botonnum8);
        botonnum8.setVisible(true);
        
        botonnum9 = new JButton("9");
       botonnum9.setBounds(10, 190, 50, 50);
	botonnum9.setFont(new Font("Arial", Font.BOLD, 25));
        botonnum9.setHorizontalAlignment(JTextField.CENTER);
        botonnum9.addActionListener(this);
        add(botonnum9);
        botonnum9.setVisible(true);
        
        botonnump = new JButton(".");
       botonnump.setBounds(60, 190, 50, 50);
	botonnump.setFont(new Font("Arial", Font.BOLD, 25));
        botonnump.setHorizontalAlignment(JTextField.CENTER);
        botonnump.addActionListener(this);
        add(botonnump);
        botonnump.setVisible(true);
        
        botoncitos = new JPanel();
       botoncitos.setLayout(new GridLayout(4, 3));
       botoncitos.setBorder(new EmptyBorder(4, 4, 4, 4));
       
       borrar = new JButton("CE");
       borrar.setBounds(225, 40, 75, 100);
	borrar.setFont(new Font("Arial", Font.BOLD, 25));
        borrar.setHorizontalAlignment(JTextField.CENTER);
       borrar.addActionListener(this);
        add(borrar);
        borrar.setVisible(true);
        
        convertir = new JButton("=");
       convertir.setBounds(225, 140, 75, 100);
	convertir.setFont(new Font("Arial", Font.BOLD, 25));
        convertir.setHorizontalAlignment(JTextField.CENTER);
        convertir.addActionListener(this);
        add(convertir);
        convertir.setVisible(true);
    }
     @Override
    public void actionPerformed(ActionEvent e){
        String billetes=poner.getText();
        
        if(e.getSource()==botonnum){
            String valoru="0";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==botonnum1){
             String valoru="1";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==botonnum2){
            String valoru="2";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==botonnum3){
            String valoru="3";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==botonnum4){
            String valoru="4";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==botonnum5){
            String valoru="5";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==botonnum6){
            String valoru="6";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==botonnum7){
            String valoru="7";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==botonnum8){
            String valoru="8";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==botonnum9){
            String valoru="9";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==botonnump){
            String valoru=".";
            billetes = billetes + valoru;
            poner.setText(billetes);
        }else if(e.getSource()==borrar){
            JOptionPane.showMessageDialog(this, "Se borrar el numero puesto :)");
            poner.setText("");
        }else if(e.getSource()==convertir){
            String pp = poner.getText();
            if(pp.isEmpty()){
                JOptionPane.showMessageDialog(this, "No puso ningun numero");
            }else{
                double manejobilletes = Double.parseDouble(pp);
                double resulf = manejobilletes/20;
                JOptionPane.showMessageDialog(this, "Ustd puso "+manejobilletes+" pesos y el equivalente en dolares es \n"+resulf+" dolares aun asi le ponemos el resultado en el campo de texto");
                poner.setText(Double.toString(resulf));
            }
        }
    }
}
