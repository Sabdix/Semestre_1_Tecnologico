
package preciomenudeo;
import java.util.Scanner;

public class Preciomenudeo {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        
        int numprod, dias, contador, vendidos;
        double cantvend, suma=1, menudeo;
        
        
        
        for (dias=1; dias <= 7; dias++)
        {
            System.out.print("Indique la cantidad de productos vendidos en el día ");
        vendidos= Teclado.nextInt();
        
            for (contador=1; contador <= vendidos; contador++)
            {
                System.out.print("Indique el número de producto ");
                numprod= Teclado.nextInt();
                
                System.out.print("Indique la cantidad vendida en el día ");
                cantvend= Teclado.nextInt();
                
                switch (numprod){
                    case 1:
                        menudeo= cantvend*2.98;
                        suma= suma+menudeo;
                        System.out.println("El precio al menudeo es $2.98");
                        break;
                    case 2:
                        menudeo= cantvend*4.50;
                        suma= suma+menudeo;
                        System.out.println("El precio al menudeo es $4.50");
                        break;
                    case 3:
                        menudeo= cantvend*9.98;
                        suma= suma+menudeo;
                        System.out.println("El precio al menudeo es $9.98");
                        break;
                    case 4:
                        menudeo= cantvend*4.49;
                        suma= suma+menudeo;
                        System.out.println("El precio al menudeo es $4.49");
                        break;
                    case 5:
                        menudeo= cantvend*6.87;
                        suma= suma+menudeo;
                        System.out.println("El precio al menudeo es $6.87");
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
                
            }
        }
        System.out.println("El valor total de menudeo de la semana pasada es "+suma);
    }
}
