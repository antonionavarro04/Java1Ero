package ejercicios.ejercicio2;

/**
 * Clase que crea un Tecnico, extiende la clase Operario
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Operario
 */
public class Tecnico extends Operario {
    /**
     * Constructor con parámetros
     * @param nombre Nombre del Tecnico
     */
    public Tecnico (String nombre) {
        super(nombre);
    }

    /**
     * Devuelve una cadena con la información del Tecnico
     * @return Cadena ya formada y creada
     */
    @ Override
    public String toString() {
        return super.toString() + " -> Técnico";
    }
}
