
package cáñculo.de.años.bisiestos;


public class CáñculoDeAñosBisiestos {

    
    public static void main(String[] args) {
        int año;
        
        for(año=2101; año <= 2200; año++)
        {
            if (año % 4 == 0)
            {
                if (año % 100 == 0)
                {
                    if (año % 400 == 0)
                    {
                        System.out.println("El año "+año+" es bisiesto");
                    } else
                    {
                        System.out.println("El año "+año+" no es bisiesto");
                    }
                } else
                {
                    System.out.println("El año "+año+" es bisiesto");
                }
            } else
            {
                System.out.println("El año "+año+" no es bisiesto");
            }
        }
    }
}
