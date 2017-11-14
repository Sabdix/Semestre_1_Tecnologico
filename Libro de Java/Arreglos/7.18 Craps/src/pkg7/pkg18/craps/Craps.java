

package pkg7.pkg18.craps;

/**
 *@author Sabdi Abraham Pantoja Orozco
 * No. de Control: 13121157
 * 
 * (juego de craps)
 * Escriba una aplicación que ejecute 1000 juegos de craps y responda a las siguientes
 * preguntas:
 * a) ¿Cuántos juegos se ganan en el primer tiro, en el segundo, ..., en el vigésimo tiro y después de éste?
 * b) ¿Cuántos juegos se pierden en el primer tiro, en el segundo, ..., en el vigésimo tiro y después de éste?
 * c) ¿Cuáles son las probabilidades de ganar en craps? [Nota: debe descubrir que craps es uno de los juegos de
 * casino más justos. ¿Qué cree usted que signifi ca esto?].
 * d) ¿Cuál es la duración promedio de un juego de craps?
 * e) ¿Las probabilidades de ganar mejoran con la duración del juego?
 */
import java.util.Random;
public class Craps {
    // crea un generador de números aleatorios para usarlo en el método tirarDado
    private static Random numerosAleatorios = new Random();
    // enumeración con constantes que representan el estado del juego
    private enum Estado { CONTINUA, GANO, PERDIO };
    
    // constantes que representan tiros comunes del dado
    private final static int DOS_UNOS = 2;
    private final static int TRES = 3;
    private final static int SIETE = 7;
    private final static int ONCE = 11;
    private final static int DOCE = 12;
    
