package ejercicio10;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio10 {
    public static void main(String[] args) {
        // ? Programa el cual nos diga si la suma de dos de los numeros introducidos da como resultado el otro número, solo se introducieran 3 numeros
        // ^ Creamos 3 variables; num1, num2, num3 las cuales van a servir para calcular si alguno de esos numeros es la suma de otro
        double num1, num2, num3;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que asigne valores a las 3 variables que hemos creado
        System.out.print("Introduce un numero: ");
        num1 = read.nextDouble();
        System.out.print("Introduce un segundo numero: ");
        num2 = read.nextDouble();
        System.out.print("Introduce un último numero: ");
        num3 = read.nextDouble();

        // ? Salto de linea bonito
        System.out.println();System.out.println("---------------------------------------------");System.out.println();
        
        // ? Imprimimos los numeros que ha introducido el usuario en una sola línea
        System.out.println("Los numeros introducidos son: num1 = " + num1 + ", num2 = " + num2 + " y num3 = " + num3);
        
        // ! Comprobamos mediante una estructura de if si alguno de los numeros es la suma de los otros dos
        if (num1 == num2 + num3){
            System.out.println("El numero " + num1 + " es la suma de " + num2 + " y " + num3);
        } else if (num2 == num1 + num3){
            System.out.println("El numero " + num2 + " es la suma de " + num1 + " y " + num3);
        } else if (num3 == num1 + num2){
            System.out.println("El numero " + num3 + " es la suma de " + num1 + " y " + num2);
        } else {
            System.out.println("Ninguno de los numeros es la suma de los otros dos");
        }
        
        // ^ Cerramos el Scanner
        read.close();
        
        // € Hecho por Antonio Navarro
    }
}
