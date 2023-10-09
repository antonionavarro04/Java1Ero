package ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos la variable resultado para almacenar la suma de todos los valores del array
        short resultado = 0; // ? Short ya que un array con 10 valores aleatorios entre 1 y 100 la suma no va a ser mayor de 32767

        // ^ Definimos una variable posicion para mostrar la posicion del array
        byte posicion = 0;

        // ^ Definimos un array entero de 10 posiciones
        byte[] numerosAleatorios = new byte[10];
        
        // ! Mediante un bucle for generaremos 10 numeros aleatorios y se los asignaremos al array
        for (byte i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (byte) (Math.random() * (100 - 1) + 1);
        }

        // ! Mediante un bucle for each mostraremos los valores del array
        System.out.println("Los numeros aleatorios generados son: ");

        for (byte numeroArray : numerosAleatorios) {
            // ! Imprimimos el valor del array
            System.out.println("[" + posicion + "] > " + numeroArray);

            // ! Incrementamos la posicion
            posicion++;
        }

        // ! Mediante un bucle for each sumaremos todos los valores del array
        for (byte numeroArray : numerosAleatorios) {
            resultado += numeroArray;
        } System.out.println(); // ? Salto de Linea

        // ! Mostramos el resultado de la suma
        System.out.println("La suma de todos los valores del array es: " + resultado);
    } // € Hecho por Antonio Navarro
}
