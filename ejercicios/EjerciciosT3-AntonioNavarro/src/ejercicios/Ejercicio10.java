// TESTS
// = Habrá que comprobar que no se puede introducir numeros negativos
// = Si se introduce un numero de 1 digito siempre será capicúa
// = Si se introduce un numero de 2 digitos las decenas y unidades deben ser iguales para que sea capicua
// = A partir de los dos digiros deben seguir esta estructura: xyzyx o xyzzyx, ej: 12321, 123321

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio10 {
    public static void main(String[] args) {
        // ? Programa Java que nos diga si un número introducido por teclado es capicúa o no
        // ^ Creamos la variable para n y el contador
        long n = 0;

        // ^ Creamos una variable para el numero invertido
        long numeroInvertido = 0;

        // ^ Creamos una variable para el numero original
        long numeroOriginal;

        // ^ Creamos una variable para el resto
        long resto = 0;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        do {
            System.out.print("Introduce un numero: ");
            n = read.nextLong(); // ! Pedimos el numero
        } while (n < 0); // * Comprobamos que no sea negativo

        // ! Guardamos el numero original
        numeroOriginal = n;

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Comprobamos si el numero es capicua
        if (n == 0) { // * Si el numero es 0, es capicua
            System.out.println("El numero " + n + " es capicua");
        } else if (n < 0) { // * Si el numero es negativo, no es capicua
            System.out.println("El numero " + n + " no es capicua");
        } else { // * Si el numero es positivo, comprobamos si es capicua

            // ! Invertimos el numero
            while (n > 0) { // * Mientras el numero sea mayor que 0
                resto = n % 10; // * El resto sera el numero % 10
                numeroInvertido = numeroInvertido * 10 + resto; // * El numero invertido sera el numero invertido * 10 + el resto
                n = n / 10; // * El numero sera el numero / 10
            }

            // ! Comprobamos si el numero es capicua
            if (numeroOriginal == numeroInvertido) { // * Si el numero original es igual al numero invertido, es capicua
                System.out.println("El numero " + numeroOriginal + " es capicua");
            } else { // * Si el numero original no es igual al numero invertido, no es capicua
                System.out.println("El numero " + numeroOriginal + " no es capicua");
            }
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarros
    }
}
