package ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("12345678A", "Mateo", 10000);

        if (cc.sacarDinero(11000)) {
            System.out.println("Dinero sacado correctamente");
        } else {
            System.out.println("No dispone de la cantidad");
        }

        if (cc.sacarDinero(9999)) {
            System.out.println("Dinero sacado correctamente");
        } else {
            System.out.println("No dispone de la cantidad");
        }

        cc.ingresarDinero(1.1f);

        System.out.println(cc);
    }
}
