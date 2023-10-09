package ejercicios.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(1, 6);
        Punto punto2 = new Punto(8, 4);

        System.out.println(punto1);
        System.out.println(punto2);
        
        // ? Salto de Línea Triple
        System.out.println("\n-------------------------\n");

        punto1.desplaza(1, -10);
        punto2.desplaza(-1, 3);

        System.out.println(punto1);
        System.out.println(punto2 + "\n");

        System.out.println(punto1.distancia(punto2));
    }
}
