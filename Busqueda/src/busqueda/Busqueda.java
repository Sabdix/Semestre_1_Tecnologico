
package busqueda;
import java.util.Scanner;


public class Busqueda {
    static int arreglo[] = new int[100];
    
    static void InicializarArreglo()
    {
        for (int i=0; i<100; i++)
        {
            arreglo[i]=(int)(Math.random()*100);
        }
    }
    static void ImprimirArreglo()
    {
        for(int i=0; i<100; i++)
        {
            System.out.println("arreglo["+i+"]= "+arreglo[i]);
        }
    }
    static boolean busquedac(int valor){
        for(int i=0; i<100; i++)
        {
            if (valor == arreglo[i])
            {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int buscar,i;
        Scanner Teclado=new Scanner(System.in);
        InicializarArreglo();
        ImprimirArreglo();
        System.out.print("¿Valor a Buscar? ");
        buscar=Teclado.nextInt();
        if (busquedac(buscar)==true)
        {
            System.out.println("Exito");
        } else
        {
            System.out.println("No hay");
        }
    }
}
