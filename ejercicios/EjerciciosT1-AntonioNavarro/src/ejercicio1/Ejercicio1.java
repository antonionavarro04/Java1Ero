package ejercicio1;

import java.util.Locale;
// Importamos el Scanner
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaramos la variable para el numero a redondear, al ser un numero con decimales va a ser double o float..
		double num;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Pedimos al usuario que introduzca un numero con decimales y lo guardamos en la variable num
		System.out.print("Introduce un numero con decimales: ");
		num = read.nextDouble();
		
		// Sumamos 0.5 a nuestro numero de esta forma si el numero vale X.5 o mas nos lo va a redondear a su numero mas proximo y no a simplimente la unidad
		num += 0.5d;
		
		System.out.println();System.out.println("---------------------------------------");System.out.println();
		
		// Imprimimos el resultado por pantalla cambiandolo al tipo int.
		System.out.println("El numero redondeado es: " + (int) num);
		
		// Cerramos el Scanner
		read.close();
		

	}

}
