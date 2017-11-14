
package factorial.pkg1.n;

public class Factorial1N {

    
    public static void main(String[] args) {
        
        int contador, acum=1;
        
        
        for (contador=1; contador <= 5; contador++)
        {
            acum= acum*contador;
            System.out.println(acum);
        }
    }
}
