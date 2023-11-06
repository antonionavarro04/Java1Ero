package examen;

/**
 * Clase que crea un empleado, es abstracta
 * @author Antonio Navarro
 * @version 1.0
 */
public abstract class Empleado implements Comparable {
    /**
     * Sexos disponibles
     */
    private enum Sexo {
        H, M
    }

    /**
     * Nombre del empleado
     */
    private String nombre;

    /**
     * Apellidos del empleado
     */
    private String apellidos;

    /**
     * Sexo del Empleado, por defecto será Hombre
     */
    private Sexo sexo = Sexo.H;

    /**
     * Constructor con 2 parámetros
     * @param nombre Nombre del empleado
     * @param apellidos Apellido del empleado
     */
    public Empleado (String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    /**
     * Constructor con todos los parámetros
     * @param nombre Nombre del Empleado
     * @param apellidos Apellidos del Empleado
     * @param sexo Sexo del Empleado
     */
    public Empleado (String nombre, String apellidos, String sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;

        if (sexo.isBlank()) {
            sexo = "H";
        } else if (sexo.equals("H") || !sexo.equals("M")) {
            sexo = "H";
        } this.sexo = Sexo.valueOf(String.valueOf(sexo.toUpperCase().charAt(0)));
    }

    /**
     * Devuelve el nombre del Empleado
     * @return el nombre del Empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el Empleado
     * @param nombre Nuevo nombre del Empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve los apellidos del Empleado
     * @return los apellidos del Empleado
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece unos nuevos apellidos para el empleado
     * @param apellidos Nuevos apellidos del Empleado
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Devuelve el sexo del empleado en formato String
     * @return Sexo return the sexo
     */
    public String getSexo() {
        return this.sexo.toString();
    }

    /**
     * Establece un nuevo sexo al empleado en formato String
     * @param sexo Nuevo Sexo para el Empleado
     */
    public void setSexo(String sexo) {
        this.sexo = Sexo.valueOf(String.valueOf(sexo.toUpperCase().charAt(0)));
    }

    /**
     * Construye y devuelve una cadena con la información del empleado
     * @return Cadena con la información
     */
    @ Override
    public String toString() {
        return
        "Nombre: \"" + nombre + "\""
        + ",\nApellidos: \"" + apellidos + "\""
        + ",\nSexo: \"" + sexo + "\""
        ;
    }

    /**
     * Compara si dos empleados son iguales, esta comparación se hará por el nombre y apellidos
     * @return True si es igual, False en caso contrario
     */
    @ Override
    public boolean equals(Object o) {
        boolean state = false;

        // ^ Parseamos el objeto a Empleado
        Empleado e = (Empleado) o;

        if (this.nombre.equals(e.nombre)) { // ? Si el nombre es igual
            if (this.apellidos.equals(e.apellidos)) { // ? Si el apellido es igual
                state = true; // ! Es igual
            }
        } return state;
    }

    /**
     * Calcula el salario de un empleado, su implementación dependerá del tipo de empleado
     * @return Salario del Empleado
     */
    public abstract double calculaSalario();

    /**
     * Compara un empleado a otro en funcion a su nombre y apellidos
     * @return Diferencia de datos
     */
    @ Override
    public int compareTo(Object o) {
        int state = 0;

        // ^ Parseamos el objeto a tipo Empleado
        Empleado e = (Empleado) o;
        
        // ^ Definimos una variable comparación para no repetir código
        int comparacion = this.apellidos.compareTo(e.apellidos);

        if (comparacion < 0) {
            state--;
        } else if (comparacion > 0) {
            state++;
        } comparacion = this.nombre.compareTo(e.nombre);
        
        if (comparacion < 0) {
            state--;
        } else if (comparacion > 0) {
            state++;
        } return state;
    }
}
