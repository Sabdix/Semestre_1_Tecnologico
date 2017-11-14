

package pkg7.pkg27.eratostenes;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * (La criba de Eratóstenes) Un número primo es cualquier entero mayor que 1, divisible sólo por sí mismo y por el
 * número 1. La Criba de Eratóstenes es un método para encontrar números primos, el cual opera de la siguiente manera:
 * 
 * a) Cree un arreglo del tipo primitivo boolean , con todos los elementos inicializados en true . Los elementos
 * del arreglo con índices primos permanecerán como true . Cualquier otro elemento del arreglo eventual-
 * mente cambiará a false .
 * 
 * b) Empezando con el índice 2 del arreglo, determine si un elemento dado es true . De ser así, itere a través del
 * resto del arreglo y asigne false a todo elemento cuyo índice sea múltiplo del índice del elemento que tiene
 * el valor true . Después continúe el proceso con el siguiente elemento que tenga el valor true . Para el índice
 * 2 del arreglo, todos los elementos más allá del elemento 2 en el arreglo que tengan índices múltiplos de 2
 * (los índices 4, 6, 8, 10, etcétera) se establecerán en false ; para el índice 3 del arreglo, todos los elementos
 * más allá del elemento 3 en el arreglo que tengan índices múltiplos de 3 (los índices 6, 9, 12, 15, etcétera) se
 * establecerán en false ; y así sucesivamente.
 * Cuando este proceso termine, los elementos del arreglo que aún sean true indicarán que el índice es un número primo.
 * Estos índices pueden mostrarse. Escriba una aplicación que utilice un arreglo de 1000 elementos para determinar e
 * imprimir los números primos entre 2 y 999. Ignore los elementos 0 y 1 del arreglo.
 */

public class Eratostenes {
    static int N=1000;
    
    static void Horca (boolean Criba[], int liquidador)
    {
        for (int victima=liquidador+1; victima < N; victima++)
        {
            if (victima % liquidador == 0)
            {
                Criba[victima]= false;
            }
        }
    }
    static void Imprimir (boolean Criba[])
    {
        for (int contador=2; contador < N; contador++)
        {
            if (Criba[contador] == true)
            {
                System.out.println(contador+" es primo.");
            }
        }
    }
    
    static void Inicializar (boolean Criba[])
    {
        for (int contador=0; contador < N; contador++)
        {
            Criba[contador]= true;
        }
    }

    
    public static void main(String[] args) {
        boolean Criba[]=new boolean[N];
        int liquidador=2;
        Inicializar(Criba);
        
        Criba[0]=false;
        Criba[1]=false;
        
        while (liquidador < N)
        {
            if (Criba[liquidador] == true)
            {
                Horca(Criba,liquidador);
            }
            liquidador++;
        }
        
        Imprimir(Criba);
    }
    
}
