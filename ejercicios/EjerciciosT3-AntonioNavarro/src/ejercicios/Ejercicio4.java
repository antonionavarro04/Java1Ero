// TESTS
// = Habrá que comprobar que no se pueden introducir números negativos
// = Si a es 4 y b es 10 el MCD deberá ser 2
// = Si a es 50 y b es 100 el MCD deberá ser 50
// = Si a es 15 y b es 70 el MCD deberá ser 5
// = Si a o b son 0 o menor el programa te volverá a pedir los números

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ? Programa Java el cual pida a y b al usuario y se realice el MCD de a y b
        // ^ Creamos las variables para a y b
        long a = 0, b = 0;

        // ^ Creamos una variable para el divisor y 2 para los módulos de a y b
        long divisor, moduloA, moduloB;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        while(a < 1){ // * a no puede ser 0 o menos
            System.out.print("Introduce a: ");
            a = read.nextLong(); // ! Pedimos a al usuario
        } // * Repetiremos el bucle hasta que a sea mayor que 0
        
        while(b < 1){ // * b no puede ser 0 o menos
            System.out.print("Introduce b: ");
            b = read.nextLong(); // ! Pedimos b al usuario
        } // * Repetiremos el bucle hasta que b sea mayor que 0
        
        // ? Salto de Línea Triple
        System.out.println("\n------------------------------------------\n");

        // ! Operador ternario para sobrescribir el valor de divisor
        divisor = (a < b) ? a : b; // * Si a es mayor que b, divisor es a, si no, divisor es b

        do { // ! Mediante un bucle do While vamos comprobando si a y b son divisibles entre el divisor
            // ! Comprobamos si a y b son divisibles entre el divisor
            moduloA = a % divisor; // * Calculamos el modulo de a
            moduloB = b % divisor; // * Calculamos el modulo de b

            divisor--; // ! Decrementamos el divisor
        } while (moduloA != 0 || moduloB != 0); // * Repetiremos el bucle mientras a y b no sean divisibles entre el divisor

        // ! Imprimimos el MCD
        System.out.println("El máximo comun divisor de " + a + " y " + b + " es: " + (divisor + 1)); // * + 1 porque en While se decrementa el divisor

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
