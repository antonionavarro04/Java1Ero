package ejerciciosfunciones.ejercicios;

import ejerciciosfunciones.newarrays.Mathematics;
import ejerciciosfunciones.newarrays.PerArrays;

public class Ejercicio3 {
    public static int[] rellenaPares(int longitud, int fin) {
        int array[] = new int[longitud];
        int random;

        for (int pos = 0; pos < array.length; pos++) {
            do {
                random = Mathematics.rng(2, fin);
            } while (Mathematics.esImpar(random));
            array[pos] = random;
        }

        return array;
    }

    public static void main(String[] args) {
        // ! Llamamos al método para crear un array de pares con longitud 10 y número máximo 56
        int array[] = rellenaPares(10, 56);

        // ? Mostramos el resultado
        PerArrays.printArray(array);
    }
}
