package ejercicio1;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? Programa el cual nos va a comprobar si el numero que introducimos es par o impar.
        // ^ Creamos la Variable num la cual es la que va a almacenar el valor que introduzca el usuario
        long num;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que nos introduzca un numero 
        System.out.print("Introduce un número: ");
        num = read.nextLong();

        // ? Salto de linea bonito
        System.out.println();System.out.println("---------------------------------------------");System.out.println();

        // ! Calculamos el resto del numero introducido dividido entre 2
        num %= 2;

        // ! Si nuestro numero es 0 el numero introducido va a ser par, ya que cualquier numero par dividido entre 2 da de resto 0, por lo cual nuesto numero es par. En caso contrario nuestro numero sería impar, esto lo comprobaremos mediante una estructura if
        if (num == 0){
            System.out.println("Tu número es Par");
        } else{
            System.out.println("Tu numero es Impar");
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
    
}
