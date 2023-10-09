package ejerciciospracticos.twodminer;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    // ^ Variables booleanas de control
    public static boolean juego = true, haGanado = false, sigueJugando = true;

    public static void main(String[] args) {
        String movement;
        char movementFinal;

        // TODO | Intro

        do {
            Game.generateBoard();
            do {
                do {
                    Game.printGame(Game.tableroJugador);
                    System.out.print("\n>>> ");
                    try {
                        movement = read.nextLine();
                    } catch (java.lang.StringIndexOutOfBoundsException exception) {
                        exception.printStackTrace();
                        movement = "?";
                    } if (!movement.isEmpty()) {
                        movementFinal = Game.moveCursor(movement);
                    } else {
                        movementFinal = '?';
                    }
                } while (movementFinal != 'x');
                Game.destapar();
            } while (juego);
            sigueJugando = false;

            // TODO | Final
        } while (sigueJugando);
    }
}
