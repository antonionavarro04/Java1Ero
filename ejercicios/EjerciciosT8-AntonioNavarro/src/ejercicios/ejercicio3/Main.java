package ejercicios.ejercicio3;

// ? Importamos la clase Mathematics del paquete funciones
import funciones.Mathematics;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array de productos con los productos ya definidos
        Producto[] productos = {
            new Producto("Camiseta", 50),
            new Perecedero("Manzana", 10, 2),
            new Perecedero("Leche", 5, 1),
            new NoPerecedero("Lentejas", 1, "Legumbres"),
            new NoPerecedero("Atún", 3, "Enlatados")
        };

        // ^ Definimos una variable de tipo float para almacenar el precio total
        float precioTotal = 0;

        // ! Recorremos el array de productos
        for (Producto producto : productos) {
            // ? Imprimimos la información del producto
            System.out.println(producto);
            
            // ^ Definimos la variable cantidad
            int cantidad = Mathematics.rng(1, 5);
            System.out.printf("Cantidad: %d\n", cantidad);

            // ^ Definimos la variable precioConjunto
            float precioConjunto = producto.calcularPrecio(cantidad);
            System.out.printf("Precio conjunto: %.2f\n\n", precioConjunto);

            // ! Calculamos el precio del producto, la cantidad será aleatoria entre 1 y 5
            precioTotal += precioConjunto;
        }
        
        // ? Salto de Línea Doble
        System.out.println("-----------------------------\n");
        
        // ! Imprimimos el precio total
        System.out.printf("Precio Total: %.2f", precioTotal);
    }
}
