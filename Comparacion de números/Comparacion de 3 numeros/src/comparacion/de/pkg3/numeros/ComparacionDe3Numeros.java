
package comparacion.de.pkg3.numeros;
import java.util.Scanner;//Librerias

public class ComparacionDe3Numeros 
{

    
    public static void main(String[] args) 
    {//Inicio
        int a, b, c;
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");//Imprimir ("Ingrese el primer numero")
        a = Teclado.nextInt();//Leer(a)
        System.out.println("Ingrese el segundo numero");//Imprimir ("Ingrese el segundo numero")
        b = Teclado.nextInt();//Leer (b)
        System.out.println("Ingrese el tercer numero");//Imprimir ("Ingrese el tercer numero")
        c = Teclado.nextInt();//Leer (c)
        
        if (a < b && a < c) //Si a<b and a<c
            { //Entonces
                if (b < c) //Si b<c
                { //Entonces
                   System.out.println(a+","+b+","+c); //Imprimir (a,b,c)
                } else //Sino
                {
                   System.out.println(a+","+c+","+b); //Imprimir(a,c,b)
                } //Fin si
            } else //Sino
            {
                if (a > b && a > c) //Si a>b and a>c)
                { //Entonces
                    if (b > c) //Si b>c
                    { //Entonces
                        System.out.println(c+","+b+","+a); //Imprimir (c,b,a)
                    } else //Sino
                    {
                        System.out.println(b+","+c+","+a); //Imprimir (b,c,a)
                    } //Fin si
                } else //Sino
                {
                    if(a > b && a < c) //Si (a>b and a<c)
                    { //Entonces
                        System.out.println(b+","+a+","+c); //Imprimir (b,a,c)
                    } else //Sino
                    {
                        if (a < b && a > c) //Si a<b and a>c)
                        { //Entonces
                            System.out.println(c+","+a+","+b); //Imprimir (c,a,b)
                        } else //Sino
                        {
                            System.out.println(a+","+b+","+c); //Imprimir (a,b,c)
                        } //Fin si
                    } //Fin si
                } //Fin si
            } //Fin si
    } //Fin
        
}

