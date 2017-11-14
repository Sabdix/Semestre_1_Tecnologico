

package pkg7.pkg11.a;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * Escriba instrucciones que realice la siguiente operacion con arreglos unidimensionales
 * 
 * Asiganr cero a los 10 elementos del arreglo cuentas de tio entero
 */

public class A {
    
    static void Inicializar (int arreglo[])
    {
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            arreglo[contador]= 0;
        }
    }
    
    static void Imprimir (int arreglo[])
    {
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            System.out.println("cuentas["+contador+"] = "+arreglo[contador]);
        }
    }

    
    public static void main(String[] args) {
        int cuentas[]= new int [10];
        
        Inicializar(cuentas);
        Imprimir(cuentas);
    }
    
}
