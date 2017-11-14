
package calificaciones.arreglos;
import java.util.Scanner;

 
public class CalificacionesArreglos {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        int cals[], sub;
        double prom=0;
        cals=new int[5]; //Crear el Arreglo como objeto
        cals[0]=8;
        cals[1]=5;
        cals[2]=7;
        cals[3]=10;
        cals[4]=6;
        for (sub=0; sub < 5; sub++)
        {
            System.out.print("Calificacion "+(sub+1)+" = "+cals[sub]+"\n");
        }
        for (sub=0; sub < 5; sub++)
        {
            prom=prom+cals[sub];
        }
        System.out.println("El promedio= "+(prom/sub));
    }
}
