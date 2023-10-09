package ejerciciosutilarrays.ejercicio6;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un Array de 1000 posiciones
        int numeros[] = new int[1000];

        // ^ Definimos una variable incognita que es el valor a buscar
        byte incognita;

        // ^ Definimos una instancia de la clase Scanner de tipo final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Rellenamos el Array con números aleatorios
        for (short pos = 0; pos < numeros.length; pos++) {
            numeros[pos] = (int) (Math.random() * 100);
        }

        do { // ! Pedimos el número al Usuario
            System.out.print("Introduce un valor a buscar en el Array (0 - 99): ");
            incognita = read.nextByte();
        } while (incognita < 0);

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ! Llamamos a la función buscarNumero para encontrar el número en el array
        Merthods.buscarNumero(numeros, incognita);
    }
}
