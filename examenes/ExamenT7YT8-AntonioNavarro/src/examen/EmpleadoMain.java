package examen;

import java.util.Locale;
import java.util.Scanner;

/**
 * Clase que contiene el método main del programa, hace la parte "vista" del
 * modelo vista-controlador
 * 
 * @author Antonio Navarro
 * @version 1.0
 */
public class EmpleadoMain {
    private static final char EXIT = '0';

    public static void main(String[] args) {
        // ^ Definimos una variable opción de tipo char
        char opcion;

        // ^ Definimos una instancia de la clase Scanner
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos un empleado que se usará mas adelante
        Empleado e;

        // ^ Definimos unas variables de tipo String
        String s = "", s1 = "", s2 = "";

        do { // ? Damos la bienvenida al Usuario y mostramos el menu
            System.out.println("Bienvenido usuario. ¿Que desea hacer?: ");
            System.out.println("1. Anhadir Empleado.");
            System.out.println("2. Listar Empleados.");
            System.out.println("3. Modificar Empleado.");
            System.out.println("4. Eliminar Empleado.");
            System.out.printf("%s. Salir.\n", EXIT);
            System.out.print(">>> ");
            opcion = read.nextLine().charAt(0);

            switch (opcion) {
                case EXIT: // * Salir
                    System.out.println("Saliendo...");
                    break;

                case '1': // * Anhadir, como 1 2 y 3 son iguales los explico una vez
                    while (true) { // ? Comenzamos un bucle infinito
                        // ! Pedimos los datos tipo, nombre y apellidos
                        System.out.print("Introduce el tipo del Empleado: ");
                        s = read.nextLine();

                        System.out.print("Introduce el nombre del Empleado: ");
                        s1 = read.nextLine();

                        System.out.print("Introduce los Apellidos del Empleado: ");
                        s2 = read.nextLine();

                        switch (s.toLowerCase()) { // ? Según el tipo que nos haya introducido crearemos un empleado u
                                                   // otro
                            case "acomision":
                                e = new AComision(s1, s2);
                                break;

                            case "fijo":
                                e = new Fijo(s1, s2);
                                break;

                            case "porhoras":
                                e = new PorHoras(s1, s2);
                                break;

                            default: // ? Si no ha introducido bien el tipo lo volvemos a pedir
                                System.err.println("Tipo Invalido");
                                continue;
                        }
                        break; // ? Partimos el bucle
                    }
                    ListadoEmpleados.anhadirEmpleado(e); // ! Llamamos al método
                    break;

                case '2': // * Listar Empleados
                    ListadoEmpleados.listarEmpleados();
                    break;

                case '3': // * Modificar Empleados
                    while (true) {
                        System.out.print("Introduce el tipo del Empleado: ");
                        s = read.nextLine();

                        System.out.print("Introduce el nombre del Empleado: ");
                        s1 = read.nextLine();

                        System.out.print("Introduce los Apellidos del Empleado: ");
                        s2 = read.nextLine();

                        switch (s.toLowerCase()) {
                            case "acomision":
                                e = new AComision(s1, s2);
                                break;

                            case "fijo":
                                e = new Fijo(s1, s2);
                                break;

                            case "porhoras":
                                e = new PorHoras(s1, s2);
                                break;

                            default:
                                System.err.println("Tipo Invalido");
                                continue;
                        }
                        break;
                    }
                    ListadoEmpleados.modificarEmpleado(e);
                    break;

                case '4': // * Elminar empleado
                    while (true) {
                        System.out.print("Introduce el tipo del Empleado: ");
                        s = read.nextLine();

                        System.out.print("Introduce el nombre del Empleado: ");
                        s1 = read.nextLine();

                        System.out.print("Introduce los Apellidos del Empleado: ");
                        s2 = read.nextLine();

                        switch (s.toLowerCase()) {
                            case "acomision":
                                e = new AComision(s1, s2);
                                break;

                            case "fijo":
                                e = new Fijo(s1, s2);
                                break;

                            case "porhoras":
                                e = new PorHoras(s1, s2);
                                break;

                            default:
                                System.err.println("Tipo Invalido");
                                continue;
                        }
                        break;
                    }
                    ListadoEmpleados.eliminarEmpleado(e);
                    break;

                default:
                    System.err.printf("Opción '%s' Inválida", opcion);
                    continue;
            }
            if (opcion != EXIT) { // ? Si la opción es diferente a Salir esperamos a que el usuario presione enter
                                  // para continuar
                System.out.println("Pulsa enter para Continuar...");
                read.nextLine();
            }
        } while (opcion != EXIT); // ? cuando la opcion sea igual a salir saldremos del bucle do-while

        // ^ Cerramos el Scanner
        read.close();
    }
}
