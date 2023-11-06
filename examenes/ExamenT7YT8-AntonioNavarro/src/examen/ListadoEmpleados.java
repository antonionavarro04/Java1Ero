package examen;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

/**
 * Clase que hace de "controlador" en el programa, es el que se encarga de
 * manejar el array donde se encuentran los empleados
 * Sus métodos son estáticos y públicos
 * 
 * @author Antonio Navarro
 * @version 1.0
 */
public class ListadoEmpleados {
    /**
     * Scanner de clase statico, da fallos el close
     */
    private static Scanner read = new Scanner(System.in).useLocale(Locale.US);

    /**
     * Array con los empleados, inicialmente todas las posiciones valdrán null
     */
    public static Empleado[] listaEmpleados = new Empleado[10];

    /**
     * Recorre el array listaEmpleados hasta encontrar una posición con valor null
     * 
     * @return el índice de del primera posición a null, si no existe ninguna
     *         devuelve -1
     */
    private static int posicionLibre() {
        int index = -1;
        for (int pos = 0; pos < listaEmpleados.length; pos++) {
            if (listaEmpleados[pos] == null) {
                index = pos;
                break;
            }
        }
        return index;
    }

    /**
     * Recorre el array listaEmpleados hasta encontar a un empleado concreto en el
     * array, en caso de no encontrarlo devuelve -1
     * 
     * @param e Empleado a buscar
     * @return el indice con la posición del Empleado, si no existe devolverá -1
     */
    private static int buscaEmpleado(Empleado e) {
        int index = -1;
        for (int pos = 0; pos < listaEmpleados.length; pos++) {
            if (listaEmpleados[pos] != null) {
                if (listaEmpleados[pos].equals(e)) {
                    index = pos;
                    break;
                }
            }
        }
        return index;
    }

    /**
     * Lista todos los empleados del Array
     */
    public static void listarEmpleados() {
        // ! Imprimos los valores con el array ordenado
        for (int pos = 0; pos < listaEmpleados.length; pos++) { // ? recorremos el array
            if (listaEmpleados[pos] != null) { // ? Si la posición no es nula 
                System.out.printf("%s:\n%s\n\n", pos + 1, listaEmpleados[pos]); // ? Imprimimos el empleado
            }
        }
    }

    /**
     * Anhade un nuevo empleado solo en caso que emp no exista, si existe se muestra
     * un mensaje y no se agrega
     * 
     * @param emp Empleado a agregar
     */
    public static void anhadirEmpleado(Empleado emp) {
        int exists = buscaEmpleado(emp); // ? Buscamos si el empleado existe

        if (exists >= 0) { // ? Si existe solo lo notificamos
            System.err.println("El empleado ya existe!!!");
        } else { // ? En caso contrario continuamos
            // ^ Definimos la variable tipo y tres variables universales para los datos de
            // los empelados
            String tipo = emp.getClass().getSimpleName().toLowerCase(), sexo;
            double dato1, dato2;
            int dato3;

            // ^ Buscamos la primera posición libre en el array
            final int LAST_POS = posicionLibre();

            System.out.print("Introduce el Sexo: ");
            sexo = read.nextLine();

            // ? Según el Tipo crearemos de un tipo u otro
            switch (tipo) {
                case "acomision":
                    System.out.print("Introduce las ventas del Empleado: ");
                    dato1 = read.nextDouble();
                    read.nextLine();

                    System.out.print("Introduce la comisión del Empleado (0%-100%): ");
                    dato2 = read.nextDouble();
                    read.nextLine();

                    listaEmpleados[LAST_POS] = new AComision(emp.getNombre(), emp.getApellidos(), sexo, dato1, dato2);
                    break;

                case "fijo":
                    System.out.print("Introduce el sueldo del empleado: ");
                    dato1 = read.nextDouble();
                    read.nextLine();

                    listaEmpleados[LAST_POS] = new Fijo(emp.getNombre(), emp.getApellidos(), sexo, dato1);
                    break;

                case "porhoras":
                    System.out.print("Introduce las horas del empleado: ");
                    dato3 = read.nextInt();
                    read.nextLine();

                    System.out.print("Introduce el sueldo por horas del empleado: ");
                    dato1 = read.nextDouble();
                    read.nextLine();

                    listaEmpleados[LAST_POS] = new PorHoras(emp.getNombre(), emp.getApellidos(), sexo, dato3, dato1);
                    break;

                default:
                    System.err.printf("No existe ningún empleado de tipo \"%s\"", tipo);
                    break;
            }
        }
    }

