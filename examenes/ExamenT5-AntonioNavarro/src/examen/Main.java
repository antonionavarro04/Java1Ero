package examen;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos la variable opcion que controlará la opcion seleccionada por el usuario para la máquina
        int opcion;

        // ^ Definimos las variables fila y columna que serviran para recoger la golosina que quiere el usuario
        int fila, columna;

        // ^ Definimos una variable cantidad para recoger la cantidad con la que el tecnico quiere rellenar la máquina
        int cantidad;

        // ! Rellenamos la tabla de cantidades a 5 con la funcion rellenarMariz()
        Maquina.rellenarMatriz(5);

        do {
            // ? Mostramos el Menú al Usuario y esperamos su respuesta
            System.out.println("1. Mostrar Golosinas y su Precio");
            System.out.println("2. Comprar Golosina");
            System.out.println("3. Rellenar Golosinas");
            System.out.println("4. Apagar Máquina");
            System.out.print(">>> ");
            opcion = read.nextInt();
            System.out.println();

            // ! Mediante un switch-case hacemos una acción u otra
            switch (opcion) {
                case 1: // * Mostramos la tabla con todas las Golosinas Disponibles
                Maquina.mostrarGolosinas();
                break;

                case 2: // * Pedimos al usuario cual es la golosina que quiere
                System.out.println("Introduce la Golosina que quieres pedir:");
                System.out.print("Fila >>> ");
                fila = read.nextInt();
                System.out.print("Columna >>> ");
                columna = read.nextInt();

                // ! Comprobamos si la posicion es valida, en caso de no serlo imprimiremos un mensaje de error
                if (Maquina.validarPos(fila, columna)) {
                    // ! Comprobaremos que hay existencias de ese producto, en caso contrario imprimiremos un mensaje de error
                    if (Maquina.hayValorPosicion(fila, columna)) {
                        Maquina.anyadirVenta(fila, columna); // * Anhadimos la compra
                        Maquina.reducirPosicion(fila, columna, 1); // * Reducimos la cantidad de la Golosina
                    } else {
                        System.out.printf("No quedan existencias de %s\n", Maquina.nombresGolosinas[fila][columna]);
                    }
                } else {
                    System.out.printf("La golosina [%s][%s] no existe\n", fila, columna);
                } break;

                case 3: // * Pedimos la contrasenha para rellenar
                System.out.println("Introduce la contraseña:");
                System.out.print(">>> ");

                // ! Si la contraseña es correcta proseguimos con el proceso de rellenado, en caso contrario mostraremos un mensaje que dice contraseña incorrecta
                read.nextLine(); // ? Hay que meter otro read.nextLine por si venimos de leer un número
                if (read.nextLine().equals("Maquina2023")) {
                    // ? Pedimos al técnico que quiere rellenar
                    System.out.println("Introduce la posicion de la Golosina que quieres rellenar y la cantidad a rellenar:");
                    System.out.print("Fila >>> ");
                    fila = read.nextInt();
                    System.out.print("Columna >>> ");
                    columna = read.nextInt();
                    System.out.print("Cantidad >>> ");
                    cantidad = read.nextInt();
                    
                    // ! Al igual que al pedir la golosina, solo rellenaremos en caso de que exista, si no existe mostraremos un mensaje de error
                    if (Maquina.validarPos(fila, columna)) {
                        Maquina.aumentarPosicion(fila, columna, cantidad); // * Rellenamos con la cantidad introducida por el técnico
                    } else {
                        System.out.printf("La golosina [%s][%s] no existe\n", fila, columna);
                    }
                } else {
                    System.out.println("Contraseña Inválida!");
                } break;

                case 4: // * Imprimimos la compra que ha realizado el usuario
                Maquina.imprimirVentasTotales();
                break;
            
                default: // * En caso de que la opción no este contemplada en la maquina imprimiremos un mensaje de error
                System.out.println("Opción Inválida");
                break;
            }

            // ? Salto de Línea Triple
            System.out.println("\n-------------------------------------------\n");
        } while (opcion != 4);

        // ? Mostramos un mensaje de que ha finalizado el programa
        System.out.println("Apagando...");

        // ^ Cerramos el Scanner
        read.close();
    }
} // € hecho por Antonio Navarro
