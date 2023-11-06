package ejercicio8;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio8 {
    public static void main(String[] args) {
        // ? Programa JAVA el cual nos va a decir si nuestra nota es INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE o SOBRESALIENTE.
        // ^ Creamos la variable nota la cual va a servir para comprobar su nota
        float nota;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al Usuario que nos introduzca un numero
        System.out.print("Introduce un numero del 0 al 10, puede contener decimales: ");
        nota = read.nextFloat();

        // ? Salto de linea bonito
        System.out.println();System.out.println("---------------------------------------------");System.out.println();

        // ! Comprobamos mediante una estructura if si la nota es insuficiente, suficiente...
        if (nota < 5){
            System.out.println("Tu nota es INSUFICIENTE");
        } else if (nota >= 5 && nota < 6){
            System.out.println("Tu nota es SUFICIENTE");
        } else if (nota >= 6 && nota < 7){
            System.out.println("Tu nota es BIEN");
        } else if (nota >= 7 && nota < 9){
            System.out.println("Tu nota es NOTABLE");
        } else if (nota >= 9 && nota <= 10){
            System.out.println("Tu nota es SOBRESALIENTE");
        } else{
            System.out.println("Tu nota no es un numero entre 0 y 10");
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
