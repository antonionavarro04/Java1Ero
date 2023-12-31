// TESTS
// = Habrá que comprobar que el programa funciona correctamente, mirando que el contador se incrementa correctamente y que el resultado es el correcto
// = Habrá que comprobar que si no se introduce ningún número el programa no divide por cero

package ejercicioswhile;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ? Programa el cual pida numeros enteros al usuario y los vaya sumando, cuando introduzca un numero negativo el programa dejará de pedir numeros y mostrará la media de los numeros introducidos
        // ^ Declaramos la variables num, resultado y contador
        long num = 0, resultado = 0, contador = -1;

        // ^ Creamos el Scanner en la variable read y lo cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un número a sumar([-1] para salir): ");

        // ! Bucle While, mientras el numero sea positivo
        while (num >= 0){
            // ! Sumamos el numero
            resultado += num;
            // ! Incrementamos el contador
            contador++;

            // ! Pedimos el numero
            System.out.print("-> ");
            num = read.nextLong();
        }

        // ! Si no se ha introducido ningún numero actualizaremos el contador a 1 de forma que así no se realice la división entre 0
        if (contador == 0) contador = 1;

        // ? Triple salto de Linea
        System.out.println();System.out.println("---------------------------------------");System.out.println();

        // ! Imprimimos la media con los numeros del usuario
        System.out.println("La media de los numeros introducidos es de: " + (resultado / contador));

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
