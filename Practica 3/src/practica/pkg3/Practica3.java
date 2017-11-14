
package practica.pkg3;
import java.util.Scanner;

public class Practica3 {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        int p1, p2, p3, p4, p5;
        int clave=0, cant;
        int s1=0, s2=0, s3=0, s4=0, s5=0;
        int rec=0;
        System.out.print("Captura el precio de la localidad 1: $");
        p1=Teclado.nextInt();
        System.out.print("\nCaptura el precio de la localidad 2: $");
        p2=Teclado.nextInt();
        System.out.print("\nCaptura el precio de la localidad 3: $");
        p3=Teclado.nextInt();
        System.out.print("\nCaptura el precio de la localidad 4: $");
        p4=Teclado.nextInt();
        System.out.print("\nCaptura el precio de la localidad 5: $");
        p5=Teclado.nextInt();
        System.out.println("\nCAPTURA DE REGISTROS ");
        while (clave != -1)
        {
            System.out.print("\nCaptura la clave ");
            clave=Teclado.nextInt();
            System.out.print("\nCaptura la cantidad ");
            cant=Teclado.nextInt();
            switch (clave){
                case 1:
                    System.out.printf("\nSe vendieron %d de %d igual a %d",cant,p1,cant*p1);
                    s1=s1+cant;
                    rec= rec+(cant*p1);
                    break;
                case 2:
                    System.out.printf("\nSe vendieron %d de %d igual a $%d",cant,p2,cant*p2);
                    s2=s2+cant;
                    rec= rec+(cant*p2);
                    break;
                case 3:
                    System.out.printf("\nSe vendieron %d de %d igual a $%d",cant,p3,cant*p3);
                    s3=s3+cant;
                    rec= rec+(cant*p3);
                    break;
                case 4:
                    System.out.printf("\nSe vendieron %d de %d igual a $%d",cant,p4,cant*p4);
                    s4=s4+cant;
                    rec= rec+(cant*p4);
                    break;
                case 5:
                    System.out.printf("\nSe vendieron %d de %d igual a $%d",cant,p5,cant*p1);
                    s5=s5+cant;
                    rec= rec+(cant*p5);
                    break;
            }
        }
        System.out.println("\nSe han vendido hasta ahorita: ");
        System.out.printf("%d de la localidad 1",s1);
        System.out.printf("\n%d de la localidad 2",s2);
        System.out.printf("\n%d de la localidad 3",s3);
        System.out.printf("\n%d de la localidad 4",s4);
        System.out.printf("\n%d de la localidad 5",s5);
        System.out.printf("\nSe han vendido %d boletos",s1+s2+s3+s4+s5);
        System.out.printf("\nSe ha recaudado $%d\n",rec);
    }
}
