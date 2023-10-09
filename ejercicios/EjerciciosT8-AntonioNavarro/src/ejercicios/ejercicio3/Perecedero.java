package ejercicios.ejercicio3;

/**
 * Clase que representa un producto perecedero, extiende la clase Producto
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Producto
 */
public class Perecedero extends Producto {
    /**
     * Dias que quedan hasta que el producto caduque
     */
    private int diasParaCaducar;

    /**
     * Constructor por Defecto
     */
    public Perecedero () {
        super();
        this.diasParaCaducar = 0;
    }

    /**
     * Constructor con Parámetros
     * @param nombre Nombre del Producto
     * @param precio Precio del Producto
     * @param diasParaCaducar Dias que quedan hasta que el producto caduque
     */
    public Perecedero (String nombre, float precio, int diasParaCaducar) {
        super(nombre, precio);

        if (diasParaCaducar < 0) {
            diasParaCaducar = 0;
        } this.diasParaCaducar = diasParaCaducar;
    }

    /**
     * @return Devuelve los dias que quedan hasta que el producto caduque
     */
    public int getDiasParaCaducar() {
        return diasParaCaducar;
    }

    /**
     * @param diasParaCaducar Establece los dias que quedan hasta que el producto caduque
     */
    public void setDiasParaCaducar(int diasParaCaducar) {
        if (diasParaCaducar < 0) {
            diasParaCaducar = 0;
        } this.diasParaCaducar = diasParaCaducar;
    }

    /**
     * Calcula el precio del producto perecedero, conforme menos dias para caducar, mas caro
     * @param cantidad Cantidad de productos
     * @return Precio del producto perecedero
     */
    @Override
    public float calcularPrecio(int cantidad) {
        byte n;

        switch (diasParaCaducar) {
            case 3:
                n = 2;
                break;

            case 2:
                n = 3;
                break;

            case 1:
                n = 4;
                break;
        
            default:
                n = 1;
                break;
        } return super.getPrecio() * cantidad / n;
    }
    
    /**
     * Devuelve la información del producto perecedero
     * @return String con la información del producto perecedero
     */
    @ Override
    public String toString() {
        return "Nombre: \"" + super.getNombre() + "\"" +
        "\nPrecio: " + super.getPrecio() + "€" +
        "\nDias para Caducar: " + diasParaCaducar;
    }
}
