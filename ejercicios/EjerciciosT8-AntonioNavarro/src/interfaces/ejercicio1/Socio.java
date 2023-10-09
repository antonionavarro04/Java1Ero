package interfaces.ejercicio1;

/**
 * Clase que representa un Socio
 * @author Antonio Navarro
 * @version 1.0
 */
public class Socio implements Comparable {
    /**
     * Id del Socio
     */
    protected int id;

    /**
     * Nombre del Socio
     */
    protected String nombre;

    /**
     * Edad del Socio
     */
    protected int edad;

    /**
     * Constructor con parámetros
     */
    public Socio (int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Crea y forma una cadena con los atributos del Socio
     * @return Cadena formada con la información del socio
     */
    @ Override
    public String toString() {
        return
        "ID: " + this.id
        + ",\nNombre: \"" + this.nombre + "\""
        + ",\nEdad: " + this.edad
        ;
    }

    /**
     * Compara un objeto con otro en base a su ID
     * @param o Objeto a comparar
     * @return Diferencia de datos, puede ser 0, < 0 o > 0
     */
    @ Override
    public int compareTo(Object o) {
        // ^ Definimos una variable resultado
        int res = 0;

        // ^ Casteamos el objeto a Socio
        Socio s = (Socio) o;

        // ! ID's
        if (this.id < s.id) {
            res--;
        } else if (this.id > s.id) {
            res++;
        } return res;
    }
}
