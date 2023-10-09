package ejerciciosdowhile;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? Programa Java que mediante un Do-While muestra los números del 1 al 20.
        // ^ Creamos la variable num la cual se va a incrementar en 1 cada vez que se ejecute el bucle.
        int num = 1;

        // ! Pequeña explicación del Programa
        System.out.println("Programa Java que mediante un Do-While muestre los números del 1 al 20.");
        
        // ? Salto de Linea Triple
        System.out.println();System.out.println("-------------------------------");System.out.println();
        
        // ! Creamos el Bucle Do-While
        do {
            System.out.println("-> " + num);
            num++;
        } while (num <= 20);

        // € Hecho por Antonio Navarro
    }
}
