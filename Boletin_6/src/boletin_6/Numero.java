package boletin_6;

import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
class Numero {
     public void positivo(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("teclea un numero : "));
        if (num>0) JOptionPane.showMessageDialog(null, "É positivo");
    }
    
    
}
