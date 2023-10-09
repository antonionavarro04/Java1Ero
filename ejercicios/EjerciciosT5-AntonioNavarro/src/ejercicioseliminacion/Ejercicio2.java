package ejercicioseliminacion;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio2 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        // ^ Definimos un array de 10 posiciones
        int array[] = new int[10];

        // ! Pedimos al Usuario los valores del Array
        System.out.println("Introduce los Valores del Array");
        SharedMethods.scannerFill(array, read);
        
        // ? Salto de Línea Triple
        System.out.println();
        
        // ? Imprimimos el Array Completo
        System.out.println("Array Original:"); SharedMethods.printArray(array);
        System.out.println(); // ? Salto de Línea Adicional

        // ! Mediante un for recorreremos todos los numeros
        for (int pos = 0; pos < array.length; pos++) {
            if (!SharedMethods.esPrimo(array[pos])) { // ! Si el numero no es primo lo eliminaremos de la tabla
                array = SharedMethods.deleteKnowingData(array, pos);
                // ! Decrementaremos la posicion ya que en la posicion que acabamos de eliminar el no primo ahora puede haber otro
                pos--;
            }
        }

        // ? Mostramos el Array con los no primos eliminados
        System.out.println("Array sin los numeros no Primos:"); SharedMethods.printArray(array);
    }
} // € Hecho por Antonio Navarro
