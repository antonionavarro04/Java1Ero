package ejercicios.ejercicio5;

import funciones.PerArrays;

/**
 * Clase que contiene la parte controlador del programa
 * <b>IMPORTANTE: Hace uso de las librerias de funciones</b>
 * @author Antonio Navarro
 * @version 1.0
 * @see PerArrays
 */
public class Methods {
    /**
     * Array que contiene polígonos, su tipo es público
     */
    public static Poligono poligonos[] = new Poligono[0];

    /**
     * Crea y forma una String con toda la información del Menú
     * @return String con el menú
     */
    public static String menu() {
        return
        "Creador de Polígonos:"
        + "\n1. Introducir triángulo."
        + "\n2. Introducir rectángulo."
        + "\n3. Mostrar contenido del array."
        + "\n" + Main.SALIR + ". Salir."
        + "\n>>> "
        ;
    }

    /**
     * Crea una nueva posición en el array e inserta un Triángulo en la última posición
     * @param lado1 longitud lado1
     * @param lado2 longitud lado2
     * @param lado3 longitud lado3
     */
    public static void insert(double lado1, double lado2, double lado3) {
        poligonos = (Poligono[]) PerArrays.insertData(poligonos, new Triangulo(lado1, lado2, lado3));
    }

    /**
     * Crea una nueva posición en el array e inserta un Rectángulo en la última posición
     * @param lado1 longitud lado1
     * @param lado2 longitud lado2
     */
    public static void insert(double lado1, double lado2) {
        poligonos = (Poligono[]) PerArrays.insertData(poligonos, new Rectangulo(lado1, lado2));
    }

    /**
     * Crea y forma una String con la información de todos los polígonos dentro del Array
     * @return String con la información
     */
    public static String print() {
        String s = "";
        final int LAST = poligonos.length - 1;

        for (int pos = 0; pos < poligonos.length; pos++) {
            s += pos + 1 + ":\n";
            s += poligonos[pos].toString() + "\n";

            if (pos != LAST) {
                s += "\n\n";
            }
        } return s;
    }
}
