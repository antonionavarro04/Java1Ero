package examen;

/**
 * Empleado de Tipo Fijo, extiende la clase Empleado
 * @author Antonio Navarro
 * @version 1.0
 * @see Empleado
 */
public class Fijo extends Empleado {
    /**
     * Sueldo del Empleado de tipo Fijo
     */
    private double sueldo;

    /**
     * Constructor con los parámetros nombre y apellidos
     * @param nombre Nombre del Empleado
     * @param apellido Apellido del Empleado
     */
    public Fijo (String nombre, String apellido) {
        super(nombre, apellido);
    }

    /**
     * Constructor con todos los parámetros
     * @param nombre Nombre del Empleado
     * @param apellido Apellido del Empleado
     * @param sexo Sexo del Empleado
     * @param sueldo Sueldo del Empleado
     */
    public Fijo (String nombre, String apellido, String sexo, double sueldo) {
        super(nombre, apellido, sexo);
        if (sueldo < 0.0d) {
            sueldo = 0.0d;
        } this.sueldo = sueldo;
    }

    /**
     * Devuelve el sueldo del empleado
     * @return sueldo del Empleado
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Establece un nuevo salario para el empleado
     * @param sueldo Nuevo salario para el empleado
     */
    public void setSueldo(double sueldo) {
        if (sueldo < 0.0d) {
            sueldo = 0.0d;
        } this.sueldo = sueldo;
    }

    /**
     * Calcula el salario del Empleado
     * @return Salario del Empleado
     */
    @ Override
    public double calculaSalario() {
        return this.sueldo;
    }

    /**
     * Construye y devuelve una cadena con la información del empleado
     * @return Cadena con la información
     */
    @ Override
    public String toString() {
        return
        super.toString()
        + ",\nSueldo: " + sueldo
        ;
    }
}
