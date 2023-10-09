package ejercicioscrud.ejercicio4;

import java.util.Arrays;

/**
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see funciones.PerArrays
 */
public class Methods {
    // ^ Definimos un array de Articulos de 0 posiciones
    public static CuentaCorriente cuentas[] = new CuentaCorriente[0];

    public static String printArray() {
        // ^ Definimos una variable de tipo String vacía
        String s = "";

        if (cuentas.length == 0) { // ? Si esta vacío haremos que imprima que no hay cuentas
            s = "NO HAY CUENTAS REGISTRADAS";
        } else { // ? En caso contrario
            // ! Recorremos el array de pedidos
            for (int pos = 0; pos < cuentas.length; pos++) {
                if (!cuentas[pos].getDni().isEmpty()) { // ? Si el dni de la cuenta no está vacío lo agregamos
                    s += (pos + 1) + ". " + cuentas[pos].toString() + "\n"; // ! Añadimos la cuenta al String junto a su posición + 1 y un salto de linea
                }
            }
        }
        
        return s;
    }

    public static boolean borrarCuenta(String codigo) {
        // ^ Definimos una variable de tipo boolean, si al final es false querra decir que no se realizo la operacion
        boolean state = false;

        // ! Recorremos el array de articulos
        for (int pos = 0; pos < cuentas.length; pos++) {
            if (cuentas[pos].getDni().equals(codigo)) {
                cuentas = deleteKnowingData(pos);
                state = true;
                break;
            }
        } return state;
    }

    public static void modificarCuenta(int posicion, CuentaCorriente cc) {
        cuentas[posicion] = cc;
    }

    public static void ingresarDinero(int pos, float cantidad) {
        cuentas[pos].ingresarDinero(cantidad);
    }

    public static int comprobarDni() {
        int pos = 0;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i].getDni().startsWith("ERROR-")) {
                pos++;
            }
        } return pos;
    }

    /**
     * Método para eliminar un dato en base a la posición que borrar
     * @param cuentas Array original en el que borrar el elemento, puede o no estar ordenado
     * @param position Posicion a borrar
     * @return Array con la posición eliminada
     */
    private static CuentaCorriente[] deleteKnowingData(int position) { // ? Can be ordered
        CuentaCorriente newArray[] = cuentas;
        int spotsToCopy = cuentas.length - position - 1;
        System.arraycopy(cuentas, position + 1, newArray, position, spotsToCopy);
        newArray = Arrays.copyOf(newArray, newArray.length - 1);
        return newArray;
    }

    /**
     * Método utilizado para insertar datos al final de un array
     * @param array Array en el que introducir el dato
     * @param data Dato a introducir
     * @return Array con el dato ya insertado
     */
    public static CuentaCorriente[] insertData(CuentaCorriente data) {
        cuentas = Arrays.copyOf(cuentas, cuentas.length + 1);
        cuentas[cuentas.length - 1] = data;
        return cuentas;
    }

    /**
     * Método para buscar la posición de un elemento de manera secuencial
     * @param array Array en el que buscar
     * @param numberToBeSearched Elemento a buscar
     * @return Posición del primer elemento con ese valor
     */
    public static int secuentialSearch(String dataToBeSearched) {
        int pos = 0;
        while (pos < cuentas.length && !cuentas[pos].getDni().equals(dataToBeSearched)) {
            pos++;
        } if (pos == cuentas.length) {
            pos = -1;
        } return pos;
    }
}
