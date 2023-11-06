package examen;

/**
 * Clase que contiene los métodos para el funcionamiento del CRUD
 */
public class Methods {
    /**
     * Método que crea, construye y devuelve una cadena con la lista de los pacientes
     * @return Lista con los pacientes
     */
    public static String listarPacientes() {
        String s = "";
        
        if (PacienteMain.listaPacientes.isEmpty()) { // ? Si la lista esta vacía nuestro String a devover será un mensaje
            s = "No hay ningún paciente en la lista";
        } else { // ? En caso contrario agregaremos los pacientes al String
            int i = 1;
            for (Paciente p : PacienteMain.listaPacientes) {
                s += i + "\n";
                s += p + "\n--------------------------------------------------\n";
                i++;
            }
        } return s;
    }

    /**
     * Método que modifica un valor de un paciente
     * @param p Paciente a modificar
     * @param opcion Opción a modificar
     */
    public static void modificarPaciente(Paciente p, String opcion) {
        p = PacienteMain.listaPacientes.ceiling(p);
        PacienteMain.listaPacientes.remove(p);

        if (opcion.equalsIgnoreCase("direccion")) { // ? Si la opción es direccion
            p.setDireccion(PacienteMain.read.nextLine()); // ! Pedimos la nueva dirección
        } else if (opcion.equalsIgnoreCase("baja")) { // ? Si la opción es baja
            boolean baja = false;
            String valor = PacienteMain.read.nextLine();
            if (valor.equalsIgnoreCase("si")) { // ! Pedimos la baja
                baja = true;
            } p.setBaja(baja);
        } else { // ? En caso contario decimos que la opción es inválida
            System.err.printf("Opción \"%s\" inválida\n", opcion);
        } PacienteMain.listaPacientes.add(p);
    }
}
