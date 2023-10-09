package ejercicios.ejercicio3;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos la variable numero para guardar el numero que introduzca el usuario, a de ser de tipo double
        double numero;

        // ^ Definimos la variable posicionArray que nos servira para imprimir los resultados
        byte posicionArray = 0;

        // ^ Creamos una instancia de la clase Scanner en la variable final read y cambiamos su localización a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ^ Creamos un array double de 5 posiciones
        double[] numerosDecimales = new double[5];

        // ! Pedimos al usuario que introduzca 5 numeros
        System.out.println("Introduce 5 numeros decimales: ");

        // ! Mediante un bucle for leemos 5 valores ello usaremos un bucle for
        for (byte i = 0; i < numerosDecimales.length; i++){
            // ! Leemos el numero
            System.out.print("> ");
            numero = read.nextDouble();

            // ! Añadimos el numero al Array
            numerosDecimales[i] = numero;
        }

        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n-------------------\n");

        // ! Mediante un bucle for each mostramos los valores que ha introducido el usuario
        System.out.println("Los numeros introducidos son: ");

        for (double numerosArray : numerosDecimales){
            System.out.println("[" + posicionArray + "] > " + numerosArray);

            // ! Incrementamos la posición
            posicionArray++;
        }
    } // € Hecho por Antonio Navarro
}
