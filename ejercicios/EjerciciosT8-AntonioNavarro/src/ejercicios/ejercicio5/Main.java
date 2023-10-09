package ejercicios.ejercicio5;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

import funciones.ConsoleManager;

public class Main {
    // ^ Definimos una constante de clase que defina el salir de la aplicación
    protected static final char SALIR = '4';

    public static void main(String[] args) {
        // ^ Definimos variables copias para las clases y el control de codigo
        double lado1, lado2, lado3;
        char opcion;

        // ^ Definimos una instancia de la clase Scanner
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        do { // ! Ejecutaremos el siguiente código
            ConsoleManager.clear(); // ? Limpiamos la Consola

            System.out.print(Methods.menu()); // ? Imprimimos el menú
            
            try { // ! Intentamos leer el caracter
                opcion = read.nextLine().charAt(0);
            } catch (Exception e) { // ? En caso de que se produzca un error cambiamos el valor a 0
                opcion = '0';
            } System.out.println();

            switch (opcion) { // ! Procesemos la opción introducida por el usuario
                case '1': // * Nuevo Triángulo
                    // ! Recogemos los datos del Triángulo
                    System.out.print("Introduce la longitud datos del lado1 (m): ");
                    lado1 = read.nextInt(); read.nextLine();

                    System.out.print("Introduce la longitud datos del lado2 (m): ");
                    lado2 = read.nextInt(); read.nextLine();

                    System.out.print("Introduce la longitud datos del lado3 (m): ");
                    lado3 = read.nextInt(); read.nextLine();

                    // ! Llamamos a la función de inserción
                    Methods.insert(lado1, lado2, lado3);
                    break;

                case '2': // * Nuevo Rectángulo
                    // ! Recogemos los datos del Rectángulo
                    System.out.print("Introduce el ancho: ");
                    lado1 = read.nextDouble(); read.nextLine();

                    System.out.print("Introduce el alto: ");
                    lado2 = read.nextDouble(); read.nextLine();

                    // ! Llamamos a la función de inserción
                    Methods.insert(lado1, lado2);
                    break;

                case '3': // * Mostrar array
                    // ! Llamamos a la función para mostrar el array
                    System.out.println(Methods.print());
                    break;

                case SALIR: // * Salir
                    System.out.println("Saliendo...");
                    break;
            
                default: // * Por defecto volvemos a el principio del bucle
                    continue;
            }

            if (opcion != SALIR) { // ? Si la opción es diferent a salir
                System.out.print("Presiona enter para continuar...");
                read.nextLine(); // ! Esperamos a que el usuario introduzca algo
            }
        } while (opcion != SALIR); // ? Mientras opción sea diferente a SALIR

        // ^ Cerramos el Scanner
        read.close();
    }
}
