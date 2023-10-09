// TESTS
// = Habrá que comprobar metiendo datos que se encuentren dentro de rango, ej: hh; -90: mm; 153 ss; -1 ii; -90 no estan bien introducidos
// = La hora resultante deberá corresponderse con la hora introducida y el incremento
// = Si introduces 23:59:59 y le sumas 1, deberá dar 00:00:00, así como si no sumas nada se debe quedar igual

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? Programa Java que pide una hora en hh:mm:ss y un incremento en segundos y muestra la hora resultante
        // ^ Creamos las variables para las horas, minutos y segundos, asi como el incremento
        long horas, minutos, segundos, incremento;

        // ^ Creamos un Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pedimos la hora, minutos y segundos al usuario
        do{
            System.out.print("Introduce la hora: ");
            horas = read.nextLong(); // ! Pedimos la hora al usuario
        } while (horas < 0 || horas > 23); // * Si la hora es menor que 0 o mayor que 23, se volverá a pedir

        do{
            System.out.print("Introduce los minutos: ");
            minutos = read.nextLong(); // ! Pedimos los minutos al usuario
        } while (minutos < 0 || minutos > 59); // * Si los minutos son menores que 0 o mayores que 59, se volverá a pedi

        do{
            System.out.print("Introduce los segundos: ");
            segundos = read.nextLong(); // ! Pedimos los segundos al usuario
        } while (segundos < 0 || segundos > 59); // * Si los segundos son menores que 0 o mayores que 59, se volverá a pedir

        do{
            System.out.print("Introduce el incremento en segundos: ");
            incremento = read.nextLong(); // ! Pedimos el incremento en segundos al usuario
        } while (incremento < 0); // * Si el incremento es menor que 0, se volverá a pedir

        // ? Salto de Línea Triple
        System.out.println("\n---------------------------------------------------------------\n");

        // ! Sumamos el incremento a los segundos
        segundos += incremento;

        // ? Lo he hecho mediante whiles porque creo que de esta manera esta mas optimizado, ya que de esta forma no hace tantas comprobaciones dentro del While o del for que si usaramos if's
        while (segundos > 59){ // ! Mediante un bucle while, comprobamos si los segundos son mayores a 59
            segundos -= 60; // * De ser cierto restaremos 60 a los segundos
            minutos++; // * Y sumaremos 1 a los minutos
        }

        while (minutos > 59){ // ! Mediante un bucle while, comprobamos si los minutos son mayores a 59
            minutos -= 60; // * De ser cierto restaremos 60 a los minutos
            horas++; // * Y sumaremos 1 a las horas
        }

        while (horas > 23){ // ! Mediante un bucle while, comprobamos si las horas son mayores a 23
            horas -= 24; // * De ser cierto restaremos 24 a las horas
        }

        // ! Mostramos la hora resultante al usuario
        System.out.println("La hora resultante es: " + (horas < 10 ? "0" + horas : horas) + ":" + (minutos < 10 ? "0" + minutos : minutos) + ":" + (segundos < 10 ? "0" + segundos : segundos)); // * Los ternarios sirven para que si la hora es 1:4:9 quede como 01:04:09

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
