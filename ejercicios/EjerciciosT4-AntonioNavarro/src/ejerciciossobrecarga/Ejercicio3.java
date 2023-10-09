package ejerciciossobrecarga;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    // ? Método sumaEnteros desde 1 a n
    static int sumaEnteros (int num1) {
        // ^ Definimos la variable suma
        int suma = 0;

        // ! Mediante un bucle for sumamos los enteros desde 1 hasta n
        for (int i = 1; i <= num1; i++) {
            suma += i;
        } return suma;
    }
    
    // ? Método sumaPares desde n1 a n2
    static int sumaEnteros (int num1, int num2) {
        // ^ Definimos la variable suma
        int suma = 0;

        // ! Mediante un bucle for sumamos los enteros desde n1 hasta n2
        for (; num1 <= num2; num1++) {
            suma += num1;
        } return suma;
    }

    // ? Método main
    public static void main(String[] args) {
        // ^ Definimos las variables num1 y num2
        int num1;
        int num2;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos los números al Usuario
        System.out.print("Introduce el primer número: ");
        num1 = read.nextInt(); // * Para num1
        System.out.print("Introduce el segundo número: ");
        num2 = read.nextInt(); // * Para num2

        // ? Salto de línea triple
        System.out.println("\n-----------------------------\n");

        // ! Mostramos el resultado
        System.out.println("La suma de los números desde 1 hasta " + num1 + " es: " + sumaEnteros(num1));
        System.out.println("La suma de los números desde " + num1 + " hasta " + num2 + " es: " + sumaEnteros(num1, num2));

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
