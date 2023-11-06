package ejercicio3;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ? Programa el cual pida dos numeros al usuario, tras eso se seleccionara una opcion de la 'a' a la 'd' y el programa calculara el numero con la opcion introducida

        // ^ Declaramos la variable num1, num2 y resultado así como la variable caso, esta ultima sera de tipo char
        double num1, num2, resultado;
        char caso;

        // ^ Decalaramos la variable read, se la asignamos al Scanner y cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que nos introduzca dos numeros
        System.out.print("Introduce un número: ");
        num1 = read.nextDouble();
        System.out.print("Introduce otro número: ");
        num2 = read.nextDouble();

        // ? Salto de Línea
        System.out.println();

        // ! Pedimos al usuario que nos introduzca el modo que quiere tratar los numeros
        System.out.println("Que deseas hacer con los numeros: ");
        System.out.println("a. Sumar los Números");
        System.out.println("b. Restar los Números");
        System.out.println("c. Multiplicar los Números");
        System.out.println("d. Dividir los Números");
        System.out.println();
        System.out.print("Introduce el modo: ");
        caso = read.next().charAt(0);

        // ? Salto de Línea Bonito
        System.out.println();System.out.println("------------------------------");System.out.println();

        // ! Comprobamos mediante una estructura Switch la opcion introducida por el usuario e imprimimos los resultados
        switch (caso){
            case 'a':
                System.out.println("Ha seleccionado 'Suma'");
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case 'b':
                System.out.println("Ha seleccionado 'Resta'");
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            case 'c':
                System.out.println("Ha seleccionado 'Multiplicación'");
                resultado = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + resultado);
                break;
            case 'd':
                System.out.println("Ha seleccionado 'División'");
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;
            default:
                System.out.println("El modo " + caso + " no es Válido, introduce un modo válido (a - d)");
                break;
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }    
}
