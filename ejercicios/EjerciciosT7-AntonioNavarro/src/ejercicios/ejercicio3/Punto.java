package ejercicios.ejercicio3;

/**
 * Clase que crea un punto en un eje cartesiano, contiene todos los métodos y constructores necesarios para su correcta manipulación
 * @author Antonio Navarro
 * @version v1.0 Release
 */
public class Punto {
    /**
     * Posición del punto en la coordenada x (Horizontal)
     */
    public int x;

    /**
     * Posición del punto en la coordenada y (Vertical)
     */
    public int y;

    /**
     * Constructor con parámetros
     * @param x Posición del punto en el eje x
     * @param y Posición del punto en el eje y
     */
    public Punto (int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Crea una cadena con las coordenadas del punto
     * @return Cadena con la información
     */
    public String toString() {
        return "[" + x + " : " + y + "]";
    }

    /**
     * Establece una nueva posición tanto en el eje x com oen el eje y
     * @param x Nueva posición para el eje x
     * @param y Nueva posición para el eje y
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Desplaza cada uno de los puntos el número de posiciones indicadas
     * @param dx Cantidad de posiciones a mover el eje x
     * @param dy Cantidad de posiciones a mover el eje y
     */
    public void desplaza(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Calcula la distancia que hay entre el punto y otro punto
     * @param p Punto diferente al punto
     * @return Distancia respecto al punto
     */
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
    }
}
