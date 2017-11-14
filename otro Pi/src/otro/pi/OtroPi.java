
package otro.pi;
import java.util.Scanner;

public class OtroPi {

    
    public static void main(String[] args) {
        Scanner Teclado= new Scanner(System.in);
        
        double num=2, Pi=1;
        int con, N;
        
        System.out.print("De un numero ");
        N=Teclado.nextInt();
        
        for (con=1; con <= N; con++)
        {
            if (con % 2 == 0)
            {
                Pi=Pi*num/(num+1);
                num=num+2;
            } else
            {
                Pi=Pi*num/(num-1);
            }
        }
        System.out.println(Pi * 2);
    }
}
