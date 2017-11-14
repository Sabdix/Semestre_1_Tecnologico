
package diamante;
import java.util.Scanner;

public class Diamante {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        
        int renglones, asteriscos, espacios, n, N=1, N2;
        
        System.out.print("De que tamaño quiere el diamante? (Solo numeros impares) ");
        N2= Teclado.nextInt();
        
        if (N2%2==1)
        {
            n= (N2+1)/2;
                    for (renglones=1; renglones <= N2/2; renglones++)
                        {
                            for (espacios=1; espacios <= n; espacios++)
                                {
                                    System.out.print(" ");
                                }
                            for (asteriscos=1; asteriscos <= N; asteriscos++)
                                {
                                    System.out.print("*");
                                }
                            System.out.print("\n");
                            n= n-1;
                            N= N+2;
                        }
                    n=1;
                    N= N2;
                    for (renglones=1; renglones <= N2/2+1; renglones++)
                        {
                            for (espacios=1; espacios <= n; espacios++)
                                {
                                    System.out.print(" ");
                                }
                            for (asteriscos=1; asteriscos <= N; asteriscos++)
                                {
                                    System.out.print("*");
                                }
                            System.out.print("\n");
                            n= n+1;
                            N= N-2;
                        }
        } else
        {
            System.out.println("El numero no es impar");
        }
  }
}