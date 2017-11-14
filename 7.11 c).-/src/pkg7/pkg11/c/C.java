

package pkg7.pkg11.c;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * Escriba instrucciones que realice la siguiente operacion con arreglo unidimensionales
 * 
 * Imprimir los 5 valores del arreglo "Mejores Puntuciones" de tipo entero en formato de columnas
 */

public class C {
    
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
            System.out.println("mejorespuntuaciones["+contador+"] =\t"+arreglo[contador]);
        }
    }

    
    public static void main(String[] args) {
        int mejorespuntuaciones[]=new int [5];
        
        Inicializar(mejorespuntuaciones);
        Imprimir(mejorespuntuaciones);
    }
    
}
