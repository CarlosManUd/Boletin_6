package boletin6_3;

import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin6_3 {

    
    public static void main(String[] args) {
        double num1;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca un número:"));
        if(num1 > 0)
            JOptionPane.showMessageDialog(null, "+");
        else if(num1 < 0)
            JOptionPane.showMessageDialog(null, "-");
        else
            JOptionPane.showMessageDialog(null, "0");
    }
        
    }
