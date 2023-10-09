package ejercicio9;

//Importamos la libreria Scanner y Locale
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Declaramos las variables para num1 y num2. Las declaro como double porque el ejercicio no nos especifica si se va a poder o no introducir decimales
		double num1;
		double num2;
		
		// Declaramos una variable boolean la cual contendra la informacion de si los numeros son iguales o no+
		boolean equal;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Pedimos al Usuario que nos introduzca un valor tanto para el primer como para el segundo numero
		System.out.print("Introduce un numero: ");
		num1 = read.nextDouble();
		
		System.out.print("Introduce otro numero: ");
		num2 = read.nextDouble();
		
		// Comprobamos mediante un operador ternario si los numeros son iguales y le asignamos a la variable equal true en caso de que lo sean y false en caso contrario
		equal = num1 == num2 ? true : false;
		
		// Imprimimos el resultado final
		System.out.println("Son iguales los numeros: " + equal);
		
		// Cerramos el Scanner
		read.close();
	}

}
