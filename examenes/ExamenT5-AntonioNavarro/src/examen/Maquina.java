package examen;

import java.util.Arrays;

/**
 * Clase que contiene los diferentes métodos para el correcto funcionamiento de una maquina de golosinas
 * @author Antonio Navarro
 * @version Examen 1.0
 * @see Arrays
 */
public class Maquina {
    /**
     * Contiene los nombres de las golosinas
     */
    public static String[][] nombresGolosinas = {
        {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
        {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
        {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
        {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
    };

    /**
     * Contiene el precio de las golosinas
     */
    public static double[][] precio = {
        {1.1, 0.8, 1.5, 0.9},
        {1.8, 1, 1.2, 1},
        {1.8, 1.3, 1.2, 0.8},
        {1.5, 1.1, 1.1, 1.1}
    };

    /**
     * Contiene la cantidad de las golosinas, inicialmente todas tendrán 5
     */
    public static int[][] cantidad = new int[precio.length][precio[0].length];

    /**
     * Contendrá todas las golosinas que el usuario vaya adquiriendo
     */
    public static String[] ventas = new String[0];

    /**
     * Contendrá el precio total que el usuario debe pagar, irá aumentando conforme se le pidan golosinas a la maquina
     */
    public static double total = 0;

    /**
     * Rellena todos los valores del array cantidades
     * @param num Cantidad a la que rellenar cada posición del array
     */
    public static void rellenarMatriz(int num) {
        for (int filas = 0; filas < cantidad.length; filas++) {
            for (int columnas = 0; columnas < cantidad[0].length; columnas++) {
                cantidad[filas][columnas] = num;
            }
        }
    }

    /**
     * Muestra una lista que contiene la posición de las golosinas, su nombre y su precio
     */
    public static void mostrarGolosinas() {
        for (int filas = 0; filas < nombresGolosinas.length; filas++) {
            for (int columnas = 0; columnas < nombresGolosinas[0].length; columnas++) {
                System.out.printf("%s:%s -> %s | %s€\n", filas, columnas, nombresGolosinas[filas][columnas], precio[filas][columnas]);
            } System.out.println();
        }
    }

    /**
     * Valida la posición introducida, ya que esta posición debe de estar dentro del rango del array
     * @param fila Fila en la que se encuentra el producto
     * @param columna Columna en la que se encuentra el producto
     * @return Devuelve si la posición es válida o no
     */
    public static boolean validarPos(int fila, int columna) {
        boolean validez = true;

        if (fila < 0 || fila >= nombresGolosinas.length) {
            validez = false;
        } else if (columna < 0 || columna >= nombresGolosinas[0].length) {
            validez = false;
        } return validez;
    }

    /**
     * Comprueba que haya existencias del producto introducido
     * @param fila Fila en la que se encuentra el producto
     * @param columna Columna en la que se encuentra el producto
     * @return Devuelve si hay existencia o no
     */
    public static boolean hayValorPosicion(int fila, int columna) {
        boolean existencias = false;

        if (cantidad[fila][columna] > 0) {
            existencias = true;
        } return existencias;
    }

    /**
     * Aumenta la cantidad del producto indicado
     * @param fila Fila en la que se encuentra el producto
     * @param columna Columna en la que se encuentra el producto
     * @param cantidad Cantidad a añadir a las existencias actuales
     */
    public static void aumentarPosicion(int fila, int columna, int cantidad) {
        Maquina.cantidad[fila][columna] += cantidad;
    }

    /**
     * Reduce la cantidad del producto indicado
     * @param fila Fila en la que se encuentra el producto
     * @param columna Columna en la que se encuentra el producto
     * @param cantidad Cantidad a reducir las existencias actuales
     */
    public static void reducirPosicion(int fila, int columna, int cantidad) {
        Maquina.cantidad[fila][columna] -= cantidad;
    }

    /**
     * Añade el nombre del producto comprado en la lista que contiene todos los productos que se han comprado y suma el precio al total
     * @param fila Fila en la que se encuentra el producto
     * @param columna Columna en la que se encuentra el producto
     */
    public static void anyadirVenta(int fila, int columna) {
        ventas = Arrays.copyOf(ventas, ventas.length + 1);
        ventas[ventas.length - 1] = nombresGolosinas[fila][columna];
        total += precio[fila][columna];
    }

    /**
     * Imprime todos los productos que se han adquirido junto a el total a pagar
     */
    public static void imprimirVentasTotales() {
        System.out.println("Las golosinas compradas son:");
        for (int pos = 0; pos < ventas.length; pos++) {
            System.out.print(ventas[pos]);
            if (pos != ventas.length - 1) {
                System.out.print(", ");
            }
        } System.out.printf("\nEl total a pagar es de: %s€\n", total);
    }
}