    // ejecuta un juego de craps
   // public void jugar()
    {
        int miPunto = 0; // punto si no gana o pierde en el primer tiro
        Estado estadoJuego; // puede contener CONTINUA, GANO o PERDIO
        
        int sumaDeDados = tirarDados(); // primer tiro de los dados
        
        // determina el estado del juego y el punto con base en el primer tiro
        switch ( sumaDeDados )
        {
            case SIETE: // gana con 7 en el primer tiro
            case ONCE: // gana con 11 en el primer tiro
                estadoJuego = Estado.GANO;
                break;
            case DOS_UNOS: // pierde con 2 en el primer tiro
            case TRES: // pierde con 3 en el primer tiro
            case DOCE: // pierde con 12 en el primer tiro
                estadoJuego = Estado.PERDIO;
                break;
            default: // no ganó ni perdió, por lo que guarda el punto
                estadoJuego = Estado.CONTINUA; // no ha terminado el juego
                miPunto = sumaDeDados; // guarda el punto
                System.out.printf( "El punto es %d\n", miPunto );
                break; // opcional al final del switch
        } // fin de switch

        // mientras el juego no esté terminado
        while ( estadoJuego == Estado.CONTINUA ) // no GANO ni PERDIO
        {
            sumaDeDados = tirarDados(); // tira los dados de nuevo
            
            // determina el estado del juego
            if ( sumaDeDados == miPunto ) // gana haciendo un punto
                estadoJuego = Estado.GANO;
            else
                if ( sumaDeDados == SIETE ) // pierde al tirar 7 antes del punto
                    estadoJuego = Estado.PERDIO;
        } // fin de while

        // muestra mensaje de que ganó o perdió
        if ( estadoJuego == Estado.GANO )
            System.out.println( "El jugador gana" );
        else
            System.out.println( "El jugador pierde" );
    } // fin del método jugar
    
    
    // tira los dados, calcula la suma y muestra los resultados
    public static int tirarDados()
    {
        // elige valores aleatorios para los dados
        int dado1 = 1 + numerosAleatorios.nextInt( 6 ); // primer tiro del dado
        int dado2 = 1 + numerosAleatorios.nextInt( 6 ); // segundo tiro del dado
        
        int suma = dado1 + dado2; // suma de los valores de los dados
        // muestra los resultados de este tiro
        
        System.out.printf( "El jugador tiro %d + %d = %d\n",dado1, dado2, suma );
        return suma; // devuelve la suma de los dados
    } // fin del método tirarDados


    
    public static void main(String[] args) {
        
        int con,tiro,gano=0,perdio=0,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U;
        A=0;
        B=0;
        C=0;
        D=0;
        E=0;
        F=0;
        G=0;
        H=0;
        I=0;
        J=0;
        K=0;
        L=0;
        M=0;
        N=0;
        O=0;
        P=0;
        Q=0;
        R=0;
        S=0;
        T=0;
        U=0;
        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
        g=0;
        h=0;
        i=0; 
        j=0;
        k=0;
        l=0;
        m=0;
        n=0;
        o=0;     
        p=0;
        q=0;
        r=0;
        s=0;
        t=0;
        u=0;
        for (con=0; con<1000;con++)
        {
            tiro=1;
            int miPunto = 0; 
            Estado estadoJuego; 
            int sumaDeDados = tirarDados(); 
            
            switch ( sumaDeDados )
            {
                case SIETE: 
                case ONCE:
                    estadoJuego = Estado.GANO;
                break;
                
                case DOS_UNOS: 
                case TRES: 
                case DOCE: 
               
                    estadoJuego = Estado.PERDIO;
                break;
                
                default: 
                    estadoJuego = Estado.CONTINUA;
                    miPunto = sumaDeDados;
                    System.out.printf( "El punto es %d\n", miPunto );
                    break;
            }

            while ( estadoJuego == Estado.CONTINUA )
            {
                tiro+=1;
                sumaDeDados = tirarDados();

                if ( sumaDeDados == miPunto )
                    estadoJuego = Estado.GANO;
                else
                    if ( sumaDeDados == SIETE )
                    { 
                        estadoJuego = Estado.PERDIO;
                    }
 
            }
            if ( estadoJuego == Estado.GANO )
            {
                System.out.println( "El jugador gana");
            }else
            {
                System.out.println( "El jugador pierde" );   
            }
 
            if(estadoJuego==Estado.GANO)
            {
                gano+=1;
                switch(tiro)
                {
                    case 1:
                        a+=1;
                        break;
                    case 2:
                        b+=1;
                        break;
                    case 3:
                        c+=1;
                        break;
                    case 4:
                        d+=1;
                        break;
                    case 5:
                        e+=1;
                        break;
                    case 6:
                        f+=1;
                        break;
                    case 7:
                        g+=1;
                        break;
                    case 8:
                        h+=1;
                        break;
                    case 9:
                        i+=1;
                        break;
                    case 10:
                        j+=1;
                        break;
                    case 11:
                        k+=1;
                        break;
                    case 12:
                        l+=1;
                        break;
                    case 13:
                        m+=1;
                        break;
                    case 14:
                        n+=1;
                        break;
                    case 15:
                        o+=1;
                        break;
                    case 16:
                        p+=1;
                        break;
                    case 17:
                        q+=1;
                        break;
                    case 18:
                        r+=1;
                        break;
                    case 19:
                        s+=1;
                        break;
                    case 20:
                        t+=1;
                        break;
                    default:
                        u+=1;
                        break;
                }
            }else
            {
                    perdio+=1;
                    switch(tiro)
                    {
                        case 1:
                            A+=1;
                            break;
                        case 2:
                            B+=1;
                            break;
                        case 3:
                            C+=1;
                            break;
                        case 4:
                            D+=1;
                            break;
                        case 5:
                            E+=1;
                            break;
                        case 6:
                            F+=1;
                            break;
                        case 7:
                            G+=1;
                            break;
                        case 8:
                            H+=1;
                            break;
                        case 9:
                            I+=1;
                            break;
                        case 10:
                            J+=1;
                            break;
                        case 11:
                            K+=1;
                            break;
                        case 12:
                            L+=1;
                            break;
                        case 13:
                            M+=1;
                            break;
                        case 14:
                            N+=1;
                            break;
                        case 15:
                            O+=1;
                            break;
                        case 16:
                            P+=1;
                            break;
                        case 17:
                            Q+=1;
                            break;
                        case 18:
                            R+=1;
                            break;
                        case 19:
                            S+=1;
                            break;
                        case 20:
                            T+=1;
                            break;
                        default:
                            U+=1;
                            break;     
                    }
            }
            System.out.println("\n");
        }         
        System.out.println("El jugador gana: "+gano);     
        System.out.println("En el turno 1 " +a);
        System.out.println("En el turno 2 " +b);
        System.out.println("En el turno 3 " +c);
        System.out.println("En el turno 4 " +d);
        System.out.println("En el turno 5 " +e);
        System.out.println("En el turno 6 " +f);
        System.out.println("En el turno 7 " +g);
        System.out.println("En el turno 8 " +h);
        System.out.println("En el turno 9 " +i);
        System.out.println("En el turno 10 "+j);
        System.out.println("En el turno 11 "+k);
        System.out.println("En el turno 12 " +l);
        System.out.println("En el turno 13 " +m);
        System.out.println("En el turno 14 " +n);
        System.out.println("En el turno 15 " +o);
        System.out.println("En el turno 16 " +p);
        System.out.println("En el turno 17 " +q);
        System.out.println("En el turno 18 " +r);
        System.out.println("En el turno 19 " +s);
        System.out.println("En el turno 20 " +t);
        System.out.println("Despues del turno 20 " +u);

        System.out.println("\n");
        System.out.println("El jugador pierde: "+perdio);
        System.out.println("En el turno 1 " +A);
        System.out.println("En el turno 2 " +B);
        System.out.println("En el turno 3 " +C);
        System.out.println("En el turno 4 " +D);
        System.out.println("En el turno 5 " +E);
        System.out.println("En el turno 6 " +F);
        System.out.println("En el turno 7 " +G);
        System.out.println("En el turno 8 " +H);
        System.out.println("En el turno 9 " +I);
        System.out.println("En el turno 10 "+J);
        System.out.println("En el turno 11 "+K);
        System.out.println("En el turno 12 "+L);
        System.out.println("En el turno 13 "+M);
        System.out.println("En el turno 14 "+N);
        System.out.println("En el turno 15 "+O);
        System.out.println("En el turno 16 "+P);
        System.out.println("En el turno 17 "+Q);
        System.out.println("En el turno 18 "+R);
        System.out.println("En el turno 19 "+S);
        System.out.println("En el turno 20 "+T);
        System.out.println("Despues del turno 20 "+U);
    }
    
}
