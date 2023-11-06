package ejercicio3;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ? Programa el cual nos va a decir si un numero es casi 0 o no
        // ^ Creamos la variable num la cual es la que va a ser comprobada si es un numero casi 0 o no
        double num;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que asigne un valor a la variable num
        System.out.print("Introduce un numero, puede contener decimales: ");
        num = read.nextDouble();

        // ? Salto de linea bonito
        System.out.println();System.out.println("---------------------------------------------");System.out.println();

        // ! Comprobamos mediante un if si nuestro numero esta entre -1 y 1
        if (num != 0 && num > -1 && num < 1){
            System.out.println(num + " es un numero casi 0");
        } else{
            System.out.println(num + " no es un numero casi 0");
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
