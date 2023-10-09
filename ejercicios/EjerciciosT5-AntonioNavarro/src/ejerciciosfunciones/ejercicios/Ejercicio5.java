package ejerciciosfunciones.ejercicios;

import ejerciciosfunciones.newarrays.PerArrays;

public class Ejercicio5 {
    public static int[] sinRepetidos(int arrayOriginal[]) {
        int arrayFinal[] = new int[0];
        arrayFinal = PerArrays.insertData(arrayFinal, arrayOriginal[0]);

        for (int pos = 1; pos < arrayOriginal.length; pos++) {
            boolean encontrado = false;
            for (int value : arrayFinal) {
                if (value == arrayOriginal[pos]) {
                    encontrado = true;
                    break;
                }
            } if (!encontrado) {
                arrayFinal = PerArrays.insertData(arrayFinal, arrayOriginal[pos]);
            }
        }

        return arrayFinal;
    }
    public static void main(String[] args) {
        // ^ Definimos un array de 10 posiciones
        int array[] = new int[10];

        // ! Rellenamos el array con valores entre 1 y 3
        PerArrays.fillArrayRandom(array, 3, 1);

        // ! Guardamos los valores no repetidos en otro array
        int noRepetidos[] = sinRepetidos(array);

        // ? Mostramos el resultado
        System.out.print("Array Original: "); PerArrays.printArray(array);
        System.out.print("Array sin repetidos: "); PerArrays.printArray(noRepetidos);
    }
}
