package ejerciciosutilarrays.ejercicio5;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

// ? Importamos la Clase Arrays y Collections
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array entero de 8 posiciones
        int calificaciones[] = new int[8];

        // ^ Definimos una instancia de la clase Scanner de tipo final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al Usuario los valores de los jugadores
        System.out.println("Introduce la calificación de los 8 jugadores:");
        for (byte pos = 0; pos < calificaciones.length; pos++) {
            System.out.print("[" + pos + "] > ");
            calificaciones[pos] = read.nextInt();
        }

        // ^ Cerramos el Scanner tras su uso
        read.close();
        
        // ? Salto de Línea Triple
        System.out.println("\n-------------------------------\n");

        // ! Ordenamos los valores del Array de forma ascendente
        Arrays.sort(calificaciones);

        // ! Invertimos el orden del Array
        Methods.invertArray(calificaciones);

        // ! Mostramos el Array
        System.out.println("Calificaciones Ordenadas de Mayor a Menor:\n" + Arrays.toString(calificaciones));
    }
}
