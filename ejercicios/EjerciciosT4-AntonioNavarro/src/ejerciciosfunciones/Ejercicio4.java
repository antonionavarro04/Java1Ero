package ejerciciosfunciones;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ? Diseñar una función que devuelva el valor máximo de dos números enteros, el valor se retornara al metodo main y se mostrara por pantalla.
        // ^ Definimos las variables num1 y num2
        int num1, num2;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Presentamos al usuario el funcionamiento del programa
        System.out.println("Este programa imprime el número mayor entre dos números introducidos por teclado.");

        // ! Pedimos a el usuario tanto el número 1 como el número 2
        System.out.print("Introduce el valor del número 1: ");
        num1 = read.nextInt(); // * Leemos el primer número
        System.out.print("Introduce el valor del número 2: ");
        num2 = read.nextInt(); // * Leemos el segundo número

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n-----------------------------------------\n");

        // ! Imprimimos el número mayor llamando a la función max
        System.out.println("El número mayor es: " + Methods.max(num1, num2));

        // € Hecho por Antonio Navarro
    }
}
