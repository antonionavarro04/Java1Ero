package ejerciciosfor;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ? Programa java que muestre todos los multiplos de 3 desde 1 hasta un numero n
        // ^ Declaramos la variable n (numero máximo) e i (incremento)
        long n, i;

        // ^ Creamos el Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca el valor de n
        System.out.print("Introduce un número: ");
        n = read.nextLong();

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Mostramos los números desde 1 hasta n con el bucle for
        for (i = 3; i <= n; i += 3){
            System.out.println(i);
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
