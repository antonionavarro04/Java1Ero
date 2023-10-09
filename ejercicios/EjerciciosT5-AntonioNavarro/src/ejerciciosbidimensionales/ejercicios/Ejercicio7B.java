package ejerciciosbidimensionales.ejercicios;

public class Ejercicio7B {
    public static void main(String[] args) {
        // ^ Definimos un array de 4x4
        int array[][] = new int[4][4];

        // ! Rellenamos el array con números del 1 al 16
        Methods.fillArray(array, 1, 1);

        // ! Llamamos al método creado para tranponer números, la idea es copiar así: final[j][i] = principal[i][j], pero guardando numeros en un array unidimensional
        Methods.transponerArray(array);

        // ? Mostramos el array transpuesto
        Methods.printArray(array);
    } // € Sin Array ni Matriz Auxiliar
} // € Hecho por Antonio Navarro
