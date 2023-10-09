package ejercicios.ejercicio9;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array temperatura de 12 posiciones, será float pues las temperaturas llevan decimales y la posición 0 corresponderá a enero y la 11 a diciembre
        float temperatura[] = new float[12];

        // ^ Definimos una variable precisión para el gráfico
        float precision;

        // ^ Definimos una instancia de la clase Scanner como final de nombre read y cambiamos su formato a US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al Usuario que introduzca las temperaturas de los 12 meses
        System.out.println("Introduce la temperatura media de los 12 meses del año: ");
        for (byte pos = 0; pos < temperatura.length; pos++){
            // ! Imprimimos el mensaje compartido
            System.out.print("Introduce la temperatura en ");
            // ! Mediante un Switch Case imprimiremos el mes que vamos a recoger
            switch (pos) {
                case 0:
                    System.out.print("Enero: ");
                    break;
                case 1:
                    System.out.print("Febrero: ");
                    break;
                case 2:
                    System.out.print("Marzo: ");
                    break;
                case 3:
                    System.out.print("Abril: ");
                    break;
                case 4:
                    System.out.print("Mayo: ");
                    break;
                case 5:
                    System.out.print("Junio: ");
                    break;
                case 6:
                    System.out.print("Julio: ");
                    break;
                case 7:
                    System.out.print("Agosto: ");
                    break;
                case 8:
                    System.out.print("Septiembre: ");
                    break;
                case 9:
                    System.out.print("Octubre: ");
                    break;
                case 10:
                    System.out.print("Noviembre: ");
                    break;
                case 11:
                    System.out.print("Diciembre: ");
                    break;
                default:
                    System.out.print("Error");
                    break;
            }

            // ! Guardamos la temperatura en la posición correspondiente
            temperatura[pos] = read.nextFloat();
        }

        // ! Pedimos al Usuario que introduzca la precisión del gráfico
        System.out.print("\nElige la presición con la que pintar el gráfico (1º, 0.5º, 0.1º...): ");
        precision = read.nextFloat();
        while (precision <= 0f) {
            System.out.print("La presición debe ser mayor que 0º: ");
            precision = read.nextFloat();
        }
        
        // ^ Cerramos el Scanner tras su uso
        read.close();

        // ? Salto de Línea Triple
        System.out.println("\n------------------------\n");

        // ! Pintamos el array con la función
        Methods.printArray(temperatura);

        // ? Salto de Línea Triple
        System.out.println("\n------------------------\n");
        
        // ! Llamamos a la función que pinta el gráfico
        Methods.graficoTemperatura(temperatura, precision);
    } // € Hecho por Antonio Navarro
}