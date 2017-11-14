
package ordenamiento.simple;


public class OrdenamientoSimple {

    
    public static void main(String[] args) {
        int N=7, arreglo[]=new int[N]; 
        int I, m, C, aux;
        arreglo[0]=4;
        arreglo[1]=9;
        arreglo[2]=6;
        arreglo[3]=5;
        arreglo[4]=13;
        arreglo[5]=25;
        arreglo[6]=2;
        
        for(I = 0 ; I <= N-2 ; I++)
        {
            m=I;
            for(C = m+1 ; C <= N-1; C++)
            {
                if(arreglo[m] > arreglo[C])
                {
                    m=C;
                }
            }
            aux = arreglo[m];
            arreglo[m] = arreglo[I];
            arreglo[I] = aux;
        }
        for(I = 0 ; I < N ; I++)
        {
            System.out.println(arreglo[I]);
        }
    }
}
