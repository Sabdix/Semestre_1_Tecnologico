
package productos.impares.pkg1.pkg15;


public class ProductosImpares115 {

    
    public static void main(String[] args) {
        int contador, producto=1;
        
        for (contador= 1; contador <= 15; contador= contador + 2)
        {
            producto= producto * contador;
        }
        System.out.println("El producto es "+producto);
    }
}
