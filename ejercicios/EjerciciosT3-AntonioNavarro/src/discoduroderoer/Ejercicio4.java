package discoduroderoer;

// ? Importamos la clase Scanner, Locale y Math
import java.util.Scanner; import java.util.Locale; import java.lang.Math;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ? Programa Java que calcule el area de un circulo
        // ^ Definimos la variable radio y resultado
        double radio, resultado;

        // ^ Definimos la variable read como Scanner con formato US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        do{
            System.out.print("Introduce el radio del circulo: ");
            radio = read.nextDouble(); // ! Pedimos el radio
        } while (radio <= 0);

        // ? Salto de Línea Triple
        System.out.println("\n----------------------------------\n");

        // ! Calculamos el area del circulo
        resultado = Math.PI * Math.pow(radio, 2);

        // ! Imprimimos el resultado
        System.out.println("El area del circulo con radio " + radio + " es: " + resultado);

        // ^ Cerramos el Scanner
        read.close();
    }
}
