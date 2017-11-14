
package practica1;


public class Practica1 {
public static int suma (int n1, int n2, int n3)
{
    return n1+n2+n3;
}
    
    public static void main(String[] args) {
        int sum=0;
        sum=suma(2,3,5);
        System.out.printf("El resultado de 2+3+5 es: %d",sum);
    }
}
