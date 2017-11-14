

package pkg7.pkg9.n;

/**
*@author Sabdi Abraham Pantoja Orozco
* No. de Control: 13121157
* 
* n).- Escriba una serie de instrucciones para imprimir el contenido de t en formato tabular.
* Enliste los indices de columna como encabezados a lo largo de la partesuperior, y enliste
* los indices de fila, a la izquierda de cada fila
*/


public class N {
    
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

    
    public static void main(String[] args) {
        int t[][]= new int[2][3];
     
        Inicializar(t);
        
        for (int encabezado = 0; encabezado < t[0].length; encabezado++)
        {
            System.out.print("\tC"+encabezado);
        }
        System.out.println("\n");
        for (int fila = 0; fila < t.length; fila++)
        {
            System.out.print("F"+fila+"\t");
            for (int columna = 0; columna < t[fila].length; columna++)
            {
                System.out.print(t[fila][columna]+"\t");
            }
            System.out.println();
        }
    }
    
}
