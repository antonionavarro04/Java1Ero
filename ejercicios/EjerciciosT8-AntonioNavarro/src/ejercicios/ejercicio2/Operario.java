package ejercicios.ejercicio2;

/**
 * Clase que hereda la clase Empleado, solo se le añade el cargo al toString()
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Empleado
 */
public class Operario extends Empleado {
    /** 
     * Constructor con parámetros, crea el empleado con el nombre indicado
     */
    public Operario(String nombre) {
        super(nombre);
    }

    @ Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
}
