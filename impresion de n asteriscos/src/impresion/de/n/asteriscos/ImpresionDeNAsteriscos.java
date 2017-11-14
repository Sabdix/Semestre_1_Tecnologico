
package impresion.de.n.asteriscos;
import java.util.Scanner;

public class ImpresionDeNAsteriscos {

    
    public static void main(String[] args) {
        Scanner Teclado= new Scanner(System.in);
        
        int n, contador1, contador2;
        
        for (contador1=1; contador1 < 5; contador1++)
        {
            System.out.print("De la cantidad de asteriscos a imprimir (menor que 30) ");
            n=Teclado.nextInt();
            
            for (contador2=1; contador2 <= n; contador2++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
