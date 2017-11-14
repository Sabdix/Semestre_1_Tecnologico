
package factor.pkg1900.pkg2000;


public class Factor19002000 {

    
    public static void main(String[] args) {
        int contador, division=1900, contador2;
        
        for (contador=1900; contador <= 2000; contador++)
        {
            System.out.print(" "+contador+" ");
            division=contador;
            for (contador2=2; contador2 <= contador/2; contador2++)
            {
                if (division % contador2 == 0)
                {
                   System.out.print(contador2+", ");
                   division=division/contador2;
                }
            }
            System.out.print("\n");
        }
    }
}
