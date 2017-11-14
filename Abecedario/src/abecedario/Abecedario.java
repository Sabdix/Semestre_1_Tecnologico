
package abecedario;


public class Abecedario {

    
    public static void main(String[] args) {
        int contador, contador2, n=26;
        char tabla=90, T=89;
        for (contador=1; contador <= 26; contador++)
        {
            for (contador2=1; contador2 <= n; contador2++)
            {
                System.out.print(tabla--);
            }
            System.out.print("\n");
            n=n-1;
            tabla= T;
            T--;
        }
    }
}
