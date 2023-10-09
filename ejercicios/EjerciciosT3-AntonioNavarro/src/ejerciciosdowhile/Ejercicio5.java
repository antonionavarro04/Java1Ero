package ejerciciosdowhile;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Programa que el usuario piensa un numero entre el 1 al 100 y el programa lo adivina, el usuario le dira si el numero es mayor o menor que el numero introducido
        // ^ Creamos las variables num, mayor y menor
        int num, mayor = 100, menor = 1;

        // ^ Creamos las variables finales, MAYOR, MENOR e IGUAL para ayudarnos a comparar los numeros
        final byte MAYOR = 1;
        final byte MENOR = 2;
        final byte IGUAL = 3;

        // ^ Creamos la variable userChoice para guardar la eleccion del usuario y intentos para guardar el numero de intentos
        byte userChoice = 0, intentos = 0;

        // ^ Creamos la variable boolean haAdivinado, empezará siendo false y será true cuando el usuario diga que el numero es igual
        boolean haAdivinado = false;

        // ^ Creamos el Scanner en la variable read y cambiamos al formato de US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Bucle Do-While
        do{
            // ! Incrementamos los intentos en 1
            intentos++;

            // ! Generamos de el Numero aleatorio
            num = (int) (Math.random() * (mayor - menor)) + menor;

            // ! Mostramos el numero y le preguntamos al usuario si es mayor, menor o igual
            System.out.println(num + " es:");
            System.out.println("[1] Mayor a mi numero");
            System.out.println("[2] Menor a mi numero");
            System.out.println("[3] Igual a mi numero");
            System.out.print("-> ");
            userChoice = read.nextByte();

            // ? Salto de Linea Triple
            System.out.println();System.out.println("-------------------------------");System.out.println();

            // ! Comprobamos que no ha superado 100 intentos
            // ? Funcionalidad extra que yo le he añadido al programa ya que es raro que no adivine el numero en 100 intentos, la media suele ser entre 5 y 10, como mucho 15
            if(intentos == 100){ // * En caso de que se hayan hecho 100 intentos
                haAdivinado = true;
                System.out.println("No he podido adivinar tu numero en menos de 100 intentos");
            }

            // ! Comprobamos que el numero introducido por el usuario sea mayor, menor o igual
            if (userChoice == MAYOR){ // * En caso de que sea mayor
                mayor = num;
            } else if (userChoice == MENOR){ // * En caso de que sea menor
                menor = num;
            } else if (userChoice == IGUAL){ // * En caso de que sea igual
                haAdivinado = true;
                System.out.println("Adiviné tu Número");
                System.out.println("Intentos: " + intentos);
            } else{ // * En caso de que el usuario introduzca un numero que no sea 1, 2 o 3
                haAdivinado = true;
                System.out.println("Se ha producido un error");
            }
        } while (haAdivinado == false); // * Mientras que haAdivinado sea 'false' el programa seguira ejecutando el bucle

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
