package ejercicios2;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static String generateHtml(String title, String content) {
        String html = "<html><head><title>" + title + "</title></head><body><p>" + content + "</p></body></html>";

        return html;
    }

    public static void main(String[] args) {
        String titulo, contenido, html;
        
        System.out.print("Introduce el titulo de tu www: ");
        titulo = read.nextLine();

        System.out.print("Introduce el contenido de tu www: ");
        contenido = read.nextLine();

        html = generateHtml(titulo, contenido);

        System.out.println(html);
    }
}
