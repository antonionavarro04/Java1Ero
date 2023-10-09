package ejerciciosfunciones;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio6 {
    public static void main(String[] args) {
        // ? Programa que pida un número integer y llame a la función esPrimo para comprobar si es primo o no
        // ^ Definimos la variable n
        int n;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Presentamos el programa al Usuario
        System.out.println("Programa que te dice si un número es primo o no.");

        // ! Pedimos el número al usuario
        System.out.print("Introduce un número: ");
        n = read.nextInt(); // * Leemos el número

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ! Imprimimos el mensaje y dentro llamamos a la función esPrimo
        System.out.println("Es " + n + " un número primo? > " + Methods.esPrimo(n));

        // € Hecho por Antonio Navarro
    }
}
