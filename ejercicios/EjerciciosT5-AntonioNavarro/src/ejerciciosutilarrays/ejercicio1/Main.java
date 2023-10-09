package ejerciciosutilarrays.ejercicio1;

// ? Importamos la Clase Scanner y Locale
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos las variables desconocidas N y M
        int valor1;
        int valor2;

        // ^ Definimos una instancia de la clase Scanner siendo esta final con nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al Usuario el valor de N y M
        System.out.print("Introduce el valor de N: ");
        valor1 = read.nextInt(); // * leemos el valor de N
        System.out.print("Introduce el valor de M: ");
        valor2 = read.nextInt(); // * Leemos el valor de M

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Linea Triple
        System.out.println("\n-------------------------------\n");

        // ! Creamos el Array de N posiciones con el valor M duplicado en todas sus posiciones
        int arrayRelleno[] = new int[valor1];

        // ! Con la clase Arrays rellenamos todas las posiciones con el valor de M (valor2)
        Arrays.fill(arrayRelleno, valor2);

        // ! Imprimimos la lista
        System.out.println("El Array de " + valor1 + " posiciones con valor " + valor2 + " queda como:");
        System.out.println(Arrays.toString(arrayRelleno));
    } // € Hecho por Antonio Navarro
}