/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Interfaz.CodInterfaz;
import javax.swing.JFrame;

/**
 *
 * @author Andres MaYa7
 */
public class CalculadoraEstructuraDatos {

    
    public static void main(String[] args) {
        CodInterfaz cal = new CodInterfaz();
        cal.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        cal.setLocationRelativeTo(null);
        cal.setSize( 393, 380); 
        cal.setResizable(false);
        cal.setVisible( true ); 
        
    }
    
}
