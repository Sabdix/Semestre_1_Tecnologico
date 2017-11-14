
package el.mayor.de.n.numeros;
import java.util.Scanner;

public class ElMayorDeNNumeros {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        
        int n, n2, mayor, contador;
        
        System.out.print("Indique el primer numero a evaluar y la cantidad de numeros que restan(Es el mismo numero) ");
        n= Teclado.nextInt();
        
        mayor= n;
        
        for (contador=1; contador <= n; contador++)
        {
            System.out.print("De el siguiente numero ");
            n2= Teclado.nextInt();
            if (n2 > mayor)
            {
               mayor= n2;
            }
        }
        System.out.println("El mayor fue "+mayor);
    }
}
