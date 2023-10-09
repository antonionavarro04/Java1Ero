// € Hecho por Antonio Navarro

package ejerciciospracticos.ejercicio5;

public class FuncionesRecursivas {
    static int sumatorio(int num){
        // ^ Definimos la variable resultado
        int resultado;

        // ! Mediante una función recursiva, calculamos el resultado
        if(num == 1){
            resultado = 1;
        } else{
            resultado = num + sumatorio(num - 1);
        }

        // ! Devolvemos el resultado
        return resultado;
    }

    static double potencia(double numA, int num){
        // ^ Definimos la variable resultado
        double resultado;

        // ! De forma recursiva calculamos numA ^ num - 1
        if (num == 0) {
            resultado = 1;
        } else {
            resultado = numA * potencia(numA, (num - 1));
        }

        // ! Devolvemos el resultado
        return resultado;
    }

    static int serieFibonacci(int num){
        // ^ Definimos la variable resultado
        int resultado = 0;

        // ! Calculamos la serie de Fibonacci de forma recursiva
        if (num == 0 || num == 1) {
            resultado = num;
        } else {
            resultado = serieFibonacci(num - 1) + serieFibonacci(num - 2);
        }

        // ! Devolvemos el resultado
        return resultado;
    }

    // ? Hecho para testear el funcionamiento recursivo
    /* static int factorial(int num){
        // ^ Definimos la variable resultado
        int resultado;

        // ! Calculamos el factorial de forma recursiva
            if (num == 1){
                resultado = 1;
            } else{
                resultado = num * factorial(num - 1);
            }   

        // ! Devolvemos el resultado
        return resultado;
    } */
}
