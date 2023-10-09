package ejerciciosfor;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Pedir 10 numeros por teclado y mostar la media
        // ^ Declaramos las variables n (numero introducido), i (incremento) y resultado para guardar la suma de los numeros
        byte i;
        long n;
        double resultado = 0;

        // ^ Creamos el Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca 10 numeros
        System.out.println("Introduce 10 números: ");

        // ! Creamos el bucle for que pide 10 números
        for (i = 1; i <= 10; i++) {
            // ! Pedimos al usuario que introduzca el valor de n
            System.out.print("[" + i + "] -> ");
            n = read.nextLong();

            // ! Sumamos el numero introducido a la variable resultado
            resultado += n;
        }

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Mostramos la media de los números introducidos
        System.out.println("La media de los números introducidos es: " + resultado / 10.0D);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
