package examen;

// ? Importamos la Clase Locale y Scanner
import java.util.Locale;
import java.util.Scanner;

public class Main {
    // ^ Definimos una instancia de la clase Scanner como public static final de nombre read y cambiamos su formato a US
    public static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        // ^ Definimos la variable intentos y opcion
        int intentos = 0, opcion;

        // ^ Definimos una String para recoger el guess del usuario
        String guess;

        Game.generaPalabra(); // ! Generamos la palabra a adivinar

        // ! Rellenamos con "_" la palabraPista con tantos caracteres tenga la palabraSecreta
        for (int pos = 0; pos < Game.palabraSecreta.length(); pos++) {
            Game.palabraPista += "_";
        } System.out.println("Pista: " + Game.palabraPista); // Imprimimos la pista
        // ! Mientras el Jugador no haya acertado la palabra y le queden intentos
        while (!Game.palabraSecreta.equalsIgnoreCase(Game.palabraPista) && intentos < Game.NUMINTENTOS) {
            opcion = Game.menu(); // ! Imprimimos el menú
            read.nextLine(); // ? Limpiamos el Búffer

            switch (opcion) { // ? Mediante un switch procesamos la opcion recogida
                case 1: // * En caso 1 pediremos solo una letra
                System.out.print("Introduce una letra: ");
                guess = read.nextLine(); // * Recogemos el valor, solo será valido el primer caracter introducido
                if (Game.noAcertadas.contains(guess) || Game.palabraPista.contains(guess)) { // ? Si la letra ya se ha usado
                    intentos--; // ! Reduciremos en 1 los intentos
                } Game.compruebaLetra(guess.toLowerCase().charAt(0)); // * Llamamos a la función comprobar letra
                break;

                case 2: // * En caso 2 pediremos una palabra
                System.out.print("Introduce una palabra: ");
                guess = read.nextLine(); // * Recogemos el valor
                Game.compruebaPalabra(guess); // * Llamamos a la función comprobar letra
                break;

                default: // * Repetimos el menú usando continue, el cual vuelve al principio del While;
                System.out.printf("Valor \"%s\" incorrecto, introduce otra opción:\n", opcion);
                continue;
            }

            Game.pintaPista(); // ! Volvemos a imprimir la pista

            intentos++; // ! Sumamos un intento
            
            System.out.printf("Intentos Restantes: %s\n\n", Game.NUMINTENTOS - intentos); // ! Imprimimos los intentos restantes
        }

        // ! Según si ha Ganado o no (Que la pista sea igual a la secreta) imprimiremos un mensaje u otro
        if (Game.palabraPista.equals(Game.palabraSecreta)) {
            System.out.println("¡¡ENHORABUENA!! HAS ACERTADO");
        } else {
            System.out.println("GAME OVER");
        }

        // ^ Ceramos el Scanner
        read.close();
    }
}
