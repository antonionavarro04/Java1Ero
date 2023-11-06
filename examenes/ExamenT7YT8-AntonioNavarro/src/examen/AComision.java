package examen;

/**
 * Crea un Empleado a Comision, extiende de Empleado
 * @author Antonio Navarro
 * @version 1.0
 * @see Empleado
 */
public class AComision extends Empleado {
    /**
     * Volumen de ventas del Empleado
     */
    private double ventas;

    /**
     * Comisión que se queda el Empleado
     */
    private double comision;

    /**
     * Constructor con los parámetros nombre y apellidos
     * @param nombre Nombre del Empleado
     * @param apellido Apellido del Empleado
     */
    public AComision (String nombre, String apellido) {
        super(nombre, apellido);
    }

    /**
     * Constructor con todos los parámetros
     * @param nombre Nombre del Empleado
     * @param apellido Apellido del Empleado
     * @param sexo Sexo del Empleado
     * @param ventas del Empleado
     * @param Comisión del Empleado
     */
    public AComision (String nombre, String apellido, String sexo, double ventas, double comision) {
        super(nombre, apellido, sexo);
        
        if (ventas < 0.0d) {
            ventas = 0.0d;
        } this.ventas = ventas;

        if (comision < 0.0d) {
            comision = 0.0d;
        } comision /= 100.0d; // * Se pasa en porcentaje 0-100% pero se trabaja en numerico 0.0-1.0
        this.comision = comision;
    }

    /**
     * Devuelve las ventas del Empleado
     * @return ventas del empleado
     */
    public double getVentas() {
        return ventas;
    }

    /**
     * Establece un nuevo valor a las ventas del Empleado
     * @param ventas nuevo valor para ventas
     */
    public void setVentas(double ventas) {
        if (ventas < 0.0d) {
            ventas = 0.0d;
        } this.ventas = ventas;
    }

    /**
     * Devuelve la comision del Empleado
     * @return comision del Empleado
     */
    public double getComision() {
        return comision * 100.0d; // * Se devuevle en formato porcentaje 0-100%
    }

    /**
     * Establece un nuevo valor para la comisión del Empleado
     * @param comision nuevo valor para comisión
     */
    public void setComision(double comision) {
        if (comision < 0.0d) {
            comision = 0.0d;
        } comision /= 100.0d; // * Se pasa en porcentaje 0-100% pero se trabaja en numerico 0.0-1.0
        this.comision = comision;
    }

    /**
     * Calcula el salario correspondiente al empleado en función a sus ventas y comisión
     * @return salario final
     */
    public double calculaSalario() {
        return ventas * comision;
    }

    /**
     * Construye y devuelve una cadena con la información del empleado
     * @return Cadena con la información
     */
    @Override
    public String toString() {
        return
        super.toString()
        + ",\nSalario: " + calculaSalario()
        ;
    }
}
