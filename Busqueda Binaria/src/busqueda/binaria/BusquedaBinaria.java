
package busqueda.binaria;


public class BusquedaBinaria {
    static int arreglo[]=new int[100];
    
    static void InicializarArreglo()
    {
        arreglo[0]=3;
        arreglo[1]=6;
        arreglo[2]=9;
        arreglo[3]=9;
        arreglo[4]=9;
        arreglo[5]=12;
        arreglo[6]=13;
        arreglo[7]=14;
        arreglo[8]=15;
        arreglo[9]=20;
    }
    
    static void ImprimirArreglo()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("arreglo["+i+"]= "+arreglo[i]);
        }
    }
    
    /*
     * Funcion busquedabin, Recibe como atributos un valor entero B que representa el valor a buscar dentro del arreglo
     * Regresa: C que representa el indice del arreglo donde se encontro B, de lo contrario regresa -1 para indicar que
     * no se encontro.
     */
    
    static int busquedabin(int B)
    {
        int I=0, C=0, F=9;
        while (B != arreglo[C] && I <= F)
        {
            C=(F+I)/2;
            if (arreglo[C] > B)
            {
                F=C-1;
            } else
            {
                I=C+1;
            }
        }
        if (B == arreglo[C])
        {
            return C;
        }
        return -1;
    }
    public static void main(String[] args) {
        int exito;
        InicializarArreglo();
        exito= busquedabin(20);
        if (exito >= 0)
        {
            System.out.println("Se encontro en la posicion: "+exito);
        } else
        {
            System.out.println("No se encontro");
        }
        
    }
}
