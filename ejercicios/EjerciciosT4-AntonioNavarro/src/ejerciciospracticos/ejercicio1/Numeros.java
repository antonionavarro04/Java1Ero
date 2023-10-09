// € Hecho por Antonio Navarro

package ejerciciospracticos.ejercicio1;

public class Numeros {
    boolean esPrimo(int num){
        // ^ Creamos la variable primo y la inicializamos en true
        boolean primo = true;

        // ! Comporobamos que el numero no sea 1 ni menor
        if(num <= 1){
            return false;
        }

        // ! Si el modulo de alguno de sus divisores da 0, no es primo
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        // ! Devolvemos el valor de primo
        return primo;
    }

    boolean esCapicua(int num){
        // ^ Creamos la variable capicua y la inicializamos en true
        boolean capicua = true;

        // ^ Creamos la variable auxiliar para guardar el numero invertido
        int aux = 0;

        // ^ Creamos la variable para guardar el numero original
        int numOriginal = num;

        // ! Mientras el numero sea mayor que 0, seguira ejecutandose
        while (num > 0) {
            // ^ Guardamos el ultimo digito del numero en la variable auxiliar
            aux *= 10 + num % 10;

            // ! Eliminamos el ultimo digito del numero
            num /= 10;
        }

        // ! Si el numero original es diferente al numero invertido, no es capicua
        if (numOriginal != aux) {
            capicua = false;
        }

        // ! Devolvemos el valor de capicua
        return capicua;
    }
}