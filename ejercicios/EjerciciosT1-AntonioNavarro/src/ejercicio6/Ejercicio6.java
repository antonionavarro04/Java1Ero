package ejercicio6;

// Importamos la libreria Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos las variables segundos, minutos y horas
		long segundos, minutos, horas;
		// Creamos otra variable segundos que nos va a servir cuando hagamos el sysout final
		long segundosOriginales;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Pedimos al usuario que nos introduzca un numero de segundos
		System.out.print("Introduce un numero de segundos: ");
		segundos = read.nextLong();
		
		// Compiamos el valor de segundos a segundosOriginales para poder imprimirlos mas tarde
		segundosOriginales = segundos;
		
		/*
		 * Para calcular los minutos se deben dividir los segundos entre 60  al igual que para las horas solo que con los minutos,
		 * así que una vez que ya hemos calculado los minutos solo faltaria hacer que los segundos tomen el valor del resto de su division entre 60
		 */
		minutos = segundos / 60;
		segundos %= 60;
		horas = minutos / 60;
		minutos %= 60;
		
		System.out.println();System.out.println("---------------------------------------");System.out.println();
		
		// Imprimimos las horas los minutos y los segundos
		System.out.println(segundosOriginales + " segundos son: " + horas + "h " + minutos + "m " + segundos + "s");

		// Cerramos el Scanner
		read.close();

	}

}
