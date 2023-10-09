package ejerciciosbidimensionales.ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ^ Definimos un array de 4x5
        int array[][] = new int[4][5];

        // ! Rellenamos el array con número aleatorios entre 100 y 999
        Methods.fillArrayRandom(array, 999, 100);

        // ! Copiamos el array aumentando en 1 las filas y las columnas
        int arrayFinal[][] = new int[array.length + 1][array[0].length + 1];
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                arrayFinal[filas][columnas] = array[filas][columnas];
            }
        }

        // ! Hacemos un for para cada una de las filas del array
        int suma = 0, total = 0;
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                suma += array[filas][columnas];
                if (columnas == array[0].length - 1) {
                    arrayFinal[filas][columnas + 1] = suma;
                    total += suma;
                }
            } suma = 0; // * Reseteamos la suma
        } for (int columnas = 0; columnas < array[0].length; columnas++) {
            for (int filas = 0; filas < array.length; filas++) {
                suma += array[filas][columnas];
                if (filas == array.length - 1) {
                    arrayFinal[filas + 1][columnas] = suma;
                    total += suma;
                }
            } suma = 0; // * Reseteamos la suma
        } arrayFinal[arrayFinal.length - 1][arrayFinal[0].length - 1] = total; // * Insertamos el total en el último valor de la tabla

        // ? Mostramos el array final
        Methods.printArray(arrayFinal);
    }
} // € Hecho por Antonio Navarro
