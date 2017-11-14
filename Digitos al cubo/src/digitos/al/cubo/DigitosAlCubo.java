
package digitos.al.cubo;


public class DigitosAlCubo {

    
    public static void main(String[] args) {
        int u,d,c,contador=100;
        
        for (c=1; c <= 9; c++)
        for (d=0; d <= 9; d++)
        for (u=0; u <= 9; u++)
        {
            if (Math.pow(u,3) + Math.pow(d,3) + Math.pow(c,3) == contador)
            {
                System.out.println(contador);
            }
            contador++;
        }
        
    }
}
