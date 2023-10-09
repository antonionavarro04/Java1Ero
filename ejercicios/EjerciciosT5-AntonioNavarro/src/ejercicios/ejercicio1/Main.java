package ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array entero de 10 posiciones
        byte[] numerosAleatorios = new byte[10];
        
        // ^ Definimos una variable posicion para mostrar la posicion del array
        byte posicion = 0;

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
    } // € Hecho por Antonio Navarro
}
