package ejerciciosutilarrays.ejercicio4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array entero de tamaño 30
        int numerosAleatorios[] = new int[30];

        // ! Rellenamos el Array con valores aleatorios entre 0 y 9
        for (byte pos = 0; pos < numerosAleatorios.length; pos++) {
            numerosAleatorios[pos] = (int) (Math.random() * 10);
        }

        // ! Ordenamos el Array
        Arrays.sort(numerosAleatorios);

        // ! Mostramos el Array
        System.out.println(Arrays.toString(numerosAleatorios));;
    }
}
