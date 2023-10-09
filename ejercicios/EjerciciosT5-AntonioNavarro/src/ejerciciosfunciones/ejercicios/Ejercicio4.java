package ejerciciosfunciones.ejercicios;

public class Ejercicio4 {
    public static int secuentialSearch(int[] array, int numberToBeSearched) {
        int pos = 0;
        while (pos < array.length && numberToBeSearched != array[pos]) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    }
}
