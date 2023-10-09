package ejerciciosfunciones;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? Diseña la función eco la cual imprime el mensaje "Eco..." tantas veces como se le indique.
        // ^ Definimos la variable veces
        long veces;

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new  Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos a el usuario el número de veces a ejecutar el código
        System.out.print("¿Cuántas veces quieres que se repita el código? ");
        veces = read.nextLong();

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n-------------\n");

        // ! Llamamos a la función eco
        Methods.eco(veces);

        // € Hecho por Antonio Navarro
    }
}
