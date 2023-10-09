package ejerciciosenumerados.ejercicio4;

// ? Imports
import java.util.Locale;
import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        // ^ Definimos una instancia de la Clase Scanner
        Scanner read = new Scanner(System.in).useLocale(Locale.US);

        // ^ Variables de control del programa
        byte opcion = 0; boolean encontrado = false;

        // ? Inicializacion de los discos a null
        for (int pos = 0; pos < FuncionesEnum.coleccion.length; pos++) {
            FuncionesEnum.coleccion[pos] = new DiscoEnum();
        }

        // ^ Definimos las variables para la creación de Discos
        String codigo, autor, titulo, genero;
        int duracion;

        do { // ? Mostramos el menú y esperamos la opción del usuario
            System.out.println("1. Listado");
            System.out.println("2. Nuevo Disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print(">>> ");
            opcion = read.nextByte(); read.nextLine();

            System.out.println();

            switch (opcion) {
                case 1:
                    FuncionesEnum.listado(FuncionesEnum.coleccion);
                    break;
            
                case 2:
                    System.out.print("Introduce el código del disco: ");
                    codigo = read.nextLine();
                    System.out.print("Introduce el autor del disco: ");
                    autor = read.nextLine();
                    System.out.print("Introduce el título del disco: ");
                    titulo = read.nextLine();
                    System.out.print("Introduce el género del disco: ");
                    genero = read.nextLine();
                    System.out.print("Introduce la duración del disco: ");
                    duracion = read.nextInt(); read.nextLine();

                    FuncionesEnum.crearDisco(codigo, autor, titulo, genero, duracion);
                    break;

                case 3:
                    System.out.print("Introduce el código del disco a modificar: ");
                    codigo = read.nextLine();

                    for (int pos = 0; pos < FuncionesEnum.coleccion.length; pos++) {
                        if (FuncionesEnum.coleccion[pos].getCodigo().equals(codigo)) {
                            System.out.print("Introduce el código del disco: ");
                            codigo = read.nextLine();
                            System.out.print("Introduce el autor del disco: ");
                            autor = read.nextLine();
                            System.out.print("Introduce el título del disco: ");
                            titulo = read.nextLine();
                            System.out.print("Introduce el género del disco: ");
                            genero = read.nextLine();
                            System.out.print("Introduce la duración del disco: ");
                            duracion = read.nextInt(); read.nextLine();

                            FuncionesEnum.modificarDisco(codigo, autor, titulo, genero, duracion, (byte) pos);
                            encontrado = true;
                            break;
                        }
                    }  if (!encontrado) {
                        System.out.println("No se ha encontrado el disco con el código " + codigo);
                    } break;
                
                case 4:
                    System.out.print("Introduce el código del disco: ");
                    codigo = read.nextLine();

                    for (int pos = 0; pos < FuncionesEnum.coleccion.length; pos++) {
                        if (FuncionesEnum.coleccion[pos].getCodigo().equals(codigo)) {
                            FuncionesEnum.borrarDisco(codigo);
                            encontrado = true;
                            break;
                        }
                    } if (!encontrado) {
                        System.out.println("No se ha encontrado el disco con el código " + codigo);
                    } break;
                
                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    continue;
            } System.out.println("\n--------------------------------\n");
            
            FuncionesEnum.resetearContador();

            System.out.print("Pulsa enter para continuar...");
            read.nextLine();
        } while (opcion != 5);

        // ^ Cerramos el Scanner
        read.close();
    }
}
