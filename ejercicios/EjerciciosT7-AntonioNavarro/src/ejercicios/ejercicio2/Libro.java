package ejercicios.ejercicio2;

/**
 * Clase que crea un libro, contiene los métodos y contructores necesarios para su manipulación
 * @author Antonio Navarro
 * @version 1.0 Release
 */
public class Libro {
    /**
     * Titulo del Libro
     */
    public String titulo;

    /**
     * Autor del Libro
     */
    public String autor;

    /**
     * Número de Ejemplares que tiene el libro disponibles para prestar
     */
    public int numeroDeEjemplares;

    /**
     * Numero de Ejemplares que estan actualmente en estado de prestamo para el libro
     */
    public int numeroDeEjemplaresPrestados;

    /**
     * Constructor por Defecto
     */
    public Libro () {
        // ? Constructor por Defecto
    }

    /**
     * Constructor con parámetros, actualiza [titulo, autor, numeroDeEjemplares, numeroDeEjemplaresPrestados]
     * @param titulo Título del Libro
     * @param autor Autor del Libro
     * @param numeroDeEjemplares Numero de Ejemplares del Libro
     * @param numeroDeEjemplaresPrestados numero de Ejemplares prestados del Libro
     */
    public Libro (String titulo, String autor, int numeroDeEjemplares, int numeroDeEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
    }

    /**
     * Presta un ejemplar del libro
     * @return Si se ha podido realizar el préstamo o no
     */
    public boolean prestar() {
        boolean state = true;

        if (numeroDeEjemplares > 0) { // ? Si los Ejemplares son mayor a 0 se podrán prestar
            numeroDeEjemplares--; numeroDeEjemplaresPrestados++;
        } else { // ? En caso contrario no
            state = false;
        } return state;
    }

    /**
     * Devuelve un ejemplar del libro
     * @return Si se ha podido realizar la devolución o no
     */
    public boolean devolver() {
        boolean state = true;

        if (numeroDeEjemplaresPrestados > 0) { // ? Si los Ejemplares Prestados son mayor a 0 se podrán prestar
            numeroDeEjemplaresPrestados--; numeroDeEjemplares++;
        } else { // ? En caso contrario no
            state = false;
        } return state;
    }
}
