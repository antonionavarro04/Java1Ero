package ejerciciosfunciones.ejercicios;

import java.util.Arrays;

import ejerciciosfunciones.newarrays.PerArrays;

public class Ejercicio6 {
    public static int[] eliminarMayores(int arrayOriginal[], int baremo) {
        int newArray[] = Arrays.copyOf(arrayOriginal, arrayOriginal.length);

        for (int pos = 0; pos < newArray.length; pos++) {
            if (newArray[pos] > baremo) {
                newArray = PerArrays.deleteKnowingData(newArray, pos);
                pos--;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        // ^ Definimos un array de 20 posiciones
        int array[] = new int[20];

        // ! Rellenamos el array con valores aleatorios del 1 al 10
        PerArrays.fillArrayRandom(array, 10, 1);

        // ! Llamamos al método para buscar y eliminar los números mayores a 5
        int noMayores[] = eliminarMayores(array, 5);

        // ? Mostramos los 2 arrays
        System.out.print("Array Original: "); PerArrays.printArray(array);
        System.out.printf("Array sin mayores a %s: ", 5); PerArrays.printArray(noMayores);
    }
}
