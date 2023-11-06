package examen;

/**
 * Clase que contiene todos los metodos y variables para el correcto funcionamiento del juego del ahorcado
 * @author Antonio Navarro 1º DAM,.
 * @version 1.0 Release
 */
public class Game {
    /**
     * Almacena las Palabras posibles que puede mostrar el juego
     */
    public static String palabras[] = {
        "humanidad",
        "persona",
        "hombre",
        "mujer",
        "individuo",
        "cuerpo",
        "pierna",
        "cabeza",
        "brazo",
        "familia"
    };

    /**
     * Numero de intentos totales
     */
    public static final int NUMINTENTOS = 7;

    /**
     * Cadena que el usuario debe de acertar
     */
    public static String palabraSecreta = "";

    /**
     * Cadena que va a contener los caracteres que el usuario haya acertado
     */
    public static String palabraPista = "";

    /**
     * Cadena que contendrá todos los caracteres que el usuario ya ha usado pero que no ha acertado
     */
    public static String noAcertadas = "";

    /**
     * Función que genera la palabra secreta de entre todas las palabras de la variable palabra
     */
    public static void generaPalabra() {
        // ! Generamos una palabra aleatoria de entre todo el array, la guardamos en palabraSecreta
        palabraSecreta = palabras[(int) (Math.random() * palabras.length)];
    }

    /**
     * Función que imprime un menú en el que se recojerá la opción que introduzca el usuario
     * @return El valor que ha introducido el usuario
     */
    public static int menu() {
        int opcion; // * Definimos una variable de tipo entero

        // * Imprimimos el menú y recogemos la opción
        System.out.printf("Seleccione una de las siguientes opciones:\n1. Introducir letra.\n2. Introducir palabra.\n>>> ");
        opcion = Main.read.nextInt();

        return opcion; // * Devolvemos la opción
    }

    /**
     * Función que comprueba si la letra está en la cadena palabraSecreta, en caso de estarlo la añade a palabraPista, en caso contrario la añade a noAcertadas
     * @param letra Letra que va a ser comprobada
     */
    public static void compruebaLetra(char letra) {
        String newPalabraPista = ""; // * Definimos una nueva palabraPista inicializada en 0

        if (palabraSecreta.contains(String.valueOf(letra))) { // ? Si la palabra secreta contiene la letra
            for (int pos = 0; pos < palabraSecreta.length(); pos++) { // ! Inicializamos un bucle for que recorrerá la palabra secreta
                if (palabraSecreta.charAt(pos) == letra) { // ? En caso de encontrarse el caracter
                    newPalabraPista += palabraSecreta.charAt(pos); // ! Lo añade a la nueva palabraPista
                } else { // ? En caso contrario
                    newPalabraPista += palabraPista.charAt(pos); // ! Añade el caracter existente en la antigua palabraPista
                }
            } palabraPista = newPalabraPista; // ! Sobreescribimos el valor de palabraPista con la nuevaPalabraPista
        } else if (!noAcertadas.contains(String.valueOf(letra))) { // ? En caso contrario, si en las noAcertadas no se encuentra la letra
            noAcertadas += letra; // ! Se añade a las noAcertadas
        }
    }

    /**
     * Comprueba si la la palabra introducida por el usuario es igual a la plabraSecreta, en caso de serlo sustituye la palabraPista por la palabraSecreta, en caso contrario no hará nada
     * @param palabra Palabra que va a ser comprobada
     */
    public static void compruebaPalabra(String palabra) {
        // ? Si la palabra introducida por el usuario (da igual si es mayus o minus) es igual a la palabra secreta
        if (palabra.equalsIgnoreCase(palabraSecreta)) {
            palabraPista = palabraSecreta; // ! Sobreescribimos la palabraPista por la palabraSecreta, pues, ha acertado
        }
    }

    /**
     * Pinta la información referente al Juego, pinta en primer lugar las letras que se han usado pero no se han acertado y en segundo lugar el estado actual de la palabraPista
     */
    public static void pintaPista() {
        System.out.print("Letras usadas no acertadas: ");
        System.out.print("[");
        for (int pos = 0; pos < noAcertadas.length(); pos++) {
            System.out.printf("'%s'", noAcertadas.charAt(pos)); // Imprimimos la letra ya usada
            if (pos != noAcertadas.length() - 1) { // ? Si la posición no es la última
                System.out.printf(", ", noAcertadas.charAt(pos)); // ! Imprimimos la coma
            }
        } System.out.println("]");
        System.out.println("Pista: " + palabraPista); // Imprimimos la pista
    }
}
