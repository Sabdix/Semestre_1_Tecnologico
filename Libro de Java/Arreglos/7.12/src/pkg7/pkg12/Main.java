

package pkg7.pkg12;

/**
*@author Sabdi Abraham Pantoja Orozco
* No. de Control: 13121157
* 
* (Eliminacion de duplicados) Use un arreglo unidimensional para resolver el siguiente problema:
* Escriba una aplicacion que reciba como entrada cinco numeros, cada uno de los cuales tiene que
* estar entre 10 y 100. A medida que se lea cada numero, muestrelo solamente si no es un duplicado
* de un numero que ya se haya leido. Preparese para el peor caso, en el que los cinco numeros son diferentes.
* Use el arreglo mas pequeño que sea posible para resolver este problema. Muestre el conjunto de valores unicos 
* instroducidos, despues de que el usuario instroduzca cada nuevo valor.
*/
import java.util.Scanner;
public class Main {
    static Scanner Teclado = new Scanner(System.in); 
    
    static boolean Verificador (int arreglo[], int numero)
    {
        for (int contador=0; contador < arreglo.length; contador++)
        {
            if (arreglo[contador] == numero)
            {
                return true;
            }
        }
        return false;
        
    }
    
    
    public static void main(String[] args) {
        int arreglo[] = new int[5];
        int numero;
        
        for (int contador=0; contador < arreglo.length; contador++)
        {
            System.out.print("Intruduzca un numero entre 10 y 100 ");
            numero=Teclado.nextInt();
            if (Verificador(arreglo,numero) == false)
            {
                arreglo[contador]=numero;
                System.out.println(arreglo[contador]+"\n");
            }
        }
    }
    
}
