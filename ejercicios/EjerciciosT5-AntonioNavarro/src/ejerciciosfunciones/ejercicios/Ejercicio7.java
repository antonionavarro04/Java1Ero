package ejerciciosfunciones.ejercicios;

import ejerciciosfunciones.newarrays.PerArrays;

public class Ejercicio7 {
    private static final int VALOR_A_BUSCAR = 3;

    public static int[] buscarTodos(int array[], int valor) {
        int index[] = new int[0];

        for (int pos = 0; pos < array.length; pos++) {
            if (array[pos] == valor) {
                index = PerArrays.insertData(index, pos);
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int array[] = new int[20];

        PerArrays.fillArrayRandom(array, 1, 10);

        int indexes[] = buscarTodos(array, VALOR_A_BUSCAR);

        PerArrays.printArray(array);
        System.out.printf("El número %s se encuentra en las posiciones: ", VALOR_A_BUSCAR); PerArrays.printArray(indexes);
    }
}
