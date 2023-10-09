package ejercicios.ejercicio2;

// ? Imports
import funciones.Mathematics;

/**
 * Clase Empleado, crea un empleado con su nombre, sueldo y edad
 * @author Antonio Navarro
 * @version 1.0 Release
 */
public class Empleado {
    /**
     * Nombre del empleado
     */
    private String nombre;

    /**
     * Constructor por Defecto
     */
    public Empleado () {
        this.nombre = "Undefined-" + Mathematics.rng(999, 111);
    }

    /**
     * Constructor con parámetros, crea el empleado con el nombre indicado
     * @param nombre Nombre del empleado
     */
    public Empleado (String nombre) {
        if (nombre.isBlank()) {
            nombre = "Undefined-" + Mathematics.rng(999, 100);
        } this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del Empleado
     * @return Devuelve el nombre del Empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Establece un nombre al empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la información del Empleado
     * @return Cadena creada y formada
     */
    @ Override
    public String toString() {
        return "Empleado: \"" + this.nombre + "\"";
    }
}
