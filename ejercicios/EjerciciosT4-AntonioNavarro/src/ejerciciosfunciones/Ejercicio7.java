package ejerciciosfunciones;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ? Programa que pida un numero integer y llame a la función divisoresPrimos para mostrar cuantos son sus divisores primos
        // ^ Definimos la variable num
        int num;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Presentamos el programa al Usuario
        System.out.println("Programa que te dice los divisores primos de un número.");

        // ! Pedimos el número al usuario
        System.out.print("Introduce un número: ");
        num = read.nextInt(); // * Leemos el número

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ! Imprimimos el mensaje y dentro llamamos a la función divisoresPrimos]#
        System.out.println("El número " + num + " tiene " + Methods.divisoresPrimos(num) + " divisores primos.");
    }
}
