package ejercicios.ejercicio2;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2Advanced {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static String contrasenhaFinal;

    public static String passwordBreaker(String password) {
        String stringFinal = "";
        for (int pos = 0; pos < contrasenhaFinal.length(); pos++) {
            if (password.length() > pos && (contrasenhaFinal.charAt(pos) == password.charAt(pos))) {
                stringFinal += password.charAt(pos);
            } else {
                stringFinal += "*";
            }
        } return stringFinal;
    }

    public static void main(String[] args) {
        String guess;
        System.out.print("Introduce la contrasenah Jugador 1: ");
        contrasenhaFinal = read.nextLine();
        do {
            System.out.print("Introduce la contraseña: ");
            guess = read.nextLine();
            System.out.println(passwordBreaker(guess));
            System.out.println();
        } while (!contrasenhaFinal.equals(guess));
    }
}
