package ejerciciosutilarrays.ejercicio2;

// ? Importamos la clase Arrays
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array de (10 + 9 + 8... Posciciones)
        int arraySecuencial[] = new int[55];

        // ^ Definimos una variable indexMinimo e indexMaximo
        int indexMinimo = 0;
        int indexMaximo = 1;
        
        // ^ Definimos una variable veces la cual indicará cuantas veces se ha de sobrescribir el valor
        byte veces = 1;

        while (veces <= 10) {
            Arrays.fill(arraySecuencial, indexMinimo, indexMaximo, veces);

            veces++; // * Incrementamos las veces en 1

            indexMinimo = indexMaximo; // * Hacemos que nuestro mínimo sea nuestro máximo
            indexMaximo += veces; // * Sumamos las veces al máximo
        }
        
        // ! Imprimimos la tabla
        System.out.println(Arrays.toString(arraySecuencial));;
    }
}
