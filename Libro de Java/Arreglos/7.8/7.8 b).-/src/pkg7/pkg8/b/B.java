package pkg7.pkg8.b;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * Inicializar con 8 cada uno de los cinco elementos del arreglo entero unidimensional g
 */
public class B {
    static void Inicializar (int arreglo[])
    {
        for (int contador = 0; contador < 5; contador++)
        {
            arreglo[contador]= 8;
        }
    }
    
    static void Imprimir (int arreglo[])
    {
        for (int contador = 0; contador < 5; contador++)
        {
            System.out.println("g["+contador+"] = "+arreglo[contador]);
        }
    }

    
    public static void main(String[] args) {
        int g[] = new int [5];
        Inicializar(g);
        Imprimir(g);
    }
    
}
