package ejercicios.ejercicio4;

/**
 * Clase que crea una televisión, hereda de Electrodomestico
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Electrodomestico
 */
public class Television extends Electrodomestico {
    /**
     * Resolución del Televisor
     */
    int resolucion = 20;

    /**
     * Presencia de Resintonizador TDT
     */
    boolean sintonizadorTdt = false;

    /**
     * Constructor por Defecto
     */
    public Television () {
       super();
    }

    /**
     * Constructor con parametros
     * @param precio Precio de la Televisión
     * @param peso Peso de la Televisión
     */
    public Television (float precio, float peso) {
        super(precio, peso);
    }

    /**
     * Constructor con todos los Parámetros
     * @param precio Precio del televisor
     * @param peso Peso del televisor
     * @param color Color del televisor
     * @param consumoEnergetico Consumo energético del televisor
     * @param resolucion Resolución del televisor
     * @param sintonizadorTdt Disponibilidad de sintonizador tdt
     */
    public Television (float precio, float peso, String color, String consumoEnergetico, int resolucion, boolean sintonizadorTdt) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }

    /**
     * Devuelve la resolución del Televisor
     * @return resolución del televisor
     */
    public int getResolucion() {
        return this.resolucion;
    }

    /**
     * Establece una resolución al televisor (pulgadas)
     * @param resolucion Nueva resolución para el televisor
     */
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    /**
     * Devuelve si el televisor tiene sintonizador tdt o no
     * @return Disponibilidad de sintonizador tdt
     */
    public boolean getSintonizadorTdt() {
        return this.sintonizadorTdt;
    }

    /**
     * Establece el estado del sintonizador tdt
     * @param sintonizadorTdt Nuevo estado del sintonizador tdt
     */
    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    /**
     * Calcula el precio final del producto teniendo en cuenta todas sus características
     * @return Precio final del producto
     */
    public float precioFinal() {
        float precio = super.precioFinal();

        if (this.sintonizadorTdt) {
            precio += 50.0f;
        }

        if (this.resolucion > 40) {
            float porcentaje = precio * 30.0f / 100.0f;
            precio += porcentaje;
        } return precio;
    }
}
