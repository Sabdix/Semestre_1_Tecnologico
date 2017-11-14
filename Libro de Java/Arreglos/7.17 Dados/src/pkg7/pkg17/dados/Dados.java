

package pkg7.pkg17.dados;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * (Tiro de daos) Escriba una aplicacion para simular el tiro de dos dados. La aplicacion
 * debe de utilizar un objeto de la clase random una vez para tirar el primer dado,
 * y de nuevo para tirar el segundo dado. Despues debe de calcularse la suma de los dos valores.
 * Cada dado puede mostrar un valor entero del 1 al 6, por lo que la suma de los valores
 * variara del 2 al 12, siendo 7 la suma mas frecuente, mientras que 2 y 12 serian la sumas
 * menos frecuentes. Su aplicacion debe de tirar los dados 36000 veces.
 * Utilice un arreglo unidimensional para registrar el numero de veces que aparezca
 * cada una de las posible sumas. Muestre los resultados en formato tabular.
 * Determine si los totales son razonables.
 * 
 */
import java.util.Random;
public class Dados {
    static Random Tiro = new Random();
    
    static int JUGAR ()
    {
        int suma=0;
        suma=(Tiro.nextInt(6)+1)+(Tiro.nextInt(6)+1);
        return suma;
    }
    
    static void Imprimir (int arreglo[])
    {
        int suma=2;
        for (int contador = 0; contador < arreglo.length; contador++)
        {
            System.out.println(suma+" = "+arreglo[contador]);
            suma++;
        }
    }

    
    public static void main(String[] args) {
        int DADOS[]= new int [11];
        
        for (int contador=0; contador <= 36000; contador++)
        {
            DADOS[JUGAR()-2]++;
        }
        Imprimir(DADOS);
        
    }
    
}
