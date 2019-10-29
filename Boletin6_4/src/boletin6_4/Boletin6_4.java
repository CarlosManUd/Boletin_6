package boletin6_4;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin6_4 {

    
    public static void main(String[] args) {
        Persona p1 = new Persona("Paco", 76.3);
        Persona p2 = new Persona("Luis", 57.6);
        if(p1.getPeso() > p2.getPeso()){
            System.out.println(p1.getNombre() + " pesa más que " + p2.getNombre());
            System.out.println("La diferencia de peso es de " + (p1.getPeso() - p2.getPeso()));
        }
        else{
            System.out.println(p2.getNombre() + " pesa más que " + p1.getNombre());
            System.out.println("La diferencia de peso es de " + (p2.getPeso() - p1.getPeso()));
        }
    }
        
    }
    