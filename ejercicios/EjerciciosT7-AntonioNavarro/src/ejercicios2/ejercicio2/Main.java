package ejercicios2.ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        Contador contador1 = new Contador(40);
        Contador contador2 = new Contador(contador1);

        for (int i = 0; i < 50; i++) {
            contador2.decrementar();
            System.out.println("Decrementado en 1 unidad: " + contador2.getCont());
        }

        read.close();
    }
}
