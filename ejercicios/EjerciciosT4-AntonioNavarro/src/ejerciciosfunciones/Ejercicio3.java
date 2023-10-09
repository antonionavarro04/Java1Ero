package ejerciciosfunciones;

// ? Importamos la clase Scanner, Locale
import java.util.Scanner;
import java.util.Locale;

// ? Programa que dado los valores radio y altura calcule el área y el volumen de un cilindro según la opción elegida.
public class Ejercicio3 {
    public static void main(String[] args) {
        // ? En el método main definimos la recogida de datos y la llamada a la función cilindro
        // ^ Definimos las variables radio, altura y opcion
        double radio, altura; // * Double porque el radio y la altura pueden ser decimales
        byte opcion; // * Byte porque las opciones válidas van del 0 al 2

        // ^ Definimos la variable read como Scanner y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Presentamos al usuario el funcionamiento del programa
        System.out.println("Este programa calcula el área y el volumen de un cilindro.");

        // ! Pedimos a el usuario tanto el radio como la altura
        System.out.print("Introduce el valor del radio: ");
        radio = read.nextDouble(); // * Leemos el radio
        System.out.print("Introduce el valor de la altura: ");
        altura = read.nextDouble(); // * Leemos la altura

        do{
            // ? Salto de Línea Triple
            System.out.println("\n-----------------------------------------\n");

            // ! Pedimos al usuario que elija una opción
            System.out.println("Elige una opción:");
            System.out.println("0. Salir");
            System.out.println("1. Calcular el área");
            System.out.println("2. Calcular el volumen");
            System.out.print("> ");
            opcion = read.nextByte(); // * Leemos la opción que escoja el usuario
            
            // ? Salto de Línea Triple
            System.out.println("\n-----------------------------------------\n");

            // ! Llamamos a la función cilindro
            Methods.cilindro(radio, altura, opcion);
        } while (opcion != 0);

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // € Hecho por Antonio Navarro
    }
}
