// € Hechor por Antonio Navarro

package ejerciciospracticos.ejercicio2;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos la variable read como final Scanner y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos el radio al usuario
        System.out.print("Introduce el radio de la esfera: ");
        Esfera.radio = read.nextDouble(); // * Leemos el radio

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Linea Triple
        System.out.println("\n--------------------------\n");

        // ! Mostramos el resultado de los metodos
        System.out.println("La superficie de la esfera es: " + Esfera.supeficie());
        System.out.println("El volumen de la esfera es: " + Esfera.volumen());
    }
}
