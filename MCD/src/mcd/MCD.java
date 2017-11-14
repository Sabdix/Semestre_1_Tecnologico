
package mcd;
import java.util.Scanner;

public class MCD {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        
        int m, n, r;
        
        System.out.print("De un numero ");
        n=Teclado.nextInt();
        System.out.print("\nDe otro numero mas grande que el primero ");
        m=Teclado.nextInt();
        
        while (n!=0)
        {
            r = m%n;
            m = n;
            n = r;
        }
        System.out.println("El MCD es "+m);
    }
}
