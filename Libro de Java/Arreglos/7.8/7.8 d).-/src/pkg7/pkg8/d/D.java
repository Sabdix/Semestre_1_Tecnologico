

package pkg7.pkg8.d;
/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * Copiar el arreglo a de 11 elementos en la primera porcion del arreglo b, el
 * cual contiene 34 elementos
 */

public class D {
    
    static void Inicializar (int arreglo[])
    {
        for (int contador = 0; contador < 11; contador++)
        {
            arreglo[contador]= (int)(Math.random()*100);
        }
    }
    
    static void Copiar (int a[], int b[])
    {
        for (int contador = 0; contador < a.length; contador++)
        {
            b[contador]= a[contador];
        }
        Imprimir(a);
        Imprimir(b);
    }
    
    static void Imprimir (int arreglo[])
    {
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            System.out.println("arreglo["+contador+"] = "+arreglo[contador]);
        }
        System.out.printf("\n");
    }
    

    
    public static void main(String[] args) {
        int a[]= new int [11];
        int b[]= new int [34];
        Inicializar(a);
        Copiar(a,b);
        
    }
    
}
