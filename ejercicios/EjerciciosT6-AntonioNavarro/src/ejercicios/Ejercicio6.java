package ejercicios;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static int howManyTimes(String frase, String palabra) {
        int times = 0;
        int firstIndex = 0, lastIndex = 0;

        do {
            lastIndex = frase.indexOf(palabra, firstIndex);
            if (lastIndex != -1) {
                times++;
            } firstIndex = lastIndex + palabra.length();
        } while (lastIndex != -1);

        return times;
    }

    public static void main(String[] args) {
        String frase, palabra;

        System.out.println("Introduce una frase y una palabra:");
        System.out.print("Frase: ");
        frase = read.nextLine();
        System.out.print("Palabra: ");
        palabra = read.nextLine();

        System.out.printf("Tu palabra sale %s veces", howManyTimes(frase, palabra));
    }
}
