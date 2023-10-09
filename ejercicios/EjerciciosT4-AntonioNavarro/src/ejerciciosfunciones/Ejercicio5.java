package ejerciciosfunciones;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Crear una función que devuelva un booleano el cual dirá si un caracter que le hemos pasado es vocal o consonante
        // ^ Definimos la variable char
        char caracter;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Presentamos el programa al Usuario
        System.out.println("Programa que te dice si un caracter es vocal o no.");

        // ! Pedimos el caracter al usuario
        System.out.print("Introduce un caracter: ");
        caracter = read.nextLine().charAt(0); // * Leemos el primer caracter, esto nos ahorra problemas

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ! Imprimimos el mensaje y dentro llamamos a la función vocal
        System.out.println("Es " + caracter + " una vocal? > " + Methods.vocal(caracter));

        // € Hecho por Antonio Navarro
    }
}
