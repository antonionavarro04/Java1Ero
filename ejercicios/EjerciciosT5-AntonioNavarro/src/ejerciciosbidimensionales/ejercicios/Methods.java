package ejerciciosbidimensionales.ejercicios;

// ? Importamos la Clase
import java.util.Arrays;

public class Methods {
    // ! Print
    // = 1d
    public static void printArray(int[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                System.out.print(array[pos]);
                if (pos != array.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.print("]"); System.out.println();
    }

    // = 2d
    public static void printArray(String array[][]) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                System.out.print(array[fila][columna] + " ");
            } System.out.println();
        }
    } public static void printArray(int array[][]) {
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                System.out.print(array[fila][columna] + " ");
            } System.out.println();
        }
    }

    // = 3d
    public static void printArray(int array[][][]) {
        for (int profundidad = 0; profundidad < array.length; profundidad++) {
            System.out.printf("Capa %s:\n", profundidad);
            for (int fila = 0; fila < array[0].length; fila++) {
                for (int columna = 0; columna < array[0][0].length; columna++) {
                    System.out.print(array[profundidad][fila][columna] + " ");
                }
                System.out.println();
            } System.out.println();
        }
    }

    // = 4d
    public static void printArray(int array[][][][]) {
        for (int momento = 0; momento < array.length; momento++) {
            System.out.printf("Momento %s:\n", momento);
            for (int profundidad = 0; profundidad < array[0].length; profundidad++) {
                System.out.printf("Capa %s:\n", profundidad);
                for (int fila = 0; fila < array[0][0].length; fila++) {
                    for (int columnas = 0; columnas < array[0][0][0].length; columnas++) {
                        System.out.print(array[momento][profundidad][fila][columnas] + " ");
                    }
                    System.out.println();
                } System.out.println();
            } System.out.println();
        } System.out.println();
    }

    // ! Fill
    public static int[][] fillArray(int array[][], int number) { // * número fijo
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = number;
            }
        } return array;
    } public static int[][] fillArray(int array[][], int number, int incremento) { // * número fijo
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = number;
                number += incremento;
            }
        } return array;
    } public static int[][] fillArrayRandom(int array[][]) { // * 0 o 1
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = (int) (Math.random() + 0.5d);
            }
        } return array;
    } public static int[][] fillArrayRandom(int array[][], int max) { // * 0 a max
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = (int) (Math.random() * max + 0.5d);
            }
        } return array;
    } public static int[][] fillArrayRandom(int array[][], int max, int min) { // * min a max
        for (int fila = 0; fila < array.length; fila++) {
            for (int columna = 0; columna < array[0].length; columna++) {
                array[fila][columna] = (int) (Math.random() * (max - min) + min + 0.5d);
            }
        } return array;
    }

    // ! Coordenadas
    public static int[] coordenadasMaximo(int array[][]) {
        int numeroMaximo = array[0][0];
        int[] posicionesMaximo = new int[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximo[0] = filas;
                    posicionesMaximo[1] = columnas;
                }
            }
        } return posicionesMaximo;
    } public static int[] coordenadasMinimo(int array[][]) {
        int numeroMinimo = array[0][0];
        int[] posicionesMinimo = new int[2];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMinimo[0] = filas;
                    posicionesMinimo[1] = columnas;
                }
            }
        } return posicionesMinimo;
    } public static int[] coordenadasMaximoYMinimo(int array[][]) { // * Devuelve las coordenadas a la vez por lo que habrá que descomprimirlo en cada array correspondiente, siendo [0] u [1] el máximo y [2] o [3] el mínimo
        int numeroMaximo = array[0][0];
        int numeroMinimo = array[0][0];
        int[] posicionesMaximoYMinimo = new int[4];

        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] > numeroMaximo) {
                    numeroMaximo = array[filas][columnas];
                    posicionesMaximoYMinimo[0] = filas;
                    posicionesMaximoYMinimo[1] = columnas;
                } if (array[filas][columnas] < numeroMinimo) {
                    numeroMinimo = array[filas][columnas];
                    posicionesMaximoYMinimo[2] = filas;
                    posicionesMaximoYMinimo[3] = columnas;
                }
            }
        } return posicionesMaximoYMinimo;
    } public static void printCords(int[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.print("EMPTY");
        } else {
            for (int pos = 0; pos < array.length; pos++) {
                if (pos == 0) {
                    System.out.print("y = ");
                } else {
                    System.out.print("x = ");
                } System.out.print(array[pos]);
                if (pos != array.length - 1) {
                    System.out.print(", ");
                }
            }
        } System.out.print("]"); System.out.println();
    }

    // ! Transponer Arrays
    public static int[][] transponerArrayMatrizAuxiliar(int[][] arrayOriginal) { // * Necesita de una matriz auxiliar
        int arrayFinal[][] = new int[arrayOriginal.length][arrayOriginal[0].length];
        for (int filas = 0; filas < arrayOriginal.length; filas++) {
            for (int columnas = 0; columnas < arrayOriginal[0].length; columnas++) {
                arrayFinal[columnas][filas] = arrayOriginal[filas][columnas];
            }
        } return arrayFinal;
    } public static int[][] transponerArrayArrayAuxiliar(int[][] array) { // * No necesita de una matriz auxiliar, solo se necesita un array auxiliar
        int numeros[] = new int[array[0].length - 1];
        int copiarEnFila = 0;
        for (int filas = 0; filas < array.length; filas++) {
            int posNumeros = 0;
            for (int columnas = filas; columnas < array[0].length; columnas++) {
                if (columnas != filas) {
                    numeros[posNumeros] = array[columnas][filas]; posNumeros++;
                    array[columnas][filas] = array[filas][columnas];
                }
            } posNumeros = 0;
            for (int columnas = numeros.length * -1 + array[0].length; columnas < array[0].length; columnas++) {
                array[copiarEnFila][columnas] = numeros[posNumeros]; posNumeros++;
            } copiarEnFila++;
            if (numeros.length != 0) {
                numeros = Arrays.copyOf(numeros, numeros.length - 1);
            }
        } return array;
    }

    public static int[][] transponerArray(int array[][]) { // * Solo necesita una variable auxiliar
        int aux;
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = filas; columnas < array[0].length; columnas++) {
                if (columnas != filas) {
                    aux = array[columnas][filas];
                    array[columnas][filas] = array [filas][columnas];
                    array[filas][columnas] = aux;
                }
            }
        } return array;
    }

    // ! Comprobar si es simétrica
    public static boolean simmetrical(int[][] array) {
        boolean simmetric = true;
        for (int filas = 0; filas < array.length; filas++) {
            for (int columnas = 0; columnas < array[0].length; columnas++) {
                if (array[filas][columnas] != array[columnas][filas]) {
                    simmetric = false;
                    break;
                }
            } if (!simmetric) {
                break;
            }
        } return simmetric;
    }

    // ! Bubble Sort
    public static int[] sortBubble(int[] array, boolean inverse, boolean visual) { // * Mi implementación del Bubble Sort, solo estaba probando
        int aux;
        for (int pos = 0; pos < array.length; pos++) {
            for (int posActual = 0; posActual < array.length - 1; posActual++) {
                if (inverse) {
                    if (array[posActual] < array[posActual + 1]) {
                        aux = array[posActual];
                        array[posActual] = array[posActual + 1];
                        array[posActual + 1] = aux;
                    }
                } else {
                    if (array[posActual] > array[posActual + 1]) {
                        aux = array[posActual];
                        array[posActual] = array[posActual + 1];
                        array[posActual + 1] = aux;
                    }
                } if (visual) {
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    printArray(array);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.err.printf("Error: %s\n", e);
                    }
                }
            }
        } return array;
    }
} // € Hecho por Antonio Navarro
