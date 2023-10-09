package ejercicios;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {
    public static String fraseLarga(String fraseOriginal) {
        String array[] = fraseOriginal.split(" ");
        String fraseMasLarga = "";

        for (String frase : array) {
            if (frase.length() > fraseMasLarga.length()) {
                fraseMasLarga = frase;
            }
        } return fraseMasLarga;
    }

    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        String frase, fraseMasLarga;

        System.out.print("Introduce una Frase: ");
        frase = read.nextLine();

        fraseMasLarga = fraseLarga(frase);
        System.out.printf("La palabra mas larga es: \"'%s'\", con una longitud de \"%s\"", fraseMasLarga, fraseMasLarga.length());
    }
}
