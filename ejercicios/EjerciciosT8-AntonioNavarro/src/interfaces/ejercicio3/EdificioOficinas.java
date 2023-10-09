package interfaces.ejercicio3;

// ? Imports
import interfaces.ejercicio3.interfaces.Edificio;

/**
 * Clase que crea un edificio de oficinas, implementa la interfaz Edificio
 * @author Antonio Navarro
 * @version 1.0
 * @see Edificio
 */
public class EdificioOficinas implements Edificio {
    /**
     * Superficie del edificio
     */
    private double superficie;

    /**
     * Numero de oficinas del edificio
     */
    private int numeroOficinas;

    /**
     * Constructor con parámetros
     */
    public EdificioOficinas (double superficie, int numeroOficinas) {
        this.superficie = superficie;
        this.numeroOficinas = numeroOficinas;
    }

    /**
     * Devuelve la superficie que tiene el edificio
     */
    @ Override
    public double getSuperficieEdificio() {
        return this.superficie;
    }

    /**
     * Devuelve el numero de oficinas del edificio
     */
    public int getNumeroOficinas() {
        return this.numeroOficinas;
    }

    /**
     * Crea y forma una cadena con los atributos del edificio de oficinas
     * @return Cadena formada con la información del edificio de oficinas
     */
    @ Override
    public String toString() {
        return
        "Superficie: " + this.getSuperficieEdificio()
        + ",\nNúmero de Oficinas: " + this.numeroOficinas
        ;
    }
}
