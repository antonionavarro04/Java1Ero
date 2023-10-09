package ejercicios.ejercicio5;

/**
 * Clase que representa un Triángulo, hereda de la clase Polígono
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Poligono
 */
public class Triangulo extends Poligono {
    /**
     * Lado1 del triángulo
     */
    private double lado1;

    /**
     * Lado2 del triángulo
     */
    private double lado2;

    /**
     * Lado3 del triángulo
     */
    private double lado3;

    /**
     * Constructor sin parámetros
     */
    public Triangulo () {
        super(3);
    }

    /**
     * Constructor con parámetros
     * @param lado1
     * @param lado2
     * @param lado3
     */
    public Triangulo (double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Devuelve el lado1 del triángulo
     * @return lado1 del triángulo
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Establece un valor para el lado1
     * @param lado1 Nuevo valor para el lado1
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    
    /**
     * Devuelve el lado2 del triángulo
     * @return lado2 del triángulo
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Establece un valor para el lado2
     * @param lado2 Nuevo valor para el lado2
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Devuelve el lado3 del triángulo
     * @return lado3 del triángulo
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * Establece un valor para el lado3
     * @param lado3 Nuevo valor para el lado3
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Calcula el area del Triágnulo utilizando la formula de Herón
     * @return Area del Triágnulo
     */
    public double area() {
        final double SEMIPERIMETRO = (this.lado1 + this.lado2 + this.lado3) / 2.0d;

        return Math.sqrt(SEMIPERIMETRO * (SEMIPERIMETRO - this.lado1) * (SEMIPERIMETRO - this.lado2) * (SEMIPERIMETRO - this.lado3));
    }
    
    /**
     * Crea una cadena con la información del Triángulo
     * @return Cadena creada y formada
     */
    @ Override
    public String toString() {
        return
        "Tipo: " + "\"" + getClass().getSimpleName() + "\""
        + "\n" + super.toString()
        + "\n" + "Lado 1: " + lado1 + 'm'
        + "\n" + "Lado 2: " + lado2 + 'm'
        + "\n" + "Lado 3: " + lado3 + 'm'
        + "\n" + "Area: " + this.area() + "m²"
        ;
    }
}
