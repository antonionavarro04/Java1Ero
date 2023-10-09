package ejercicios.ejercicio6;

public class Methods {
    static void printNormalArrayEvenOrOdd(long array[]){
        // ! Preparamos el mensaje final
        System.out.print("[");

        // ! Imprimimos los valores
        for (int pos = 0; pos < array.length; pos++){
            // ! Llamamos a la función evenOrOdd para comprobar si el numero es Par o Impar
            System.out.print("(");
            System.out.print(evenOrOdd(array[pos]));
            System.out.print(") ");

            // ! Imprimimos los valores de esa posición
            if (pos == (array.length - 1)){
                System.out.print(array[pos]);
            } else {
                System.out.print(array[pos]);
                System.out.print(", ");
            }
        }

        // ! Imprimimos el final del Mensaje
        System.out.print("]");
    }

    static String evenOrOdd(long number){
        if (number % 2 == 0){
            return "Par";
        } else {
            return "Impar";
        }
    }
} // € Hecho por Antonio Navarro
