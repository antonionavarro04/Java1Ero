package ejercicio3;

//Importamos las utilidades Scanner y Locale
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// La variable num la cual va a ser la que vamos a comprobar cuantos numeros hay que sumarle para que sea multiplo del numero introducido
		long num;
		// La variable multiplo la cual va a ser el numero por el que se divida nuestro primer numero para asi poder sacar el resto
		long multiplo;
		// La variable resto la cual va a servir para guradar el resto de num / multiplo
		long resto;
		// La variable resultado nos va a servir para guardar el resultado del operador ternario 
		long resultado;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		// Pedimos al usuario que introduzca el numero y el multiplo
		System.out.print("Introduce un numero entero: ");
		num = read.nextLong();
		
		System.out.print("Introduce el multiplo entero: ");
		multiplo = read.nextLong();
		
		// Dividimos el primer numero por el segundo introducido y obtenemos su resto, lo vamos a guardar en la variable resto
		resto = num % multiplo;
		
		// Usamos un operador ternario para determinar si el resto de nuestra división se va a restar o no al multiplo, en caso de que el resto sea 0 no lo vamos a restar
		resultado = resto == 0 ? resto : multiplo - resto;
		
		System.out.println();System.out.println("---------------------------------------");System.out.println();
		
		// Imprimimos el resultado por pantalla
		System.out.println("Para que " + num + " sea múltiplo de " + multiplo + " hay que sumarle: " + resultado);
		
		// Cerramos el Scanner
		read.close();

	}

}
