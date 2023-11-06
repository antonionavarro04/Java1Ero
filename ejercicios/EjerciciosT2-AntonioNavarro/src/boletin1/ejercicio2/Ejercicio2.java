package ejercicio2;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio2 {
    public static void main(String[] args) {
        // ? Programa el cual nos va a comprobar si dos numeros que hayamos introducido son iguales o no.
        // ^ Creamos dos Variables, una para el primer numero introducido y otra para el segundo
        double num1, num2;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que nos introduzca dos numeros para comprobar si son iguales posteriormente
        System.out.print("Introduce un número: ");
        num1 = read.nextDouble();

        System.out.print("Introduce otro número: ");
        num2 = read.nextDouble();

        // ? Salto de linea bonito
        System.out.println();System.out.println("---------------------------------------------");System.out.println();

        // ! Comprobamos mediante un if si son iguales los numeros e imprimimos el resultado por pantalla
        if (num1 == num2){
            System.out.println(num1 + " y " + num2 + " son iguales");
        } else{
            System.out.println(num1 + " y " + num2 + " son diferentes");
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
