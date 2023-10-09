package ejercicios.ejercicio2;

/**
 * Clase que crea un Oficial, extiende la clase Operario
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Operario
 */
public class Oficial extends Operario {
    /**
     * Constructor con parámetros
     * @param nombre Nombre del Oficial
     */
    public Oficial (String nombre) {
        super(nombre);
    }

    /**
     * Devuelve una cadena con la información del Oficial
     * @return Cadena ya formada y creada
     */
    @ Override
    public String toString() {
        return super.toString() + " -> Oficial";
    }
}
