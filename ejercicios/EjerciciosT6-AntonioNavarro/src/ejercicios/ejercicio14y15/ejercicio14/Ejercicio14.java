package ejercicios.ejercicio14y15.ejercicio14;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

import funciones.ConsoleManager;

public class Ejercicio14 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        System.out.println("Bienvenidos al Juego del Anagrama!!!");
        System.out.println("En este juego uno de ustedes dos tiene que introducir una palabra.");
        System.out.println("Acto seguido el jugador 2 deberá acertar la palabra teniendo");
        System.out.println("como referencia un anagrama que se generará de forma aleatoria.");
        System.out.print("Press 'Enter' to start Playing...");
        read.nextLine();

        ConsoleManager.clear();
        System.out.print("Jugador 1, introduce una palabra: ");
        Game.anagrama = read.nextLine();

        do {
            ConsoleManager.clear();
            Game.generateAnagram();
            System.out.println(Game.anagramaGenerado);
            System.out.print(">>> ");
            Game.guess = read.nextLine();
        } while (!Game.comprobar());
        
        // ? Salto de Línea Triple
        System.out.println("\n-------------------------------------------\n");
        
        System.out.println("Enhorabuena Jugador 2, has ganado!");
    }
}
