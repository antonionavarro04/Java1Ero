package ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Hora normal = new Hora(0, 0);
        HoraExacta exacta = new HoraExacta(0, 0, 0);

        while (true) {
            System.out.println(normal);
            System.out.println(exacta);
            normal.inc();
            exacta.inc();
        }
    }
}
