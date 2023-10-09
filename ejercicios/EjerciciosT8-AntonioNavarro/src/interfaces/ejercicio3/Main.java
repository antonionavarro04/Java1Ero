package interfaces.ejercicio3;

// ? Imports
import funciones.PerArrays;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array con 3 polideportivos y 3 edificios de oficinas
        Object objetos[] = {
            new EdificioOficinas(50.58d, 10),
            new EdificioOficinas(149.98d, 40),
            new EdificioOficinas(15.72d, 5),
            new Polideportivo("Francisco Leon", 14.92d, 0),
            new Polideportivo("Rafael Alberti", 86.61d, 1),
            new Polideportivo("Marina Alabau", 28.46d, 2),
        };

        // ! Imprimimos la información del array
        System.out.println(PerArrays.printArray(objetos));
    }
}
