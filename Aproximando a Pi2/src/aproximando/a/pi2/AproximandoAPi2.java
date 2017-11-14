
package aproximando.a.pi2;
import java.util.Scanner;

public class AproximandoAPi2 {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        
        float PI=4, i;
        int nt;
        
        System.out.print("De un numero ");
        nt= Teclado.nextInt();
        
        for (i=2; i <= nt; i++)
        {
            if (i % 2 == 0)
            {
                PI= PI*(i/(i+1));
            } else
            {
                PI= PI*((i+1)/i);
            }
        }
        System.out.println(PI);
        
    }
}
