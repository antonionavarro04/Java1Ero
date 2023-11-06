package ejercicio5;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Programa el cual introduciendo el permiso de conducir que posees te dira si pertenece a automoviles, remolques, etc
        // ^ Declaramos la variable permiso para usarla con el switch, sera de tipo String
        String permiso;

        // ^ Decalaramos la variable read, se la asignamos al Scanner y cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introduzca su permiso
        System.out.print("Introduce tu permiso: ");
        permiso = read.nextLine();

        // ? Salto de Línea Bonito
        System.out.println();System.out.println("------------------------------");System.out.println();

        // ! Comprobamos mediante un switch a que pertenece ese carnet
        switch (permiso){
            case "A":
                System.out.println("Tu permiso " + permiso + " corresponde a Motocicletas");
                break;
            case "B1":
            case "B2":
                System.out.println("Tu permiso " + permiso + " corresponde a Automóviles");
                break;
            case "C1":
            case "C2":
            case "C3":
            case "C4":
            case "C5":
                System.out.println("Tu permiso " + permiso + " corresponde a Camiones");
                break;
            case "D":
                System.out.println("Tu permiso " + permiso + " corresponde a Autobuses");
                break;
            case "E":
                System.out.println("Tu permiso " + permiso + " corresponde a Remolques");
                break;
            default:
                System.out.println("Tu permiso " + permiso + " no está contemplada por nuestro sistema.");
                break;
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
    
}
