package ejerciciosbidimensionales.ejercicios;

public class Ejercicio4 {
    public static void printArray(int array[][]) { // * Modificado para este ejercicio
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                if (array[fila][columna] == 100) { // * Si el valor es 100 no lo imprimiremos
                    System.out.print(" ");
                } else {
                    System.out.print(array[fila][columna]);
                } System.out.print(" ");
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        // ^ Definimos un array entero de 3x6
        int num[][] = new int[3][6];

        // ! Rellenaremos todos los valores con 100
        Methods.fillArray(num, 100);

        // ! Manualmente rellenaremos las posiciones como se proponen en el enunciado
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        // ? Imprimimos el array
        printArray(num);
    }
} // € Hecho por Antonio Navarro
