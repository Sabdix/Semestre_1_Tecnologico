
package numeros.romanos;


public class NumerosRomanos {

    public static void Decenas (int dec){
        switch (dec){
            case 1:
                System.out.print("X");
                break;
            case 2:
                System.out.print("XX");
                break;
            case 3:
                System.out.print("XXX");
                break;
            case 4:
                System.out.print("XL");
                break;
            case 5:
                System.out.print("L");
                break;
            case 6:
                System.out.print("LX");
                break;
            case 7:
                System.out.print("LXX");
                break;
            case 8:
                System.out.print("LXXX");
                break;
            case 9:
                System.out.print("XC");
                break;
                            
        }
    }
    public static void Unidades (int uni){
        switch (uni){
            case 1:
                System.out.print("I");
                break;
            case 2:
                System.out.print("II");
                break;
            case 3:
                System.out.print("III");
                break;
            case 4:
                System.out.print("IV");
                break;
            case 5:
                System.out.print("V");
                break;
            case 6:
                System.out.print("VI");
                break;
            case 7:
                System.out.print("VII");
                break;
            case 8:
                System.out.print("VIII");
                break;
            case 9:
                System.out.print("IX");
                break;
        }
    }
    public static void main(String[] args) {
        int Unidad, Decena, suma=1;
        
        for (Decena=0; Decena <= 9; Decena++)
            {
                for (Unidad=1; Unidad <= 10; Unidad++)
                    {
                        
                        Decenas(Decena);
                        Unidades(Unidad);
                        System.out.print("\t\t");
                        suma= suma+1;
                    }
                System.out.print("\n");
            }
        System.out.println("C");
    }
}
