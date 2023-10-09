package ejerciciosenumerados.ejercicio1;

/**
 * Clase que crea una cuenta corriente asignada a un usuario, contiene todos los métodos y constructores necesarios para su manipulación
 * @author Antonio Navarro
 * @version 1.0 Release
 */
public class CuentaCorrienteEnum {
    /**
     * Generos disponibles
     */
    private enum Sexo {
        HOMBRE,
        MUJER
    };    

    /**
     * DNI del usuario
     */
    public String DNI;

    /**
     * Nombre del usuario
     */
    public String nombre;

    /**
     * Saldo disponible del usuario
     */
    public float saldo;

    /**
     * Sexo del usuario
     */
    private Sexo sexo;

    /**
     * Constructor con parámetros sin nombre
     * @param DNI DNI del usuario
     * @param saldo saldo del usuario
     * @param sexo Sexo del usuario
     */
    public CuentaCorrienteEnum (String DNI, float saldo, String sexo) {
        this.DNI = DNI;
        this.saldo = saldo;

        Sexo s = Sexo.valueOf(sexo.toUpperCase());
        this.sexo = s;
    }

    /**
     * Constructor con parámetros
     * @param DNI DNI del usuario
     * @param nombre Nombre del usuario
     * @param sexo Sexo del usuario
     * @param saldo Saldo del Usuario
     */
    public CuentaCorrienteEnum (String DNI, String nombre, String sexo, float saldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldo;
        
        Sexo s = Sexo.valueOf(sexo.toUpperCase());
        this.sexo = s;
    }

    /**
     * Devuelve el Sexo del usuario
     * @return Sexo del usuario
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Asigna un Sexo al usuario
     * @param sexo Sexo del usuario
     */
    public void setSexo(String sexo) {
        Sexo s = Sexo.valueOf(sexo.toUpperCase());
        this.sexo = s;
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
    public String toString() {
        String s = "DNI: " + DNI + "\nNombre: " + nombre + "\nGénero: " + sexo + "\nSaldo: " + saldo + "\n";
        return s;
    }
}
