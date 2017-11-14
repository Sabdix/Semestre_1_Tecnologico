
package comparacion.de.numeros;
import java.util.Scanner; //Librerias

public class ComparacionDeNumeros {//Clase

    
    public static void main(String[] args) 
    {//Inicio
        int val1, val2;//Entero val1, val2
        Scanner Teclado = new Scanner(System.in);//Creacion de la variable Teclado
        System.out.println("Ingrese el primer numero");//Imprimir ("Ingrese el primer numero")
        val1 = Teclado.nextInt();//Leer(val1)
        System.out.println("Ingrese el segundo numero");//Imprimir ("Ingrese el segundo numero")
        val2 = Teclado.nextInt();//Leer (val2)
        
        if (val1 > val2)//Si val1 > val2
        {//Entonces
            System.out.println("El numero mayor es "+val1);//Imprimir ("El numero mayor es"+val1)
        } else //Sino
        {
            System.out.println("El numero mayor es "+val2);//Imprimir ("El numero mayor es"+val2)
        }//Fin si
    }//Fin
}
