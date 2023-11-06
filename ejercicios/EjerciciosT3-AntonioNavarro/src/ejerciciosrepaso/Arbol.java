/*
 * @antonionavarro04
 */

package ejercicios;

// ? Importamos la Clase Scanner y Locale
import java.util.Scanner; import java.util.Locale;

public class Arbol {
    public static void main(String[] args) {
        // ? Programa java que pida la altura de al copa, la anchura y altura del tronco y dibuje un arbol.
        // ^ Definimos las variables copa, altoTronco, anchoTronco
        short copa, altoTronco, anchoTronco;

        // ^ Definimos una variable para el caracter de las hojas y del tronco
        char charHoja;
        char charTronco;

        // ^ Declaramos la variable read como scanner y cambiamos su formato al de US
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        do{ // ! Pedimos todos los datos al Usuario
            System.out.print("Introduce el Alto de la Copa: ");
            copa = read.nextShort(); // * Pedimos el Alto de la Copa
        } while (copa <= 0);

        copa *= 2; // ? Multiplicamos la copa x2 para poder imprimir de 2 en 2 y no 1 en 1

        do{
            System.out.print("Introduce el Ancho del Tronco: ");
            anchoTronco = read.nextShort(); // * Pedimos el Ancho del Tronco
        } while (anchoTronco <= 0);

        do{
            System.out.print("Introduce el Alto del Tronco: ");
            altoTronco = read.nextShort(); // * Pedimos el Alto del Tronco
        } while (altoTronco <= 0);

        do{
            System.out.print("Introduce el Caracter para la Hoja: ");
            charHoja = read.next().charAt(0);
        } while (charHoja == ' ');

        do{
            System.out.print("Introduce el Caracter para el Tronco: ");
            charTronco = read.next().charAt(0);
        } while (charTronco == ' ');

        // ? Salto de Línea Triple
        System.out.println("\n----------------------------------\n");

        // ! Dibujamos el arbol según los datos, empezando por la copa
        for (short i = 0; i < copa; i+=2){
            for (int blank = (copa - 1); blank > i; blank -= 2){
                System.out.print(" ");
            }
            for (short c = 0; c < i + 1; c++){
                System.out.print(charHoja);
            } System.out.println(); // ? Cambiamos de Línea
        }

        // ! Dibujaremos el Tronco
        for (short i = 1; i <= altoTronco; i++){
            for (int blank = (copa - 1); blank > 1; blank -=2){
                System.out.print(" ");
            }
            for (short c = 1; c <= anchoTronco; c++){
                System.out.print(charTronco);
            } System.out.println(); // ? Cambiamos de Línea
        }

        // ^ Cerramos el Scaner
        read.close();
    }
}
