
package calcular.numeros.primos;
import java.util.Scanner;

public class CalcularNumerosPrimos {

    public static void main(String[] args) {
        int con, n, band=1;
        Scanner Teclado= new Scanner(System.in);
        System.out.println("Introduce un numero");
        n=Teclado.nextInt();
        for(con = 2; con <= Math.sqrt(n); con++)
        {
            if (n % con == 0)
            {
                band=0;
                break;
            }
        }
        if (band == 0)
        {
            System.out.println("El numero "+n+" no es primo");
        } else
        {
            System.out.println("El numero "+n+" es primo");
        }
    }
}
