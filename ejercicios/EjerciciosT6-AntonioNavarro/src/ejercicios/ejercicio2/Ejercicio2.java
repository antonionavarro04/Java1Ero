package ejercicios.ejercicio2;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    private static final String CONTRASENHA = "Nutria";

    public static boolean comprobarContrasenha(String contrasenha) {
        boolean state = true;
        int comparison = contrasenha.compareTo(CONTRASENHA);
        if (comparison == 0) {
            System.out.println("Contraseña correcta");
            state = false;
        } else if (comparison > 0) {
            System.out.printf("Contraseña incorrecta, %s es mayor que la contraseña\n\n", contrasenha);
        } else {
            System.out.printf("Contraseña incorrecta, %s es menor que la contraseña\n\n", contrasenha);
        } return state;
    }

    public static void main(String[] args) {
        String guess;
        boolean game = true;

        do {
            System.out.print("Introduce la contraseña: ");
            guess = read.nextLine();
            game = comprobarContrasenha(guess);
        } while (game);
    }
}
