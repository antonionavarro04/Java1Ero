package ejercicioscrud.ejercicio2;

import java.util.Arrays;

/**
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see funciones.PerArrays
 */
public class Methods {
    // ^ Definimos un array de Articulos de 0 posiciones
    public static Articulo articulos[] = new Articulo[0];

    public static String printArray() {
        // ^ Definimos una variable de tipo String vacía
        String s = "";

        if (articulos.length == 0) { // ? Si esta vacío haremos que imprima que no hay artículos
            s = "NO HAY ARTÍCULOS DISPONIBLES";
        } else { // ? En caso contrario
            // ! Recorremos el array de articulos
            for (int pos = 0; pos < articulos.length; pos++) {
                if (!articulos[pos].getCodigo().isEmpty()) { // ? Si el nombre del alumno no esta vacío
                    s += (pos + 1) + ". " + articulos[pos].toString() + "\n"; // ! Añadimos el articulo al String junto a su posición + 1 y un salto de linea
                }
            }
        }
        
        return s;
    }

    public static boolean borrarArticulo(String codigo) {
        // ^ Definimos una variable de tipo boolean, si al final es false querra decir que no se realizo la operacion
        boolean state = false;

        // ! Recorremos el array de articulos
        for (int pos = 0; pos < articulos.length; pos++) {
            if (articulos[pos].getCodigo().equals(codigo)) { // ? Si el nombre del alumno es igual al nombre pasado por parámetro
                articulos = deleteKnowingData(articulos, pos);
                state = true;
                break;
            }
        } return state;
    }

    /**
     * Método utilizado para insertar datos al final de un array
     * @param array Array en el que introducir el dato
     * @param data Dato a introducir
     * @return Array con el dato ya insertado
     */
    public static Articulo[] insertData(Articulo data) {
        articulos = Arrays.copyOf(articulos, articulos.length + 1);
        articulos[articulos.length - 1] = data;
        return articulos;
    }

    /**
     * Método para buscar la posición de un elemento de manera secuencial
     * @param array Array en el que buscar
     * @param numberToBeSearched Elemento a buscar
     * @return Posición del primer elemento con ese valor
     */
    public static int secuentialSearch(Articulo[] array, String dataToBeSearched) {
        int pos = 0;
        while (pos < array.length && !array[pos].getCodigo().equals(dataToBeSearched)) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    }

    /**
     * Método para eliminar un dato en base ala posición que borrar
     * @param originalArray Array original en el que borrar el elemento, puede o no estar ordenado
     * @param position Posicion a borrar
     * @return Array con la posición eliminada
     */
    private static Articulo[] deleteKnowingData(Articulo originalArray[], int position) { // ? Can be ordered
        Articulo newArray[] = originalArray;
        int spotsToCopy = originalArray.length - position - 1;
        System.arraycopy(originalArray, position + 1, newArray, position, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }
}
