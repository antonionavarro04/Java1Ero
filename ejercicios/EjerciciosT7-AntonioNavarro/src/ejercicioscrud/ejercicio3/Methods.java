package ejercicioscrud.ejercicio3;

import java.util.Arrays;

/**
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see funciones.PerArrays
 */
public class Methods {
    // ^ Definimos un array de Articulos de 0 posiciones
    public static Pizza pedidos[] = new Pizza[0];

    public static String printArray() {
        // ^ Definimos una variable de tipo String vacía
        String s = "";

        if (pedidos.length == 0) { // ? Si esta vacío haremos que imprima que no hay pedidos
            s = "NO HAY PEDIDOS";
        } else { // ? En caso contrario
            // ! Recorremos el array de pedidos
            for (int pos = 0; pos < pedidos.length; pos++) {
                if (!pedidos[pos].getCodigo().isEmpty()) { // ? Si el nombre del alumno no esta vacío
                    s += (pos + 1) + ". " + pedidos[pos].toString() + "\n"; // ! Añadimos el articulo al String junto a su posición + 1 y un salto de linea
                }
            }
        }
        
        return s;
    }

    public static boolean borrarArticulo(String codigo) {
        // ^ Definimos una variable de tipo boolean, si al final es false querra decir que no se realizo la operacion
        boolean state = false;

        // ! Recorremos el array de articulos
        for (int pos = 0; pos < pedidos.length; pos++) {
            if (pedidos[pos].getCodigo().equals(codigo)) { // ? Si el nombre del alumno es igual al nombre pasado por parámetro
                pedidos[pos].setEstado("SERVIDA");
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
    public static Pizza[] insertData(Pizza data) {
        pedidos = Arrays.copyOf(pedidos, pedidos.length + 1);
        pedidos[pedidos.length - 1] = data;
        return pedidos;
    }

    /**
     * Método para buscar la posición de un elemento de manera secuencial
     * @param array Array en el que buscar
     * @param numberToBeSearched Elemento a buscar
     * @return Posición del primer elemento con ese valor
     */
    public static int secuentialSearch(Pizza[] array, String dataToBeSearched) {
        int pos = 0;
        while (pos < array.length && !array[pos].getCodigo().equals(dataToBeSearched)) {
            pos++;
        } if (pos == array.length) {
            pos = -1;
        } return pos;
    }
}
