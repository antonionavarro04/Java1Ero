package ejercicios;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

import funciones.PerArrays;

public class Ejercicio12 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static boolean esAnagrama(String cadena1, String cadena2) {
        boolean state = true;

        char arrayCadena1[] = cadena1.toCharArray();
        char arrayCadena2[] = cadena2.toCharArray();

        for (int posCadena1 = 0; posCadena1 < arrayCadena1.length; posCadena1++) {
            boolean encontrado = false;
            for (int posCadena2 = 0; posCadena2 < arrayCadena2.length; posCadena2++) {
                if (arrayCadena1[posCadena1] == arrayCadena2[posCadena2]) {
                    PerArrays.deleteKnowingData(arrayCadena2, posCadena2);
                    encontrado = true;
                    break;
                }
            } if (!encontrado) {
                state = false;
                break;
            }
        } return state;
    }

    public static void main(String[] args) {
        String cadena1, cadena2;

        System.out.print("Introduce la primera frase/palabra: ");
        cadena1 = read.nextLine();

        System.out.print("Introduce la segunda frase/palabra: ");
        cadena2 = read.nextLine();

        System.out.printf("La frase/palabra %s y la frase/palabra %s %s anagramas", cadena1, cadena2, (esAnagrama(cadena1, cadena2) ? "son" : "no son"));
    }
}
