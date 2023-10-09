package ejerciciosbidimensionales.ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        // ^ Definimos un array de 10x10 posiciones
        int array[][] = new int[10][10];

        // ! Rellenamos el array teniendo en cuenta que cada fila contendra una tabla de multiplicar, desde la del 1 al 10
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = (fila + 1) * (columna + 1);
            }
        }

        // ? Imprimimos el Array
        Methods.printArray(array);
    }
} // € Hecho por Antonio Navarro
