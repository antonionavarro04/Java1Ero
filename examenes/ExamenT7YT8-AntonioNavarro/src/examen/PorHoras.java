package examen;

/**
 * Clase que crea un Empleado por Horas, extiende de la clase empleado
 * @author Antonio Navarro
 * @version 1.0
 * @see Empleado
 */
public class PorHoras extends Empleado {
    /**
     * Horas que trabaja el Empleado
     */
    private int horas;

    /**
     * Sueldo por cada hora trabajada del Empleado
     */
    private double sueldoHora;

    /**
     * Constructor con los parámetros nombre y apellidos
     * @param nombre Nombre del Empleado
     * @param apellido Apellido del Empleado
     */
    public PorHoras (String nombre, String apellido) {
        super(nombre, apellido);
    }

    /**
     * Constructor con todos los parámetros
     * @param nombre Nombre del Empleado
     * @param apellido Apellido del Empleado
     * @param sexo Sexo del Empleado
     * @param horas Horas del Empleado
     * @param sueldoHora Sueldo por Horas del Empleado
     */
    public PorHoras (String nombre, String apellido, String sexo, int horas, double sueldoHora) {
        super(nombre, apellido, sexo);

        if (horas < 0) {
            horas = 0;
        } this.horas = horas;

        if (sueldoHora < 0.0d) {
            sueldoHora = 0.0d;
        } this.sueldoHora = sueldoHora;
    }

    /**
     * Devuelve las horas que trabaja el empleado
     * @return horas que trabaja el empleado
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Establece nuevas horas para el empleado
     * @param horas nuevas horas del empleado
     */
    public void setHoras(int horas) {
        if (horas < 0) {
            horas = 0;
        } this.horas = horas;
    }

    /**
     * Devuelve el sueldo por cada hora trabajada del Empleado
     * @return sueldo por hora del Empleado
     */
    public double getSueldoHora() {
        return sueldoHora;
    }

    /**
     * Establece un nuevo sueldo por cada hora trabajada para el Empleado
     * @param sueldoHora Nuevo sueldo por horas del Empleado
     */
    public void setSueldoHora(double sueldoHora) {
        if (sueldoHora < 0.0d) {
            sueldoHora = 0.0d;
        } this.sueldoHora = sueldoHora;
    }

    /**
     * Calcula el salario correspondiente al empleado por las horas trabajadas
     * @return salario final
     */
    @ Override
    public double calculaSalario() {
        return this.sueldoHora * this.horas;
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
