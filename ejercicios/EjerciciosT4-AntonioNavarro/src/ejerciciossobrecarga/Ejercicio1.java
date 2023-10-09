package ejerciciossobrecarga;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    // ? Método suma int
    static int suma (int num1, int num2) {
        return num1 + num2;
    }

    // ? Método suma double
    static double suma (double num1, double num2) {
        return num1 + num2;
    }

    // ? Método main
    public static void main(String[] args) {
        // ^ Definimos la variable intNum1 y intNum2
        int intNum1;
        int intNum2;

        // ^ Definimos la variable doubleNum1 y doubleNum2
        double doubleNum1;
        double doubleNum2;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos los números al Usuario
        System.out.print("Introduce el primer número entero: ");
        intNum1 = read.nextInt(); // * Para intNum1
        System.out.print("Introduce el segundo número entero: ");
        intNum2 = read.nextInt(); // * Para intNum2
        System.out.print("Introduce el primer número decimal: ");
        doubleNum1 = read.nextDouble(); // * Para doubleNum1
        System.out.print("Introduce el segundo número decimal: ");
        doubleNum2 = read.nextDouble(); // * Para doubleNum2
        
        // ^ Cerramos el Scanner tras su uso
        read.close();

        System.out.println("\n-----------------------------\n");

        // ! Mostramos el resultado
        System.out.println("La suma de los números enteros es: " + suma(intNum1, intNum2));
        System.out.println("La suma de los números decimales es: " + suma(doubleNum1, doubleNum2));

        // € Hecho por Antonio Navarro
    }
}
