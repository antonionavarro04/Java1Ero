package ejercicios.ejercicio5;

/**
 * Clase que representa un polígono
 * @author Antonio Navarro
 * @version 1.0 Release
 */
public abstract class Poligono {
    /**
     * Numero de Lados del Polígono
     */
    protected int numeroLados;

    /**
     * Constructor con Parámetros
     * @param numeroLados Numero de Lados del Polígono
     */
    public Poligono (int numeroLados) {
        this.numeroLados = numeroLados;
    }

    /**
     * Devuelve el numero de lados del polígono
     * @return Numero de lados del polígono
     */
    public int getNumeroLados() {
        return numeroLados;
    }

    /**
     * Devuelve el area del polígono, que será calculada en las clases hijas
     * @return Area del polígono
     */
    abstract double area();

    /**
     * Crea y devuelve una cadena con la información del polígono
     * @return Cadena creada y formada
     */
    @ Override
    public String toString() {
        return "Número de Lados: " + this.numeroLados;
    }
}