

package pkg7.pkg14;

/**
*@author Sabdi Abraham Pantoja Orozco
* No. de Control: 13121157
* 
* Escriba una aplicacion que calcule el producto de una serie de enteros que se
* pasan al metodo producto, usando una lista de argumentos de longitud variable.
* Pruebe su metodo con varias llamadas, cada una con un numero distinto de 
* argumentos.
*/

public class Main {
    static int N=5;
    
    static void Inicializar (int arreglo[])
    {
        for (int contador=0; contador < arreglo.length; contador++)
        {
                arreglo[contador]= (int)(Math.random()*100);
        }
    }
    
    static void Imprimir (int arreglo[])
    {
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            System.out.println("arreglo["+contador+"] = "+arreglo[contador]);
        }
    }
    
    static void Producto (int arreglo[])
    {
        int Producto=1;
        for (int contador=0; contador < arreglo.length; contador++)
        {
            Producto *= arreglo[contador];
        }
        System.out.println("\n\nEl producto es "+Producto);
    }

    
    public static void main(String[] args) {
        int arreglo[]= new int[N];
        Inicializar(arreglo);
        Imprimir(arreglo);
        Producto(arreglo);
    }
    
}
