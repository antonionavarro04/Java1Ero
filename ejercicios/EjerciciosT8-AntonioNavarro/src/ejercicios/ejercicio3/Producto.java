package ejercicios.ejercicio3;

import funciones.Mathematics;

/**
 * Clase que representa un producto con su nombre y precio
 * @author Antonio Navarro
 * @version 1.0 Release
 */
public class Producto {
    /**
     * Nombre del Producto
     */
    private String nombre;

    /**
     * Precio del Producto
     */
    private float precio;

    /**
     * Constructor por Defecto
     */
    public Producto () {
        this.nombre = "Undefined-" + Mathematics.rng(9999, 1111);
        this.precio = 0.0f;
    }

    /**
     * Constructor con Parámetros
     * @param nombre Nombre del producto
     * @param precio Precio del producto
     */
    public Producto (String nombre, float precio) {
        if (nombre.isBlank()) {
            nombre = "Undefined-" + Mathematics.rng(9999, 1111);
        } this.nombre = nombre;

        if (precio < 0.0f) {
            precio = 0.0f;
        } this.precio = precio;
    }

    /**
     * @return Devuelve el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Establece un nombre
     */
    public void setNombre(String nombre) {
        if (nombre.isBlank()) {
            nombre = "Undefined-" + Mathematics.rng(9999, 1111);
        } this.nombre = nombre;
    }

    /**
     * @return Devuelve el precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio Establece un precio
     */
    public void setPrecio(float precio) {
        if (precio < 0.0f) {
            precio = 0.0f;
        } this.precio = precio;
    }

    /**
     * Calcula el precio de varios productos
     * @param cantidad Cantidad de productos
     * @return Precio total
     */
    public float calcularPrecio(int cantidad) {
        return precio * cantidad;
    }

    /**
     * Devuelve la información de un producto
     * @return Cadena creada y montada
     */
    @Override
    public String toString() {
        return
        "Nombre: \"" + nombre + "\"\n" +
        "Precio: " + precio + "€";
    }
}
