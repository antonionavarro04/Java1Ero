package ejercicioscrud.ejercicio3;

import funciones.Mathematics;

/**
 * Clase que contiene los constructores, métodos, atributos y enumerados que se requieren para la correcta creación de una pizza
 * @author Arturo
 * @version 1.0 Alpha
 */
public class Pizza extends Object {
    /**
     * Valores que puede tener el tamanho de la pizza
     */
    private enum Tamanho {
        MEDIANA,
        FAMILIAR
    }

    /**
     * Valores que puede tener el tipo de la pizza
     */
    private enum Tipo {
        MARGARITA,
        CUATROQUESOS,
        FUNGHI
    }

    /**
     * Valores que puede tomar el estado
     */
    private enum Estado {
        PEDIDA,
        SERVIDA
    }

    /**
     * Código de la pizza
     */
    private String codigo;

    /**
     * Tamanho de la pizza, es de tipo Tamanho que es un enum
     */
    private Tamanho tamanho;

    /**
     * Tipo de la pizza, es de tipo Tipo que es un enum
     */
    private Tipo tipo;

    /**
     * Estado en el que se encuentra la pizza, es de tipo enum
     */
    private Estado estado;

    /**
     * Constructor por Defecto, el estado siempre va a ser inicialmente servida
     */
    public Pizza () {
        this.estado = Estado.PEDIDA;
    }

    /**
     * Constructor con parámetros, el estado siempre va a ser inicialmente servida
     * @param codigo Código de la pizza
     * @param tamanho Tamanho de la pizza
     * @param tipo Tipo de la pizza
     */
    public Pizza (String codigo, String tamanho, String tipo) {
        if (codigo.isEmpty()) { // ? En caso de que no haya pasado ningún código generaremos uno aleatorio
            String s;
            boolean original = true;
            
            do { // ? Generamos un número aleatorio como String
                s = String.valueOf(Mathematics.rng(99999, 0));
                Pizza arr[] = Methods.pedidos; // ^ Referenciamos el Array de la clase Methods en la variable arr[]

                // ? Recorremos el array en busca del código, si ya se encuentra le diremos que el código no es original y se repetirá el bucle
                for (int pos = 0; pos < arr.length; pos++) {
                    if (arr[pos].codigo.equals(s)) {
                        original = false;
                        break;
                    }
                }
            } while (!original);

            codigo = s; // ! Sobreescribimos la variable código
        } // ? En caso contrario aceptamos el código del usuario
            this.codigo = codigo;

        if (tamanho.isEmpty()) {
            this.tamanho = Tamanho.MEDIANA;
        } else {
            this.tamanho = Tamanho.valueOf(tamanho.toUpperCase());
        }

        if (tipo.isEmpty()) {
            this.tipo = Tipo.MARGARITA;
        } else {
            this.tipo = Tipo.valueOf(tipo.toUpperCase());
        }

        this.estado = Estado.PEDIDA;
    }
    
    /**
     * @return Devuelve el código de la pizza
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo Establece un nuevo codigo a la pizza
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return Devuelve el tamanho de la pizza
     */
    public Tamanho getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho Establece un nuevo tamanho
     */
    public void setTamanho(String tamanho) {
        this.tamanho = Tamanho.valueOf(tamanho.toUpperCase());
    }

    /**
     * @return Devuelve el tipo de la pizza
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo Establece un nuevo tipo
     */
    public void setTipo(String tipo) {
        this.tipo = Tipo.valueOf(tipo.toUpperCase());
    }

    /**
     * @return Estado Devuelve el estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado Establece un nuevo estado
     */
    public void setEstado(String estado) {
        this.estado = Estado.valueOf(estado.toUpperCase());
    }

    /**
     * Crea y devuelve una String con la información del pedido
     * @return Cadena ya montada
     */
    @ Override
    public String toString() {
        return "{" +
            "\n  Código: \"" + codigo + "\"" +
            ",\n  Tamaño: \"" + tamanho + "\"" +
            ",\n  Tipo: " + tipo +
            ",\n  Estado: " + estado +
        "\n}";
    }
}
