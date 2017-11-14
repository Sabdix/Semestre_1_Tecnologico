
package practica.pkg7;
import java.util.Scanner;

public class Practica7 {
static int N=100;

static void copiarn(char d[], char f[], int n)
{
    int i;
    for (i=0; i<n; i++)
    {
        d[i]=f[i];
    }
    d[i]='\0';
}

static int misterio(char c1[], char c2[])
{
    int ban=1, i=0;
    while(c1[i] != '\0' && c2[i] != '\0' && ban != 0)
    {
        if(c1[i] != c2[2])
        {
            ban=0;
        }
        i++;
    }
    return ban;
}


    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        char f[]=new char[N], d[]=new char[N];
        
        System.out.print("Ingrese una frase (max 100 caracteres: ");
        f=Teclado.
        
        System.out.printf("Ha introducido la cadena %s",f);
        copiarn(d,f,5);
        System.out.printf("\nCadena: %s",d);
        
        //codigo para la funcion misterio
        System.out.print("\n\nIntroduzca un texto: ");
        f=Teclado.nextLine();
        System.out.print("\n\nIntroduzca un texto: ");
        d=Teclado.nextLine();
        
        if (misterio(d,f))
        {
            System.out.printf("\n¿Qué imprimir aqui(v)?");
        } else
        {
            System.out.printf("\n¿Qué imprimir aqui (f)?");
        }
    }
}
