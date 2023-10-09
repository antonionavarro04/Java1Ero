package ejercicios;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

import funciones.Mathematics;

public class Ejercicio7 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static boolean palindroma(String palabraOriginal) {
        boolean state = false;
        boolean impar = Mathematics.esImpar(palabraOriginal.length());

        String izquierda = "", derecha = "";

        for (int pos = 0; pos < palabraOriginal.length() / 2; pos++) {
            izquierda += palabraOriginal.charAt(pos);
        } if (impar) {
            for (int pos = palabraOriginal.length() - 1; pos > palabraOriginal.length() / 2; pos--) {
                derecha += palabraOriginal.charAt(pos);
            }   
        } else {
            for (int pos = palabraOriginal.length() - 1; pos >= palabraOriginal.length() / 2; pos--) {
                derecha += palabraOriginal.charAt(pos);
            } 
        } if (izquierda.equals(derecha)) {
            state = true;
        } return state;
    }

    public static void main(String[] args) {
        String palabra;

        System.out.print("Introduce una palabra: ");
        palabra = read.nextLine();

        System.out.printf("la palabra %s %s palíndroma", palabra, palindroma(palabra) ? "es" : "no es");
    }
}
