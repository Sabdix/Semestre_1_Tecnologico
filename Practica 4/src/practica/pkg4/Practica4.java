
package practica.pkg4;
import java.util.Scanner;

public class Practica4 {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        int vars[], i;
        vars=new int[100];
        
        for (i=0; i <= 100; i++)
        {
            System.out.print("De un numero ");
            vars[i]=Teclado.nextInt();
            System.out.printf("Posición %d = %d\n",i,vars[i]);
        }
        
    }
}
