/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package entidad;


public class Perro {
    private String nombre;
    private int patas[];
    
    //Constructores

    public Perro() {
        
    }

    public Perro(String nombre, int[] patas) {
        this.nombre = nombre;
        this.patas = patas;
    }
    
    
    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getPatas() {
        return patas;
    }

    public void setPatas(int[] patas) {
        this.patas = patas;
    }

    
    
    //to string

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", patas=" + patas + '}';
    }

    
    
    
}
