package discoduroderoer;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ? Programa Java el cual te diga bienvenido segun el nombre que introduzcas
        // ^ Definimos la variable name
        String name;

        // ^ Definimos la variable read como Scanner con formato US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        do{ // ! Pedimos el nombre al usuario
            System.out.print("Introduce tu nombre: ");
            name = read.nextLine();
        } while (name.isEmpty());

        // ? Salto de Línea Triple
        System.out.println("\n----------------------------------\n");

        System.out.println("Bienvenido " + name); // ! Imprimimos el nombre

        // ^ Cerramos el Scanner
        read.close();
    }       
}
