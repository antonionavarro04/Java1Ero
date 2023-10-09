package ejercicios2.ejercicio4;

public class Funciones {
    // ^ Definimos un array de Discos de 10 posiciones
    public static Disco coleccion[] = new Disco[10];

    private static byte newPositions = 0;

    public static void listado(Disco[] coleccion) {
        byte calculo = (byte) (coleccion.length - 1);

        for (int pos = 0; pos < coleccion.length; pos++) {
            if (!coleccion[pos].getCodigo().equals("LIBRE")) {
                System.out.println(coleccion[pos].toString());

                if (pos != calculo) {
                    System.out.println("\n--------------------------------\n");
                }
            }
        }
    }

    public static void crearDisco(String codigo, String autor, String titulo, String genero, int duracion) {
        coleccion[newPositions].setCodigo(codigo);
        coleccion[newPositions].setAutor(autor);
        coleccion[newPositions].setTitulo(titulo);
        coleccion[newPositions].setGenero(genero);
        coleccion[newPositions].setDuracion(duracion);
    }

    public static void modificarDisco(String codigo, String autor, String titulo, String genero, int duracion, byte posicion) {
        coleccion[posicion].setCodigo(codigo);
        coleccion[posicion].setAutor(autor);
        coleccion[posicion].setTitulo(titulo);
        coleccion[posicion].setGenero(genero);
        coleccion[posicion].setDuracion(duracion);
    }

    public static void borrarDisco(String codigo) {
        for (int pos = 0; pos < coleccion.length; pos++) {
            if (coleccion[pos].getCodigo().equals(codigo)) {
                coleccion[pos].setCodigo("LIBRE");
            }
        }
    }

    public static void resetearContador() {
        for (byte pos = 0; pos < coleccion.length; pos++) {
            if (coleccion[pos].getCodigo().equals("LIBRE")) {
                newPositions = pos;
                break;
            }
        }
    }
}
