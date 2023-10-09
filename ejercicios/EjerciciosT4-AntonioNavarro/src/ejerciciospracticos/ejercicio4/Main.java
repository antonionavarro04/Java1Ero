// € Hecho por Antonio Navarro

package ejerciciospracticos.ejercicio4;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos la variable read como final Scanner y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ^ Definimos la variable methods con la clase Operaciones
        Operaciones methods = new Operaciones();

        // ! Pedimos los numeros al usuario
        System.out.print("Introduce el primer número: ");
        methods.num1 = read.nextDouble(); // * Para num1
        System.out.print("Introduce el segundo número: ");
        methods.num2 = read.nextDouble(); // * Para num2

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de línea Triple
        System.out.println("\n--------------------\n");

        // ! Mostramos los resultados
        System.out.println("La suma de los números es: " + methods.suma());
        System.out.println("La resta de los números es: " + methods.resta());
        System.out.println("La multiplicación de los números es: " + methods.multiplicacion());
        System.out.println("La división de los números es: " + methods.division());
    }
}
