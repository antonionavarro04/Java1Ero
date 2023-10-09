package ejercicioscrud.ejercicio1;

public class Methods {
    // ^ Definimos un array de Alumnos de 30 posiciones
    public static Alumno alumnos[] = new Alumno[30];

    public static String printArray() {
        // ^ Definimos una variable de tipo String
        String s = "";

        // ! Recorremos el array de alumnos
        for (int pos = 0; pos < alumnos.length; pos++) {
            if (!alumnos[pos].getNombre().isEmpty()) { // ? Si el nombre del alumno no esta vacío
                s += (pos + 1) + ". " + alumnos[pos].toString() + "\n"; // ! Añadimos el alumno al String junto a su posición + 1 y un salto de linea
            }
        } return s;
    }

    public static boolean modificarAlumno(String nombre, int notaMedia) {
        // ^ Definimos una variable de tipo boolean, si al final es false querra decir que no se realizo la operacion
        boolean state = false;

        // ! Recorremos el array de alumnos
        for (int pos = 0; pos < alumnos.length; pos++) {
            if (alumnos[pos].getNombre().equals(nombre)) { // ? Si el nombre del alumno es igual al nombre pasado por parámetro
                alumnos[pos].setNotaMedia(notaMedia); // ! Modificamos la nota media del alumno
                state = true;
                break;
            }
        } return state;
    }

    public static boolean borrarAlumno(String nombre) {
        // ^ Definimos una variable de tipo boolean, si al final es false querra decir que no se realizo la operacion
        boolean state = false;

        // ! Recorremos el array de alumnos
        for (int pos = 0; pos < alumnos.length; pos++) {
            if (alumnos[pos].getNombre().equals(nombre)) { // ? Si el nombre del alumno es igual al nombre pasado por parámetro
                alumnos[pos].setNombre(""); // ! Borramos el nombre del alumno, existe aun la nota pero no se mostrará
                state = true;
                break;
            }
        } return state;
    }
}
