

package pkg7.pkg9.k.l.m;

/**
*@author Sabdi Abraham Pantoja Orozco
* No. de Control: 13121157
* 
* k).- Escriba una serie de instrucciones que determine e imprima el valor mas pequeño en t
* l).- Escriba una instruccion printf que muestre los elementos de la primera fila de t. No utilice repeticion
* m).- Escriba una instruccion que totalice los elementos de la tercera columna de t. No utilice repeticion
*/

public class KLM {
    //k).-
    static void Inicializar (int arreglo[][])
    {
        for (int fila=0; fila < arreglo.length; fila++)
        {
            for (int columna=0; columna < arreglo[fila].length; columna++)
            {
                arreglo[fila][columna]= (int)(Math.random()*100);
            }
        }
    }
    
    static void Menor (int arreglo[][])
    {
        int menor=arreglo[0][0];
        for (int fila=0; fila < arreglo.length; fila++)
        {
            for (int columna=0; columna < arreglo[fila].length; columna++)
            {
                if (arreglo[fila][columna] < menor)
                {
                    menor= arreglo[fila][columna];
                }
            }
        }
        System.out.println("El menor es "+menor);
    }
    
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

    
    public static void main(String[] args) {
        int t[][]= new int[2][3];
        //k).-
        Inicializar(t);
        Imprimir(t);
        Menor(t);
        
        //l).-
        System.out.printf("\n\n%d\t%d\t%d\n",t[0][0],t[0][1],t[0][2]);
        
        //m).-
        int suma= t[0][2]+t[1][2];
        System.out.println("\nLa suma es "+suma);
        
    }
    
}
