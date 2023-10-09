package ejercicios.ejercicio1;

/**
 * Clase HoraExacta, crea una hora con sus segundos
 * Hereda la clase Hora
 */
public class HoraExacta extends Hora {
    /**
     * Segundo de la hora
     */
    private int segundo;
    
    /**
     * Constructor con parámetros, crea la hora con los valores indicados
     * @param hora Hora de la hora
     * @param minuto Minuto de la hora
     * @param segundo Segundo de la hora
     */
    public HoraExacta (int hora, int minuto, int segundo) {
        super(hora, minuto); // ! Llamamos al constructor de la clase padre

        if (segundo > 59 || segundo < 0) { // ? Si los segundos estan en un rango ilegal
            segundo = 0; // ! Se pone a 0
        }

        // ! Se asigna el valor
        this.segundo = segundo;
    }

    /**
     * Incrementa la hora en 1 segundo
     */
    public boolean setSegundo(int value) {
        boolean state = true;

        if (segundo > 59 || segundo < 0) {
            state = false;
        } else {
            this.segundo = value;
        } return state;
    }

    /**
     * Incrementa en 1 los segundos
     */
    @ Override
    public void inc() {
        this.segundo++; // ! Incrementamos en 1 el segundo

        if (segundo > 59) {
            this.segundo = 0; // ! Reseteamos los segundos
            super.inc(); // ! Y llamamos al método inc de la clase padre
        }
    }

    /**
     * Devuelve la hora en una String de formato hh:mm:ss
     * @return String creada y formada
     */
    @ Override
    public String toString() {
        return super.toString() + ":" + (segundo < 10 ? "0" : "") + segundo;
    }

}
