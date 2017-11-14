
package pi.leibniz;
import java.util.Scanner;

public class PiLeibniz {

    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        int contador, n;
        double denominador=3, suma=1;
        
        System.out.print("De un numero ");
        n=Teclado.nextInt();
        
        for (contador=2; contador <= n; contador++)
        {
            if (contador % 2 == 0)
            {
                suma=suma-(1/denominador);
            } else
            {
                suma=suma+(1/denominador);
            }
            denominador=denominador+2;
        }
        System.out.println(suma*4);
    }
}
