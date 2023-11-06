package examen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class PacienteMain {
    // ^ Definimos las rutas y los nombres al fichero
    private static final String DIR = "src\\examen\\out";
    private static final String FILE = "pacientes.txt";
    private static final String ROUTE = DIR + "\\" + FILE;

    // ^ Definimos un char para salir
    public static final char SALIR = '0';

    // ^ Definimos un TreeSet de Pacientes
    protected static TreeSet<Paciente> listaPacientes = new TreeSet<Paciente>();

    // ^ Definimos una String con el menú
    private static final String MENU =
        "1. Añadir paciente."
    + "\n2. Listar pacientes."
    + "\n3. Modificar paciente."
    + "\n4. Eliminar paciente."
    + "\n5. Guardar pacientes."
    + "\n" + SALIR + ". Salir.";

    // ^ Definimos un Scanner de archivos global
    protected static Scanner read = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        // ^ Definimos un Scanner de Ficheros, así como un BufferedWriter
        Scanner sc = null;

        BufferedWriter bw = null;

        // ! Damos la bienvenida al usuario
        System.out.println("Bienvenido al Sistema de Gestión de Pacientes");

        // ! Comprobamos que el fichero y la carpeta existen
        // ^ Definimos un File y cargamos la ruta
        File file = new File(DIR);
        if (!file.exists()) { // ? Si la ruta no existe
            file.mkdirs(); // ! La creamos
            System.out.printf("La carpeta \"%s\" no existía y ha sido creada\n", DIR);
        }

        // ^ Cargamos el Archivo
        file = new File(ROUTE);
        if (!file.exists()) { // ? Si el archivo no existe
            try {
                file.createNewFile(); // ! Lo creamos
                System.out.printf("El archivo \"%s\" no existía y ha sido creado\n", FILE);
            } catch (IOException e) {
                System.err.printf("Ha habido un error al crear el Fichero en la ruta: \"%s\"", ROUTE);
            }
        } else { // ! Cargamos el contenido del archivo en la colección listaPacientes solo si el archivo existía
            try {
                // ^ Cargamos en sc el contenido del archivo
                sc = new Scanner(new BufferedReader(new FileReader(file)));

                // ! Guardamos en un array de Strings la primera linea del archivo, repetiremos esto mientras el archivo tenga una siguiente línea
                while (sc.hasNextLine()) {
                    String data[] = sc.nextLine().split(";");

                    boolean state;

                    // ? Para el 4 dato tendremos que pasarlo a Boolean
                    if (data[3].equalsIgnoreCase("Si")) {
                        state = true;
                    } else {
                        state = false;
                    }

                    // ! Añadimos los datos a la colección
                    listaPacientes.add(new Paciente(data[0], Integer.valueOf(data[2]), data[1], state));
                }
            } catch (FileNotFoundException e) {
                System.err.printf("No se a encontrado el archivo en la ruta \"%s\"\n", ROUTE);
            } finally {
                sc.close();
            }

            // ! Comenzamos con el CRUD, este CRUD se ejecutará hasta que el usuario introduzca la opción 0
            // ^ Definimos variables copia para los atributos y una variable opcion
            String nombre, direccion, baja;
            int telefono;
            boolean bajaBool;

            Paciente p = null;

            char opcion = '9';

            do {
                System.out.println(MENU);
                System.out.print(">>> ");
                try { // ? Intentamos leer el caracter
                    opcion = read.nextLine().charAt(0);
                } catch (StringIndexOutOfBoundsException e) { // ? Si se ha leido una cadena vacía cambiamos la opción a 6
                    opcion = '6';
                }

                switch (opcion) { // ? Procesamos la opcion
                    case '1': // * Añadir Paciente
                        // ! Pedimos todos los datos
                        System.out.print("Introduce el nombre del Paciente: ");
                        nombre = read.nextLine();

                        System.out.print("Introduce la dirección del Paciente: ");
                        direccion = read.nextLine();

                        System.out.print("Introduce el telefono del Paciente: ");
                        telefono = read.nextInt(); read.nextLine();

                        System.out.print("Esta el Paciente de baja? (Sí || No): ");
                        baja = read.nextLine();

                        // ? Convertimos la cadena de baja a un boolean
                        if (baja.equalsIgnoreCase("Si")) {
                            bajaBool = true;
                        } else {
                            bajaBool = false;
                        }

                        // ^ Creamos el objeto paciente
                        p = new Paciente(nombre, telefono, direccion, bajaBool);

                        if (!listaPacientes.add(p)) {
                            System.err.printf("El paciente de nombre \"%s\" y telefono %d ya existe\n", nombre, telefono);
                        } break;

                    case '2': // * Listar Pacientes
                        System.out.println(Methods.listarPacientes());
                        break;

                    case '3': // * Modificar Paciente
                        // ! Pedimos los primordiales del Paciente
                        System.out.print("Introduce el nombre del Paciente: ");
                        nombre = read.nextLine();

                        System.out.print("Introduce el telefono del Paciente: ");
                        telefono = read.nextInt(); read.nextLine();

                        // ^ Creamos el objeto con los datos
                        p = new Paciente(nombre, telefono);

                        if (listaPacientes.contains(p)) {
                            System.out.print("Que atributo quieres modificar (Direccion || Baja): ");
                            nombre = read.nextLine(); // ? Pedimos el atributo a modificar
                            System.out.print("Introudce el nuevo valor: ");
                            Methods.modificarPaciente(p, nombre);
                        } else {
                            System.err.printf("No se ha encontrado ningún paciente de nombre \"%s\" y teléfono %d\n", nombre, telefono);
                        } break;

                    case '4': // * Eliminar Paciente
                        // ! Pedimos los primordiales del Paciente
                        System.out.print("Introduce el nombre del Paciente: ");
                        nombre = read.nextLine();

                        System.out.print("Introduce el telefono del Paciente: ");
                        telefono = read.nextInt(); read.nextLine();

                        // ^ Creamos el objeto paciente con los datos
                        p = new Paciente(nombre, telefono);

                        // ! Eliminamos al paciente
                        if (listaPacientes.remove(p)) {
                            System.out.println("Paciente eliminado correctamente");
                        } else {
                            System.err.printf("No se ha encontrado ningún paciente de nombre \"%s\" y telefono %d\n", nombre, telefono);
                        } break;

                    case '5':
                        try {
                            // ^ Cargamos el archivo en el FileWriter sin append
                            bw = new BufferedWriter(new FileWriter(file, false));

                            // ! Vaciamos el archivo
                            bw.write("");
                            bw.flush();
                            bw.close();

                            // ^ Volvemos a cargar el archivo, esta vez con append
                            bw = new BufferedWriter(new FileWriter(file, true));

                            // ! Cargamos todos los datos en el archivo con el formato especificado
                            for (Paciente dato : listaPacientes) {
                                // ^ Creamos una cadena con el nombre, la dirección y el telefono
                                String data = dato.getNombre() + ";" + dato.getDireccion() + ";" + dato.getTelefono() + ";";

                                baja = "No";
                                if (dato.isBaja()) { // ? Si esta de baja pondremos en los datos "Sí", en caso contrario pondremos "No"
                                    baja = "Si";
                                } data += baja;

                                // ! Escribimos los datos
                                bw.write(data);
                                bw.newLine();
                            }
                        } catch (IOException e) {
                            System.err.printf("Se ha producido un error de Input/Output en el archivo en la ruta \"%s\"\n", ROUTE);
                        } finally {
                            try {
                                bw.flush();
                                bw.close();
                            } catch (IOException e) {
                                System.err.printf("Se ha producido un error de Input/Output en el archivo en la ruta \"%s\"\n", ROUTE);
                            }
                        } break;

                    case '0':
                        System.out.println("Saliendo...");
                        break;
                
                    default:
                        System.err.printf("Opción '%s' no válida\n", opcion);
                        continue;
                } if (opcion != SALIR) { // ? Si la opción es diferente a SALIR esperamos a que el usuario presione enter para continuar
                    System.out.print("Presione 'enter' para continuar...");
                    read.nextLine();
                    System.out.println();
                }
            } while (opcion != SALIR);

            // ^ Cerramos el Scanner
            read.close();
        }
    }
}
