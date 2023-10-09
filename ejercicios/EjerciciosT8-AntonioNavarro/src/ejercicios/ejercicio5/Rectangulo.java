package ejercicios.ejercicio5;

/**
 * Clase que representa un Rectángulo, hereda de la clase Polígono
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Poligono
 */
public class Rectangulo extends Poligono {
    /**
     * Longitud del primer lado
     */
    private double lado1;

    /**
     * Longitud del segundo lado
     */
    private double lado2;

    /**
     * Constructor sin parámetros
     */
    public Rectangulo () {
        super(4);
    }

    /**
     * Constructor con Parámetros
     * @param lado1 Longitud del lado1
     * @param lado2 Longitud del lado2
     */
    public Rectangulo (double lado1, double lado2) {
        super(4);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Devuelve el lado1 del rectangulo
     * @return lado1 del rectangulo
     */
    public double getLado1() {
        return this.lado1;
    }

    /**
     * Establece el valor del lado1
     * @param lado1 nuevo valor para el lado1
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    
    /**
     * Devuelve el lado2 del rectangulo
     * @return lado2 del rectangulo
     */
    public double getLado2() {
        return this.lado2;
    }

    /**
     * Establece el valor del lado2
     * @param lado2 nuevo valor para el lado2
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Devuelve el area del Rectangulo
     */
    public double area() {
        return lado1 * lado2;
    }

    /**
     * Construye una cadena con la información del rectángulo
     * @return Cadena creada y formado
     */
    @ Override
    public String toString() {
        return
        "Tipo: \"" + getClass().getSimpleName() + "\""
        + "\n" + super.toString()
        + "\n" + "Anchura: " + this.lado1 + 'm'
        + "\n" + "Altura: " + this.lado2 + 'm'
        + "\n" + "Area: " + this.area() + "m²"
        ;
    }
}