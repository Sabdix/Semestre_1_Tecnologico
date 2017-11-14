

package pkg7.pkg8.c;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * Sumar el total de los 100 elementos del arreglo c de punto flotante
 */
public class C {
    static void Inicializar (float arreglo[])
    {
        for (int contador = 0; contador < 100; contador++)
        {
            arreglo[contador]= (float)(Math.random()*100);
        }
    }
    
    static void Imprimir (float arreglo[])
    {
        for (int contador = 0; contador < 100; contador++)
        {
            System.out.println("c["+contador+"] = "+arreglo[contador]);
        }
    }
    
    static void Sumar (float arreglo[])
    {
        float suma=0;
        for (int contador = 0; contador < 100; contador++)
        {
            suma += arreglo[contador];
        }
        System.out.println("La suma es "+suma);
    }

    
    public static void main(String[] args) {
        float c[]= new float [100];
        Inicializar(c);
        Imprimir(c);
        Sumar(c);
        
    }
    
}
