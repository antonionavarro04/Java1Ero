package ejerciciosfunciones.ejercicios;

import ejerciciosfunciones.newarrays.PerArrays;

public class Ejercicio8 {
    public static int[] suma(int array[], int elementos) {
        int newArray[] = new int[0];

        for (int pos = elementos - 1; pos < array.length; pos++) {
            int suma = 0;

            for (int sumas = pos; sumas >= (pos - elementos + 1); sumas--) {
                suma += array[sumas];
            }
            
            newArray = PerArrays.insertData(newArray, suma);
        }

        return newArray;
    }

    public static void main(String[] args) {
        int array[] = {10, 1, 5, 8, 9, 2};

        int newArray[] = suma(array, 3);

        PerArrays.printArray(newArray);
    }
}
