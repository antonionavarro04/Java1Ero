package ejercicios.ejercicio9;

public class Methods {
    static void graficoTemperatura(float temperatura[], float precision){
        // ! Pintamos el gráfico en función al mes y la temperatura media
        for (byte pos = 0; pos < temperatura.length; pos++) {
            // ! Mediante un switch case pintaremos por pantalla el mes en el que nos encontramos
            switch (pos) {
                case 0:
                    System.out.print("Enero:");
                    break;
                case 1:
                    System.out.print("Febrero:");
                    break;
                case 2:
                    System.out.print("Marzo:");
                    break;
                case 3:
                    System.out.print("Abril:");
                    break;
                case 4:
                    System.out.print("Mayo:");
                    break;
                case 5:
                    System.out.print("Junio:");
                    break;
                case 6:
                    System.out.print("Julio:");
                    break;
                case 7:
                    System.out.print("Agosto:");
                    break;
                case 8:
                    System.out.print("Septiembre:");
                    break;
                case 9:
                    System.out.print("Octubre:");
                    break;
                case 10:
                    System.out.print("Noviembre:");
                    break;
                case 11:
                    System.out.print("Diciembre:");
                    break;
                default:
                    System.out.print("Error");
                    break;
            }
        
            // ? Tabulador para separar los nombres de los gráficos
            System.out.print("   \t");

            for (float temperaturaMes = temperatura[pos]; temperaturaMes > 0.0f; temperaturaMes-=0.5f) {
                System.out.print("*");
            }

            // ? Cambiamos de Línea
            System.out.println();
        }
    }

    static void printArray(float array[]){
        // ! Preparamos el mensaje final
        System.out.print("[");
    
        // ! Imprimimos los valores
        for (int pos = 0; pos < array.length; pos++){
            System.out.print(array[pos] + "ºC");

            if (pos == (array.length - 1)){
                
            } else {
                System.out.print(", ");
            }
        }
    
        // ! Imprimimos el final del Mensaje
        System.out.println("]");
    }
} // € Hecho por Antonio Navarro