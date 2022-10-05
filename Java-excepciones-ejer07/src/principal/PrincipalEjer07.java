/*
Dado el método metodoB de la clase B, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
class B {
public void metodoB() {
sentencia_b1
try {
sentencia_b2
} catch (MioException e){
sentencia_b3
}
finally
sentencia_b4
}
}

a) si se produce la MioExcption
se ejecutan
sentincia_b1
sentincia_b2
sentincia_b3
sentincia_b4 (la sentencia finally se ejecuta siempre)

b)Si no se produce la MioException
se ejecutan
sentincia_b1
sentincia_b2
sentincia_b4 y finaliza el programa
 */
package principal;


public class PrincipalEjer07 {

   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
