
package reduccion.de.credito;
import java.util.Scanner;

public class ReduccionDeCredito {

    
    public static void main(String[] args) {
        Scanner Teclado= new Scanner(System.in);
        
        int cuenta, Lcredito,Ncredito, deuda, contador;
        
        for ( contador=1; contador <= 3; contador++)
        {
            System.out.print("Ingrese el número de cuenta ");
            cuenta= Teclado.nextInt();
            
            System.out.print("Ingrese el límite de credito ");
            Lcredito= Teclado.nextInt();
            
            System.out.print("Ingrese la deuda ");
            deuda= Teclado.nextInt();
            
            Ncredito= Lcredito/2;
            
            if (deuda > Ncredito)
            {
                System.out.println("El nuevo límite de credito de la cuenta "+cuenta+" es "+Ncredito);
                System.out.println("La cuenta "+cuenta+" a Excedido su limite de credito");
            } else
            {
                System.out.println("El nuevo límite de credito de la cuenta "+cuenta+" es "+Ncredito);
                
            }
            
        }
    }
}
