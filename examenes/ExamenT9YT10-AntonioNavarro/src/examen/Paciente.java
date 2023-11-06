package examen;

/**
 * Clase que define un paciente, cuenta con todos los atributos métodos y
 * constructores necesarios para su funcionamento, también implementa la
 * interfaz comparable
 */
public class Paciente implements Comparable<Paciente> {
    /**
     * Nombre del paciente
     */
    private String nombre;

    /**
     * Dirección del Paciente
     */
    private String direccion;

    /**
     * Teléfono del Paciente
     */
    private int telefono;

    /**
     * Estado de baja del paciente (Verdadero o Falso)
     */
    private boolean baja;

    /**
     * Constructor sin parámetros
     */
    public Paciente() {
        // // Constructor sin parámetros
    }

    /**
     * Constructor con nombre y teléfono
     * 
     * @param nombre   Nombre del Paciente
     * @param telefono Teléfono del Paciente
     */
    public Paciente(String nombre, int telefono) {
        if (nombre.isBlank()) {
            nombre = "Undefined";
        }
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Constructor con todos los parámetros
     * 
     * @param nombre    Nombre del Paciente
     * @param direccion Direccion del Paciente
     * @param telefono  Teléfono del Paciente
     * @param baja      Estado de Baja del Paciente
     */
    public Paciente(String nombre, int telefono, String direccion, boolean baja) {
        if (nombre.isBlank()) {
            nombre = "Undefined";
        } this.nombre = nombre;

        if (direccion.isBlank()) {
            direccion = "Undefined";
        } this.direccion = direccion;

        if (telefono < 100000000) {
            telefono = 100000000;
        } else if (telefono > 999999999) {
            telefono = 999999999;
        } this.telefono = telefono;
        this.baja = baja;
    }

    /**
     * Devuelve el nombre del Paciente
     * 
     * @return Nombre del Paciente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el paciente
     * 
     * @param nombre Nuevo nombre a establecer
     */
    public void setNombre(String nombre) {
        if (nombre.isBlank()) {
            nombre = "Undefined";
        } this.nombre = nombre;
    }

    /**
     * Devuelve la dirección asociada al paciente
     * 
     * @return Dirección asociada al paciente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece una nueva dirección para el paciente
     * 
     * @param direccion Nueva dirección a establecer
     */
    public void setDireccion(String direccion) {
        if (direccion.isBlank()) {
            direccion = "Undefined";
        } this.direccion = direccion;
    }

    /**
     * Devuelve el teléfono del paciente
     * 
     * @return Teléfono del Paciente
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece un nuevo teléfono para el paciente
     * 
     * @param telefono Nuevo teléfono para el paciente
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve el estado de Baja del Paciente
     * 
     * @return Estado de Baja del Paciente
     */
    public boolean isBaja() {
        return baja;
    }

    /**
     * Establece un nuevo estado para la baja del paciente
     * 
     * @param baja Nuevo estado de baja para el Paciente
     */
    public void setBaja(boolean baja) {
        this.baja = baja;
    }

    /**
     * Crea, construye y devuelve una cadena con la información del Paciente
     * 
     * @return cadena con la información del paciente
     */
    @Override
    public String toString() {
        return  "Nombre: " + this.nombre
            + "\nDirección: " + this.direccion
            + "\nTeléfono: " + this.telefono
            + "\nBaja: " + (this.baja ? "Sí" : "No");
    }

    /**
     * Compara dos pacientes
     * Los pacientes son iguales si tienen el mismo nombre y número de teléfono
     * 
     * @param p Paciente a comparar
     * @return Boolean indicando si es igual o no
     */
    public boolean equals(Paciente p) {
        boolean state = false;
        if (this.nombre == p.nombre) {
            state = true;

            if (this.telefono == p.telefono) {
                state = true;
            } else {
                state = false;
            }
        } return state;
    }

    /**
     * Compara los atributos Nombre y Teléfono y devuelve si son mayores o menores a
     * otro paciente
     * 
     * @param p Paciente con el que comparar
     * @return Indice de comparación
     */
    public int compareTo(Paciente p) {
        int state = 0, comparacion = this.nombre.compareTo(p.nombre);
        if (comparacion > 0) {
            state++;
        } else if (comparacion < 0) {
            state--;
        } else {
            if (this.telefono > p.telefono) {
                state++;
            } else if (this.telefono < p.telefono) {
                state--;
            }
        } return state;
    }
}
