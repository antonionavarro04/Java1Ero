package ejercicios2;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static String diccionario(String s) {
        String diccionario = "";

        String[] palabras = s.split(" ");

        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = 0; j < palabras.length - i - 1; j++) {
                if (palabras[j].compareTo(palabras[j + 1]) < 0) {
                    String temp = palabras[j];
                    palabras[j] = palabras[j + 1];
                    palabras[j + 1] = temp;
                }
            }
        }

        for (int pos = 0; pos < palabras.length; pos++) {
            diccionario += palabras[pos] + " ";
        }

        return diccionario;
    }

    public static void main(String[] args) {
        System.out.println("Introduce una serie de palabras separadas por espacios:");
        String palabras = read.nextLine();

        String palabra1 = "Matias";
        String palabra2 = "Pedro";
        String palabra3 = "Juan";

        System.out.printf("%s ; %s ; %s ; %s\n", palabra1.compareTo(palabra3), palabra2.compareTo(palabra3), palabra2.compareTo(palabra1), palabra1.compareTo(palabra2));

        System.out.printf("Tus palabras ordenadas alfabéticamnete son:\n%s", diccionario(palabras));
    }
}
