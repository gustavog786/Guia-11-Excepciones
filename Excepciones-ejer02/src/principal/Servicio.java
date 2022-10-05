/*

 */
package principal;

import entidad.Persona;
import java.util.Scanner;


class Servicio {
    
     public void prueba() throws Exception
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona[] Lista = new Persona[1];
        
        System.out.println("Ingrese una posicion para mostrala");
        int indice = leer.nextInt();

        if(indice>Lista.length)
        throw new Exception("Esa persona no existe");
        
    }
}
