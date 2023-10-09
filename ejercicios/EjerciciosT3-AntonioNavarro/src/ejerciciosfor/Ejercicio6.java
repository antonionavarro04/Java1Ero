package ejerciciosfor;

public class Ejercicio6 {
    public static void main(String[] args) {
        // ? Programa java que muestre la suma de los 10 primeros numeros impares mediante un bucle for
        // ^ Declaramos la variable i (incremento) y suma (suma de los números impares)
        byte i, suma = 0;

        // ! Pequeña descripción del programa
        System.out.println("Programa java que muestre la suma de los 10 primeros numeros impares mediante un bucle for");

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Bucle for que muestra la suma de los 10 primeros números impares
        for (i = 1; i <= 20; i += 2) {
            suma += i;
        }

        // ! Mostramos la suma de los 10 primeros números impares
        System.out.println("La suma de los 10 primeros números impares es: " + suma);

        // € Hecho por Antonio Navarro
    }
}
