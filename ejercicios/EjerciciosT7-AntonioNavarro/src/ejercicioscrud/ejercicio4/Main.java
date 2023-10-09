package ejercicioscrud.ejercicio4;

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
        int pos, dniErroneos;

        // ^ Definimos variables (copia de la clase)
        String dni, nombre;
        float saldo;

        // ? A el array tener 0 de longitud al principio, no hace falta inicializarlo

        do {
            // ! Buscamos si existe algún problema con los DNI
            dniErroneos = Methods.comprobarDni();

            // ! Imprimimos el menú y pedimos la opción al usuario
            System.out.println(" BANCO BENALMÁDENA");
            System.out.println("===================");
            if (dniErroneos > 0) {
                System.out.printf("Hay %s %s con DNI erroneos, resuelvelo lo antes posible!!!.\n", dniErroneos, dniErroneos == 1 ? "cuenta" : "cuentas");
            }
            System.out.println("\n1. Listado de cuentas.");
            System.out.println("2. Crear Cuenta Corriente.");
            System.out.println("3. Borrar Cuenta Corriente.");
            System.out.println("4. Modificar Cuenta Corriente.");
            System.out.println("5. Ingresar dinero en Cuenta Corriente");
            System.out.println("6. Retirar dinero en Cuenta Corriente");
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

                    System.out.print("Introduce el dni de la Cuenta: ");
                    dni = read.nextLine();

                    pos = Methods.secuentialSearch(dni);

                    if (pos != -1) { // ? Crear Cuenta Corriente
                        System.out.printf("Ya existe una cuenta asociada a ese DNI \"%s\", en la posición \"%s\"\n", dni, pos + 1);
                    } else { // ? Si no
                        System.out.print("Introduce el saldo de la Cuenta: ");
                        saldo = read.nextFloat(); read.nextLine(); // ? Limpiamos el Búffer
                        
                        System.out.print("Introduce el nombre (Enter para Dejar en Blanco): ");
                        nombre = read.nextLine();

                        /* BLOQUE AMPLIACION E INSERCION */

                        if (nombre.isEmpty()) {
                            Methods.insertData(new CuentaCorriente(dni, saldo));
                        } else {
                            Methods.insertData(new CuentaCorriente(dni, nombre, saldo));
                        }
                    }

                    break;

                case '3': // ? Borrar Cuenta Corriente
                    System.out.print("Introduce el dni de la cuenta a borrar: ");
                    dni = read.nextLine();
                    
                    if (Methods.borrarCuenta(dni)) { // ? Si la operación se ha completado querrá decir que se ha borrado la cuenta
                        System.out.println("Operación realizada correctamente");
                    } else { // ? Si no, no se ha borrado la cuenta, por ende no existe
                        System.out.printf("No existe ninguna cuenta con el DNI: \"%s\"\n", dni);
                    }

                    break;

                case '4': // ? Modificar Cuenta Corriente
                    System.out.print("Introduce el dni de la cuenta a modificar: ");
                    dni = read.nextLine();

                    pos = Methods.secuentialSearch(dni);

                    if (pos != -1) { // ? Si la cuenta existe
                        System.out.print("Introduce el nuevo dni de la cuenta: ");
                        dni = read.nextLine();

                        System.out.printf("Introduce el nuevo saldo de la cuenta \"%s\": ", dni);
                        saldo = read.nextFloat(); read.nextLine(); // ? Limpiamos el Búffer

                        System.out.print("Introduce el nuevo nombre (Enter para Dejar en Blanco): ");
                        nombre = read.nextLine();

                        Methods.modificarCuenta(pos, new CuentaCorriente(dni, nombre, saldo));
                    } else { // ? Si no, no existe
                        System.out.printf("No existe ninguna cuenta con el DNI: \"%s\"\n", dni);
                    }

                    break;

                case '5': // ? Ingresar dinero en Cuenta Corriente
                    System.out.print("Introduce el dni de la cuenta a la que quieres ingresar dinero: ");
                    dni = read.nextLine();

                    pos = Methods.secuentialSearch(dni);

                    if (pos != -1) { // ? Si la cuenta existe
                        System.out.printf("Introduce la cantidad a ingresar en la cuenta \"%s\": ", dni);
                        saldo = read.nextFloat(); read.nextLine(); // ? Limpiamos el Búffer

                        Methods.ingresarDinero(pos, saldo);
                    } else { // ? Si no, no existe
                        System.out.printf("No existe ninguna cuenta con el DNI: \"%s\"\n", dni);
                    }

                    break;

                case '6': // ? Retirar dinero en Cuenta Corriente
                    System.out.print("Introduce el dni de la cuenta de la que quieres retirar dinero: ");
                    dni = read.nextLine();

                    pos = Methods.secuentialSearch(dni);

                    if (pos != -1) { // ? Si la cuenta existe
                        System.out.printf("Introduce la cantidad a retirar en la cuenta \"%s\": ", dni);
                        saldo = read.nextFloat(); read.nextLine(); // ? Limpiamos el Búffer

                        Methods.ingresarDinero(pos, saldo * -1);
                    } else { // ? Si no, no existe
                        System.out.printf("No existe ninguna cuenta con el DNI: \"%s\"\n", dni);
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
                read.nextLine(); // ! Esperamos a que el usuario presione enter
                ConsoleManager.clear(); // ? Limpiamos la consola
            }
        } while (opcion != SALIR); // ? Mientras la opción sea diferente a 5 ejecutaremos el bucle

        // ^ Cerramos el Scanner
        read.close();
    }
}
