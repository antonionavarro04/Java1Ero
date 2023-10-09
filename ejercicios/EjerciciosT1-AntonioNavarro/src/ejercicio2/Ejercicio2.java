package ejercicio2;

// Importamos las utilidades Scanner y Locale
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Declaramos la variable num la cual va a almacenar el número que introduzca el usuario
		long num;
		
		// Declaramos la variable resto la cual nos va a valer para almacenar el resto de la division mas adelante
		long resto;
		
		// Declaramos la variable resultado que nos va ayudar a determinar si hay o no que restar el resto a 7 en el operador ternario
		long resultado;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Pedimos al usuario que nos introduzca un numero y lo guardamos en la variable num
		System.out.print("Introduce un numero entero: ");
		num = read.nextLong();
		
		// Calculamos el resto de la division num / 7 y se lo asignamos a la variable resto
		resto = num % 7;
		
		// Usamos un operador ternario para determinar si el resto de nuestra división se va a restar o no a 7, en caso de que el resto sea 0 no lo vamos a restar
		resultado = resto == 0 ? resto : 7 - resto;
		
		System.out.println();System.out.println("---------------------------------------");System.out.println();
		
		// Imprimimos el resultado por pantalla
		System.out.println("Para que " + num + " sea múltiplo de 7 hay que sumarle: " + resultado);
		
		// Cerramos el Scanner
		read.close();

	}

}
