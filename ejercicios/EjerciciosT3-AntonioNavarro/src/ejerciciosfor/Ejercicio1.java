package ejerciciosfor;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? Programa Java que pida un numero n y muestre todos los numeros desde 1 hasta n con el bucle for
        // ^ Declaramos la variable n (numero máximo) e i (incremento)
        long n, i;

        // ^ Creamos el Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca el valor de n
        System.out.print("Introduce un número hasta donde contar: ");
        n = read.nextLong();

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Mostramos los números desde 1 hasta n
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
