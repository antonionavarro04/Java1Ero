package ejercicios.ejercicio2;

/**
 * Clase que crea un Directivo, extiende la clase Empleado
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Empleado
 */
public class Directivo extends Empleado {
    /**
     * Constructor con parámetros
     * @param nombre Nombre del Directivo
     */
    public Directivo (String nombre) {
        super(nombre);
    }
    
    /**
     * Devuelve una String con la información del Directivo
     * @return Cadena creada y devuelta
     */
    @Override
    public String toString() {
        return super.toString() + " -> Directivo";
    }
}
