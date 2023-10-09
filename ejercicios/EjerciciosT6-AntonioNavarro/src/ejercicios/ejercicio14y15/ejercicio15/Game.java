package ejercicios.ejercicio14y15.ejercicio15;

import funciones.ConsoleManager;
import funciones.Mathematics;
import funciones.PerArrays;

public class Game {
    public static String anagrama;
    public static String anagramaGenerado = "";

    public static String guess = "";
    public static String acertadas = "";

    public static boolean haGanado = false;

    public static void firstGuess() {
        for (int pos = 0; pos < anagrama.length(); pos++) {
            acertadas += "_";
        }
    }

    public static void generateAnagram() {
        do {
            anagramaGenerado = "";
            char charizedString[] = anagrama.toCharArray();
            while (charizedString.length != 0) {
                int rng = Mathematics.rng(charizedString.length - 1);
                anagramaGenerado += charizedString[rng];
                charizedString = PerArrays.deleteKnowingData(charizedString, rng);
            }
        } while (anagramaGenerado.equals(anagrama));
    }

    public static boolean comprobar() {
        acertadas = "";
        for (int pos = 0; pos < anagrama.length(); pos++) {
            if (pos < guess.length() && guess.charAt(pos) == anagrama.charAt(pos)) {
                acertadas += guess.charAt(pos);
            } else {
                acertadas += "_";
            }
        }

        if (guess.equals(anagrama)) {
            haGanado = true;
        } return haGanado;
    }

    public static void printInfo() {
        System.out.printf("{ %s%s%s | ", ConsoleManager.RED, Game.anagramaGenerado, ConsoleManager.RESET);
        for (int pos = 0; pos < acertadas.length(); pos++) {
            char letraActual = acertadas.charAt(pos);
            switch (letraActual) {
                case '_':
                    System.out.print(ConsoleManager.YELLOW);;
                    break;
            
                default:
                    System.out.print(ConsoleManager.CYAN);
                    break;
            } System.out.printf("%s%s", letraActual, ConsoleManager.RESET);
        } System.out.println(" }");
    }
}
