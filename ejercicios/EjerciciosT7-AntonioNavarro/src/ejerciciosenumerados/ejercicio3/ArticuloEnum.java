package ejerciciosenumerados.ejercicio3;

/**
 * Clase que crea un artículo, contiene todos los métodos y constructores necesarios para su corecta manipulación
 * @author Antonio Navarro
 * @version 1.0 Release
 */
public class ArticuloEnum {
    /**
     * Departamentos disponibles
     */
    public enum Departamento {
        ELECTRONICA,
        ALIMENTACION,
        DROGUERIA
    }

    /**
     * Nombre del articulo
     */
    public String nombre;

    /**
     * Precio del articulo sin IVA
     */
    public float precio;

    /**
     * IVA Aplicable del articulo
     */
    public float iva;

    /**
     * Cuantas existencias quedan disponibles
     */
    public int cuantosQuedan;

    /**
     * Departamento al que pertenece el articulo
     */
    private Departamento departamento;

    /**
     * Constructor por parámetros, en caso de que algunos de los parámetos no sea correcto dará un mensjae de error
     * @param nombre Nombre del artículo
     * @param precio Precio del artículo
     * @param iva IVA aplicable del artículo
     * @param cuantosQuedan Unidades disponibles del Artículo
     * @param departamento Departamento al que pertenece el artículo
     */
    public ArticuloEnum (String nombre, float precio, float iva, int cuantosQuedan, String departamento) {
        if (nombre.isBlank()) {
            this.nombre = "Articulo sin nombre";
        } else {
            this.nombre = nombre;
        }

        if (precio <= 0.0f) {
            this.precio = 0.0f;
        } else {
            this.precio = precio;
        }

        if (iva != 21.0f) {
            this.iva = 21.0f;
        } else {
            this.iva = iva;
        }

        if (cuantosQuedan < 0) {
            this.cuantosQuedan = 0;
        } else {
            this.cuantosQuedan = cuantosQuedan;
        }

        this.departamento = Departamento.valueOf(departamento.toUpperCase());
    }

    /**
     * Devuelve el nombre del articulo
     * @return Nombre del articulo
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Establece el departamento del articulo
     * @param departamento Departamento del articulo
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Método que construye una string con la información del Articulo
     * @return Cadena con la información
     */
    public String toString() {
        return "Nombre: " + nombre + "\nPrecio: " + precio + "\nIVA: " + iva + "\nUnidades Disponibles: " + cuantosQuedan + "\nDepartamento: " + departamento;
    }

    /**
     * Calcula el precio con IVA del articulo
     * @return Precio con IVA del articulo
     */
    public float getPVP() {
        return (iva / 100.0f + 1) * precio;
    }

    /**
     * Calcula el precio con IVA - descuento del articulo
     * @param descuento Descuento que se le aplica al articulo
     * @return Precio con IVA - descuento del articulo
     */
    public float getPVPDescuento(float descuento) {
        float descuentoAplicable = 1 - (descuento / 100.0f);

        return precio * (iva / 100.0f + 1) * descuentoAplicable;
    }

    /**
     * Vende un articulo, en caso de que no haya esxistencias no se podrá vender
     * @param cantidad Cantidad a vender
     * @return Si se ha podido realizar la operación o no
     */
    public boolean vender(int cantidad) {
        boolean state = true;

        if (cuantosQuedan - cantidad >= 0) { // ? Si hay libros disponibles para vender y que la cantidad sea 0 o mayor los vendemos
            cuantosQuedan -= cantidad;
        } else { // ? En caso contrario no
            state = false;
        } return state;
    }

    /**
     * Almacena una cantidad de articulo
     * @param cantidad Cantidad de articulos a almacenar
     */
    public void almacenar(int cantidad) {
        cuantosQuedan += cantidad;
    }
}
