package ejerciciossobrecarga;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    // ? Método parseToBoolean int
    static boolean parseToBoolean (int num) {
        // ! Comprobaremos si es 1 o 0 y devolveremos el valor booleano
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }

    // ? Método parseToBoolean String
    static boolean parseToBoolean (String str) {
        // ! Comprobaremos si es "true" o "false" y devolveremos el valor booleano
        if (str.equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    // ? Método main
    public static void main(String[] args) {
        // ^ Definimos la variable num y str
        int num;
        String str;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos los números al Usuario
        System.out.print("Introduce un número: ");
        num = read.nextInt(); // * Para num
        System.out.print("Introduce un texto: ");
        str = read.next(); // * Para str

        // ? Salto de Línea Triple
        System.out.println("\n-----------------------------\n");

        // ! Mostramos el resultado
        System.out.println("El número " + num + " convertido a booleano es: " + parseToBoolean(num));
        System.out.println("El texto " + str + " convertido a booleano es: " + parseToBoolean(str));

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
