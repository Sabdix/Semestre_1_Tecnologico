
package empresa.de.computadoras;
import java.util.Scanner;

public class EmpresaDeComputadoras {

    
    public static void main(String[] args) {
        Scanner Teclado=new Scanner(System.in);
        
        double Salario, NSalario=0, porcentaje;
        
        System.out.print("Ingrese el salario actual del trabajador");
        Salario=Teclado.nextDouble();
        
        if (Salario <= 9000){
            porcentaje= Salario*0.20;
            NSalario= Salario+porcentaje;
        } else{
            if(Salario >= 9001 && Salario <= 15000){
            porcentaje= Salario*0.10;
            NSalario= Salario+porcentaje;
            } else{
                if (Salario >= 15001 && Salario <= 20000){
                    porcentaje= Salario*0.05;
                    NSalario= Salario+porcentaje;
                }
            }
        }
        if (Salario > 20000){
            System.out.println("El nuevo salario es $"+Salario);
        } else{
            System.out.println("El nuevo salario es $"+NSalario);
        }
        
    }
}

