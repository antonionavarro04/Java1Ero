// TESTS
// = Habrá que comprobar que no se puede introducir 0 ni menores ni mayores que 20
// = Si se introduce 4 deberá quedar: 1
// =                                  22
// =                                  333
// =                                  4444

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio6 {
    public static void main(String[] args) {
        // ? Programa Java el cual pida un número entero N entre 0 y 20, tras eso se imprimiran todos los valores desde 1 hasta n. Cada número se imprimira en una nueva línea y tantas veces diga su valor
        // ^ Creamos la variable para n, incremento y veces
        byte n, incremento = 1, veces = 1; // * Es de tipo byte porque no puede ser mayor de 20
        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        do {
            System.out.print("Introduce un número entre 0 y 20: ");
            n = read.nextByte(); // ! Pedimos n al usuario
        } while (n < 1 || n > 20); // * Repetiremos el bucle mientras n sea menor que 1 o mayor que 20

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        while (veces <= n){ // ! Mediante un bucle while imprimiremos los caracteres
            while (incremento <= veces){ // ! Mediante un bucle while imprimiremos los caracteres tantas veces el número
                System.out.print(veces); // * Imprimimos veces ya que es el que contiene el número de la fila
                incremento++; // * Incrementaremos el incremento hasta que sea igual a veces
            } System.out.println(); // * Cambiamos de Línea
            incremento = 1; // * Reiniciamos el incremento
            veces++; // * Incrementaremos las veces hasta que sea igual a n
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
