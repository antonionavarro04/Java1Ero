package ejercicioseliminacion;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    private static final boolean DEV = false; // ? Esta opción marca si se muestran mensajes de error al capturar la excepción o no

    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    // ^ Definimos una variable global estática que indique el número máximo
    private static final int MAX_NUMBER = 10;

    public static void main(String[] args) {
        // ^ Definimos un array de 20 posiciones
        int array[] = new int[20];

        // ^ Definimos una variable entera , nos servirá para indicar a patir de que numero buscar
        int number;

        // ! Rellenamos el array con valores entre 0 y 10
        SharedMethods.randomFill(array, MAX_NUMBER);

        // ? Imprimimos el Array original
        System.out.println("Array Original:");
        SharedMethods.printArray(array); System.out.println(); // ? Salto de Línea

        // ! Pedimos al usuario que introduzca un número
        System.out.println("Introduce a partir de que valor eliminar");
        do { // * Este número no podrá ser mayor a MAX_NUMBER (Default: 10) ni menor a 0
            System.out.print(">>> ");
            number = read.nextInt();
        } while (number < 0 || number > MAX_NUMBER);

        // ! Copiamos el número a ser buscado en una variable auxiliar
        final int auxNumber = number;

        // ! Mediante un bucle for iremos eliminando los números hasta que no quede ninguno
        for (; number <= MAX_NUMBER; number++) {
            try {
                array = SharedMethods.deleteUnsortedData(array, number);
                number--;
            } catch (ArrayIndexOutOfBoundsException exception) {
                if (DEV) {
                    System.err.println("El número " + number + " no se encuentra en el Array\nDetailed Error: " + exception);
                }
            }
        }

        // ? Mostramos el Array Final
        System.out.println("Array con Valores <= " + auxNumber + " Eliminados");
        SharedMethods.printArray(array);
    }
} // € Hecho por Antonio Navarro
