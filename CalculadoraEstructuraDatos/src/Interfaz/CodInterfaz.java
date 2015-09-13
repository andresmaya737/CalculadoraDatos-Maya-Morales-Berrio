/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import calculadora.ArrayStack;
import calculadora.Calculos;

/**
 *
 * @author Andres MaYa7
 */
public class CodInterfaz extends JFrame {

    ArrayStack<Character> pilaCadena = new ArrayStack<>();
    Calculos ob = new Calculos();
    
    private ArrayList<Character> vector = new ArrayList<Character>();
    
    private int tamaño;
    private char propiedad;

    private JTextField txtCampoTexto;
    private JTextField txtResultado;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnLimpiar;
    private JButton btnBorrar;
    private JButton btnNum0;
    private JButton btnNum1;
    private JButton btnNum2;
    private JButton btnNum3;
    private JButton btnNum4;
    private JButton btnNum5;
    private JButton btnNum6;
    private JButton btnNum7;
    private JButton btnNum8;
    private JButton btnNum9;
    private JButton btnPunto;
    private JButton btnResultado;

    private JPanel panelTexto;
    private JPanel panelBotones;

    public CodInterfaz() {
        super("CALCULADORA!");

        setLayout(null);

        btnSumar = new JButton("+");
        btnRestar = new JButton("-");
        btnMultiplicar = new JButton("*");
        btnDividir = new JButton("/");
        txtCampoTexto = new JTextField();
        txtResultado = new JTextField();
        btnBorrar = new JButton("CE");
        btnLimpiar = new JButton("C");
        btnResultado = new JButton("=");
        btnPunto = new JButton(".");

        btnNum0 = new JButton("0");
        btnNum1 = new JButton("1");
        btnNum2 = new JButton("2");
        btnNum3 = new JButton("3");
        btnNum4 = new JButton("4");
        btnNum5 = new JButton("5");
        btnNum6 = new JButton("6");
        btnNum7 = new JButton("7");
        btnNum8 = new JButton("8");
        btnNum9 = new JButton("9");

        txtCampoTexto.setSize(245, 25);
        txtCampoTexto.setLocation(5, 5);

        txtResultado.setSize(220, 25);
        txtResultado.setLocation(5, 29);
        txtResultado.setText("=");
        txtResultado.enable(false);

        btnBorrar.setSize(55, 50);
        btnBorrar.setLocation(255, 5);
        btnBorrar.setBackground(Color.red);

        btnLimpiar.setSize(55, 50);
        btnLimpiar.setLocation(315, 5);
        btnLimpiar.setBackground(Color.red);

        btnNum7.setSize(75, 55);
        btnNum7.setLocation(5, 60);

        btnNum8.setSize(75, 55);
        btnNum8.setLocation(90, 60);

        btnNum9.setSize(75, 55);
        btnNum9.setLocation(175, 60);

        btnDividir.setSize(115, 55);
        btnDividir.setLocation(255, 60);
        btnDividir.setBackground(Color.green);

        btnNum4.setSize(75, 55);
        btnNum4.setLocation(5, 130);

        btnNum5.setSize(77, 55);
        btnNum5.setLocation(90, 130);

        btnNum6.setSize(77, 55);
        btnNum6.setLocation(175, 130);

        btnMultiplicar.setSize(115, 55);
        btnMultiplicar.setLocation(255, 130);
        btnMultiplicar.setBackground(Color.green);

        btnNum1.setSize(77, 55);
        btnNum1.setLocation(5, 200);

        btnNum2.setSize(77, 55);
        btnNum2.setLocation(90, 200);

        btnNum3.setSize(77, 55);
        btnNum3.setLocation(175, 200);

        btnRestar.setSize(115, 55);
        btnRestar.setLocation(255, 200);
        btnRestar.setBackground(Color.green);

        btnNum0.setSize(77, 55);
        btnNum0.setLocation(5, 270);

        btnPunto.setSize(77, 55);
        btnPunto.setLocation(90, 270);

        btnResultado.setSize(77, 55);
        btnResultado.setLocation(175, 270);

        btnSumar.setSize(115, 55);
        btnSumar.setLocation(255, 270);
        btnSumar.setBackground(Color.green);

        add(txtCampoTexto);
        add(txtResultado);
        add(btnBorrar);
        add(btnLimpiar);
        add(btnNum7);
        add(btnNum8);
        add(btnNum9);
        add(btnDividir);
        add(btnNum4);
        add(btnNum5);
        add(btnNum6);
        add(btnMultiplicar);
        add(btnNum1);
        add(btnNum2);
        add(btnNum3);
        add(btnRestar);
        add(btnNum0);
        add(btnPunto);
        add(btnResultado);
        add(btnSumar);

        AccionBoton1 ob1 = new AccionBoton1();
        btnNum1.addActionListener(ob1);

        AccionBoton2 ob2 = new AccionBoton2();
        btnNum2.addActionListener(ob2);

        AccionBoton3 ob3 = new AccionBoton3();
        btnNum3.addActionListener(ob3);

        AccionBoton4 ob4 = new AccionBoton4();
        btnNum4.addActionListener(ob4);

        AccionBoton5 ob5 = new AccionBoton5();
        btnNum5.addActionListener(ob5);

        AccionBoton6 ob6 = new AccionBoton6();
        btnNum6.addActionListener(ob6);

        AccionBoton7 ob7 = new AccionBoton7();
        btnNum7.addActionListener(ob7);

        AccionBoton8 ob8 = new AccionBoton8();
        btnNum8.addActionListener(ob8);

        AccionBoton9 ob9 = new AccionBoton9();
        btnNum9.addActionListener(ob9);

        AccionBoton0 ob0 = new AccionBoton0();
        btnNum0.addActionListener(ob0);

        AccionBotonBorrar obBorrar = new AccionBotonBorrar();
        btnBorrar.addActionListener(obBorrar);

        AccionBotonLimpiar obLimpiar = new AccionBotonLimpiar();
        btnLimpiar.addActionListener(obLimpiar);

        AccionBotonResultado obResultado = new AccionBotonResultado();
        btnResultado.addActionListener(obResultado);
        
        AccionBotonMultiplicar obMultipliar = new AccionBotonMultiplicar();
        btnMultiplicar.addActionListener(obMultipliar);
        
        AccionBotonDividir obDividir = new AccionBotonDividir();
        btnDividir.addActionListener(obDividir);
        
        AccionBotonRestar obRestar = new AccionBotonRestar();
        btnRestar.addActionListener(obRestar);
        
        AccionBotonSumar obSumar = new AccionBotonSumar();
        btnSumar.addActionListener(obSumar);

    }

