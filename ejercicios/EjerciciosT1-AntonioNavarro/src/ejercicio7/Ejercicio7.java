package ejercicio7;

//Importamos la libreria Scanner y Locale
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args) {
		// Creamos las variables milimetros, centimetros y metros
		double milimetros, centimetros, metros;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Pedimos al usuario que nos introduzca cada una de las medidas, se las asignaremos a sus correspondientes variables
		System.out.print("Introduce una distancia en milimetros: ");
		milimetros = read.nextDouble();
		System.out.print("Introduce una distancia en centimetros: ");
		centimetros = read.nextDouble();
		System.out.print("Introduce una distancia en metros: ");
		metros = read.nextDouble();
		
		// Dividimos y asignamos los milimetros x10 y los metros los multiplicamos y asignamos x100
		milimetros /= 10.0d;
		metros *= 100.0d;
		
		// Sumamos y asignamos las medidas a la variable centimetros
		centimetros += milimetros;
		centimetros += metros;
		
		System.out.println();System.out.println("---------------------------------------");System.out.println();
		
		// Imprimimos el resultado por consola
		System.out.println("Las 3 medidas suman: " + centimetros + "cm");
		
		// Cerramos el Scanner
		read.close();
	}

}
