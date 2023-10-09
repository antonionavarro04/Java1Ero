package ejerciciosfor;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio9 {
    public static void main(String[] args) {
        // ? Programa Java que pida un numero y muestre si es primo o no
        // ^ Declaramos la variable n (numero introducido)
        long n, i;
        boolean esPrimo = true;

        // ^ Creamos el Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos a el usuario el numero a comprobar
        System.out.print("Introduce un número: ");
        n = read.nextLong();

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Bucle for en el cual comprobamos si el numero es primo o no, si su modulo es 0 no es primo. De esta manera dividiremos el numero por todos los numeros hasta llegar al suyo mismo
        for (i = 2; i < n; i++) {
            if (n % i == 0 && n != i){
                esPrimo = false;
                break;
            }
        }
        
        // ! Mostramos si el numero es primo o no mediante un operador ternario
        System.out.println(esPrimo ? "El número " + n + " es primo" : "El número " + n + " no es primo");
    }    
}
