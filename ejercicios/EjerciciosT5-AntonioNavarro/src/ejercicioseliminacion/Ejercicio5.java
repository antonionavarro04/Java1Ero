package ejercicioseliminacion;

// ? Importamos la Clase Scanner, Locale y Arrays
import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Ejercicio5 {
    // ^ Definimos una instancia de la clase Scanner como private static final de nombre read y cambiamos su formato a US
    private static final Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        // ^ Definimos un array de números enteros sin posiciones
        int array[] = new int[0];

        // ^ Definimos una variable número y otra encontrado
        int number;

        // ^ Definimos dos variables enteras que nos proporcionaran el número aleatorio para buscar en la lista, así como una variable para la media
        int random1, random2, media;

        // ! Pedimos al usuario que escriba tantos números como quiera, al introducir un número negativo parará de introducir numeros negativos
        System.out.println("Introduce tus números favoritos!");
        do { // * No se podrán repetir números
            boolean encontrado = false;
            System.out.print(">>> ");
            number = read.nextInt();
            if (number >= 0) { // * Solo insertaremos números >= 0
                for (int value : array) { // * Recorremos el array
                    if (value == number) { // * Si el numero ya esta dentro del array cambiaremos encontrado a true
                        encontrado = true;
                        break; // * Salimos del Bucle
                    }
                } if (!encontrado) { // * Si el numero no está en el array lo aumentaremos 1 su posicion y meteremos el valor en la ultima posición
                    array = SharedMethods.insertData(array, number);
                } else { // * Si esta en la lista lo notificaremos y cambiaremos encontrado a false
                    System.err.println("El número " + number + " ya esta en la lista");
                } Arrays.sort(array);
            }
        } while (number >= 0 || array.length < 2);

        do { // ! Abrimos un bucle do-while que se ejecutara hasta que la lista sea de tamaño 1
            // * Primero generaremos 2 posiciones aleatorias en base a las posiciones que tiene el array
            random1 = (int) (Math.random() * (array.length));
            do { // * Para el segundo numero tendremos que generarlo hasta que sea diferente del primero
                random2 = (int) (Math.random() * (array.length));
            } while (random2 == random1);
            media = SharedMethods.media(array[random1], array[random2]); // * Hacemos la media aritmética de los dos números en esas posiciones
            int aux = array[random2]; // * Para el segundo valor la posición puede variar por lo que antes de eliminar vamos a guardar el valor en una variable aux
            array = SharedMethods.deleteKnowingData(array, random1); // * Eliminamos los dos valores del array, para el primero si sabemos la posición
            array = SharedMethods.deleteData(array, aux); // * El segundo lo eliminaremos en base a su valor y no a su posición
            array = SharedMethods.insertData(array, media); // * Inseramos el valor en la última posición
            Arrays.sort(array); // * Ordenamos el array antes de pasar al siguiente número
        } while (array.length != 1);

        // ? Imprimimos el Número de la Suerte
        System.out.println("Tu número de la suerte es el: " + array[0]);
    }
}
