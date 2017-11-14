

package pkg7.pkg8.e;
/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * Determinar e imprimir los valores menor y mayor contenidos en el arreglo w
 * con 99 elementos de punto flotante
 */

public class E {
    
    static void Inicializar (float arreglo[])
    {
        for (int contador = 0; contador < 99; contador++)
        {
            arreglo[contador]= (float)(Math.random()*100);
        }
    }
    
    static void Imprimir (float arreglo[])
    {
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            System.out.println("w["+contador+"] = "+arreglo[contador]);
        }
    }

    
    public static void main(String[] args) {
        float w[]=new float [99];
        float Mayor, Menor;
        
        Inicializar(w);
        Imprimir(w);
        
        Mayor= w[0];
        Menor= w[0];
        
        for (int contador = 0; contador < w.length; contador++)
        {
            if (w[contador] > Mayor)
            {
                Mayor= w[contador];
            } else
            {
                if (w[contador] < Menor)
                {
                    Menor= w[contador];
                }
            }
        }
        System.out.println("El mayor es "+Mayor);
        System.out.println("El menor es "+Menor);
    }
    
}
