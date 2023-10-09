// TESTS
// = Si introducimos 10, 9, 11 y 0 deberá dar 3 numeros introducidos y 1 fallo
// = Si introducimos 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 y 0 deberá dar 10 numeros introducidos y 0 fallos
// = Si introducimos 20, 21, 8, 15, 10, 30 y 0 deberá dar 6 numeros introducidos y 2 fallos

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio8 {
    public static void main(String[] args) {
        // ? Programa Java el cual lea solo los numeros mayores a el anterior introducido, la introduciión de números finaliza con un 0
        // ^ Creamos la variable para n, nMayor, contador y el contador de fallos
        long n, nMayor, contador = 0, fallos = 0;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un numero inicial: ");
        n = read.nextLong();

        System.out.println(); // ? Salto de Línea

        nMayor = n; // * Hacemos que nMayor sea igual a n, el cual es el primer numero introducido por el usuario

        // ! Mediante un bucle while, pedimos los numeros al usuario
        while (n != 0){
            System.out.print("Introduce un numero: ");
            n = read.nextLong(); // ! Pedimos el numero al usuario

            if (n >= nMayor) nMayor = n; // * Si el numero es mayor que el anterior, lo guardamos en nMayor

            contador++; // ! Incrementamos el contador

            // ! Si el numero es menor que el anterior, incrementamos el contador de fallos
            if (n < nMayor && n != 0){ 
                System.out.println("El numero introducido es menor que el anterior"); // * Imprimimos un mensaje de error
                fallos++; // * Incrementamos el contador de fallos
                nMayor = n; // * Reiniciamos nMayor
            }

            // ? Salto de Línea Triple
            System.out.println("");
        }

        // ? Salto de Línea Doble
        System.out.println("---------------------------------------\n");

        // ! Imprimimos el contador y los fallos
        System.out.println("Has introducido " + contador + " numeros");
        System.out.println("El numero de fallos es: " + fallos);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
