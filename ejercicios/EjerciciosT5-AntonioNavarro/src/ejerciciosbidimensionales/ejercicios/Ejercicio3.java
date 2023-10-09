package ejerciciosbidimensionales.ejercicios;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        // ^ Definimos un array de 4*5
        int array[][] = new int[4][5];
        
        // ! Rellenamos el Array con las notas de los alumnos, cada fila será un alumno distinto
        for (int fila = 0; fila < array.length; fila++) {
            System.out.printf("Introduce las notas del Alumno %s:\n", fila + 1);
            for (int columna = 0; columna < array[0].length; columna++) {
                System.out.printf("Asignatura %s >>> ", columna + 1);
                array[fila][columna] = read.nextInt();
            } System.out.println();
        }

        // ? Limpiamos el Búffer del Scanner
        read.nextLine();
        
        // ? Salto de Línea Doble
        System.out.println("--------------------------------------------------------------------\n");
        
        // ! Recorremos el bucle y por cada fila imprimiremos la información del alumno concreto
        for (int fila = 0; fila < array.length; fila++) {
            int max = array[fila][0];
            int min = array[fila][0];
            double media = array[fila][0];
            System.out.printf("Para el Alumno %s:\n", fila + 1);
            for (int columna = 1; columna < array[0].length; columna++) {
                if (max < array[fila][columna]) {
                    max = array[fila][columna];
                } else if (min > array[fila][columna]) {
                    min = array[fila][columna];
                } media += array[fila][columna];
            }
            System.out.printf("Su nota máxima fue: %s\n", max);
            System.out.printf("Su nota mínima fue: %s\n", min);
            System.out.printf("Su nota media fue: %s\n", media / (double) array[0].length);
            System.out.print("Pulsa Intro para continuar... ");
            read.nextLine();
            System.out.println();
        }
        System.out.println("Calificaciones totales, cada fila es un alumno diferente:");
        Methods.printArray(array);
    }
} // € Hecho por Antonio Navarro
