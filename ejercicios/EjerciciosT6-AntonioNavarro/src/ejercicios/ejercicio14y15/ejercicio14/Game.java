package ejercicios.ejercicio14y15.ejercicio14;

import funciones.Mathematics;
import funciones.PerArrays;

public class Game {
    public static String anagrama;
    public static String anagramaGenerado = "";

    public static String guess = "";

    public static boolean haGanado = false;

    public static void generateAnagram() {
        anagramaGenerado = "";
        char charizedString[] = anagrama.toCharArray();

        while (charizedString.length != 0) {
            int rng = Mathematics.rng(charizedString.length - 1);
            anagramaGenerado += charizedString[rng];
            charizedString = PerArrays.deleteKnowingData(charizedString, rng);
        }
    }

    public static boolean comprobar() {
        if (guess.equals(anagrama)) {
            haGanado = true;
        } return haGanado;
    }
}
