

package pkg7.pkg29.fibonacci;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * (Serie de Fibonacci) La serie de Fibonacci
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * empieza con los términos 0 y 1, y tiene la propiedad de que cada término sucesivo es la suma de los dos términos
 * anteriores.
 * a) Escriba un método llamado fibonacci( n ) que calcule el enésimo número de Fibonacci. Incorpore este
 * método en una aplicación que permita al usuario introducir el valor de n .
 * 
 * b) Determine el número de Fibonacci más grande que puede imprimirse en su sistema.
 * 
 * c) Modifi que la aplicación que escribió en la parte (a), de manera que utilice double en vez de int para calcu-
 * lar y devolver números de Fibonacci, y utilice esta aplicación modifi cada para repetir la parte (b).
 */
import java.util.Scanner;
public class Fibonacci {
    
    static void Fibonacci (int N)
    {
        double a=0, b=1, c;
        
        System.out.print(a+"\n"+b);
                
        for (int contador=1; contador <= N; contador++)
        {
            c= a+b;
            System.out.print("\n"+c);
            a=b;
            b=c;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int N;
        Scanner Teclado=new Scanner(System.in);
        System.out.print("¿Hasta que numero desea calcular?");
        N=Teclado.nextInt();
        
        Fibonacci(N);
        
    }
    
}
