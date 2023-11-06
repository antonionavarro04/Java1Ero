package ejercicio7;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ? Programa el cual nos va a decir si nuestro numero tiene 1, 2, 3, 3 o 5 cifras.
        // ^ Creamos una variable para almacenar el numero introducido por el usuario
        int num;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca un numero
        System.out.print("Introduce un numero: ");
        num = read.nextInt();

        // ? Salto de linea bonito
        System.out.println();System.out.println("---------------------------------------------");System.out.println();

        // ! Comprobamos cuantas cifras tiene el numero introducido
        if (num < 10){
            System.out.println("El numero introducido tiene 1 cifra");
        } else if (num < 100){
            System.out.println("El numero introducido tiene 2 cifras");
        } else if (num < 1000){
            System.out.println("El numero introducido tiene 3 cifras");
        } else if (num < 10000){
            System.out.println("El numero introducido tiene 4 cifras");
        } else if (num < 100000){
            System.out.println("El numero introducido tiene 5 cifras");
        } else{
            System.out.println("El numero introducido tiene mas de 5 cifras");
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
