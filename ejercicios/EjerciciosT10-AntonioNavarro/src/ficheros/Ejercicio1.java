package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio1 {
    private static final String ROUTE = "in\\ejercicio1\\NumerosReales.txt";

    public static void main(String[] args) {
        // ^ Definimos un Scanner
        Scanner sc;

        // ^ Definimos dos variables, una para la suma total y otra para la media
        int sumaTotal = 0, i = 0;

        try {
            sc = new Scanner(new FileReader(ROUTE));

            while (sc.hasNextInt()) {
                sumaTotal += sc.nextInt();
                i++;
            } sc.close();
        } catch (FileNotFoundException e) {
            System.err.printf("El archivo en la ruta \"%s\" no ha sido encontrado...\n", ROUTE);
        } finally {
            System.out.printf("La suma total es: %d\nLa media aritmética es: %.2f", sumaTotal, (double) sumaTotal / i);
        }
    }
}
