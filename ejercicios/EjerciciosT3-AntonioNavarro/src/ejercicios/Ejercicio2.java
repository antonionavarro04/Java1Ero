// TESTS
// = Habrá que comprobar que no se pueden introducir números negativos
// = Habrá que comprobar que cuenta bien los números primos que hay entre 1 y n, ej: entre 1 y 100 hay 25 números primos
// = Si n = 1, deberá decir que no hay números primos
// = Si n = 10 deberá decir que hay 4 números primos
// = Si n = 100 deberá decir que hay 25 números primos

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio2 {
    public static void main(String[] args) {
        // ? Programa Java que pida un número n y diga cuantos numeros primos hay entre 1 y n
        // ^ Creamos las variables para el número y el contador, asi como otro número que empezara siendo 2
        long contadorNoPrimos = 0, numero2; // ? El número 2 sirve para ir incrementando el número que empieza en 2 y llegar hasta el número n
        long numero; // ? El número que introducira el usuario por teclado
        long contadorPrimos = 0; // ^ Crearemos otra variable que sera el contador de primos

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        do{ // * Pediremos el número en un Bucle Do While, para que se introduzca un valor apropiado
            System.out.print("Introduce un número: ");
            numero = read.nextLong(); // ! Pedimos el número al usuario
        } while (numero < 2); // * Si el número es menor que 2, se volverá a pedir

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Mediante un bucle for, comprobamos si el número es primo
        for (numero2 = 2; numero2 < numero ; numero2++) { // * El número 2 es el que se ira incrementando hasta llegar al número n
            for (long i = 2; i < numero2; i++){ // * El bucle for empieza en 2 porque 1 es divisor de todos los números
                if (numero2 % i == 0){ // * Si el numero es divisible entre i, no es primo
                    contadorNoPrimos++; // * Si el número no es primo, se suma 1 al contador
                    break; // * Si el número no es primo, se sale del bucle
                }
            }
        }

        // ! Calculamos cuantos números primos hay en base a los que no son primos
        contadorPrimos = (numero - contadorNoPrimos) - 2; // * Se le resta 2 porque '1' y 'n' no hay que incluirlos

        // ! Mostramos el resultado al usuario
        System.out.println("Entre 1 y " + numero + " hay " + contadorPrimos + " números primos");

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
