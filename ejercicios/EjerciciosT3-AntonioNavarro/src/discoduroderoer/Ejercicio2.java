/*
 * @antonionavarro04
 */

package discoduroderoer;

public class Ejercicio2 {
    public static void main(String[] args) {
        // ? Programa java el cual te dice cual es el mayor de los dos numeros, en caso de que sean iguales indicarlo tambien
        // ^ Definimos num1 y num2
        double num1 = 6234, num2 = 563; // * Caso en el que num1 es mayor que num2

        // ! Mediante una estructura if comprobaremos los resultados
        if (num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2){
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println(num1 + " es igual que " + num2);
        }

        // ? Salto de Línea Triple
        System.out.println("\n----------------------------------\n");

        num1 = 43 ; num2 = 563; // * Caso en el que num1 es menor que num2

        // ! Mediante una estructura if comprobaremos los resultados
        if (num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2){
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println(num1 + " es igual que " + num2);
        }

        // ? Salto de Línea Triple
        System.out.println("\n----------------------------------\n");
        num1 = 20 ; num2 = 20; // * Caso en el que num1 es igual que num2

        // ! Mediante una estructura if comprobaremos los resultados
        if (num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2){
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println(num1 + " es igual que " + num2);
        }
    }
}
