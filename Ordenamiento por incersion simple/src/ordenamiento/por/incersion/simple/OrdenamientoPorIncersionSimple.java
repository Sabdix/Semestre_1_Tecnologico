

package ordenamiento.por.incersion.simple;


public class OrdenamientoPorIncersionSimple {
    static int N=7;
    
    static void Inicializar(int a[])
    {
        int i;
        for (i=0; i<N; i++)
        {
            a[i]=(int)(Math.random()*100);
        }
    }
    
    static void Imprimir (int arreglo[])
    {
        int i;
        
        for (i = 0; i < N; i++)
        {
            System.out.println(arreglo[i]);
        }
    }

    
    public static void main(String[] args) {
       int TMP, arreglo[]=new int[N], c, i;
       
       Inicializar(arreglo);
       
       for (i=0; i < N-1; i++)
       {
           c=i;
           if (arreglo[c] > arreglo[c+1])
           {
               TMP=arreglo[c+1];
               while (c >= 0 && TMP < arreglo[c])
               {
                   arreglo[c+1]=arreglo[c];
                   c--;
               }
               arreglo[c+1]=TMP;
           }
       }
       Imprimir(arreglo);
    }
    
}
