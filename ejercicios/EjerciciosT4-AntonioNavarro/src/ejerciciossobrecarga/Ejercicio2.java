package ejerciciossobrecarga;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio2 {
    // ? Método media con 2 argumentos
    static double media (int num1, int num2) {
        // ! Calculamos y devolvemos la media de los dos primeros numeros
        return (num1 + num2) / 2.0d;
    }

    // ? Método media con 3 argumentos
    static double media (int num1, int num2, int num3) {
        // ! Calculamos y devolvemos la media de los 3 números
        return (num1 + num2 + num3) / 3.0d;
    }

    // ? Método main
    public static void main(String[] args) {
        // ^ Definimos las variables num1, num2 y num3
        int num1;
        int num2;
        int num3;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos los números al Usuario
        System.out.print("Introduce el primer número: ");
        num1 = read.nextInt(); // * Para num1
        System.out.print("Introduce el segundo número: ");
        num2 = read.nextInt(); // * Para num2
        System.out.print("Introduce el tercer número: ");
        num3 = read.nextInt(); // * Para num3

        // ? Salto de línea triple
        System.out.println("\n-----------------------------\n");

        // ! Mostramos el resultado
        System.out.println("La media de los 2 primeros números es: " + media(num1, num2));
        System.out.println("La media de los 3 números es: " + media(num1, num2, num3));

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
