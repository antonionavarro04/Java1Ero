package ejercicioscrud.ejercicio1;

// ? Importamos la Clase Scanner y Locale
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos una instancia de la Clase Scanner
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos una variable de control opción, de tipo char
        char opcion;

        // ^ Definimos una variable de control newpos, de tipo int, controlará por que parte del array habrá que crear un nuevo alumno
        int newPos = 0;

        // ^ Definimos una variable nombre, de tipo String
        String nombre;

        // ! Inicializamos el array de alumnos a null
        for (int pos = 0; pos < Methods.alumnos.length; ++pos) {
            Methods.alumnos[pos] = new Alumno();
        }

        do {
            // ! Imprimimos el menú y pedimos la opción al usuario
            System.out.println("ALUMNOS/AS");
            System.out.println("===============");
            System.out.println("\n1. Listado.");
            System.out.println("2. Nuevo Alumno.");
            System.out.println("3. Modificar.");
            System.out.println("4. Borrar.");
            System.out.println("5. Salir.");
            System.out.print(">>> ");
            opcion = read.nextLine().charAt(0);

            System.out.println(); // ? salto de Línea

            // ! Mediante un Switch procesamos la opción
            switch (opcion) {
                case '1': // ? Listado
                    System.out.println(Methods.printArray());
                    break;

                case '2': // ? Nuevo Alumno
                    System.out.print("Introduce el nombre del Alumno: ");
                    Methods.alumnos[newPos].setNombre(read.nextLine());

                    System.out.print("Introduce la nota media del Alumno: ");
                    Methods.alumnos[newPos].setNotaMedia(read.nextDouble());
                    read.nextLine(); // ? Limpiamos el buffer
                    break;

                case '3': // ? Modificar
                    System.out.print("Introduce el nombre del Alumno a modificar: ");
                    nombre = read.nextLine();

                    System.out.print("Introduce la nueva nota media del Alumno: ");
                    newPos = read.nextInt();
                    read.nextLine(); // ? Limpiamos el buffer

                    if (Methods.modificarAlumno(nombre, newPos)) {
                        System.out.println("Alumno modificado correctamente.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case '4': // ? Borrar
                    System.out.print("Introduce el nombre del Alumno a borrar: ");
                    nombre = read.nextLine();

                    if (Methods.borrarAlumno(nombre)) {
                        System.out.println("Alumno borrado correctamente.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case '5': // ? Salir
                    System.out.println("Saliendo...");
                    break;
            
                default: 
                    System.out.printf("Opción \"%s\" inválida\n\n", opcion);
                    continue;
            }

            // ! Si la opción es diferente a 5, esperamos a que el usuario pulse enter para continuar
            if (opcion != '5') {
                System.out.print("Pulsa enter para continuar...");
                read.nextLine(); // ? Limpiamos el buffer
            }

            // ! Reseteamos la variable newpos
            for (int pos = 0; pos < Methods.alumnos.length; ++pos) {
                if (Methods.alumnos[pos].getNombre().isBlank()) {
                    newPos = pos;
                    break;
                }
            }

            System.out.println(); // ? Salto de Línea
        } while (opcion != '5'); // ? Mientras la opción sea diferente a 5 ejecutaremos el bucle

        // ^ Cerramos el Scanner
        read.close();
    }
}
