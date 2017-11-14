

package practica.pkg8;
import java.util.Scanner;

public class Practica8 {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        int N, M;
        System.out.print("¿Cuantas filas quiere?\n");
        N=Teclado.nextInt();
        System.out.println("¿Cuantas columnas quiere?");
        M=Teclado.nextInt();
        
        int matriz[][]=new int[N][M], x, y;
        
        //ciclos para inicializar las localidades de un arreglo bidimensional.
        for (x=0; x < matriz.length; x++)
        {
            for (y=0; y < matriz[x].length; y++)
            {
                matriz[x][y]=(int)(Math.random()*100);
            }
        }
        
        //para capturar desde el teclado elementos para el arreglo bidimensional
        for (x=0; x < matriz.length; x++)
        {
            for (y=0; y< matriz[x].length; y++)
            {
                System.out.printf("\nEn la posición %d, %d tiene el valor %d\n",x, y, matriz[x][y]);
            }
        }
    }
    
}
