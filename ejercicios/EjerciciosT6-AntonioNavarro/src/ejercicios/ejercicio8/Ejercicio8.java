package ejercicios.ejercicio8;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static Traductor traductorJavalandia(String fraseOriginal) {
        Traductor translation = new Traductor();

        // No lo puedo hacer con tildes, java no me las pilla
        if (fraseOriginal.startsWith("Javalin, javalon")) {
            translation.state = true;
            translation.fraseTraducida += fraseOriginal.substring(17);
        } if (fraseOriginal.endsWith("Javalen, len, len")) {
            translation.state = true;
            translation.fraseTraducida = translation.fraseTraducida.substring(0, translation.fraseTraducida.length() - 17);
        } return translation;
    }

    public static void main(String[] args) {
        String frase;
        
        System.out.print("Introduce una frase: ");
        frase = read.nextLine();

        Traductor translate = traductorJavalandia(frase);

        System.out.printf("La frase %s %s en \"Javalandia\"\nSu traducción es: %s", frase, translate.state ? "está" : "no está", translate.fraseTraducida);
    }
}
