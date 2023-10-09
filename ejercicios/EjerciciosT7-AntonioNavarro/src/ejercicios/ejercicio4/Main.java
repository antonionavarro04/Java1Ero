package ejercicios.ejercicio4;

public class Main {
    public static void main(String[] args) {
        Articulo articulo = new Articulo("La Vida", 2.5f, 21.0f, 10);
        Articulo articuloMal = new Articulo("", -1, 20.584f, -8);
        
        // ? Salto de Línea Triple
        System.out.println("\n-----------------------------------\n");
        
        System.out.println(articulo); System.out.println("-------------------------");
        System.out.println(articuloMal);
        
        // ? Salto de Línea Triple
        System.out.println("\n-----------------------------------\n");
        
        System.out.printf("Precio de \"%s\": %s\n", articulo.nombre, articulo.getPVP());
        System.out.printf("Precio de \"%s\" con 15%% de descuento: %s\n", articulo.nombre, articulo.getPVPDescuento(15.0f));

        System.out.printf("%s han podido vender 10 libros\n", articulo.vender(10) ? "Se" : "No se");
        System.out.printf("%s han podido vender 2 libros\n", articulo.vender(2) ? "Se" : "No se");

        articulo.almacenar(5000);
        System.out.printf("Libros actuales: %s\n", articulo.cuantosQuedan);
    }
}
