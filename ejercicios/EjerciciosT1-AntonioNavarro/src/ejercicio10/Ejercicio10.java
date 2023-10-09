package ejercicio10;

// ! Importamos la libreria Scanner y Locale
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Declaramos la variable lanzamiento la cual almacenará la distancia del lanzamiento en m, esta distancia sera introducida por el Usuario
		double lanzamiento;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Pedimos al usuario que nos introduzca la distancia del lanzamiento en metros
		System.out.print("Introduce la distancia del lanzamiento en metros: ");
		lanzamiento = read.nextDouble();
		
		// Multiplicamos la variable x100 para pasarla a cm y almacenaremos su resultado en la misma variable
		lanzamiento *= 100;
		
		// Imprimimos el resultado final pero antes de imprimir la variable escribiremos (long) para transformar la variable a entera
		System.out.print("La distancia fue de: " + (long) lanzamiento + "cm");
		
		// Cerramos el Scanner
		read.close();
		
	}

}
