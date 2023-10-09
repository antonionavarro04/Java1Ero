package ejercicios.ejercicio4;

/**
 * Clase que crea un electrodoméstico
 * @author Antonio Navarro
 * @version 1.0 Release
 */
public class Electrodomestico {
    /**
     * Consumos energéticos disponibles
     */
    private enum ConsumosEnergeticos {
        A, B, C, D, E, F
    }

    /**
     * Colores disponibles
     */
    private enum Colores {
        BLANCO, NEGRO, ROJO, AZUL, GRIS
    }

    /**
     * Precio base del electrodoméstico
     */
    protected float precioBase = 100.0f;

    /**
     * Peso del electrodoméstico
     */
    protected float peso = 5.0f;

    /**
     * Color del electrodoméstico
     */
    protected Colores color = Colores.BLANCO;;

    /**
     * Consumo energético del electrodoméstico, es de tipo enum
     */
    protected ConsumosEnergeticos consumoEnergetico = ConsumosEnergeticos.F;

    /**
     * Constructor por defecto
     */
    public Electrodomestico () {
        // // Constructor por Defecto
    }

    /**
     * Constructor con peso y precio
     */
    public Electrodomestico (float precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    /**
     * Constructor por parámetros
     */
    public Electrodomestico (float precioBase, float peso, String color, String consumoEnergetico) {
        this.precioBase = precioBase;
        this.peso = peso;

        // ! Pasamos el color a String mayuscula
        color = color.toUpperCase();
        if (comprobarColor(color)) { // ? Si el color es correcto
            this.color = Colores.valueOf(color); // ! Pasamos el String a enum
        }

        // ! Comprobamos que la letra es correcta
        if (comprobarConsumoEnergetico(consumoEnergetico.charAt(0))) {
            this.consumoEnergetico = ConsumosEnergeticos.valueOf(consumoEnergetico.toUpperCase());    
        }
    }

    /**
     * Devuelve el precio base del electrodoméstico
     * @return precio base del electrodoméstico
     */
    public float getPrecioBase() {
        return this.precioBase;
    }

    /**
     * Establece el precio base del electrodoméstico
     */
    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    /**
     * Devuelve el peso del electrodoméstico
     * @return peso del electrodoméstico
     */
    public float getPeso() {
        return this.peso;
    }

    /**
     * Establece el peso del electrodoméstico
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Devuelve el color del electrodoméstico
     * @return color del electrodoméstico
     */
    public Colores getColor() {
        return this.color;
    }

    /**
     * Establece el color del electrodoméstico
     */
    public void setColor(String color) {
        this.color = Colores.valueOf(color.toUpperCase());
    }

    /**
     * Devuelve el consumo energético del electrodoméstico
     * @return consumo energético del electrodoméstico
     */
    public ConsumosEnergeticos getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    /**
     * Establece el consumo energético del electrodoméstico
     */
    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = ConsumosEnergeticos.valueOf(consumoEnergetico.toUpperCase());
        
    }

    /**
     * Comprueba que la letra del consumo energético sea correcta
     * @param c letra del consumo energético
     * @return true si es correcta, false si no lo es
     */
    private boolean comprobarConsumoEnergetico(char c) {
        boolean state = false, notExists = false;
        int i = 0;
        
        while (!state && !notExists) {
            try {
                if (ConsumosEnergeticos.valueOf(String.valueOf(c)) == ConsumosEnergeticos.values()[i]) {
                    state = true;
                }
            } catch (Exception e) {
                notExists = true;
            } finally {
                i++;
            }
        } return state;
    }

    /**
     * Compruba que el color sea correcto
     * @param color color del electrodoméstico
     * @return true si es correcto, false si no lo es
     */
    private boolean comprobarColor(String color) {
        boolean state = false;

        switch (color) {
            case "ROJO":
            case "BLANCO":
            case "AZUL":
            case "GRIS":
            case "NEGRO":
                state = true;
                break;
        } return state;
    }

    /**
     * Calcula el precio final que tendra un producto en base a sus atributos de consumo energético y peso
     * @return
     */
    public float precioFinal() {
        // ^ Definimos la variable incremento a 0
        int incremento = 0;

        // ! Creamos un Switch case con lo que valga consumoEnergetico
        switch (this.consumoEnergetico) {
            case A:
                incremento += 100;
                break;
        
            case B:
                incremento += 80;
                break;

            case C:
                incremento += 60;
                break;

            case D:
                incremento += 50;
                break;

            case E:
                incremento += 30;
                break;

            case F:
                incremento += 10;
                break;
        }

        // ! Según el peso actualizaremos la variable incremento
        if (this.peso >= 0 && this.peso < 20) {
            incremento += 10;
        } else if (this.peso >= 20 && this.peso < 50) {
            incremento += 50;
        } else if (this.peso >= 50 && this.peso < 80) {
            incremento += 80;
        } else if (this.peso >= 80) {
            incremento += 100;
        }

        // ! Devolvemos el precio base + el incremento
        return precioBase + incremento;
    }
}