    /**
     * Modifica un empleado en el array, si no existe el empleado no se podrá
     * modificar
     * 
     * @param emp Empleado a modificar
     */
    public static void modificarEmpleado(Empleado emp) {
        int posEmp = buscaEmpleado(emp); // ? Buscamos el empleado

        if (posEmp == -1) { // ? Si no existe terminamos
            System.err.println("El empleado no existe!!!");
        } else { // ? Si si existe continuamos
            // ^ Definimos una instancia de la clase Scanner
            Scanner read = new Scanner(System.in).useLocale(Locale.US);

            // ^ Definimos la variable tipo y tres variables universales para los datos de
            // los empleados
            final String S = emp.getClass().getSimpleName().toLowerCase();
            char c = 0;
            final String ATT_BASES = "Atributos a Modificar:"
                    + "\nSalir = " + 0
                    + "\nNombre = 1"
                    + "\nApellidos = 2"
                    + "\nSexo = 3";

            // ? Según el tipo vamos a hacer una cosa u otra
            do { // ! Mostramos el menú con los atributos disponibles
                switch (S) {
                    case "acomision":
                        System.out.printf("%s\nVentas = 4\nComision = 5\n>>> ", ATT_BASES);
                        c = read.nextLine().charAt(0);
                        if (c > '0' && c <= '3') {
                            sharedData(c, posEmp, read);
                        } else if (c == '4') {
                            System.out.print("Introduce las nuevas ventas del Empleado: ");
                            ((AComision) listaEmpleados[posEmp]).setVentas(read.nextDouble());
                        } else if (c == '5') {
                            System.out.print("Introduce la nueva comisión del empleado: ");
                            ((AComision) listaEmpleados[posEmp]).setComision(read.nextDouble());
                        }
                        break;

                    case "fijo":
                        System.out.printf("%s\nSalario = 4\n>>> ", ATT_BASES);
                        c = read.nextLine().charAt(0);
                        if (c > '0' && c <= '3') {
                            sharedData(c, posEmp, read);
                        } else if (c == '4') {
                            System.out.print("Introduce el nuevo sueldo del Empleado: ");
                            ((Fijo) listaEmpleados[posEmp]).setSueldo(read.nextDouble());
                        }
                        break;

                    case "porhoras":
                        System.out.printf("%s\nHoras = 4\nSueldo por Horas = 5\n>>> ", ATT_BASES);
                        c = read.nextLine().charAt(0);
                        if (c > '0' && c <= '3') {
                            sharedData(c, posEmp, read);
                        } else if (c == '4') {
                            System.out.print("Introduce las nuevas horas del Empleado: ");
                            ((PorHoras) listaEmpleados[posEmp]).setHoras(read.nextInt());
                        } else if (c == '5') {
                            System.out.print("Introduce el nuevo saldo por hora del Empleado: ");
                            ((PorHoras) listaEmpleados[posEmp]).setSueldoHora(read.nextDouble());
                        }
                        break;
                }
                if (c > '3') {
                    read.nextLine();
                }
            } while (c != '0');
        }
    }

    /**
     * Método autodefinido, sirve para a la hora de modificar no tener que repetir
     * codigo pues, todos los empleados tienen nombre, apellidos y sexo
     * 
     * @param opt  Opcion elegida
     * @param pos  Posicion en el array
     * @param read Scanner para la lectura de datos
     */
    private static void sharedData(char opt, int pos, Scanner read) {
        switch (opt) {
            case '1':
                System.out.print("Introduce el nuevo nombre del Empleado: ");
                listaEmpleados[pos].setNombre(read.nextLine());
                break;

            case '2':
                System.out.print("Introduce los nuevos apellidos del Empleado: ");
                listaEmpleados[pos].setApellidos(read.nextLine());
                break;

            case '3':
                System.out.print("Introduce el nuevo sexo del Empleado: ");
                listaEmpleados[pos].setSexo(read.nextLine());
                break;

            default:
                break;
        }
    }

    /**
     * Elimina un empleado del array, si no existe no se eliminará
     * 
     * @param emp Empleado a eliminars
     */
    public static void eliminarEmpleado(Empleado emp) {
        int posEmp = buscaEmpleado(emp);

        if (posEmp >= 0) {
            listaEmpleados[posEmp] = null;
        } else {
            System.err.println("No se ha encontrado el Empleado");
        }
    }
}
