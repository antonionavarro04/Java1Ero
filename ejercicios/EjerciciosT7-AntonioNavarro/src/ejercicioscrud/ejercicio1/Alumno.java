package ejercicioscrud.ejercicio1;

/**
 * Clase Alumno, contiene los atributos y métodos de un Alumno
 * @author Antonio Navarro
 * @version 1.0 Stable
 */
public class Alumno {
    /**
     * Nombre del Alumno
     */
    private String nombre;

    /**
     * Nombre de la Media
     */
    private double notaMedia;

    /**
     * Constructor por defecto
     */
    public Alumno () {
        this.nombre = "";
    }

    /**
     * Constructor con parámetros, comprobará que los datos sean correctos
     * @param nombre Nombre del Alumno
     * @param notaMedia Media del Alumno
     */
    public Alumno (String nombre, double notaMedia) {
        // ! Comprobamos que el nombre no este vacío
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Error";
        }
        
        // ! Comprobamos que la nota media este entre 0 y 10 inclusivos
        if (notaMedia >= 0 && notaMedia <= 10) {
            this.notaMedia = notaMedia;
        } else {
            this.notaMedia = 0;
        }
    }

    /**
     * @return Devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Establece un valor al nombre
     */
    public void setNombre(String nombre) {
        if (!nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            this.nombre = "Undefined";
        }
    }

    /**
     * @return Devuelve la nota media
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * @param notaMedia Establece una nota media
     */
    public void setNotaMedia(double notaMedia) {
        if (notaMedia >= 0 && notaMedia <= 10) {
            this.notaMedia = notaMedia;
        } else {
            this.notaMedia = 0;
        }
    }

    /**
     * Método to String, contruye y devuelve una cadena con la información
     */
    public String toString() {
        return "Nombre: " + nombre + " | Nota media: " + notaMedia;
    }
}
