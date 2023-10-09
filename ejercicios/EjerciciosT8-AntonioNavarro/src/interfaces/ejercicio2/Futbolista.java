package interfaces.ejercicio2;

/**
 * Clase que representa un Futbolista
 * @author Antonio Navarro
 * @version 1.0
 */
public class Futbolista implements Comparable {
    /**
     * Numero de la camista del Futbolista
     */
    private int numeroCamiseta;

    /**
     * Nombre del Futbolista
     */
    private String nombre;

    /**
     * Edad del Futbolista
     */
    private int edad;

    /**
     * Número de Goles Marcados
     */
    private int goles;

    /**
     * Constructor con Parámetros
     */
    public Futbolista(int numeroCamiseta, String nombre, int edad, int goles) {
        if (numeroCamiseta < 1) {
            this.numeroCamiseta = 1;
        } else if (numeroCamiseta > 99) {
            this.numeroCamiseta = 99;
        } else {
            this.numeroCamiseta = numeroCamiseta;
        }
        
        if (nombre.isEmpty()) {
            this.nombre = "Unknown";
        } else {
            this.nombre = nombre;
        }

        if (edad < 0) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }

        if (goles < 0) {
            this.goles = 0;
        } else {
            this.goles = goles;
        }
    }

    /**
     * Crea y forma una cadena con los atributos del Futbolista
     * @return Cadena formada con la información del Futbolista
     */
    @ Override
    public String toString() {
        return 
        "Numero de Camiseta: " + this.numeroCamiseta
        + ",\nNombre: \"" + this.nombre + "\""
        + ",\nEdad: " + this.edad
        + ",\nGoles: " + this.goles
        ;
    }

    /**
     * Compara un Futbolista con otro en base a su número de camiseta y nombre
     * @param o Futbolista a comparar
     * @return True en caso de que sean iguales, False en caso contrario
     */
    @ Override
    public boolean equals(Object o) {
        // ^ Definimos una variable resultado
        boolean state = false;

        // ! Pasamos el objeto a un Futbolista
        Futbolista f = (Futbolista) o;

        // ! Comparamos los datos
        if (this.numeroCamiseta == f.numeroCamiseta) {
            state = true;
        } if (!this.nombre.equals(f.nombre)) {
            state = false;
        } return state;
    }

    /**
     * Compara un objeto con otro en base a su camiseta, en caso que sean iguales comparara por nombre
     * @param o Objeto a comparar
     * @return Diferencia de datos, puede ser 0, < 0 o > 0
     */
    @ Override
    public int compareTo(Object o) {
        // ^ Definimos una variable resultado
        int state = 0;

        // ! Pasamos el objeto a un Futbolista
        Futbolista f = (Futbolista) o;

        // ! Comparamos los numeros, en caso que sean iguales pasaremos a comparar los nombres
        if (this.numeroCamiseta < f.numeroCamiseta) {
            state--;
        } else if (this.numeroCamiseta > f.numeroCamiseta) {
            state++;
        } else { // * Comparamos por nombre
            if (this.nombre.compareTo(f.nombre) < 0) {
                state--;
            } else if (this.nombre.compareTo(f.nombre) > 0) {
                state++;
            }
        } return state;
    }
}
