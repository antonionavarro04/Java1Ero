// TESTS
// = Habrá que comprobar que no se pueden introducir números negativos
// = Si a es 2 y b es 3 el MCM será 6
// = Si a es 4 y b es 10 el MCM será 20

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Programa que dado a y b, calcule el MCM de a y b
        // ^ Creamos las variables para a y b
        long a, b;

        // ^ Creamos una variable multiplicador y 2 para los resultados de a y b así como 2 para los multiplicadores de a y b
        long resultadoA, resultadoB, multiplicadorA = 1, multiplicadorB = 1; // * Las variables multiplicador se iniciaran a 1 para que en la multiplicación empieze desde el 1, ya qeu si el usuario introduce a = 2 y b = 2, el mcm será de 2 ya que son iguales

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        do{
            System.out.print("Introduce el valor de a: ");
            a = read.nextLong(); // ! Leemos el valor de a
        } while (a <= 0); // * Si a es menor o igual a 0, se volverá a pedir el valor de a
        
        do{
            System.out.print("Introduce el valor de b: ");
            b = read.nextLong(); // ! Leemos el valor de b
        } while (b <= 0); // * Si b es menor o igual a 0, se volverá a pedir el valor de b

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        // ! Mediante un bucle Do-While multiplicaremos cada valor por su multiplicador
        do{
            // ! Calculamos los resultados de x por su multiplicador
            resultadoA = a * multiplicadorA; // * Calculamos el resultado de a por el multiplicador de a
            resultadoB = b * multiplicadorB; // * Calculamos el resultado de b por el multiplicador de b
            
            // ! Mediante un if-else incrementamos el multiplicador del que haya dado un resultado menor
            if (resultadoA < resultadoB) multiplicadorA++; // * Si a es menor que b, incrementamos solo el multiplicador de a
            else multiplicadorB++; // * Si b es menor que a, incrementamos solo el multiplicador de b

        } while (resultadoA != resultadoB); // * Repetiremos el bucle hasta que los resultados sean iguales

        // ! Imprimimos el MCM
        System.out.println("El mínimo comun múltiplo de " + a + " y " + b + " es: " + resultadoA);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
