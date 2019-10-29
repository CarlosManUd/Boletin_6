package boletin6_4;

/**
 *
 * @author cfigueirasvalverde
 */
class Persona {

    private String nombre;
    private double peso;
    
    public Persona(){}
    public Persona(String nombre, double peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    public String getNombre(){
        return nombre;
    }
    
    
}
