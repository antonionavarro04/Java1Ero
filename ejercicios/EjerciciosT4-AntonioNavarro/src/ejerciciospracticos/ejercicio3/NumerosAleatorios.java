// € Hecho por Antonio Navarro

package ejerciciospracticos.ejercicio3;

public class NumerosAleatorios {
    // ? Método numerosAleatorios con contador de numeros
    static void numerosAleatorios (int contador) {
        // ! Mediante un bucle for generamos los numeros aleatorios hasta que el contador sea 0
        do{
            System.out.println((Math.random()));
            contador--;
        } while (contador != 0);
    }

    // ? Método numerosAleatorios con contador de numeros y rango maximo
    static void numerosAleatorios (int contador, int max) {
        // ! Mediante un bucle for generamos los numeros aleatorios hasta que el contador sea 0
        do{
            System.out.println(Math.random() * max);
            contador--;
        } while (contador != 0);
    }

    // ? Método numerosAleatorios con contador de numeros, rango maximo y minimo
    static void numerosAleatorios (int contador, int max, int min) {
        // ! Mediante un bucle for generamos los numeros aleatorios hasta que el contador sea 0
        do{
            System.out.println(Math.random() * (max - min) + min);
            contador--;
        } while (contador != 0);
    }
}
