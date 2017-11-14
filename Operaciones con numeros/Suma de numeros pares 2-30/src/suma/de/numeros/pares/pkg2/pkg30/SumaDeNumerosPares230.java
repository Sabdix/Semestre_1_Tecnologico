
package suma.de.numeros.pares.pkg2.pkg30;

public class SumaDeNumerosPares230 {

    
    public static void main(String[] args) {
        int suma=0, contador;
        
        for (contador= 2; contador <= 30; contador= contador + 2)
        {
            suma= suma + contador;
        }
        System.out.println("La suma es "+suma);
    }
}
