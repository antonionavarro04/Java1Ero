package ejercicios2;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static String toCamelCase(String cadenaOriginal) {
        String camelized = "";
        boolean upperCase = false;

        for (int pos = 0; pos < cadenaOriginal.length(); pos++) {
            if (cadenaOriginal.charAt(pos) == ' ') {
                upperCase = true;
            } else if (upperCase) {
                camelized += Character.toUpperCase(cadenaOriginal.charAt(pos));
                upperCase = false;
            } else {
                camelized += Character.toLowerCase(cadenaOriginal.charAt(pos));
            }
        } return camelized;
    }

    public static void main(String[] args) {
        System.out.print("Introduce una frase: ");
        String frase = read.nextLine();

        System.out.printf("Tu frase en nomenclatura Camel es: %s\n", toCamelCase(frase));
    }
}
