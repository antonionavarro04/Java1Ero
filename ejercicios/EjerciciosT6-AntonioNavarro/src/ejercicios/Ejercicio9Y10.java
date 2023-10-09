package ejercicios;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9Y10 {
    private static final char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
    private static final char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

    public static char codifica(char conjunto1[], char conjunto2[], char caracterOriginal) {
        char caracterCodificado = caracterOriginal;

        for (int pos = 0; pos < conjunto1.length; pos++) {
            if (caracterOriginal == conjunto1[pos]) {
                caracterCodificado = conjunto2[pos];
            }
        } return caracterCodificado;
    }

    public static char decodifica(char conjunto1[], char conjunto2[], char caracterOriginal) {
        char caracterCodificado = caracterOriginal;

        for (int pos = 0; pos < conjunto1.length; pos++) {
            if (caracterOriginal == conjunto2[pos]) {
                caracterCodificado = conjunto1[pos];
            }
        } return caracterCodificado;
    }

    public static String coder(String textoOriginal) {
        String textoCodificado = "";
        textoOriginal = textoOriginal.toLowerCase();
        for (int pos = 0; pos < textoOriginal.length(); pos++) {
            textoCodificado += codifica(conjunto1, conjunto2, textoOriginal.charAt(pos));
        } return textoCodificado;
    }

    public static String decoder(String textoOriginal) {
        String textoCodificado = "";
        textoOriginal = textoOriginal.toLowerCase();
        for (int pos = 0; pos < textoOriginal.length(); pos++) {
            textoCodificado += decodifica(conjunto1, conjunto2, textoOriginal.charAt(pos));
        } return textoCodificado;
    }

    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        String texto = "";

        System.out.print("Introduce el Texto a Codificar: ");
        texto = read.nextLine();

        System.out.printf("El texto codificado es: %s\n", coder(texto));
        
        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");
        
        System.out.print("Introduce el Texto a Decodificar: ");
        texto = read.nextLine();

        System.out.printf("El texto decodificado es: %s\n", decoder(texto));
    }
}
