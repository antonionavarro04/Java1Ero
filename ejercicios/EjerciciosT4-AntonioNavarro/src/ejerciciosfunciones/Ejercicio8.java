package ejerciciosfunciones;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio8 {
    public static void main(String[] args) {
        // ^ Definimos las variables para los numeros y la opcion de la calculadora
        double num1;
        double num2;
        byte opcion;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos a el usuario los números a operar
        System.out.print("Introduce el primer número: ");
        num1 = read.nextDouble(); // * Para num1
        System.out.print("Introduce el segundo número: ");
        num2 = read.nextDouble(); // * Para num2

        // ? Salto de Línea Doble
        System.out.println("\n--------------------------------");

        do{ // ! Pedimos a el usuario la operación a realizar imprimiendo un menú
            System.out.println(); // ? Salto de Línea
            System.out.println("¿Qué operación quieres realizar?");
            System.out.println("0. Salir");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("> ");

            opcion = read.nextByte(); // * Leemos la opción

            System.out.println(); // ? Salto de Línea

            // ! Llammamos a la función calculadora
            System.out.println("Has elegido la opción " + opcion + " el resultado es: " + Methods.calc(num1, num2, opcion));
        } while (opcion != 0); // ^ Repetimos el bucle hasta que el usuario introduzca 0

        // ^ Cerramos el Scanner tras su uso
        read.close();
    }
}
