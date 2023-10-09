package ejerciciosfunciones.ejercicios;

import ejerciciosfunciones.newarrays.PerArrays;

public class Ejercicio2 {
    public static int maximoArray(int array[]) {
        // ^ Definimos la variable maximo con el primer valor del array
        int maximo = array[0];

        // ! Recorremos el array en busca del número máximo
        for (int pos = 1; pos < array.length; pos++) {
            if (array[pos] > maximo) {
                maximo = array[pos];
            }
        }

        // ! Devolvemos el número máximo
        return maximo;
    }

    public static void main(String[] args) {
        // ^ Definimos un array de 10 posiciones
        int array[] = new int[10];

        // ! Rellenamos el array con valores aleatorios entre 0 y 1000
        PerArrays.fillArrayRandom(array, 1000);

        // ? Mostramos el array y el resultado
        PerArrays.printArray(array);
        System.out.printf("El valor máximo es: %s", maximoArray(array));
    }
}
