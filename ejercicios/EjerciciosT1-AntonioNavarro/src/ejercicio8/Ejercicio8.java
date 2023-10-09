package ejercicio8;

//Importamos la libreria Scanner y Locale
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Declaramos dos cosntantes para el precio de las entradas y otra para el descuento aplicable
		final byte PRECIO_ENTRADA_ADULTO = 20;
		final float PRECIO_ENTRADA_INFANTIL = 15.50f;
		final float DESCUENTO = 0.95f;
		
		// Declaramos variables para el precio total, precio con descuento y las entradas vendidas
		float precioTotal;
		float precioDescontado;
		short entradasAdultos;
		short entradasInfantiles;
		
		// Creamos una variable String la cual contendra el mensaje final si se ha aplicado el descuento o no
		String msg;
		
		// Creamos el Scanner en la variables read y asignamos el formato US
		final Scanner read = new Scanner(System.in);
		read.useLocale(Locale.US);
		
		
		// Pedimos al usuario que nos introduzca cuantas entradas de adulto y de niño se vendieron
		System.out.print("Cuantas entradas de Adulto se han vendido?: ");
		entradasAdultos = read.nextShort();
		
		System.out.print("Cuantas entradas Infantiles se han vendido?: ");
		entradasInfantiles = read.nextShort();
		
		// Calculamos las entradas por el precio y las sumamos para obtener el resultado final
		precioTotal = PRECIO_ENTRADA_ADULTO * entradasAdultos + PRECIO_ENTRADA_INFANTIL * entradasInfantiles;
		
		// Usamos un operador ternario para determinar si el descuento va a ser aplicado o no
		precioDescontado = precioTotal >= 100 ? precioTotal * DESCUENTO : precioTotal;
		
		// Usamos otro operador Ternario para para hacer que la variable msg tome un mensaje el cual diga si el descuento fue aplicado o no
		msg = precioTotal >= 100 ? "El descuento fue aplicado" : "El descuento no fue aplicado";
		
		System.out.println();System.out.println("---------------------------------------");System.out.println();
		
		// Imprimimos el resultado final
		System.out.println("El precio final es de: " + precioDescontado + "€");
		System.out.println(msg);
		
		// Cerramos el Scanner
		read.close();

	}

}
