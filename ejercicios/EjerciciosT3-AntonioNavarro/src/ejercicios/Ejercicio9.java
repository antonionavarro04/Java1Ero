// TESTS
// = Habrá que comprobar que no se puede introducir numeros negativos
// = Si se introduce 1 deberá decir que tiene 1 digito
// = Si se introduce 10 deberá decir que tiene 2 digitos
// = Si se introduce 100 deberá decir que tiene 3 digitos
// = Y así hasta el límite de long el cual es 9223372036854775807 osease 19 digitos

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio9 {
    public static void main(String[] args) {
        // ? Programa Java que nos diga cuantos digitos tiene un numero entero positivo introducido por teclado
        // ^ Creamos la variable para n y el contador
        long n;

        // ^ Creamos el contador
        byte digitos = 0; // * Byte ya que por limitación de long el numero no va a tener más de 19 digitos

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        do{
            System.out.print("Introduce el numero: ");
            n = read.nextLong(); // ! Leemos el numero
        } while (n < 0); // * Comprobamos que el numero sea mayor que 0

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------\n");

        while (n > 0){ // ! Mediante un bucle while, dividimos el numero entre 10 hasta que n sea > 0
            n /= 10; // * Dividimos el numero entre 10
            digitos++; // * Incrementamos el contador
        }

        // ! Imprimimos el contador
        System.out.println("El numero tiene " + digitos + " digitos");

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }    
}
