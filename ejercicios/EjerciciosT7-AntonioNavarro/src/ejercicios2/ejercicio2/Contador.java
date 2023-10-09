package ejercicios2.ejercicio2;

/**
 * Clase que crea un Contador, con todos los atributos, métodos y constructores necesarios para su correcto funcionamiento
 * @author Antonio Navarro
 * @version Release 1.0
 */
public class Contador {
    /**
     * Contador
     */
    private int cont;

    /**
     * Constructor por Defecto
     */
    public Contador () {
        // ? Constructor por Defecto
    }

    /**
     * Constructor por parámetros
     * @param cont Contador
     */
    public Contador (int cont) {
        if (cont < 0) {
            System.err.println("El valor no puede ser Negativo");
        } else {
            this.cont = cont;
        }
    }

    /**
     * Constructor copia
     * @param object Contador a copiar
     */
    public Contador (Contador object) {
        this.cont = object.cont;
    }

    /**
     * Método que devuelve el valor del contador
     * @return Valor del contador
     */
    public int getCont() {
        return this.cont;
    }

    /**
     * Método que modifica el valor del contador
     * @param cont Nuevo valor del contador
     */
    public void setCont(int cont) {
        this.cont = cont;
    }

    /**
     * Método que incrementa el contador
     */
    public void incrementar() {
        this.cont++;
    }

    /**
     * Método que decrementa el contador, si el contador queda como -1 se pondrá a 0
     */
    public void decrementar() {
        this.cont--;
        if (this.cont == -1) {
            this.cont = 0;
        }
    }
}
