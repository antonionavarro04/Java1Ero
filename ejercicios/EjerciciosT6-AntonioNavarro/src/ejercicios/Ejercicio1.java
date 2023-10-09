package ejercicios;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    public static void compararCadenas(String cadena1, String cadena2) {
        if (cadena1.length() > cadena2.length()) {
            System.out.print("La cadena 1 es mayor que la cadena 2");
        } else if (cadena1.length() < cadena2.length()) {
            System.out.print("La cadena 1 es menor que la cadena 2");
        } else {
            System.out.print("La cadena 1 es igual que la cadena 2");
        } System.out.printf(" (%s: %d caracteres, %s: %d caracteres)\n", cadena1, cadena1.length(), cadena2, cadena2.length());
    }

    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        String cadena1, cadena2;

        System.out.print("Introduzca la primera cadena: ");
        cadena1 = read.nextLine();
        System.out.print("Introduzca la segunda cadena: ");
        cadena2 = read.nextLine();

        compararCadenas(cadena1, cadena2);
    }
}
