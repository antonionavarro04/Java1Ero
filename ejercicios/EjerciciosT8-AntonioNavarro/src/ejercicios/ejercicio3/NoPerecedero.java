package ejercicios.ejercicio3;

// ? Importamos la clase Mathematics del paquete funciones
import funciones.Mathematics;

/**
 * Clase que representa un producto no perecedero
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Producto
 */
public class NoPerecedero extends Producto {
    /**
     * Tipo de producto no perecedero
     */
    private String tipo;

    /**
     * Constructor por Defecto
     */
    public NoPerecedero () {
        super();
        this.tipo = "Undefined-" + Mathematics.rng(9999, 1111);
    }

    /**
     * Constructor con Parámetros
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     * @param tipo Tipo del producto
     */
    public NoPerecedero (String nombre, float precio, String tipo) {
        super(nombre, precio);
        if (tipo.isBlank()) {
            tipo = "Undefined-" + Mathematics.rng(9999, 1111);
        } this.tipo = tipo;
    }

    /**
     * @return Devuelve el tipo del producto
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo Establece un tipo
     */
    public void setTipo(String tipo) {
        if (tipo.isBlank()) {
            tipo = "Undefined-" + Mathematics.rng(9999, 1111);
        } this.tipo = tipo;
    }
}
