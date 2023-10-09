package ejercicioseliminacion;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void printMenu() {
        System.out.println("a. Mostrar Valores");
        System.out.println("b. Eliminar Valor");
        System.out.println("c. Salir");
        System.out.print(">>> ");
    }
    public static void main(String[] args) {
        // ^ Definimos un array entero de 10 posiciones
        int array[] = new int[10];

        // ^ Definimos la variable option y needToBeDeleted
        char option; int numberToBeDeleted;

        // ! Rellenamos el array con numeros aleatorios comprendidos entre 0 y 1000
        SharedMethods.randomFill(array, 1000);

        do { // ! Mostraremos el menú hasta que el usuario introduzca 'c' 
            printMenu();
            try {
                option = read.nextLine().charAt(0);
            } catch (StringIndexOutOfBoundsException exception) {
                System.err.println("Ha habido un error al introducir el valor, se ajustará automaticamente como '!' \nDetailed Error: " + exception);
                option = '!';
            } System.out.println(); // ? Salto de Línea
            switch (option) { // * Mediante un Switch-Case trabajaremos en consecuencia de la opción elegida por el usuario
                case 'A':
                case 'a': // * Imprimiremos el Array
                    SharedMethods.printArray(array);
                    break;
                case 'B':
                case 'b': // * Preguntamos el numero a eliminar y llamamos a la función
                    System.out.println("Que número desea eliminar?");
                    System.out.print(">>> ");
                    numberToBeDeleted = read.nextInt(); read.nextLine(); // ? Limpieza de Búffer
                    try {
                        array = SharedMethods.deleteUnsortedData(array, numberToBeDeleted);
                    } catch (IndexOutOfBoundsException exception) {
                        System.err.println("El número " + numberToBeDeleted + " no existe en el array\n" + "Detailed Error: " + exception);
                    } break;
                case 'C':
                case 'c': // * Solo mostramos que pulse enter para salir
                    System.out.print("Programa Finalizado... ");
                    break;
                default: // * Cualquier otra opción sera inválida
                    System.err.println("Opción Inválida!");
                    break;
            }
            if (option != 'c' && option != 'C') {
                System.out.print("Pulsa 'enter' para continuar... ");
                read.nextLine();
            }
        } while (option != 'c');
    }
} // € Hecho por Antonio Navarro
