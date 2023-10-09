package interfaces.ejercicio4;

// ? Imports
import interfaces.ejercicio4.interfaces.Animal;

/**
 * Clase que crea un animal doméstico
 * Implementa la interfaz Animal
 * @see Animal
 * @author Antonio Navarro
 * @version 1.0
 */
public abstract class AnimalDomestico implements Animal {
    /**
     * Nombre del Animal
     */
    private String nombre;

    /**
     * Raza del Animal
     */
    private String raza;

    /**
     * Peso del Animal
     */
    private float peso;

    /**
     * Color del Animal
     */
    private String color;

    /**
     * Constructor con Parámetros
     * @param nombre Nombre del animal
     * @param raza Raza del animal
     * @param peso Peso del animal
     * @param color Color del animal
     */
    public AnimalDomestico (String nombre, String raza, float peso, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.color = color;
    }

    /**
     * @return nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre para el animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return raza del animal
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza nueva raza para el animal
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return peso del animal
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso nuevo peso para el animal
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return color del animal
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color nuevo color para el animal
     */
    public void setColor(String color) {
        this.color = color;
    }

    // ? START Implementaciones

    /**
     * Método que hace que el animal doméstico coma
     */
    @ Override
    public void comer() {
        System.out.println("El animal doméstico está comiendo");
    }

    /**
     * Método que hace que el animal doméstico duerma
     */
    @ Override
    public void dormir() {
        System.out.println("El animal doméstico está durmiendo");
    }

    /**
     * Método que hace que el animal doméstico haga ruido
     */
    @ Override
    public abstract void hacerRuido();

    // ? END Implementaciones

    /**
     * Método que hace que el animal sea vacunado
     */
    public void vacunar() {
        System.out.println("El animal a sido vacunado");
    }

    /**
     * Método que hace que el animal te haga caso
     */
    public abstract boolean hacerCaso();

    /**
     * Crea y devuelve una cadena con la información del Animal
     * @return Cadena con la información del Animal
     */
    @ Override
    public String toString() {
        return
        "Nombre: \"" + this.nombre + "\""
        + ",\nRaza: \"" + this.raza + "\""
        + ",\nPeso: " + this.peso
        + ",\nColor: \"" + this.color + "\""
        ;
    }
}