    private class AccionBoton1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "1");
        }

    }

    private class AccionBoton2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "2");
        }

    }

    private class AccionBoton3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "3");
        }

    }

    private class AccionBoton4 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "4");
        }

    }

    private class AccionBoton5 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "5");
        }

    }

    private class AccionBoton6 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "6");
        }

    }

    private class AccionBoton7 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "7");
        }

    }

    private class AccionBoton8 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "8");
        }

    }

    private class AccionBoton9 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "9");
        }

    }

    private class AccionBoton0 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "0");
        }

    }

    ArrayStack<Character> nuevaPila = new ArrayStack();

    private class AccionBotonBorrar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String cadena = txtCampoTexto.getText();
            char[] vectorCadena = cadena.toCharArray();
            txtCampoTexto.setText("");

            for (int i = 0; i < vectorCadena.length - 1; i++) {
                txtCampoTexto.setText(txtCampoTexto.getText() + vectorCadena[i]);
            }
        }
    }

    private class AccionBotonLimpiar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText("");
        }

    }

    private class AccionBotonResultado implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            pilaCadena.clearAll();
            String cadena = txtCampoTexto.getText();
            double resultado = ob.definirPrioridad(cadena);
            txtResultado.setText(String.valueOf(resultado));
                    
        }
    }



    
    private class AccionBotonMultiplicar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "*");
        }

    }
    
    private class AccionBotonDividir implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "/");
        }

    }
    private class AccionBotonSumar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "+");
        }

    }
    
    private class AccionBotonRestar implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            txtCampoTexto.setText(txtCampoTexto.getText() + "-");
        }

    }
    
    
}
