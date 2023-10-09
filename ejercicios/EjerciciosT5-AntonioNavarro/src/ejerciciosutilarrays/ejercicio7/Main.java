package ejerciciosutilarrays.ejercicio7;

// ? Importamos la Clase Arrays
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos dos array entero de 6 posiciones
        int numeroAleatorio[] = new int[6];
        int combinacionGanadora[] = new int[6];

        // ! Rellenamos ambos arrays con números aleatorios entre 1 y 49
        for (short pos = 0; pos < numeroAleatorio.length; pos++) {
            numeroAleatorio[pos] = (int) (Math.random() * 49) + 1;
            combinacionGanadora[pos] = (int) (Math.random() * 49) + 1;
        }

        // ! Imprimimos los arrays
        System.out.println("Número Aleatorio:\n" + Arrays.toString(numeroAleatorio));
        System.out.println("\nCombinación Ganadora:\n" + Arrays.toString(combinacionGanadora) + "\n\n---------------------\n");

        // ! Ordenamos la combinación ganadora
        Arrays.sort(combinacionGanadora);

        // ! Sacamos los valores comunes entre los dos arrays
        for (short pos = 0; pos < numeroAleatorio.length; pos++) {
            if (Arrays.binarySearch(combinacionGanadora, numeroAleatorio[pos]) >= 0) {
                System.out.println("El número " + (numeroAleatorio[pos] < 10 ? numeroAleatorio[pos] + " " : numeroAleatorio[pos]) + " sí está en la combinación ganadora");
            } else {
                System.out.println("El número " + (numeroAleatorio[pos] < 10 ? numeroAleatorio[pos] + " " : numeroAleatorio[pos]) + " no está en la combinación ganadora");
            }
        }
    }
}
