package interfaces.ejercicio2;

// ? Imports
import java.util.Arrays;

import funciones.Mathematics;
import funciones.PerArrays;

public class Main {
    // ? Se basa en el Bubble Sort
    private static Futbolista[] sortArray(Futbolista[] a) {
        // ^ Hacemos una copia del array
        Futbolista[] b = Arrays.copyOf(a, a.length);

        // ? Ordenamos b
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                if (b[j].compareTo(b[j + 1]) > 0) {
                    Futbolista aux = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = aux;
                }
            }
        } return b;
    }

    public static void main(String[] args) {
        // ^ Definimos un array con 5 futbolistas predefinidos
        Futbolista futbolistas[] = {
            new Futbolista(Mathematics.rng(1, 99), "Abdul", Mathematics.rng(99), Mathematics.rng(Integer.MAX_VALUE)),
            new Futbolista(Mathematics.rng(1, 99), "Mario", Mathematics.rng(99), Mathematics.rng(Integer.MAX_VALUE)),
            new Futbolista(Mathematics.rng(1, 99), "Mohamed", Mathematics.rng(99), Mathematics.rng(Integer.MAX_VALUE)),
            new Futbolista(50, "Maximo", Mathematics.rng(99), Mathematics.rng(Integer.MAX_VALUE)),
            new Futbolista(50, "Juan", Mathematics.rng(99), Mathematics.rng(Integer.MAX_VALUE)),
        };

        // ? Imprimimos el contenido del Array
        System.out.println(PerArrays.printArray(futbolistas));

        // ! Ordenamos el Contenido del Array usando el metodo compareTo() de la clase Futbolista
        futbolistas = sortArray(futbolistas);

        // ? Imprimimos el contenido del Array
        System.out.println("\n---------------------\n\n" + PerArrays.printArray(futbolistas));
    }
}
