package ejercicios;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        String stringFinal = "", string = "";
        System.out.println("Introduce una cadena palabra por palabra, escribe fin para acabar");

        while (!string.equalsIgnoreCase("fin")) {
            stringFinal += string + " ";
            string = read.nextLine();
        }

        System.out.printf("Frase Acabada:%s", stringFinal);
    }
}
