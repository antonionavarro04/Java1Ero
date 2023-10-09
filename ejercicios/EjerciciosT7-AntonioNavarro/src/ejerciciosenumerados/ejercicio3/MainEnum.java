package ejerciciosenumerados.ejercicio3;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        // ^ Definimos una instancia de la Clase Scanner para leer datos por teclado
        final Scanner read = new Scanner(System.in);

        // ^! Pedimos el Departaento de dos Artículos y los construimos directamente
        System.out.print("Introduce el departamento del primer artículo: ");
        ArticuloEnum articulo1 = new ArticuloEnum("Coca-Cola", 1.5f, 0.21f, 10, read.nextLine());

        System.out.print("Introduce el departamento del segundo artículo: ");
        ArticuloEnum articulo2 = new ArticuloEnum("Pepsi", 1.5f, 0.21f, 10, read.nextLine());

        // ? Imprimimos la información de los Artículos
        System.out.println(articulo1);
        System.out.println(articulo2);

        // ^ Cerramos el Scanner
        read.close();
    }
}
