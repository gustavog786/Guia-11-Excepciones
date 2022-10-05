/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package principal;

import static java.lang.Integer.parseInt;
import java.util.Scanner;


public class DivisionNumero {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros: ");
        String cad1= scan.next();
        String cad2= scan.next();
        int num1= parseInt(cad1);
        int num2= parseInt(cad2);
        
        System.out.println("La division de los numeros es "+ num1/num2);
        
    }
    
}
