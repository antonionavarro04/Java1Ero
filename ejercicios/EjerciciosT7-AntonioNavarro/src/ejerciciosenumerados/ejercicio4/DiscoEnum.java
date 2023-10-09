package ejerciciosenumerados.ejercicio4;

/**
 * Clase que crea un Disco, con todos los atributos, métodos y constructores necesarios para su correcto funcionamiento
 * @author Antonio Navarro
 * @version Release 1.0
 */
public class DiscoEnum {
    /**
     * Generos disponibles
     */
    public enum Genero {
        ROCK,
        POP,
        ELECTRONICA,
        REGGAETON   
    }

    /**
     * Codigo del Disco, por defecto será "LIBRE"
     */
    private String codigo = "LIBRE";

    /**
     * Autor del Disco
     */
    private String autor;

    /**
     * Título del Disco
     */
    private String titulo;

    /**
     * Género del Disco
     */
    private Genero genero;

    /**
     * Duración del Disco
     */
    private int duracion;

    /**
     * Constructor por Defecto
     */
    public DiscoEnum () {
        // ? Constructor por Defecto
    }

    /**
     * Constructor por parámetros
     * @param codigo Código del disco
     * @param autor Autor del disco
     * @param titulo Título del disco
     * @param genero Género del disco
     * @param duracion Duración del disco
     */
    public DiscoEnum (String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = Genero.valueOf(genero.toUpperCase()); 
        this.duracion = duracion;
    }

    /**
     * Constructor copia
     * @param d Disco a copiar
     */
    public DiscoEnum (DiscoEnum d) {
        this.codigo = d.codigo;
        this.autor = d.autor;
        this.titulo = d.titulo;
        this.genero = d.genero;
        this.duracion = d.duracion;
    }

    /**
     * Devuelve el código del disco
     * @return Código del disco
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * Establece el código del disco
     * @param codigo Código del disco
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Devuelve el autor del disco
     * @return Autor del disco
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * Establece el autor del disco
     * @param autor Autor del disco
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Devuelve el título del disco
     * @return Título del disco
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Establece el título del disco
     * @param titulo Título del disco
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve el género del disco
     * @return Género del disco
     */
    public Genero getGenero() {
        return this.genero;
    }

    /**
     * Establece el género del disco
     * @param genero Género del disco
     */
    public void setGenero(String genero) {
        this.genero = Genero.valueOf(genero.toUpperCase());
    }

    /**
     * Devuelve la duración del disco
     * @return Duración del disco
     */
    public int getDuracion() {
        return this.duracion;
    }

    /**
     * Establece la duración del disco
     * @param duracion Duración del disco
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Devuelve la información del disco en formato String
     * @return Información del Disco en formato String
     */
    public String toString() {
        return "\"codigo\" = \"" + getCodigo() + "\"" +
            ",\n\"autor\" = \"" + getAutor() + "\"" +
            ",\n\"titulo\" = \"" + getTitulo() + "\"" +
            ",\n\"genero\" = \"" + getGenero() + "\"" +
            ",\n\"duracion\" = " + getDuracion();
    }
}
