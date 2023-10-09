package ejerciciosenumerados.ejercicio2;

// ? Imports
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        // ^ Definimos una instancia de la Clase Scanner para leer datos por teclado
        final Scanner read = new Scanner(System.in, StandardCharsets.UTF_8);

        // ^! Pedimos el Género de dos libros y los construimos directamente
        System.out.print("Introduce el genero del primer libro: ");
        LibroEnum libro1 = new LibroEnum("El Quijote", "Cervantes", 10, 5, read.nextLine());
        
        System.out.print("Introduce el genero del segundo libro: ");
        LibroEnum libro2 = new LibroEnum("El Lazarillo de Tormes", "Anónimo", 5, 2, read.nextLine());

        // ? Imprimimos la información de los Libros
        System.out.println(libro1);
        System.out.println(libro2);

        // ^ Cerramos el Scanner
        read.close();
    }
}
