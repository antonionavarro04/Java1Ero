package ejerciciosfor;

public class Ejercicio3 {
    public static void main(String[] args) {
        // ? Programa que con un bucle for muestre todos los multiplos de 7 menores que 100
        // ^ Declaramos la variable i (incremento)
        short i;

        // ! Pequeña descripción del programa
        System.out.println("Programa que con un bucle for muestre todos los multiplos de 7 menores que 100");

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Bucle for que muestra los multiplos de 7 menores que 100
        for (i = 7; i < 100; i += 7) {
            System.out.println(i);
        }

        // € Hecho por Antonio Navarro
    }
}
