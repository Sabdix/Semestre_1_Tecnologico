

package pkg7.pkg10;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * (Comision por ventas). Utilice un arreglo unidimensional para resolver el siguiente problema:
 * 
 * Una compañia paga a sus vendedores por comision. Los vendedores reciben $200 por semana
 * mas el 9% de sus ventas totales de esa semana. Por ejemplo, un vendedor que acumule $5000 en ventas
 * en una semana, recibirá $200 más el 9% de $5000, o un total de $650.
 * Escriba una aplicación (utilizando un arreglo de contadores) que determine cuántos vendedores recibieron salarios
 * en cada uno de los siguientes rangos (suponga que el salario de cada vendedor se trunca a una cantidad entera).
 * 
 * a).- $200-299
 * b).- $300-399
 * c).- $400-499
 * d).- $500-599
 * e).- $600-699
 * f).- $700-799
 * g).- $800-899
 * h).- $900-999
 * i).- $1000 en adelante.
 * 
 * Sintetice los formatos en forma tabular.
 */

import java.util.Scanner;

public class Main {
    static Scanner Teclado = new Scanner(System.in);
    
    static void VerificadorPago (int Vendidos, int contador[])
    {
        int Nomina;
        System.out.print("¿Cuanto vendió el trabajador? ");
        Vendidos=Teclado.nextInt();
        Nomina = 200+((Vendidos * 9)/100);
        
        while (Vendidos != -1)
        {
            if (Nomina >= 1000)
            {
                contador[8]++;
            } else
            {
                if (Nomina >= 900 && Nomina <= 999)
                {
                    contador[7]++;
                } else
                {
                    if (Nomina >= 800 && Nomina <= 899)
                    {   
                        contador[6]++;
                    } else
                    {
                        if (Nomina >= 700 && Nomina <= 799)
                        {
                            contador[5]++;
                        } else
                        {
                            if (Nomina >= 600 && Nomina <= 699)
                            {
                                contador[4]++;
                            } else
                            {
                                if (Nomina >= 500 && Nomina <= 599)
                                {
                                    contador[3]++;
                                } else
                                {
                                    if (Nomina >= 400 && Nomina <= 499)
                                    {
                                        contador[2]++;
                                    } else
                                    {
                                        if (Nomina >= 300 && Nomina <= 399)
                                        {
                                            contador[1]++;
                                        } else
                                        {
                                            if (Nomina >= 200 && Nomina <= 299)
                                            {
                                                contador[0]++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.print("¿Cuanto vendio el trabajador?");
            Vendidos=Teclado.nextInt();
            Nomina = 200+((Vendidos * 9)/100);
        }
    }

    
    public static void main(String[] args) {
        int contador[]= new int[9];
        int Vendidos=0;
        
        VerificadorPago(Vendidos,contador);
        
        System.out.printf("%s%8s\n", "$200-299", contador[0]);
        System.out.printf("%s%8s\n", "$300-399", contador[1]);
        System.out.printf("%s%8s\n", "$400-499", contador[2]);
        System.out.printf("%s%8s\n", "$500-599", contador[3]);
        System.out.printf("%s%8s\n", "$600-699", contador[4]);
        System.out.printf("%s%8s\n", "$700-799", contador[5]);
        System.out.printf("%s%8s\n", "$800-899", contador[6]);
        System.out.printf("%s%8s\n", "$900-999", contador[7]);
        System.out.printf("%s%3s\n", "$1000-Mayores", contador[8]);
        
        //%s es para imprimir un arreglo
        //%8s es para imprimir los espacios del arreglo
        
        
        
        
    }
    
}
