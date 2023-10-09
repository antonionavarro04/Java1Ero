package interfaces.ejercicio3;

// ? Imports
import interfaces.ejercicio3.interfaces.Edificio;
import interfaces.ejercicio3.interfaces.InstalacionDeportiva;

/**
 * Clase que crea un Polideportivo, implementa las interfaces Edificio e Instalación Deportiva
 */
public class Polideportivo implements Edificio, InstalacionDeportiva {
    /**
     * Nombre del Polideportivo
     */
    private String nombre;

    /**
     * Superficie del Polideportivo
     */
    private double superficie;

    /**
     * Tipo del polideportivo
     */
    private int tipo;

    /**
     * Constructor con Parámetros
     */
    public Polideportivo (String nombre, double superficie, int tipo) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.tipo = tipo;
    }

    /**
     * Devuelve la superficie que tiene el polideportivo
     */
    @ Override
    public double getSuperficieEdificio() {
        return this.superficie;
    }

    /**
     * Devuelve el tipo de polideportivo
     */
    @ Override
    public int getTipoInstalacion() {
        return this.tipo;
    }

    /**
     * Crea y forma una cadena con los atributos del polideportivo
     * @return Cadena formada con la información del polideportivo
     */
    @ Override
    public String toString() {
        return
        "Nombre: \"" + this.nombre + "\""
        + ",\nSuperficie: " + this.getSuperficieEdificio()
        + ",\nTipo: " + this.getTipoInstalacion()
        ;
    }
}
