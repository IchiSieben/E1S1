/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1e1;

import javax.swing.JOptionPane;
import java.lang.Math;

/**
 *
 * @author DesktopN°1
 */
public class S1E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String radioInput = JOptionPane.showInputDialog(null,"ingrese el radio del circulo");
        
        int radio = Integer.parseInt(radioInput);
        
        double area = (Math.pow(radio,2))*Math.PI;
        
        System.out.println("el área del ciruclo es: "+area);
        
    }
    
}
