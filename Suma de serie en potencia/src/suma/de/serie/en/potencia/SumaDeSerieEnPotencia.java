
package suma.de.serie.en.potencia;
import java.util.Scanner;

public class SumaDeSerieEnPotencia {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        double N, suma=0, contador;
        
        System.out.print("Hasta que número sumar ");
        N=Teclado.nextInt();
        
        for (contador=1; contador <= N; contador++)
        {
            suma=suma+(contador/Math.pow(2, contador));
        }
        System.out.println("La suma es "+suma);
    }
}
