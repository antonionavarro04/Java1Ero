package ejerciciosfunciones;

public class Ejercicio7E {
    // ^ Definimos la variable num
    static final int NUM = 1000000;

    public static void main(String[] args) {
        // ! Imprimimos el mensaje y dentro llamamos a la función divisoresPrimos]#
        System.out.println("El número " + Ejercicio7E.NUM + " tiene " + Methods.divisoresPrimos(Ejercicio7E.NUM) + " divisores primos.");
    }
}
