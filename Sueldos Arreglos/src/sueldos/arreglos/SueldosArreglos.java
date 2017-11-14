
package sueldos.arreglos;


public class SueldosArreglos {

    
    public static void main(String[] args) {
        
        int sueldos[], sub, arriba=0;
        double prom=0, N=70;
        sueldos=new int[70]; //Crear el Arreglo como objeto
        
        for (sub=0; sub < N; sub++)
        {
            sueldos[sub]=(int)(Math.random()*100);//Generar numeros de forma aleatoria
            System.out.println(sueldos[sub]);
        }
        for (sub=0; sub < N; sub++)
        {
            prom=prom+sueldos[sub];
        }
        System.out.println("El promedio= "+(prom=prom/sub));
        for (sub=0; sub < N; sub++)
        {
            if (sueldos[sub] > prom)
            {
                arriba++;
            }
        }
        System.out.println("El numero de sueldos que sobrepasan el promedio son: "+arriba);
    }
}
