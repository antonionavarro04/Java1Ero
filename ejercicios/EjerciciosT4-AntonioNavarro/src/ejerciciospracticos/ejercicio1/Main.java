// € Hecho por Antonio Navarro

package ejerciciospracticos.ejercicio1;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos la variable para guardar el numero
        int num;

        // ^ Definimos la variable method para guardar la clase que contiene los metodos
        Numeros method = new Numeros();

        // ^ Definimos la variable read como final Scanner y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un numero: ");
        num = read.nextInt(); // * Leemos el numero

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Linea Triple
        System.out.println("\n--------------------------\n");

        // ! Mostramos el resultado de los metodos
        System.out.println("El numero " + num + " " + (method.esPrimo(num) ? "es Primo" : "no es Primo"));
        System.out.println("El numero " + num + " " + (method.esCapicua(num) ? "es Capicua" : "no es Capicua"));
    }
}
