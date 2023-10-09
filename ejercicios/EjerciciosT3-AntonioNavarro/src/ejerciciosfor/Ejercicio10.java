package ejerciciosfor;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio10 {
    public static void main(String[] args) {
        // ? Programa que pida un numero menor (a) y un numero mayor (b), tras esto se mostrarán todos los numeros desde a hasta b
        // ^ Declaramos las variables a y b
        long a, b;

        // ^ Creamos el Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pequeña descripción del programa
        System.out.println("Introduce dos numeros, siendo a menor a b");

        // ! Pedimos a el usuario los numeros
        System.out.print("Introduce un número a: ");
        a = read.nextLong();
        System.out.print("Introduce un número b: ");
        b = read.nextLong();

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Creamos el Bucle for en el cual iremos mostrando los numeros desde a hasta b
        for (; a <= b; a++){
            System.out.println(a);
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
