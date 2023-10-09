package ejercicios.ejercicio8;

public class Methods {
    static void printArray(byte array[]){
        // ! Preparamos el mensaje final
        System.out.print("[");

        // ! Imprimimos los valores
        for (int pos = 0; pos < array.length; pos++){
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

    static void printArray(short array[]){
        // ! Preparamos el mensaje final
        System.out.print("[");

        // ! Imprimimos los valores
        for (int pos = 0; pos < array.length; pos++){
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
} // € Hecho por Antonio Navarro
