
package practica.pkg6;


public class Practica6 {
static int N=15; //Definimos N como 15, que serán la cantidad de casillas que tendra nuestro arreglo principal

static void Triangulo_Pascal(int arreglo[]) //Se define el procedimiento 
{
    int C, ant[], I, D, i; //Se definen las variables
    ant=new int[N]; //creamos el arreglo
    
    C=N/2; //Aqui la C toma el valor de N/2 osea 15/2=7
    I=D=C; //Aqui progcuramos que I y D tengan el mismo valor
    arreglo[C]= 1; //Hacemos que el centro del arreglo tome el valor de 1
    System.out.println("\t"+arreglo[C]);
    do //Entramos a mientras pero por lo menos debe de entrar una vez
    {
       Inicializar(ant); //Inicializamos el arreglo ant
       Copiar_Arreglo(ant,arreglo);//Entramos al procedimiento el cual copia el arreglo principal al arreglo ant
       Inicializar(arreglo); //Aqui inicializamos el arreglo principal
       I=I-1;//Aqui restamos I en -1
       D=D+1;//Sumamos D en +1
       arreglo[I]= ant[I-1] + ant[I+1];//hacemos que la casilla I del arreglo sea igual a la casilla I-1 del arreglo ant + la casiila I+1 del arreglo ant 
       
       for(i=I+2; i<D; i=i+2)//Hacemos un ciclo que vaya desde I+2 hasta D-1 con saltos de dos en dos
       {
           arreglo[i]=ant[i-1] + ant[i+1];//Aqui hacecemos que las casiilas i tomen el valor de las casillas i-1 mas las casillas i+1 del arreglo ant
       }
       arreglo[D]= ant[D-1] + ant[D+1]; //Aqui es donde esta el meoyo del asunto, pues hay que tener cuidado de que D no se vuelva negativo
       for (i=0; i<N; i++)//Aqui hacemos otro arreglo para imprimir el arreglo e imprima la linea del triangulo
       {
           if (arreglo[i] > 0){//Para evitar imprimir ceros de mas, se coloca una condicional para que solo imprima mayores que 0
                System.out.print(arreglo[i]+" ");//Imprimimos el arreglo con un espacio pára tener orden
           } else
           {
               System.out.print(" ");
           }
       }
       System.out.print("\n");//Imprimos un salto de linea para pasar a calcular la siguiente linea del triangulo
    } while (I>1);//Se evalua I para que esta sea mayor que 1, pues si toma el valor de 1, en las operaciones siguientes da un numero negativo, y pues nuestro arreglo no tiene casillas negativas por lo que da un error
}

static void Copiar_Arreglo(int r[], int a[]) //Inicializamos el procedimiento que copiará el arreglo principal al arreglo ant
{
    int i;
    for (i=0; i<N; i++)//hacemos un ciclo para que tome todas la variables
    {
        r[i] = a[i];//Hacemos que la casilla i del arreglo ant sea igual a la casilla i del arreglo principal
    }
}

static void Inicializar(int a[]) //Inicializamos el procedimiento
{
    int i;
    for (i=0; i<N; i++)//Hacemos un ciclo que pase por cada casilla del arreglo
    {
        a[i]=0;//Hacemos que cada casilla del arreglo tenga un valor de 0
    }
}
//Este procedimiento de imprimir es inservible, porque no imprime todo el triangulo completo, solo el último renglon.
static void Imprimir(int arreglo[])
{
    int i;
    for(i=0; i<N; i++)
    {
        System.out.printf("\nArreglo[%d] = %d",i,arreglo[i]);
    }
}
   
    public static void main(String[] args) {
        int arreglo[];//Declaramos el arreglo
        arreglo=new int[N];//Hacemos que el arreglo tenga N casillas. (en esete caso N=15)
        
        Inicializar(arreglo);//Hacemos que Inicialice el arreglo principal
        Triangulo_Pascal(arreglo);//Introducimos el arreglo principal al procedimiento triangulo de pascal para que calcule e imprima el triangulo
        //Imprimir(arreglo);
    }
}
