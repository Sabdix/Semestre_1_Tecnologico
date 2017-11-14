

package pkg7.pkg13;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * Etiquete los elementos del arreglo bidimensional ventas de tres por cinco, 
 * para indicar el orden en que se establecen en cero.
 */

public class Main {
    
    static void Inicializar (int arreglo[][])
    {
        for (int fila=0; fila < arreglo.length; fila++)
        {
            for (int col = 0; col < arreglo[fila].length; col++)
            {
                arreglo[fila][col]= 1;
            }
        }
    }
    
    static void Imprimir (int arreglo [][])
    {
        for (int fila=0; fila < arreglo.length; fila++)
        {
            for (int col = 0; col < arreglo[fila].length; col++)
            {
                System.out.print(arreglo[fila][col]+"\t");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        int ventas[][]=new int[3][5];
        
        Inicializar(ventas);
        
        for (int fila=0; fila < ventas.length; fila++)
        {
            for (int col = 0; col < ventas[fila].length; col++)
            {
                ventas[fila][col] = 0;
                Imprimir(ventas);
                System.out.println("\n\n");
            }
        }
    }
    
}
