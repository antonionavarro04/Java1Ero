package ejercicio9;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio9Original {
    public static void main(String[] args) {
        // ? Juego piedra papel o tijera, los dos jugadores introduciran un numero del 1 al 3, si el numero es 1 es piedra, 2 papel y 3 tijera.
        // ^ Creamos las variables para los dos jugadores
        byte p1, p2;

        // ^ Creamos variables de tipo constantes para los Valores PIEDRA, PAPEL y TIJERA y se la asignamos a un numero
        final byte PIEDRA = 1;
        final byte PAPEL = 2;
        final byte TIJERA = 3;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al Jugador 1 que nos introduzca su jugada
        System.out.print("Jugador 1, introduce tu jugada (PIEDRA [1], PAPEL [2] O TIJERA [3]): ");
        p1 = read.nextByte();
        
        // ! Pedimos al Jugador 2 que nos introduzca su jugada
        System.out.print("Jugador 2, introduce tu jugada (PIEDRA [1], PAPEL [2] O TIJERA [3]): ");
        p2 = read.nextByte();

        // ? Salto de linea bonito
        System.out.println();System.out.println("---------------------------------------------");System.out.println();

        // ! Comprobamos el ganador mediante una estructura if
        if (p1 == p2){
            System.out.println("Empate");
        } else if (p1 == PIEDRA && p2 == TIJERA){
            System.out.println("Gana el Jugador 1");
        } else if (p1 == PAPEL && p2 == PIEDRA){
            System.out.println("Gana el Jugador 1");
        } else if (p1 == TIJERA && p2 == PAPEL){
            System.out.println("Gana el Jugador 1");
        } else if (p1 == PIEDRA && p2 == PAPEL){
            System.out.println("Gana el Jugador 2");
        } else if (p1 == PAPEL && p2 == TIJERA){
            System.out.println("Gana el Jugador 2");
        } else if (p1 == TIJERA && p2 == PIEDRA){
            System.out.println("Gana el Jugador 2");
        } else{
            System.out.println("Alguno de los dos jugadores no ha introducido una jugada valida");
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
