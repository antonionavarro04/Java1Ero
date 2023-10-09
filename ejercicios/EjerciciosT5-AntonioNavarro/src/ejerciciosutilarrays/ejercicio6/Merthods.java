package ejerciciosutilarrays.ejercicio6;

public class Merthods {
    static void buscarNumero (int array[], byte incognita) {
        // ^ Definimos una variable veces para almacenar cuantas veces encuentra el número
        short veces = 0;

        // ! Recorremos el Array buscando la incognita
        for (short pos = 0; pos < array.length; pos++) {
            if (array[pos] == incognita) {
                System.out.println("Encontrada coincidencia en la posición [" + pos + "]");
                veces++;
                
                try { // ? Pequeño delay para que se vea mejor
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // ? Salto de Línea Triple
        System.out.println("\n----------------------------\n");

        // ! Imprimimos el resultado
        if (veces == 0) {
            System.out.println("No se ha encontrado ninguna coincidencia");
        } else {
            System.out.println("Se ha encontrado el valor '" + incognita + "' " + veces + " " + (veces > 1 ? "veces" : "vez"));
        }
    }
}
