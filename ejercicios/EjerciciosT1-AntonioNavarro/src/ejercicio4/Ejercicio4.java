package ejercicio4;

// Importamos la libreria Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos las variables que van a almacenar la base y la altura, asi como el area total del Triangulo.
		double base, altura, resultado;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Pedimos al Usuario que introduzca la base y la altura del triangulo
		System.out.print("Introduce la altura del Triángulo: ");
		altura = read.nextDouble();
		
		System.out.print("Introduce la base del Triángulo: ");
		base = read.nextDouble();
		
		// Calculamos y guardamos en la variable resultado el area del triangulo, usando la formula matematica para calcular el area de un triangulo (BaseTotal = Base x Altura / 2)
		resultado = base * altura / 2.0d;
		
		// Imprimimos nuestro resultado
		System.out.println("El área del Triángulo es de: " + resultado);
		
		// Cerramos el Scanner
		read.close();
		
	}

}
