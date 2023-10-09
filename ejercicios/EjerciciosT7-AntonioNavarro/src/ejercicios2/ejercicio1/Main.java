package ejercicios2.ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        Hora reloj = new Hora();

        System.out.print("Introduce cuantos segundos incrementar la hora: ");
        int incremento = read.nextInt();

        do {
            reloj.incrementaSegundo();
            incremento--;
        } while (incremento > 0);

        System.out.println("Tu nueva hora es >>> " + reloj.getHora() + ":" + reloj.getMinuto() + ":" + reloj.getSegundo());

        read.close();
    }
}
