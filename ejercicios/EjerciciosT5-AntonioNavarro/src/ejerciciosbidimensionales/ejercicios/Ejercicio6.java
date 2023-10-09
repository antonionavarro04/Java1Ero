package ejerciciosbidimensionales.ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        // ^ Definimos un array entero de 6x10
        int array[][] = new int[6][10];

        // ! Rellenamos el array con valores aleatorios entre 0 y 1000
        Methods.fillArrayRandom(array, 1000);

        // ^ Definimos 2 arrays de 2 posiciones cada uno, uno para el max y otra para el minimo
        int posiciones[] = new int[4];
        int posicionesMaximo[] = new int[2];
        int posicionesMinimo[] = new int[2];

        // ! Recorremos el array en busca del número máximo y mínimo
        posiciones = Methods.coordenadasMaximoYMinimo(array);
        posicionesMaximo[0] = posiciones[0]; posicionesMaximo[1] = posiciones[1];
        posicionesMinimo[0] = posiciones[2]; posicionesMinimo[1] = posiciones[3];

        // ? Mostramos la tabla y las posiciones
        Methods.printArray(array); System.out.println(); // ? Salto de Línea
        System.out.print("Coordenadas del número máximo: "); Methods.printCords(posicionesMaximo);
        System.out.print("Coordenadas del número mínimo: "); Methods.printCords(posicionesMinimo);
    }
} // € Hechop por Antonio Navarro
