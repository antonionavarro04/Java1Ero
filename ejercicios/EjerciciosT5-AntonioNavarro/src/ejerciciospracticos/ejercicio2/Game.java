package ejerciciospracticos.ejercicio2;
// TODO | Falta comentar toda la Clase

import ejerciciospracticos.funciones.Mathematics;

public class Game {
    public static final float CARTAS_DISPONIBLES[][] = {
        {1, 2, 3, 4, 5, 6, 7, 0.5f, 0.5f, 0.5f}, // 0 == Oros
        {1, 2, 3, 4, 5, 6, 7, 0.5f, 0.5f, 0.5f}, // 1 == Copas
        {1, 2, 3, 4, 5, 6, 7, 0.5f, 0.5f, 0.5f}, // 2 == Espadas
        {1, 2, 3, 4, 5, 6, 7, 0.5f, 0.5f, 0.5f}, // 3 == Bastos
    };

    public static float mazoJugador1;
    public static float mazoJugador2;

    public static final float THRESHOLD = 7.5f;

    public static void sacaCarta(String nombre) {
        float mazo;

        int coordenadaY = Mathematics.rng(CARTAS_DISPONIBLES.length - 1);
        int coordenadaX = Mathematics.rng(CARTAS_DISPONIBLES[0].length - 1);

        String nombreCarta, valorCarta;

        switch (coordenadaY) {
            case 0:
                nombreCarta = "Oros";
                break;
            case 1:
                nombreCarta = "Copas";
                break;
            case 2:
                nombreCarta = "Espadas";
                break;
            case 3:
                nombreCarta = "Bastos";
                break;
            default:
                nombreCarta = "ERROR";
                break;
        }

        switch (coordenadaX) {
            case 7:
                valorCarta = "Sota";
                break;
            case 8:
                valorCarta = "Caballo";
                break;
            case 9:
                valorCarta = "Rey";
                break;
            default:
                valorCarta = String.valueOf((int) (coordenadaX + 1));
                break;
        }

        System.out.printf("Tu carta es: %s de %s\n", valorCarta, nombreCarta);

        mazo = CARTAS_DISPONIBLES[coordenadaY][coordenadaX];
        
        if (nombre == Main.NOMBRE_JUGADOR_1) {
            mazoJugador1 += mazo;
            System.out.printf("Tienes %s puntos\n\n", mazoJugador1);
        } else {
            mazoJugador2 += mazo;
            System.out.printf("Tienes %s puntos\n\n", mazoJugador2);
        }
    }

    public static boolean menu(String jugador) {
        char opcion;
        boolean movimiento;

        System.out.printf("Es el turno de %s\nQuieres sacar una carta (Y/N)? >>> ", jugador);
        opcion = Scan.read.nextLine().charAt(0);

        switch (opcion) {
            case 'N':
            case 'n':
                movimiento = false;                
                break;
            default:
                movimiento = true;
                break;
        } return movimiento;
    }

    public static boolean check(float mazo) {
        boolean seHaPasado = false;

        if (mazo > THRESHOLD) {
            seHaPasado = true;
        }

        return seHaPasado;
    }

    public static void ganador(String n1, String n2, boolean j2perdio) {
        if (j2perdio) {
            System.out.printf("El ganador es %s con %s puntos", n1, mazoJugador1);
        } else {
            if (mazoJugador1 > 0 && mazoJugador2 == 0) {
                System.out.printf("El ganador es %s con %s puntos", n2, mazoJugador2);
            } else if (mazoJugador1 > mazoJugador2) {
                System.out.printf("El ganador es %s con %s puntos", n1, mazoJugador1);
            } else if (mazoJugador1 < mazoJugador2) {
                System.out.printf("El ganador es %s con %s puntos", n2, mazoJugador2);
            } else {
                System.out.printf("Empate con %s puntos", mazoJugador1);
            }
        }
    }
}
