package ejercicios.ejercicio4;

/**
 * Clase que crea una lavadora, hereda de Electrodomestico
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Electrodomestico
 */
public class Lavadora extends Electrodomestico {
    /**
     * Carga que puede soportar la lavadora
     */
    protected float carga = 5.0f;

    /**
     * Constructor por Defecto
     */
    public Lavadora () {
        super();
    }

    /**
     * Constructor con parámetros
     * @param precio Precio de la Lavadora
     * @param peso Peso de la Lavadora
     */
    public Lavadora (float precio, float peso) {
        super(precio, peso);
    }

    /**
     * Constructor con todos los atributos
     * @param precio Precio de la Lavadora
     * @param peso Peso de la Lavadora
     * @param color Color de la Lavadora
     * @param consumoEnergetico Consumo Energético de la Lavadora
     * @param carga Carga de la Lavadora
     */
    public Lavadora (float precio, float peso, String color, String consumoEnergetico, float carga) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    /**
     * Devuelve la carga de la Lavadora
     * @return carga de la Lavadora
     */
    public float getCarga() {
        return carga;
    }

    /**
     * Establece una nueva carga a la Lavadora
     * @param carga Nueva carga de la Lavadora
     */
    public void setCarga(float carga) {
        this.carga = carga;
    }
    
    /**
     * Devuelve el precio final que tendrá el producto, la lavadora hay que añadirle también lo que le sume la carga
     * @return Precio final del producto
     */
    @ Override
    public float precioFinal() {
        float precio = super.precioFinal();

        if (carga > 30.0f) {
            precio += 50.0f;
        } return precio;
    }
}
