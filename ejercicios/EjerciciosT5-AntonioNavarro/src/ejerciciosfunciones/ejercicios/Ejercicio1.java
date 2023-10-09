package ejerciciosfunciones.ejercicios;

import ejerciciosfunciones.newarrays.PerArrays;

public class Ejercicio1 {
    public static int sumaArray(int array[]) {
        // ^ Definimos una variable suma y la inicializamos con el primer valor del array
        int suma = array[0];

        // ! Recorremos el array sumando todos los valores en nuestra variable suma
        for (int pos = 1; pos < array.length; pos++) {
            suma += array[pos];
        }
        
        // ! Devolvemos el resultado
        return suma;
    }

    public static void main(String[] args) {
        // ^ Definimos un array de 10 posiciones
        int array[] = new int[10];

        // ! Rellenamos el array con valores aleatorios entre 0 y 5
        PerArrays.fillArrayRandom(array, 5);

        // ? Mostramos el array y la suma total
        PerArrays.printArray(array);
        System.out.printf("La suma de todos sus elementos es de: %s", sumaArray(array));
    }
}
