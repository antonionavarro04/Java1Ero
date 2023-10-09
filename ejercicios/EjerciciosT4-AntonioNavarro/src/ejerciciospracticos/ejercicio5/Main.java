// € Hecho por Antonio Navarro

package ejerciciospracticos.ejercicio5;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos la variable num
        int num;

        // ^ Definimos la variable numA
        double numA;

        // ^ Definimos la variable read como final Scanner y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca un numero
        System.out.print("Introduce un numero entero: ");
        num = read.nextInt(); // * Leemos el numero
        System.out.print("Introduce un numero decimal: ");
        numA = read.nextDouble(); // * Leemos el numero

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n------------------------\n");

        // ! Mostramos los resultados
        System.out.println("El sumatorio de los numeros entre 1 y " + num + " es: " + FuncionesRecursivas.sumatorio(num));
        System.out.println(numA + " elevado a " + num + " es: " + FuncionesRecursivas.potencia(numA, num));
        System.out.println("La posición " + num + " de la serie de Fibonacci es: " + FuncionesRecursivas.serieFibonacci(num));
    }
}
