package ejercicioscrud.ejercicio3;

// ? Importamos la Clase Scanner y Locale
import java.util.Locale;
import java.util.Scanner;
import funciones.ConsoleManager;

public class Main {
    // ^ Definimos una constante para la opción de SALIR
    private static final char SALIR = '4';
    
    public static void main(String[] args) {
        // ^ Definimos una instancia de la Clase Scanner
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos una variable de control opción, de tipo char
        char opcion;

        // ^ Definimos una variable de control pos, de tipo int, controlará que parte del array se va a tocar
        int pos;

        // ^ Definimos variables (copia de la clase)
        String codigo, tamanho, tipo;

        // ? A el array tener 0 de longitud al principio, no hace falta inicializarlo

        do {
            // ! Imprimimos el menú y pedimos la opción al usuario
            System.out.println(" PIZZERIA SIMULATOR");
            System.out.println("====================");
            System.out.println("\n1. Listado de pizzas.");
            System.out.println("2. Nuevo Pedido.");
            System.out.println("3. Servir pedido.");
            System.out.println(SALIR + ". Salir.");
            System.out.print(">>> ");
            try { // ? Intentamos leer un char
                opcion = read.nextLine().charAt(0);
            } catch (Exception e) { // ? Si se ha introducido algo invalido, ponemos la opción 0
                System.out.println("Opción no válida, se ha seleccionado la opción 0 (Nada)");
                opcion = '0';
            }

            System.out.println(); // ? salto de Línea

            // ! Mediante un Switch procesamos la opción
            switch (opcion) {
                case '1': // ? Listado de pizzas
                    System.out.println(Methods.printArray());
                    break;

                case '2': // ? Nuevo pedido
                    /* BLOQUE CREACION */

                    System.out.print("Introduce el codigo del Artículo: ");
                    codigo = read.nextLine();

                    pos = Methods.secuentialSearch(Methods.pedidos, codigo);

                    if (pos != -1) { // ? Si el elemento ya existe en el array
                        System.out.printf("Ya existe un artículo de código \"%s\", en la posición \"%s\"\n", codigo, pos + 1);
                    } else { // ? Si no
                        System.out.print("Introduce el tipo de la pizza: ");
                        tipo = read.nextLine();

                        System.out.print("Introduce el tamanho de la pizza: ");
                        tamanho = read.nextLine();

                        /* BLOQUE AMPLIACION E INSERCION */

                        Methods.insertData(new Pizza(codigo, tamanho, tipo));
                    }

                    break;

                case '3': // ? Servir pedido
                    System.out.print("Introduce el codigo del pedido a servir: ");
                    codigo = read.nextLine(); // ! Pedimos el código del pedido
                    
                    if (Methods.borrarArticulo(codigo)) { // ? Si la operación se ha completado querrá decir que se ha borrado el artículo
                        System.out.println("Operación realizada correctamente");
                    } else { // ? Si no, no se ha borrado el artículo
                        System.out.printf("No existe ningún artículo con el código \"%s\"\n", codigo);
                    }

                    break;

                case SALIR: // ? Salir
                    System.out.println("Saliendo...");
                    break;
            
                default: // ? Caulquier otra opción
                    ConsoleManager.clear(); // ? Limpiamos la consola
                    System.out.printf("Opción \"%s\" inválida\n\n", opcion);
                    continue; // ? Volvemos al inicio del bucle
            }

            // ! Si la opción es diferente a SALIR, esperamos a que el usuario pulse enter para continuar
            if (opcion != SALIR) {
                System.out.print("Pulsa enter para continuar...");
                read.nextLine(); // ? Limpiamos el buffer
                ConsoleManager.clear(); // ? Limpiamos la consola
            }
        } while (opcion != SALIR); // ? Mientras la opción sea diferente a 5 ejecutaremos el bucle

        // ^ Cerramos el Scanner
        read.close();
    }
}
