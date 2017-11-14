

package ordenamiento.burbuja;


public class OrdenamientoBurbuja {
    
    static void OrdenamientoBurbuja(int arreglo[])
    {
        int aux;
        boolean cambios;
        
        while (true)
        {
            cambios = false;
            for(int i = 1; i < arreglo.length; i++)
            {
                if(arreglo[i] < arreglo[i-1])
                {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i-1];
                    arreglo[i-1] = aux;
                    cambios = true;
                }
            }
            if (cambios == false)
            {
                break;
            }
        }
    }

    
    public static void main(String[] args) {
        int arreglo[] = {5,3,4,2};
        
        OrdenamientoBurbuja(arreglo);
        
        for (int i = 0; i < arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
    }
    
}
