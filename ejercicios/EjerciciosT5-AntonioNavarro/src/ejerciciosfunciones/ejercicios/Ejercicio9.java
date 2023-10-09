package ejerciciosfunciones.ejercicios;

import ejerciciosfunciones.newarrays.PerArrays;

public class Ejercicio9 {
    public static boolean esMagica(int array[][]) {
        boolean esMagica = true;
        int resultado = 0;
        int sumaFilas = 0, sumaColumnas = 0;

        // ! Primero Sacamos el Número Mágico recorriendo la primera fila
        for (int columna = 0; columna < array[0].length; columna++) {
            resultado += array[0][columna];
        }

        for (int fila = 1; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                sumaFilas += array[fila][columna];
            } if (sumaFilas != resultado) {
                esMagica = false;
                break;
            } sumaFilas = 0;
        }

        if (esMagica) {
            for (int columna = 0; columna < array.length; columna++) {
                for (int fila = 0; fila < array[0].length; fila++) {
                    sumaColumnas += array[fila][columna];
                } if (sumaColumnas != resultado) {
                    esMagica = false;
                    break;
                } sumaColumnas = 0;
            }
        }

        return esMagica;
    }

    public static void main(String[] args) {
        int magicMatrix[][] = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8},
        };

        int matrix[][] = new int [3][3]; PerArrays.fillArrayRandom(matrix, 9, 1);

        PerArrays.printArray(magicMatrix);
        System.out.printf("Esta matriz es '%s'\n", (esMagica(magicMatrix) ? "Mágica" : "Normal"));
        
        // ? Salto de Línea Triple
        System.out.println("\n------------------------------\n");
        
        PerArrays.printArray(matrix);
        System.out.printf("Esta matriz es '%s'", (esMagica(matrix) ? "Mágica" : "Normal"));
    }
}
