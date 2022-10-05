/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Perro;
import java.util.Scanner;


public class PrincipalEjer02 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio S = new Servicio();
        try{
        S.prueba(); 
//        System.out.println("Ingrese una posicion para mostrala");
//        int indice = leer.nextInt();
//        
//        
//     
//           if(indice>Lista.length)
//           throw new Exception("Esa persona no existe");
        }
        catch(Exception e){
                System.out.println(e.getMessage());
        }
    }
}
