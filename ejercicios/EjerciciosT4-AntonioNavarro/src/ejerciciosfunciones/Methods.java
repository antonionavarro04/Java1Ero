package ejerciciosfunciones;

public class Methods {
    // ? Función del Ejercicio 1
    static void eco (long veces) { // ! Definimos la función veces la cual tiene el parámetro veces
        for (int i = 1; i <= veces; i++){ // * Creamos un bucle for que se repita el número de veces que se le indique en el método main
            System.out.println("[" + i + "] > Eco..."); // * Imprimimos el mensaje
        }
    }

    // ? Función del Ejercicio 2
    static void between (long num1, long num2) { // ! Definimos la función between la cual tiene los parámetros num1 y num2
        for (num1++; num1 < num2; num1++){ // * Creamos un bucle for que se repita desde el número siguiente al introducido hasta el número anterior al introducido
            System.out.print(num1 + ", "); // * Imprimimos el número seguido de una coma y un espacio
        }
    }

    // ? Función del Ejercicio 3
    static void cilindro (double radio, double altura, byte opcion){ 
        switch (opcion){
            case 0:
                System.out.println("Fin del Programa");
                break;
            case 1:
                System.out.println("El área del cilindro es: " + (2 * Math.PI * radio * (altura + radio)));
                break;
            case 2:
                System.out.println("El volumen del cilindro es: " + (Math.PI * Math.pow(radio, 2) * altura));
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    // ? Función del Ejercicio 4
    static int max (int num1, int num2){
        if (num1 > num2){
            return num1;
        } else if (num1 <= num2){
            return num2;
        } return 0;
    }

    // ? Función del Ejercicio 5
    static boolean vocal (char caracter){
        switch (caracter){
            case 'a':
            case 'i':
            case 'u':
            case 'e':
            case 'o':
            case 'A':
            case 'I':
            case 'U':
            case 'E':
            case 'O':
                return true;
            default:
                return false;
        }
    }

    // ? Función del Ejercicio 6 y 7
    static boolean esPrimo (int n){
        if (n <= 1){
            return false;
        } for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        } return true;
    }

    // ? Función del Ejercicio 7
    static int divisoresPrimos (int num){
        // ^ Definimos una variable contador
        int contador = 0;

        // ^ Bucle for que comprueba si el divisor es primo y si el divisor es divisible entre el numero
        for (int div = 2; div < num; div++){
            if (esPrimo(div)){
                if (num % div == 0){
                    contador++;
                }
            }
        }

        // ^ Devolvemos el contador
        return contador;
    }

    // ? Función del Ejercicio 8
    static double calc (double num1, double num2, byte opcion){
        switch (opcion){
            case 0:
                System.out.println("Fin del Programa");
                break;
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                return num1 / num2;
            default:
                System.out.println("Opción no válida.");
                break;
        } return 0;
    }
}
