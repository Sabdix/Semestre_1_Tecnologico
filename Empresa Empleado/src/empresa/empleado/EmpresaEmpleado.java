
package empresa.empleado;
import java.util.Scanner;

public class EmpresaEmpleado {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        
        int Codigonomina;
        double a, b;
        
        System.out.println("Escribe el tipo de empleado");
        System.out.println("1-Gerente");
        System.out.println("2-Trabajador horario");
        System.out.println("3-Trabajador a comisión");
        System.out.println("4-Trabajador a destajo");
        Codigonomina=Teclado.nextInt();
        
        switch (Codigonomina){
            case 1:
                System.out.print("Escribe el sueldo semanal ");
                a=Teclado.nextDouble();
                System.out.println("El pago es $"+a);
                break;
            case 2:
                System.out.print("Escriba el sueldo por hora ");
                a=Teclado.nextDouble();
                
                System.out.print("Escriba las horas trabajadas ");
                b=Teclado.nextDouble();
                
                if (b >= 40)
                {
                    b= (a * 40)+(b-40)*(a)*3/2;
                } else
                {
                    b= a * b;
                }
                System.out.println("El sueldo es $"+b);
                break;
            case 3:
                System.out.print("Escriba las ventas semanales ");
                a=Teclado.nextDouble();
                 
                b= (250+a*57)/1000;
                
                System.out.println("El sueldo es $"+a * b);
                break;
            case 4:
                System.out.print("Escriba la cantidad de piezas ");
                a=Teclado.nextDouble();
                
                System.out.print("Escriba el sueldo por pieza");
                b=Teclado.nextDouble();
                
                System.out.println("El sueldo es $"+a * b);
                break;
            default:
                System.out.println("Error");
        }
    }
}
