
package practica.pkg2;
import java.util.Scanner;

public class Practica2 {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        
        int Duracion, Tipo=0, contador=0;
        double costo=0;
        
        while (Tipo != -1)
        {
            System.out.print("Ingrese el tipo de llamada");
            System.out.print("\n1.- Internacional");
            System.out.print("\n2.- Nacional");
            System.out.print("\n3.- Local");
            System.out.println("\n-1.- Salir ");
            Tipo=Teclado.nextInt();
            
            System.out.print("Ingrese la duración en minutos ");
            Duracion=Teclado.nextInt();
            
            switch (Tipo)
            {
                case 1:
                    if (Duracion >= 3)
                    {
                        Duracion=Duracion-3;
                        costo=(Duracion*3.03)+7.59;
                        System.out.println("Total a pagar: "+costo);
                        break;
                    } else
                    {
                        costo= 7.59;
                        System.out.println("Total a pagar: "+costo);
                        break;
                    }
                case 2:
                    if (Duracion > 3)
                    {
                        Duracion=Duracion-3;
                        costo=(Duracion*0.48)+1.20;
                        System.out.println("Total a pagar: "+costo);
                        break;
                    } else
                    {
                        costo=1.20;
                        System.out.println("Total a pagar: "+costo);
                        break;
                    }
                case 3:
                    if (contador > 50)
                    {
                        contador=contador-50;
                        costo=contador*0.60;
                        System.out.println("Total a pagar: "+costo);
                        break;
                    } else
                    {
                        contador++;
                        costo=0;
                        System.out.println("Total a pagar: "+costo);
                        break;
                    }
                        
            }
        }
    }
}
