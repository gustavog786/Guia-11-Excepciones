/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package principal;

import java.util.Scanner;


public class PirncipalEjer05 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        int secreto= (int) (Math.random()*500+1);
        int n= 0;
        int cont= 0;
        do {   
            try {
                Scanner scan = new Scanner(System.in).useDelimiter("\n");
             System.out.println("adivine un numero secreto: ");
             n=scan.nextInt();
             if (n > secreto) {
                 cont++;
                 System.out.println("El numero a adivinar es menor, ingrese otro");
            }
             if (n< secreto) {
                 cont++;
                 System.out.println("El numero a adivinar es mayor, ingrese otro");
            }
                
            } catch (Exception e) {
                System.out.println("capttre la excepcion " + e.getClass());
            }    
        } while (n!=secreto);
        System.out.println("Luego de " +cont+ "");
        System.out.println("Avininaste, el numero secreto es: "+ secreto);
    }   
}
