package ejercicios.ejercicio4;

public class Main {
    public static void main(String[] args) {
        // ! Definimos un array en la variable num de la forma en la que se plantea en el ejercicio
        byte[] num = new byte[12];

        // ! Añadimos los valores planteados al array
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        // ! Mediante un bucle forEach imprimimos todos los valores de num
        for (byte numeros : num){
            System.out.println(numeros);
        }
    } // € Hecho por Antonio Navarro
}
