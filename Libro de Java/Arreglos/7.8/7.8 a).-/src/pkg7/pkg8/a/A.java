

package pkg7.pkg8.a;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * Mostrar el valor del elemento 6 del arreglo f
 */
public class A {
    static void Inicializar (int arreglo[])
    {
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            arreglo[contador]= (int)(Math.random()*100);
        }
    }

    
    public static void main(String[] args) {
        int arreglo[] = new int [20];
        
        Inicializar(arreglo);
        
        System.out.println("Elemento 6 = "+arreglo[6]);
    }
    
}
