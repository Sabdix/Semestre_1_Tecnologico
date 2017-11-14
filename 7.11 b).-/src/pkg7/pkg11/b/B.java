

package pkg7.pkg11.b;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * Escriba instrucciones que realice la siguiente operacion con arreglos unidimensionales
 * 
 * Sumar uno a cada uno de los 15 elementos del arreglo bono de tipo entero
 */

public class B {
    
    static void Inicializar (int arreglo[])
    {
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            arreglo[contador]= (int)(Math.random()*100);
        }
    }
    
    static void Imprimir (int arreglo[])
    {
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            System.out.println("bono["+contador+"] = "+arreglo[contador]);
        }
    }
    
    static void Suma (int arreglo[])
    {
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            arreglo[contador] += 1;
        }
    }

    
    public static void main(String[] args) {
        int bono[]= new int [15];
        
        Inicializar(bono);
        Imprimir(bono);
        Suma(bono);
        System.out.println("\n");
        Imprimir(bono);
    }
    
}
