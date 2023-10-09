package ejerciciosutilarrays.ejercicio3;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Creamos 2 arrays enteros de 10 posiciones cada uno
        int primerArray[] = new int[10];
        int segundoArray[] = new int[10];

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca los 10 valores del primer Array
        System.out.println("Introduce 10 valores para el Primer Array:");
        for (byte pos = 0; pos < primerArray.length; pos++) {
            System.out.print("[" + pos + "] > ");
            primerArray[pos] = read.nextInt();
        }

        // ? Salto de Línea
        System.out.println();

        // ! Pedimos al usuario que introduzca los 10 valores del segundo Array
        System.out.println("Introduce 10 valores para el Segundo Array:");
        for (byte pos = 0; pos < segundoArray.length; pos++) {
            System.out.print("[" + pos + "] > ");
            segundoArray[pos] = read.nextInt();
        }

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n-------------------\n");

        // ! Imprimimos parte del Mensaje final
        System.out.print("Los Arrays sin Ordenar son ");
        
        // ! Mediante una estructura if-else comparamos los Arrays
        if (Arrays.equals(primerArray, segundoArray)) {
            System.out.println("Iguales");
        } else {
            System.out.println("Diferentes");
        }

        // ! Ordenamos ambos arrays
        Arrays.sort(primerArray);
        Arrays.sort(segundoArray);

        // ? Salto de Línea
        System.out.println();

        // ! Imprimimos parte del Mensaje final
        System.out.print("Los Arrays Ordenados son ");

        // ! Mediante una estructura if-else comparamos los Arrays
        if (Arrays.equals(primerArray, segundoArray)) {
            System.out.println("Iguales");
        } else {
            System.out.println("Diferentes");
        }
    }
}
