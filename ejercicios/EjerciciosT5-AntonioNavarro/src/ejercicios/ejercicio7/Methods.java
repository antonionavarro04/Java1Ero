package ejercicios.ejercicio7;

public class Methods {
    static void printInverseArray(double array[]){
        // ! Preparamos el mensaje final
        System.out.print("[");

        // ! Imprimimos los valores
        for (int pos = (array.length - 1); pos >= 0; pos--){
            if (pos == 0){
                System.out.print(array[pos]);
            } else {
                System.out.print(array[pos]);
                System.out.print(", ");
            }
        }

        // ! Imprimimos el final del Mensaje
        System.out.print("]");
    } // € Hecho por Antonio Navarro
}
