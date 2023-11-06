package ejercicio4;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ? Programa el cual pide al Usuario que introudzca en formato cadena de texto que ha sacado al tirar los dados, tras eso mediante un switch se sumaran y dara cuanto ha sacado en total
        // ^ Declaramos las variables dado1 y dado2 para usarlas con el switch, tambien las variable resultado
        String dado1, dado2;
        byte resultado = 0;

        // ^ Decalaramos la variable read, se la asignamos al Scanner y cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca el valor del primer dado
        System.out.print("Introduce el valor del primer dado en texto y en mayúsculas: ");
        dado1 = read.nextLine();

        // ! Comprobamos mediante un switch cuanto ha sacado y se lo sumamos al resultado
        switch(dado1){
            case "UNO":
                resultado++;
                break;
            case "DOS":
                resultado += 2;
                break;
            case "TRES":
                resultado += 3;
                break;
            case "CUATRO":
                resultado += 4;
                break;
            case "CINCO":
                resultado += 5;
                break;
            case "SEIS":
                resultado += 6;
                break;
            default:
                System.out.println("El valor " + dado1 + " es invalido, su valor se ha dejado en 2: ");
                break;

        }
            
        // ! Pedimos al usuario que introduzca el valor del segundo dado
        System.out.print("Introduce el valor del segundo dado en texto y en mayúsculas: ");
        dado2 = read.nextLine();

        // ! Comprobamos mediante un switch cuanto ha sacado y se lo sumamos al resultado
        switch(dado2){
            case "UNO":
                resultado++;
                break;
            case "DOS":
                resultado += 2;
                break;
            case "TRES":
                resultado += 3;
                break;
            case "CUATRO":
                resultado += 4;
                break;
            case "CINCO":
                resultado += 5;
                break;
            case "SEIS":
                resultado += 6;
                break;
            default:
                System.out.println("El valor " + dado2 + " es invalido, su valor se ha dejado en 1: ");
                resultado++;
                break;

        }
        // ? Salto de Línea Bonito
        System.out.println();System.out.println("------------------------------");System.out.println();

        // ! Imprimimos el resultado final
        System.out.println("La suma del primer dado con valor " + dado1 + " y el segundo dado con valor " + dado2 + " es: " + resultado);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
