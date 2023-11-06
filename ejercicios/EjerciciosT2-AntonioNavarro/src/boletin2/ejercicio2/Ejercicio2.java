package ejercicio2;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio2 {
    public static void main(String[] args) {
        // ? Programa que pide al Usuario que introduzca un numero del 1 al 7 y el programa le muestre mediante un switch el dia de la semana que corresponde.
        // ^ Declaramos la variable dia para usarla con el switch
        byte dia;

        // ^ Decalaramos la variable read, se la asignamos al Scanner y cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);
        
        // ! Pedimos al usuario que introduzca un numero del 1 al 7
        System.out.print("Introduce un numero del 1 al 7: ");
        dia = read.nextByte();

        // ? Salto de Línea Bonito
        System.out.println();System.out.println("------------------------------");System.out.println();

        // ! Comprobamos mediante una estructura Switch a que dia pertenece el numero introducido
        switch (dia){
            case 1:
                System.out.println("El día '1' corresponde a Lunes");
                break;
            case 2:
                System.out.println("El día '2' corresponde a Martes");
                break;
            case 3:
                System.out.println("El día '3' corresponde a Miercoles");
                break;
            case 4:
                System.out.println("El día '4' corresponde a Jueves");
                break;
            case 5:
                System.out.println("El día '5' corresponde a Viernes");
                break;
            case 6:
                System.out.println("El día '6' corresponde a Sabado");
                break;
            case 7:
                System.out.println("El día '7' corresponde a Domingo");
                break;
            default:
                System.out.println("El numero introducido no es valido");
                break;
        }
        
        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
