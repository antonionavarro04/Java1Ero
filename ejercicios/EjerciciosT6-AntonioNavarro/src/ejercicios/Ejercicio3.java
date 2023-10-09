package ejercicios;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static int howManyBlanks(String string) {
        int howMany = 0;
        for (int pos = 0; pos < string.length(); pos++) {
            if (string.charAt(pos) == ' ') {
                howMany++;
            }
        } return howMany;
    }

    public static void main(String[] args) {
        System.out.print("Introduce una cadena: ");
        System.out.printf("Tu cadena tiene %s espacios en blanco", howManyBlanks(read.nextLine()));
    }
}
