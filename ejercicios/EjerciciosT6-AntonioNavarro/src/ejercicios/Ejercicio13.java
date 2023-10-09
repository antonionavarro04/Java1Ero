package ejercicios;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

import funciones.PerArrays;

public class Ejercicio13 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void sumario(String frase) {
        frase = frase.toUpperCase();
        char fraseSplit[] = frase.toCharArray();
        
        // ! Quitar Espacios
        for (int pos = 0; pos < fraseSplit.length; pos++) {
            if (fraseSplit[pos] == ' ') {
                fraseSplit = PerArrays.deleteKnowingData(fraseSplit, pos);
            }
        }

        while (fraseSplit.length != 0) {
            int veces = 1;
            char caracterABuscar = fraseSplit[0];
            fraseSplit = PerArrays.deleteKnowingData(fraseSplit, 0);

            for (int pos = 0; pos < fraseSplit.length; pos++) { 
                if (caracterABuscar == fraseSplit[pos]) {
                    fraseSplit = PerArrays.deleteKnowingData(fraseSplit, pos);
                    veces++;
                    pos--;
                }
            } System.out.printf("El caracter %s se repite %s %s.\n", caracterABuscar, veces, (veces == 1 ? "vez" : "veces"));

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        String frase;

        System.out.print("Introduce una frase: ");
        frase = read.nextLine();

        sumario(frase);
    }
}
