
package practica.pkg5;


public class Practica5 {

    public static int palindromo (String arreglo)//Nombre de la funcion
    {
        int i;
        
        for(i=0; i<arreglo.length(); i++)//Ciclo desde 0 hasta la longitud del arreglo
        {
            if (arreglo.charAt(i) != arreglo.charAt(arreglo.length()-i-1))//Comparando las primeras letras con las ultimas
            {
                return 0;//Si una sola letra es diferente, retorna 0. Y 0=No es un palindromo
            }
        }
        return 1;//Si todas las letras son iguales retorna 1. Y 1=Es un palindromo
    }
    
    public static void main(String[] args) {
        
        String arreglo;//Declaracion de una cadena
        arreglo= "amamaromaleavivaelamorapapayapaparomaleavivaelamoramama";//Lo que la variable arreglo guardará
        if(palindromo(arreglo) == 1)//Si La funcion palindromo retorna un 1 entonces:
        {
            System.out.printf("La frase \"%s\" es un palindromo\n",arreglo);
        } else
        {
            System.out.printf("La frase \"%s\" no es un palindromo\n",arreglo);
        }
        
    }
}
