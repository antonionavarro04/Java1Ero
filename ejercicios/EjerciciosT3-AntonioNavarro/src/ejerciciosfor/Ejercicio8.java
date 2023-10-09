package ejerciciosfor;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Ejercicio8 {
    public static void main(String[] args) {
        // ? Pedir 5 calificaciones de alumnos (0 - 10) y mostrar si hay algún suspenso
        // ^ Declaramos las variables calificacion, suspenso e i (incremento)
        byte suspenso = 0, i;
        float calificacion;

        // ^ Creamos el Scanner en la variable read y cambiamos su formato a US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ! Pequeña descripción del programa
        System.out.println("Introduce 5 calificaciones (0 - 10):");

        // ! Bucle for que pide las 5 calificaciones
        for (i = 1; i <= 5; i++){
            // ! Pedimos a el usuario la calificación
            System.out.print("Calificación [" + i + "] -> ");
            calificacion = read.nextFloat();

            // ! Comprobamos si la calificación es menor que 5
            if (calificacion < 5){
                suspenso++; // * Si es menor que 5, incrementamos en 1 la variable suspenso
            }
        }

        // ? Salto de Línea Triple
        System.out.println("\n" + "-------------------------------" + "\n");

        // ! Mostramos el resultado final
        if (suspenso == 1){
            System.out.println("Hay 1 suspenso"); // * Si hay 1 suspenso, mostramos este mensaje en singular
        } else if (suspenso > 1){
            System.out.println("Hay " + suspenso + " suspensos"); // * Si hay más de 1 suspenso, mostramos este mensaje en plural
        } else {
            System.out.println("No hay suspensos"); // * Si no hay suspensos, mostramos este mensaje
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
