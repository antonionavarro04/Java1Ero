package ejerciciosutilarrays.ejercicio5;

public class Methods {
    static void invertArray (int array[]) {
        // ^ Definimos una variable para el máximo y el mínimo tanto para los cvalores como para las posiciones
        int valorMaximo, valorMinimo;
        int posicionMaxima = (array.length - 1), posicionMinima = 0;

        for (int veces = (array.length / 2); veces != 0; veces--) {
            // ! Recogemos los valores máximos y mínimos actuales
            valorMaximo = array[posicionMaxima];
            valorMinimo = array[posicionMinima];

            // ! Invertimos el orden
            array[posicionMaxima] = valorMinimo;
            array[posicionMinima] = valorMaximo;

            // ! Decrementamos la posición máxima y aumentamos la mínima
            posicionMaxima--;
            posicionMinima++;
        }
    }
}
