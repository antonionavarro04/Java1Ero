package ejercicios.ejercicio1;

/**
 * Clase que crea una hora y permite pasar el tiempo en minutos, no da la hora en segundos
 * @author Antonio Navarro
 * @version 1.0 Release
 */
public class Hora {
    /**
     * Hora de la hora
     */
    private int hora;

    /**
     * Minuto de la hora
     */
    private int minuto;

    /**
     * Constructor con parámetros, crea la hora con los valores indicados
     * @param hora Hora de la hora
     * @param minuto Minuto de la hora
     */
    public Hora (int hora, int minuto) {
        if (hora > 23 || hora < 0) { // ? Si la hora esta en un rango ilegal
            hora = 0; // ! Se pone a 0
        } else if (minuto > 59 || minuto < 0) { // ? Si los minutos estan en un rango ilegal
            minuto = 0; // ! Se pone a 0
        }

        // ! Se asignan los valores
        this.hora = hora;
        this.minuto = minuto;
    }

    /**
     * Incrementa la hora en 1 minuto
     */
    public void inc() {
        this.minuto++; // ! Incrementamos el minuto en 1

        if (this.minuto > 59) { // ? Si los minutos se han pasado de 59
            this.minuto = 0; // ! Reseteamos los minutos
            hora++; // ! Y sumamos en 1 la hora
        } if (this.hora > 23) { // ? Comprobaremos tambien que la hora no se haya pasado
            this.hora = 0; // ! Reseteamos la hora a 0
        }
    }

    /**
     * Establece los minutos de la hora
     * @param value Minutos a establecer
     * @return Devuelve true si se ha podido hacer y false en caso contrario
     */
    public boolean setMinutos(int value) {
        boolean state = true;

        if (value > 59 || value < 0) {
            state = false;
        } else {
            this.minuto = value;
        } return state;
    }

    /**
     * Establece la hora de la hora
     * @param value Hora a establecer
     * @return Devuelve true si se ha podido hacer y false en caso contrario
     */
    public boolean setHora(int value) {
        boolean state = true;

        if (value > 23 || value < 0) {
            state = false;
        } else {
            this.hora = value;
        } return state;
    }

    /**
     * Devuelve la hora en una String con formato HH:MM
     * @return String creada y formada
     */
    @ Override
    public String toString() {
        return (hora < 10 ? "0" + hora : hora) + ":" + (minuto < 10 ? "0" + minuto : minuto);
    }
}
