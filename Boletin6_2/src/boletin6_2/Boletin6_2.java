package boletin6_2;

import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin6_2 {

    
    public static void main(String[] args) {
       short num1, num2;
        num1 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el primer número:"));
        num2 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el segundo número:"));
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "Suma: " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Resta: " + (num1 - num2));
        }
        else{
            JOptionPane.showMessageDialog(null, "Suma: " + (num1 + num2));
        }
        
    }
    
}
