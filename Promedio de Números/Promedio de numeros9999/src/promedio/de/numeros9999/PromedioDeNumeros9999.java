
package promedio.de.numeros9999;
import java.util.Scanner;

public class PromedioDeNumeros9999 {

    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        int n=0, suma=0, conteo=0, promedio;
        
        while (n != 9999)
        {
            System.out.println("De un numero (Tecle 9999 para terminar)");
            n= Teclado.nextInt();
            
            if (n == 9999)
            {
                break;
            } else
            {
                conteo= conteo + 1;
                suma= suma + n;
            }
        }
        promedio= suma/conteo;
        System.out.println("El promedio es"+promedio);
    }
}
