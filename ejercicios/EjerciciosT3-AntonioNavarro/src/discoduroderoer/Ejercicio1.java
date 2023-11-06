/*
 * @antonionavarro04
 */

package discoduroderoer;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? Programa Java el cual te calcula la suma, resta, multiplicación división y módulo de dos numeros
        // ^ Definimos la variable del num1 y el num 2
        double num1 = 2534.5235, num2 = 790.1352;

        // ! Mostramos los resultados
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num1 - num2));
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + (num1 * num2));
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2));
        System.out.println("El módulo de " + num1 + " y " + num2 + " es: " + (num1 % num2));

        // ? Salto de Línea Triple
        System.out.println("\n----------------------------------\n");

        // ! Hacemos lo mismo pero calculando el resultado y guardandolo en una variable
        double var;
        var = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + var);

        var = num1 - num2;
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + var);

        var = num1 * num2;
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + var);

        var = num1 / num2;
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + var);

        var = num1 % num2;
        System.out.println("El módulo de " + num1 + " y " + num2 + " es: " + var);

        // ? Salto de Línea Triple
        System.out.println("\n----------------------------------\n");

        // ! Hacemos lo mismo pero guardando cada resultado en una variable diferente
        double suma, resta, multiplicacion, division, modulo;
        suma = num1 + num2; resta = num1 - num2; multiplicacion = num1 * num2; division = num1 / num2; modulo = num1 % num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + division);
        System.out.println("El módulo de " + num1 + " y " + num2 + " es: " + modulo);
    }
}
