package interfaces.ejercicio4;

/**
 * Clase que crea un Gato
 * @author Antonio Navarro
 * @version 1.0
 * @see AnimalDomestico
 */
public class Gato extends AnimalDomestico {
    /**
     * Constructor con Parámetros
     */
    public Gato (String nombre, String raza, float peso, String color) {
        super(nombre, raza, peso, color);
    }

    /**
     * Método que hace que el Gato maulle
     */
    @ Override
    public void hacerRuido() {
        System.out.println("El gato ha maullado");
    }

    /**
     * Método que hace que el gato tosa una bola de pelo
     */
    public void toserBolaDePelo() {
        System.out.println("El gato ha tosido una bola de pelo");
    }

    /**
     * Método que hace que el Gato te haga caso
     * 5% chance de hacerte caso
     * @return True si te ha hecho caso, false en caso contrario
     */
    public boolean hacerCaso() {
        boolean state = false;

        // ? Si el al generar un numero entre 0.0d y 1.0d el número es menor que 0.05d querrá decir que el 5% de las veces va a devolver true
        if (Math.random() < 0.05d) {
            state = true;
        }

        return state;
    }
}
