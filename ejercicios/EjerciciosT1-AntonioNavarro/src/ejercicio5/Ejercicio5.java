package ejercicio5;

//Importamos la libreria Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la variable a, b, c y x las cuales van a tomar un valor por el usuario y la variable 'y' que va a ser el resultado de la ecuación
		double a, b, c, x, y;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Mostramos por pantalla la ecuación a resolver
		System.out.println("y = ax^2 + bx + c");
		System.out.println();System.out.println("---------------------------------------");System.out.println();
		
		// Pedimos al Usuario que indique los valores de a, b, c y x
		System.out.print("Introduce el valor de 'a': ");
		a = read.nextDouble();
		System.out.print("Introduce el valor de 'b': ");
		b = read.nextDouble();
		System.out.print("Introduce el valor de 'c': ");
		c = read.nextDouble();
		System.out.print("Introduce el valor de 'x': ");
		x = read.nextDouble();
		
		// Calculamos la Ecuación y asignamos su valor a 'y'
		y = a * (x * x) + b * x + c;
		
		System.out.println();System.out.println("---------------------------------------");System.out.println();
		
		// Imprimimos el resultado por pantalla
		System.out.println(a + " · " + x + "^2 + " + b + " · " + x + " + " + c + " = " + y);
		
		// Cerramos el Scanner
		read.close();

	}

}
