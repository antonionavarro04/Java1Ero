package ejercicio1;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? Programa que pide al Usuario que introduzca una nota del 0 al 10 y el programa le muestre mediante un switch si su nota es INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE o SOBRESALIENTE.
        // ^ Declaramos la variable nota para usarla con el switch
        byte nota;

        // ^ Decalaramos la variable read, se la asignamos al Scanner y cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);
        
        // ! Pedimos al usuario que introduzca su nota, la cual esta comprendida del 1 al 10
        System.out.print("Introduce tu nota del 0 al 10: ");
        nota = read.nextByte();

        // ? Salto de Línea Bonito
        System.out.println();System.out.println("------------------------------");System.out.println();

        // ! Comprobamos mediante una estructura Switch la nota introducida
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("La nota introducida no es valida");
                break;
        }
        
        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
