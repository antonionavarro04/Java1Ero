package ejercicio4;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ? Programa el cual nos va a ordenar dos numeros introducidos de menor a mayor
        // ^ Creamos dos variables, num1 y num2 las cuales van a ser ordenadas de menor a mayor una vez el usuario introduzca sus valores
        double num1, num2;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que nos introduzca los valores
        System.out.print("Introduce un numero: ");
        num1 = read.nextDouble();
        System.out.print("Introduce otro un numero: ");
        num2 = read.nextDouble();

        // ? Salto de linea bonito
        System.out.println();System.out.println("---------------------------------------------");System.out.println();

        // ! Comprobamos si el num1 es menor que el num2, de ser asi los numeros se imprimirian de esta forma(num1 + num2), en caso contrario se imprimirian al revés
        if (num1 <= num2){
            System.out.println(num1 + ", " + num2);
        } else {
            System.out.println(num2 + ", " + num1);
        }
        
        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
