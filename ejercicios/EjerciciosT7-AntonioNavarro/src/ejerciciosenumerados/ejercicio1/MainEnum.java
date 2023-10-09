package ejerciciosenumerados.ejercicio1;

// ? Imports
import java.util.Scanner;
import java.util.Locale;

public class MainEnum {
    public static void main(String[] args) {
        // ^ Definimos una instancia de la Clase Scanner para leer datos por teclado
        final Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Definimos una variable String de nombre sexo
        String sexo;

        // ? Pedimos el Sexo
        System.out.print("Introduce el Sexo de la cc1: ");
        sexo = read.nextLine();

        // ^ Creamos la primera cuenta corriente
        CuentaCorrienteEnum cuenta1 = new CuentaCorrienteEnum("12345678A", 1000, sexo);

        // ? Pedimos el Sexo
        System.out.print("Introduce el Sexo de la cc2: ");
        sexo = read.nextLine();

        // ^ Creamos la segunda cuenta corriente
        CuentaCorrienteEnum cuenta2 = new CuentaCorrienteEnum("87654321B", "Antonio", sexo, 2000);

        // ? Mostramos los datos de las cuentas
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        // ^ Cerramos el Scanner
        read.close();
    }
}
