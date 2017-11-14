
package suma.de.serie;
import java.util.Scanner;

public class SumaDeSerie {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        int N; 
        double suma=0, contador;
        
        System.out.print("Hasta que numero sumar ");
        N=Teclado.nextInt();
        
        for (contador=1; contador <= N; contador++)
        {
            suma=suma+(1/contador);
        }
        System.out.println("La suma es "+suma);
    }
}
