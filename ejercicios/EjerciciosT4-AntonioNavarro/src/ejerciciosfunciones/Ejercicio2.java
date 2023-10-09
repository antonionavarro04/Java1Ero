package ejerciciosfunciones;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio2 {
    public static void main(String[] args) {
        // ^ Definimos las variables num1 y num2
        long num1, num2;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Presentamos al usuario el funcionamiento del programa
        System.out.println("Este programa imprime todos los números entre dos números introducidos por teclado.");

        // ! Pedimos a el usuario tanto el número 1 como el número 2
        System.out.print("Introduce el valor del número 1: ");
        num1 = read.nextLong(); // * Leemos el primer número
        System.out.print("Introduce el valor del número 2: ");
        num2 = read.nextLong(); // * Leemos el segundo número

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n-----------------------------------------\n");

        // ! Llamamos a la función between
        Methods.between(num1, num2);

        // € Hocho por Antonio Navarro
    }
}
