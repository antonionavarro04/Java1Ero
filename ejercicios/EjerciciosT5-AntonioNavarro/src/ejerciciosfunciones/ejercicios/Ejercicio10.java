package ejerciciosfunciones.ejercicios;

import ejerciciosfunciones.newarrays.PerArrays;

public class Ejercicio10 {
    public static int[][] rotatePositive(int array[][]) {
        int newArray[][] = new int [array.length][array[0].length];
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                newArray[columna][array.length - fila - 1] = array[fila][columna];
            }
        } return newArray;
    }

    public static void main(String[] args) {
        int array[][] = new int[4][4];

        PerArrays.fillArray(array, 1, 1);

        System.out.print(Colors.RED);
        System.out.println("Array antes de Girar:");
        PerArrays.printArray(array);

        System.out.println(Colors.BLUE);
        System.out.println("Array después de Girar:");
        PerArrays.printArray(rotatePositive(array));
    }
}
