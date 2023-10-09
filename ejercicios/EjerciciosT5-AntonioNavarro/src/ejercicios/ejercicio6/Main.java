package ejercicios.ejercicio6;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array entero de 8 posiciones
        long arrayEvenOrOdd[] = new long[8];

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al Usuario que introduzca 8 numeros
        System.out.println("Introduce 8 números enteros:");
        for (byte pos = 0; pos < arrayEvenOrOdd.length; pos++){
            System.out.print("[" + pos + "] --> ");
            arrayEvenOrOdd[pos] = read.nextLong();
        }

        // ^ Cerramos el Scanner tras su uso
        read.close();
        
        // ? Salto de Línea Triple
        System.out.println("\n--------------------------\n");
        
        // ! Llamamos a la función para mostrar los números de un array
        System.out.println("Estos son los numeros introducidos y si sin Pares o Impares");
        Methods.printNormalArrayEvenOrOdd(arrayEvenOrOdd);
    } // € Hecho por Antonio Navarro
}
