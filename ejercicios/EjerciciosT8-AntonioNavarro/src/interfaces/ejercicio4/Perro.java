package interfaces.ejercicio4;

/**
 * Clase que crea un Perro
 * @author Antonio Navarro
 * @version 1.0
 * @see AnimalDomestico
 */
public class Perro extends AnimalDomestico {
    /**
     * Constructor con Parámetros
     */
    public Perro (String nombre, String raza, float peso, String color) {
        super(nombre, raza, peso, color);
    }

    /**
     * Método que hace que el Perro ladre
     */
    @ Override
    public void hacerRuido() {
        System.out.println("El perro ha ladrado");
    }

    /**
     * Método que hace que el perro sea sacado a pasear
     */
    public void sacarAPasear() {
        System.out.println("El perro ha sido sacado a pasear");
    }

    /**
     * Método que hace que el Perro te haga caso
     * 90% chance de hacerte caso
     * @return True si te ha hecho caso, false en caso contrario
     */
    public boolean hacerCaso() {
        boolean state = true;

        // ? Si el al generar un numero entre 0.0d y 1.0d el número es menor que 0.1d querrá decir que el 90% de las veces va a devolver true
        if (Math.random() < 0.1d) {
            state = false;
        }

        return state;
    }
}
