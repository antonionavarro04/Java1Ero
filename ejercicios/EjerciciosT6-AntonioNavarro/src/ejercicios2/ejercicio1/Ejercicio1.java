package ejercicios2.ejercicio1;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static String uncomment(String fraseOriginal) {
        String fraseFinal = "";
        int lastIndex = 0;
        int startFrom = 0;

        do {
            int index = fraseOriginal.indexOf("/*", startFrom);
            
            for (int pos = lastIndex; pos < index; pos++) {
                fraseFinal += fraseOriginal.charAt(pos);
            }
            lastIndex = fraseOriginal.indexOf("*/", startFrom) + 3;
            startFrom = lastIndex;
        } while (startFrom < fraseOriginal.length());

        return fraseFinal;
    }

    public static void main(String[] args) {
        String sentencia;
        String sentenciaFinal;

        System.out.println("Copia tu Sentencia en C:");
        sentencia = read.nextLine();

        sentenciaFinal = uncomment(sentencia);

        System.out.printf("Tu sentencia sin comentarios es: \"%s\"\n", sentenciaFinal);
    }
}
