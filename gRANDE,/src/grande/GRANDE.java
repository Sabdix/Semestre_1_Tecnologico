
package grande;
import java.util.Scanner;

public class GRANDE {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        int n, Mayor, Menor, Medio, contador, num, suma;
        
        System.out.print("De la cantidad de numeros");
        n=Teclado.nextInt();
        System.out.println("De un numero");
        num=Teclado.nextInt(); 
        Mayor=num;
        Menor=num;
        Medio=num;
        suma=num;
        for (contador=1; contador <= n-1; contador++)
        {
            System.out.println("De un numero");
            num=Teclado.nextInt();
            if (num > Mayor)
            {
                Mayor=num;
            } else
            {
                if (num < Menor)
                {
                    Menor=num;
                }
            }
            suma=suma+num;
        }
        Medio= suma/n;
        System.out.println("El mayor fue "+Mayor+" El menor fue "+Menor+" Y la Media fue "+Medio);
    }
}
