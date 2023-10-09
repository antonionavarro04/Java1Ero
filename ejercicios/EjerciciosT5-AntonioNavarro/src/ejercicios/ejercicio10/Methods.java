package ejercicios.ejercicio10;

public class Methods {
    static void fillArray (byte array[]) {
        for (byte pos = 0; pos < array.length; pos++) {
            // ! Generamos un número aleatorio entre 1 y 10
            array[pos] = (byte) (1 + Math.random() * 10);
        }
    }

    static void searchNumber (byte array[], byte incognita) {
        // ! Recorremos el Array en busca de valores iguales al numero solicitado
        for (byte pos = 0; pos < array.length; pos++) {
            // ! Comparamos si la posición es igual a la incognita
            if (array[pos] == incognita) {
                System.out.println("Encontrada coincidencia en la posición [" + pos + "] = " + array[pos]);

                try { // ? Delay para que se vea mejor
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void printArray(byte array[]){
        // ! Preparamos el mensaje final
        System.out.print("[");
    
        // ! Imprimimos los valores
        for (int pos = 0; pos < array.length; pos++){
            System.out.print(array[pos]);

            if (pos == (array.length - 1)){
                
            } else {
                System.out.print(", ");
            }
        }
    
        // ! Imprimimos el final del Mensaje
        System.out.println("]");
    }
} // € Hecho por Antonio Navarro
