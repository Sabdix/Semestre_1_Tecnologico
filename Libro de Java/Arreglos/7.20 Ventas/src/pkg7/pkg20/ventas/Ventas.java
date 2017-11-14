

package pkg7.pkg20.ventas;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * (Ventas totales) Use un arreglo bidimensional para resolver el siguiente problema: una compañía tiene cuatro
 * vendedores (1 a 4) que venden cinco productos distintos (1 a 5). Una vez al día, cada vendedor pasa una nota por cada
 * tipo de producto vendido. Cada nota contiene lo siguiente:
 * a) El número del vendedor.
 * b) El número del producto.
 * c) El valor total en dólares de ese producto vendido en ese día.
 * 
 * Así, cada vendedor pasa entre 0 y 5 notas de venta por día. Suponga que está disponible la información sobre todas las
 * notas del mes pasado. Escriba una aplicación que lea toda esta información para las ventas del último mes y que resuma
 * las ventas totales por vendedor, por producto. Todos los totales deben guardarse en el arreglo bidimensional ventas .
 * Después de procesar toda la información del mes pasado, muestre los resultados en formato tabular, en donde cada
 * columna represente a un vendedor específico y cada fila represente a un producto. Saque el total de cada fila para obte-
 * ner las ventas totales de cada producto durante el último mes. Saque el total de cada columna para obtener las ventas
 * totales de cada vendedor durante el último mes. Su impresión tabular debe incluir estos totales cruzados a la derecha de
 * las filas totalizadas, y en la parte inferior de las columnas totalizadas.
 */
import java.util.Scanner;
public class Ventas {
    static Scanner Teclado = new Scanner(System.in);
    
    static void VentasProducto (int Ventas[][], int SumaP[],int N)
    {
        for (int columna=0; columna < Ventas[N].length; columna++)
        {
            SumaP[columna]+= Ventas[N][columna];
        }
    }
    
    static void VentasVendedor (int Ventas[][], int SumaV[], int N)
    {
        for (int fila=0; fila < 5; fila++)
        {
            SumaV[N]+= Ventas[fila][N];
        }
    }
    
    static void Imprimir (int Ventas[][], int SumaP[],int SumaV[])
    {
        System.out.println("\n\n\tV1\tV2\tV3\tV4\tSuma\n");
        for (int fila=0; fila < Ventas.length; fila++)
        {
            System.out.print("P"+(fila+1));
            for (int col=0; col < Ventas[fila].length; col++)
            {
                System.out.print("\t"+Ventas[fila][col]);
            }
            System.out.println("\t"+SumaP[fila]);
        }
        System.out.print("Suma");
        for (int col=0; col < Ventas[4].length; col++)
        {
            System.out.print("\t"+SumaV[col]);
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int Ventas[][]= new int[5][4];
        int SumaP[]=new int [5];
        int SumaV[]= new int [4];
        int Vendedor, Producto, Vendido, Dia=1, Notas;
        int N;
        
        while (Dia <= 30)
        {
            System.out.println("\n\tDìa "+Dia);
            System.out.print("¿Cuantas notas capturará hoy? ");
            Notas=Teclado.nextInt();
            if (Notas > 0)
            {
                for (int contador=0; contador < Notas; contador++)
                {
                    System.out.print("Ingrese el número del vendedor ");
                    Vendedor=Teclado.nextInt();
                    System.out.print("\nIngrese el número del producto ");
                    Producto=Teclado.nextInt();
                    System.out.print("\nIngrese el valor en dólares del producto vendido ");
                    Vendido=Teclado.nextInt();

                    Ventas[Producto-1][Vendedor-1]+= Vendido;
                    Dia++;
                }
            } else
            {
                Dia++;
            }
        }
        for (N=0; N < 5; N++)
        {
            VentasProducto(Ventas,SumaP,N);
        }
        for (N=0; N < 4; N++)
        {
            VentasVendedor(Ventas,SumaV,N);
        }
        
        Imprimir(Ventas,SumaP,SumaV);
       
        
        
        
        
    }
    
}
