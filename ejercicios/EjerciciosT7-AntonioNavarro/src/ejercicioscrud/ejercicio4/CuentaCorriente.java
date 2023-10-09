package ejercicioscrud.ejercicio4;

import funciones.Mathematics;

/**
 * Clase que crea una cuenta corriente asignada a un usuario, contiene todos los métodos y constructores necesarios para su manipulación
 * @author Antonio Navarro
 * @version 1.0 Release
 */
public class CuentaCorriente {
    /**
     * DNI del usuario
     */
    private String dni;

    /**
     * Nombre del usuario
     */
    private String nombre;

    /**
     * Saldo disponible del usuario
     */
    private float saldo;

    /**
     * Constructor con parámetros sin nombre
     * @param DNI DNI del usuario
     * @param saldo saldo del usuario
     */
    public CuentaCorriente (String dni, float saldo) {
        if (dni.isEmpty()) { // ? Si está vacío generaremos un ERROR junto a un dni aleatorio que será temporal
            String newDni = String.valueOf(Mathematics.rng(99999999, 11111111));

            newDni += Mathematics.randomChar();

            dni = "ERROR-" + newDni;
        } this.dni = dni;
        
        this.nombre = "";
        this.saldo = saldo;
    }

    /**
     * Constructor con parámetros
     * @param DNI DNI del usuario
     * @param nombre Nombre del usuario
     * @param saldo Saldo del Usuario
     */
    public CuentaCorriente (String dni, String nombre, float saldo) {
        if (dni.isEmpty()) { // ? Si está vacío generaremos un ERROR junto a un dni aleatorio que será temporal
            String newDni = String.valueOf(Mathematics.rng(99999999, 11111111));

            newDni += Mathematics.randomChar();

            dni = "ERROR-" + newDni;
        } this.dni = dni;

        this.nombre = nombre;
        this.saldo = saldo;
    }

    /**
     * @return Devuelve el Dni del usuario
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni Establece un Dni para el usuario
     */
    public void setDni(String dni) {
        if (dni.isEmpty()) { // ? Si está vacío generaremos un ERROR junto a un dni aleatorio que será temporal
            String newDni = String.valueOf(Mathematics.rng(99999999, 11111111));

            newDni += Mathematics.randomChar();

            dni = "ERROR-" + newDni;
        } this.dni = dni;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return float return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que saca una cantidad de dinero indicada por parámetros en caso de que el usuario tenga esa cantidad disponible
     * @param cantidad Cantidad a sacar
     * @return Si se ha podido completar la operación o no
     */
    public boolean sacarDinero(float cantidad) {
        boolean state = true;

        if (saldo - cantidad < 0) {
            state = false;
        } else {
            saldo -= cantidad;
        }

        return state;
    }

    /**
     * Método que ingresa una cantidad de dinero indicada por parámetros en la cuenta
     * @param cantidad Cantidad a ingresar
     */
    public void ingresarDinero(float cantidad) {
        saldo += cantidad;
    }

    /**
     * Método que crea una cadena con la información de la cuenta bancaria
     * @return Cadena con la información
     */
    @ Override
    public String toString() {
        // ^ Preparamos la cadena
        String s = "{\n  DNI: \"" + dni + "\",\n  Nombre: \"";
        if (!nombre.isEmpty()) { // ? Si la cuenta tiene un nombre asociado
            s += nombre; // ! Agregamos el nombre
        } else {
            s += "Sin Nombre Asociado";
        }

        // ! Agregamos el salario
        s += "\",\n  Saldo: " + saldo + "\n}";

        // ! Devolvemos la cadena
        return s;
    }
}
