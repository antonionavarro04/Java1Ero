package ejerciciosbidimensionales.ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ^ Definimos un array de 5x5 posiciones
        int array[][] = new int[5][5];

        // ! Rellenamos el array con la formula array[n][m] = 10 * n + m
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = 10 * fila + columna;
            }
        }

        // ? Mostramos el contenido del array
        Methods.printArray(array);
    }
} // € Hecho por Antonio Navarro