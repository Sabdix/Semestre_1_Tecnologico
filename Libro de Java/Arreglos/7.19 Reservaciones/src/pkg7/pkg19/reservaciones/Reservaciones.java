

package pkg7.pkg19.reservaciones;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * (Sistema de reservacion de una aereolinea).
 * Una pequeña aereolinea acaba de comprar una computadora para su nuevo sistema
 * de reservaciones automatizado. Se le ha pedido a usted que desarrolle el nuevo
 * sistema. Usted escribira una aplicacion para asignar asientos en cada vuelo del
 * unico avion de la aereolinea (capacidad 10 asientos).
 * Su aplicacion debe de mostrar las siguientes alternativas: Por favor escriba uno para primera clase
 * y Por favor escriba 2 para economico. Si el usuario escribe 1, su aplicacion debe de asignarle
 * un asiento en la seccion de primera clase (asientos de 1 a 5). Si el usuario
 * escribe 2, su aplicacion debe de asignarle un asiento en la seccion economica (asientos de 6 a 10)
 * Su aplicacion debera entonces imprimir un pase de abordaje, indicando el numero de asiento de la
 * persona y si se encientra en la seccion de primera clase o clase ecnonomica del avion.
 * 
 * Use un arreglo unidimensional del tipo primitivo boolean para representar la tabla de asientos del
 * avion. Inicialice todos los elementos del arreglo con false para indicar que todos los asientos estan vacios.
 * A medida que se asigne cada siento, establezca los elementos correspondientes del arreglo en true para indicar quie ese asiento
 * ya no esta disponible.
 * Su aplicacion nunca debera de asignar un asiento que ya haya sido asignado. Cuando este llena la
 * seccion economica, su programa debera de preguntar a la persona si acepta ser colocada en la seccion de primera clase
 * (y viceversa). Si la persona acepta, haga la asignacion de aciento apropiada. si no acepta, imprima el mensaje "El proximo vuelo
 * sale en tres horas".
 * 
 */
import java.util.Scanner;
public class Reservaciones {

    static Scanner Teclado = new Scanner(System.in); 
    static boolean lleno = false;
    static boolean lleno2= false;
     
    static void Inicializar (boolean arreglo[])
    {
        for (int contador = 0; contador < 9; contador++)
        {
            arreglo[contador]= false;
        }
    }
    
    public static void PrimeraClase (boolean Asientos[])
    {
        boolean Reservacion=false;
        int Desicion;
        for (int colocador=0; colocador <= 4; colocador++)
        {
            if (Asientos[colocador] == false)
            {
                Asientos[colocador]= true;
                Reservacion = true;
                System.out.println("\n\t Boleto de abordaje");
                System.out.println("Asiento: "+(colocador+1)+"\nClase: Primera Clase");
                System.out.println("_______________________________________________\n\n");
                break;
            }
        }
        if (Reservacion == false)
        {
            lleno=true;
            if (lleno2 == false)
            {
                System.out.println("No hay lugar en Primera clase.");
                System.out.print("¿Desea reservar en la clase economica? 0= no 1= si ");
                Desicion = Teclado.nextInt();
                if (Desicion == 1)
                    {
                        Economico(Asientos);
                    } else
                    {
                        System.out.println("\nEl proximo vuelo sale en tres horas\n");
                        System.out.println("_______________________________________________\n\n");
                    }
            } else
            {
                System.out.println("No hay lugar en clase Economica ni en Primera Clase.");
                System.out.println("El proximo vuelo sale en tres horas");
                System.out.println("_______________________________________________");
            }
        }
    }
    
    public static void Economico (boolean Asientos[])
    {
        boolean Reservacion= false;
        int Desicion;
        
        for (int colocador=5; colocador <= 9; colocador++)
        {
            if (Asientos[colocador] == false)
            {
                Asientos[colocador]= true;
                Reservacion= true;
                System.out.println("\n\t Boleto de abordaje");
                System.out.println("Asiento: "+(colocador+1)+"\nClase: Economico");
                System.out.println("_______________________________________________\n\n");
                break;
            }
        }
        if (Reservacion == false)
        {
            lleno2=true;
            if (lleno == true)
            {
                System.out.println("No hay lugar en clase Economica ni en Primera Clase.");
                System.out.println("El proximo vuelo sale en tres horas");
                System.out.println("_______________________________________________");
            } else
            {
                System.out.println("No hay lugar en clase Economica.");
                System.out.print("¿Desea reservar en primera clase? 0= no 1= si ");
                Desicion = Teclado.nextInt();
                if (Desicion == 1)
                {
                    PrimeraClase(Asientos);
                } else
                {
                    System.out.println("\nEl proximo vuelo sale en tres horas");
                    System.out.println("_______________________________________________\n\n");
                }
            }
        }
    }

    
    public static void main(String[] args) {
        boolean Asientos []= new boolean [10];
        int clase;
        
        Inicializar(Asientos);
        
        while (Asientos[9] == false || Asientos[4] == false)
        {
            System.out.println("Por favor escriba 1 para primera clase");
            System.out.println("Por favor escriba 2 para economico");
            clase=Teclado.nextInt();
            
            switch (clase)
            {
                case 1:
                    PrimeraClase(Asientos);
                    break;
                case 2:
                    Economico(Asientos);
                    break;
                
            }
        }
        System.out.println("\n\n\n____________________________________________________\n\n\n");
        System.out.println("EL AVION YA ESTA LLENO");
    }
    
}
