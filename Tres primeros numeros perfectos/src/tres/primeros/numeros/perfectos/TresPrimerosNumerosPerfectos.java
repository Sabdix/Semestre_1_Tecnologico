
package tres.primeros.numeros.perfectos;


public class TresPrimerosNumerosPerfectos {

    
    public static void main(String[] args) {
        int n, cont, suma;
        
        for (n=1; n<= 10000; n++){
            suma=0;
            for (cont=1; cont <= n/2; cont++)
            {
                if (n % cont == 0)
                {
                    suma= suma + cont;
                }
            }
            if (suma == n)
            {
                if (n % 2 == 0)
                {
                    System.out.println("Par "+n);
                } else
                {
                    System.out.println("Impar "+n);
                }
            }
        }
    }
}
