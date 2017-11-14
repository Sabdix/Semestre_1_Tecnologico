

package pkg7.pkg9;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * Considere un arreglo t de dos por tres.
 * a).- Escriba una instruccion que declare y cree a t.
 * e).- Escriba expresiones de acceso para todos los elementos en la fila 1 de t
 * f).- Escriba expresiones de acceso para todos los elementos en la columna 2 de t
 * g).- Escriba una sola instruccion que asigne cero al elemento de t en la fila 0 y la columna 1
 * h).- Escriba una serie de instrucciones que inicialice cada elemento de t con cero.
 * No utilice una instruccion de repeticion.
 * i).- Escriba una instruccion for anidada que inicialice cada elemento de t en cero
 * j).- Escriba una instruccion for anidada que reciba como entrada del usuario los valores de los elementos de t
 */
import java.util.Scanner;

public class Main {
    static Scanner Teclado=new Scanner(System.in);
    
    static void Imprimir (int arreglo[][])
    {
        for (int fila = 0; fila < arreglo.length; fila++)
        {
            for (int columna = 0; columna < arreglo[fila].length; columna++)
            {
                System.out.print(arreglo[fila][columna]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
    
    //i).-
    static void Inicializar (int arreglo[][])
    {
        for (int fila=0; fila < arreglo.length; fila++)
        {
            for (int columna=0; columna < arreglo[fila].length; columna++)
            {
                arreglo[fila][columna]= 0;
            }
        }
    }
    
    //j).-
    static void Pedir (int arreglo[][])
    {
        for (int fila=0; fila < arreglo.length; fila++)
        {
            for (int columna=0; columna < arreglo[fila].length; columna++)
            {
                System.out.println("\nDe un numero ");
                arreglo[fila][columna]= Teclado.nextInt();
            }
        }
    }

    
    public static void main(String[] args) {
        //a).-
        int t [][]=new int [2][3];
        
        //e).-
        t[0][0]= 1;
        t[0][1]= 1;
        t[0][2]= 1;
        Imprimir(t);
        
        //f).-
        t[0][2]= 1;
        t[1][2]= 1;
        Imprimir(t);
        
        //g).-
        t[0][1]= 0;
        Imprimir(t);
        
        //h).-
        t[0][0]= 0;
        t[0][1]= 0;
        t[0][2]= 0;
        t[1][0]= 0;
        t[1][1]= 0;
        t[1][2]= 0;
        Imprimir(t);
        
        //i).-
        Inicializar(t);
        Imprimir(t);
        
        //j).-
        Pedir(t);
        Imprimir(t);
    }
    
}
