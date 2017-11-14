
package calcular.numeros.primos.eratostenes;
import java.util.Scanner;
public class CalcularNumerosPrimosEratostenes {


    public static void main(String[] args) {
        int n, con, band, con2;
        Scanner Teclado= new Scanner(System.in);
        System.out.println("¿Hasta que numero deseas calcular?");
        n=Teclado.nextInt();
        for (con=1; con <= n; con++)
        {
           band=0;
           for (con2=2; con2 <= Math.sqrt(con); con2++)
           {
               if (con % con2 == 0)
               {
                   band=1;
                   break;
               }
           }
           if (band == 0)
           {
               System.out.println(con);
           }
        }
    }
}
