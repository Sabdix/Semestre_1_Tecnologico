
package evaluacion.si.un.numero.es.perfecto;

public class EvaluacionSiUnNumeroEsPerfecto {

    
    public static void main(String[] args) {
        int n, cont, suma;
        
        for (n=1; n<= 100000000; n++){
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
            System.out.println("El número es perfecto "+n);
        }
        }
    }
}
