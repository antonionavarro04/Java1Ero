package ejercicios.ejercicio10;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array de 100 posiciones de tipo byte
        byte randomNumbers[] = new byte[100];

        // ^ Definimos una varable incognita para almacenar el numero a buscar
        byte incognita;

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Llamamos a la función rellenar aleatorios para rellenar el array
        Methods.fillArray(randomNumbers);

        // ! Pedimos al usuario que introduzca un numero N para buscarlo en el Array
        System.out.print("Introduce un numero a buscar (1 / 10): ");
        incognita = read.nextByte();
        while (incognita <= 0 || incognita > 10){
            System.out.print("Introduce un numero entre 1 y 10: ");
            incognita = read.nextByte();
        }

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n--------------------------\n");

        // ! Llamamos a la función buscarNumero para buscar el numero en el array
        Methods.searchNumber(randomNumbers, incognita);
    } // € Hecho por Antonio Navarro
}