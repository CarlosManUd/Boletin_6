package boletin_6;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin_6 {

    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número positivo:");
        double num = teclado.nextDouble();
        if(num > 0){
            System.out.println(num + " es un número positivo");
        }
    }
        
    }
