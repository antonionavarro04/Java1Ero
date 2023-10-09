package ejercicios.ejercicio8;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos tres arrays (numeros, cuadrados y cubos) enteros de 20 posiciones cada uno
        byte numeros[] = new byte[20];
        short cuadrados[] = new short[20];
        short cubos[] = new short[20];

        // ! Rellenamos el array de números con números aleatorios
        for (byte pos = 0; pos < numeros.length; pos++) {
            numeros[pos] = (byte) (Math.random() * 100);
        }

        // ! Rellenamos cuadrados[] con los cuadrados de numeros[]
        for (byte pos = 0; pos < cuadrados.length; pos++){
            cuadrados[pos] = (short) (Math.pow(numeros[pos], 2));
        }

        // ! Rellenamos cubos[] con los cubos de numeros[]
        for (byte pos = 0; pos < cubos.length; pos++){
            cubos[pos] = (short) (Math.pow(numeros[pos], 3));
        }

        // ! Imprimimos numeros[], cuadrados[], cubos[]
        System.out.println("Los numeros aleatorios del 0 al 100 son:");
        Methods.printArray(numeros);
        System.out.println("\n");

        System.out.println("Los numeros aleatorios al cuadrado son:");
        Methods.printArray(cuadrados);
        System.out.println("\n");

        System.out.println("Los numeros aleatorios al cubo son:");
        Methods.printArray(cubos);
    } // € Hecho por Antonio Navarro
}
