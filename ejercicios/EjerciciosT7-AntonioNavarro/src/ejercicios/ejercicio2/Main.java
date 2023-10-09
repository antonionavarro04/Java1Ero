package ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Quijote", "Ceervantes (Creo)", 10, 5);

        for (int i = 1; i <= 11; i++) {
            boolean state = libro1.prestar();
            if (state) {
                System.out.println("Libro prestado satisfactoriamente");
            } else {
                System.out.println("No hay ejemplares para prestar");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        }

        for (int i = 1; i <= 16; i++) {
            boolean state = libro1.devolver();
            if (state) {
                System.out.println("Libro devuelto satisfactoriamente");
            } else {
                System.out.println("No hay ejemplares para devolver");
            }
        }
    }
}
