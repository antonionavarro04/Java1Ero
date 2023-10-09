package ejercicioscrud.ejercicio2;

// ? Importamos la Clase Scanner y Locale
import java.util.Locale;
import java.util.Scanner;
import funciones.ConsoleManager;

public class Main {
    // ^ Definimos una constante para la opción de SALIR
    private static final char SALIR = '7';
    
    public static void main(String[] args) {
        // ^ Definimos una instancia de la Clase Scanner
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos una variable de control opción, de tipo char
        char opcion;

        // ^ Definimos una variable de control pos, de tipo int, controlará que parte del array se va a tocar
        int pos;

        // ^ Definimos variables (copia de la clase)
        String codigo, descripcion;
        double precioCompra, precioVenta;
        int stock;

        // ? A el array tener 0 de longitud al principio, no hace falta inicializarlo

        do {
            // ! Imprimimos el menú y pedimos la opción al usuario
            System.out.println("GESTISIMAL");
            System.out.println("===============");
            System.out.println("\n1. Listado.");
            System.out.println("2. Alta.");
            System.out.println("3. Baja.");
            System.out.println("4. Modificación.");
            System.out.println("5. Entrada de mercancía.");
            System.out.println("6. Salida de mercancía.");
            System.out.println("7. Salir.");
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
                case '1': // ? Listado
                    System.out.println(Methods.printArray());
                    break;

                case '2': // ? Nuevo Artículo
                    /* BLOQUE CREACION */

                    System.out.print("Introduce el codigo del Artículo: ");
                    codigo = read.nextLine();

                    pos = Methods.secuentialSearch(Methods.articulos, codigo);

                    if (pos != -1) { // ? Si el elemento ya existe en el array
                        System.out.printf("Ya existe un artículo de código \"%s\", en la posición \"%s\"\n", codigo, pos + 1);
                    } else { // ? Si no
                        System.out.print("Introduce la descripción del Artículo: ");
                        descripcion = read.nextLine();

                        System.out.print("Introduce el precio de compra del Artículo: ");
                        precioCompra = read.nextDouble(); read.nextLine(); // ? Limpiamos el buffer

                        System.out.print("Introduce el precio de venta del Artículo: ");
                        precioVenta = read.nextDouble(); read.nextLine(); // ? limpiamos el Búffer

                        System.out.print("Introduce el stock del Artículo: ");
                        stock = read.nextInt(); read.nextLine(); // ? limpiamos el Búffer

                        /* BLOQUE AMPLIACION E INSERCION */

                        Methods.insertData(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));
                    }

                    break;

                case '3': // ? Borrar Articulo
                    System.out.print("Introduce el codigo del Articulo a borrar: ");
                    codigo = read.nextLine(); // ! Pedimos el código del artículo
                    
                    if (Methods.borrarArticulo(codigo)) { // ? Si la operación se ha completado querrá decir que se ha borrado el artículo
                        System.out.println("Operación realizada correctamente");
                    } else { // ? Si no, no se ha borrado el artículo
                        System.out.printf("No existe ningún artículo con el código \"%s\"\n", codigo);
                    }

                    break;

                case '4': // ? Modificar
                    System.out.print("Introduce el codigo del Articulo a modificar: ");
                    codigo = read.nextLine(); // ! Pedimos el código del artículo

                    pos = Methods.secuentialSearch(Methods.articulos, codigo); // ? Buscamos el código en el array
                    
                    if (pos == -1) { // ? Si no existe
                        System.out.printf("No existe ningún artículo con el código \"%s\"\n", codigo);
                    } else { // ? Si existe
                        // ! Pedimos los nuevos datos para el artículo
                        System.out.print("Introduce el nuevo código del Artículo: ");
                        codigo = read.nextLine();

                        System.out.print("Introduce la nueva descripción del Artículo: ");
                        descripcion = read.nextLine();

                        System.out.print("Introduce el nuevo precio de compra del Artículo: ");
                        precioCompra = read.nextDouble(); read.nextLine(); // ? Limpiamos el buffer

                        System.out.print("Introduce el nuevo precio de venta del Artículo: ");  
                        precioVenta = read.nextDouble(); read.nextLine(); // ? limpiamos el Búffer

                        System.out.print("Introduce el nuevo stock del Artículo: ");
                        stock = read.nextInt(); read.nextLine(); // ? limpiamos el Búffer

                        // ! Una vez los tenemos todos creamos un nuevo artículo con los datos nuevos y lo insertamos en el array
                        Methods.articulos[pos] = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
                        System.out.println("\nOperación realizada correctamente");
                    }
                    
                    break;

                case '5': // ? Entrada de mercancía
                    System.out.print("Introduce el codigo del Articulo a modificar: ");
                    codigo = read.nextLine(); // ! Pedimos el código del artículo

                    pos = Methods.secuentialSearch(Methods.articulos, codigo); // ? Buscamos el código en el array

                    if (pos == -1) { // ? Si no existe
                        System.out.printf("No existe ningún artículo con el código \"%s\"\n", codigo);
                    } else { // ? Si existe
                        // ! Pedimos cuanta mercancía ha llegado
                        System.out.print("Introduce la cantidad de mercancía a añadir: ");
                        stock = read.nextInt(); read.nextLine(); // ? limpiamos el Búffer

                        // ! Sumamos la mercancía al stock
                        Methods.articulos[pos].setStock(Methods.articulos[pos].getStock() + stock);
                        System.out.println("\nOperación realizada correctamente");
                    }
                    break;

                case '6': // ? Salida de mercancía
                    System.out.print("Introduce el codigo del Articulo a modificar: ");
                    codigo = read.nextLine(); // ! Pedimos el código del artículo

                    pos = Methods.secuentialSearch(Methods.articulos, codigo); // ? Buscamos el código en el array
                    
                    if (pos == -1) { // ? Si no existe
                        System.out.printf("No existe ningún artículo con el código \"%s\"\n", codigo);
                    } else { // ? Si existe
                        // ! Pedimos cuanta mercancía ha salido
                        System.out.print("Introduce la cantidad de mercancía que va a salir: ");
                        stock = read.nextInt(); read.nextLine(); // ? limpiamos el Búffer

                        // ! Restamos la mercancía al stock
                        Methods.articulos[pos].setStock(Methods.articulos[pos].getStock() - stock);
                        System.out.println("\nOperación realizada correctamente");
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

            // ! Si la opción es diferente a 7, esperamos a que el usuario pulse enter para continuar
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
