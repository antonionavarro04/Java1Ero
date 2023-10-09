package ejercicios.ejercicio7;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array de 10 posiciones
        double array[] = new double[10];

        // ^ Definimos una instancia de la clase Scanner llamandose read siendo final y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos a el Usuario que introduzca 10 numeros
        System.out.println("Introduce 10 números reales:");
        for (byte pos = 0; pos < array.length; pos++){
            System.out.print("[" + pos + "] --> ");
            array[pos] = read.nextDouble();
        }

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ! Mostramos el array en orden inverso llamando a la función estatica
        System.out.println("El array visto de forma inversa queda así:");
        Methods.printInverseArray(array);
    } // € Hecho por Antonio Navarro
}
