package ejerciciosdowhile;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ? Programa que muestre la tabla de multiplicar del numero introducido
        // ^ Creamos las variables num para el entero introducido por el usuario, i para el incremento y resultado para el resultado de la multiplicacion
        int num, i = 1, resultado;

        // ^ Creamos el Scanner en la variable read y cambiamos al formato de US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.print("Introduce un numero: ");
        num = read.nextInt();

        // ? Salto de Linea Triple
        System.out.println();System.out.println("-------------------------------");System.out.println();

        // ! Bucle Do-While
        do {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
            i++;
        } while (i <= 10);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
