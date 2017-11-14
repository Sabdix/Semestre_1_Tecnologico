
package aproximando.a.pi;


public class AproximandoAPi {

    
    public static void main(String[] args) {
        int alternador=1, contador;
        double suma=0, denominador;
        for (contador=1; contador <= 17147; contador++)
        {
            for (denominador=1; denominador <= 34301; denominador=denominador+2)
            {
                if (alternador == 1)
                {
                    suma= suma+(4/denominador);
                    alternador=0;
                } else
                {
                    suma = suma-(4/denominador);
                    alternador=1;
                }
            }
        }
        System.out.println(suma);
    }
}
