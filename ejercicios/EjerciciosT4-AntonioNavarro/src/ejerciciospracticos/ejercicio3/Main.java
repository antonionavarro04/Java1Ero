// € Hecho por Antonio Navarro

package ejerciciospracticos.ejercicio3;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos las variables contador, max y min
        int contador;
        int max;
        int min;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos los números al Usuario
        System.out.print("Introduce el número de números aleatorios que quieres: ");
        contador = read.nextInt(); // * Para contador
        System.out.print("Introduce el número máximo: ");
        max = read.nextInt(); // * Para max
        System.out.print("Introduce el número mínimo: ");
        min = read.nextInt(); // * Para min

        // ? Salto de línea triple
        System.out.println("\n<<<<<<----------------->>>>>>\n");

        // ! Mostramos el resultado
        System.out.println("Números aleatorios entre 0 y 1: ");
        NumerosAleatorios.numerosAleatorios(contador);

        // ? Salto de línea triple
        System.out.println("\n-----------------------------\n");

        // ! Mostramos el resultado
        System.out.println("Números aleatorios entre 0 y " + max + ":");
        NumerosAleatorios.numerosAleatorios(contador, max);

        // ? Salto de línea triple
        System.out.println("\n-----------------------------\n");

        // ! Mostramos el resultado
        System.out.println("Números aleatorios entre " + min + " y " + max + ":");
        NumerosAleatorios.numerosAleatorios(contador, max, min);

        // ^ Cerramos el Scanner
        read.close();
    }
}
