package ejerciciosdowhile;

public class Ejercicio2 {
    public static void main(String[] args) {
        // ? Realiza un programa Java que muestre los numeros pares comprendidos entre el 1 y el 200
        // ^ Creamos la variable num que se incrementara en 2 y empezará en 2
        int num = 2;

        // ! Pequeña explicación del Programa
        System.out.println("Programa Java que muestre los numeros pares comprendidos entre el 1 y el 200");

        // ? Salto de Linea Triple
        System.out.println();System.out.println("-------------------------------");System.out.println();

        // ! Creamos el Bucle Do-While
        do{
            System.out.println("-> " + num);
            num += 2;
        } while (num <= 200);

        // € Hecho por Antonio Navarro
    }
}
