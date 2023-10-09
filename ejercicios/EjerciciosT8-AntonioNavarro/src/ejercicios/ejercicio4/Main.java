package ejercicios.ejercicio4;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array de 10 posiciones de tipo Electrodomestico
        Electrodomestico aparatos[] = {
            new Electrodomestico(),
            new Electrodomestico(50, 80),
            new Electrodomestico(90, 40, "rojo", "A"),
            new Lavadora(),
            new Lavadora(100, 60),
            new Lavadora(150, 30, "azul", "B", 40),
            new Television(),
            new Television(200, 20),
            new Television(700, 25, "negro", "F", 75, true),
            new Television(150, 10, "blanco", "E", 35, false)
        };

        // ^ Definimos 4 variables para guardar los diferentes precios
        float precioElectrodomesticos = 0, precioLavadoras = 0, precioTelevisores = 0;

        // ! Recorremos el Array
        for (int pos = 0; pos < aparatos.length; pos++) {
            // ^ Definimos una variable precioActual con el precio del electrodoméstico actual
            float precioActual = aparatos[pos].precioFinal();

            // ^ Extraemos el nombre simplificado de la Clase
            String nombreClase = aparatos[pos].getClass().getSimpleName();

            // ! Imprimimos el precio base y final
            System.out.printf("Tipo de Producto: %s\n", nombreClase);
            System.out.printf("El precio base es: %s\n", aparatos[pos].getPrecioBase());
            System.out.printf("El precio final es: %s\n", precioActual);

            /* if (aparatos[pos] instanceof Television) { // ? Si el objeto es de tipo Televisión
                precioTelevisores += precioActual; 
            } else if (aparatos[pos] instanceof Lavadora) { // ? Si el objeto es de tipo Lavadora
                precioLavadoras += precioActual;
            } else if (aparatos[pos] instanceof Electrodomestico) { // ? Si el objeto es de tipo Electrodoméstico, debe ir el ultimo porque la clase Electrodoméstico es la clase padre de las otras dos
                precioElectrodomesticos += precioActual;
            } */

            switch (nombreClase) { // ? Según el nombre de la clase meteremos el precio en una variable o otra
                case "Electrodomestico":
                    precioElectrodomesticos += precioActual;
                    break;
                
                case "Television":
                    precioTelevisores += precioActual;
                    break;

                case "Lavadora":
                    precioLavadoras += precioActual;
                    break;

                default:
                    System.err.printf("Clase \"%s\" inválida\n", nombreClase);
                    break;
            }

            try { // ? Probamos a dormir el Hilo principal
                Thread.sleep(1000);
            } catch (Exception e) { // ? En caso de que se produzca alguna excepción la imprimimos
                e.printStackTrace();
            }
            
            // ? Salto de Línea Triple
            System.out.println("\n-------------------------------\n");
        }

        // ! Imprimimos los precios totales
        System.out.printf("El precio total de los electrodomésticos es: %s\n", precioElectrodomesticos);
        System.out.printf("El precio total de las lavadoras es: %s\n", precioLavadoras);
        System.out.printf("El precio total de las televisores es: %s\n", precioTelevisores);
        System.out.printf("El precio total de todos los electrodomésticos es: %s\n", precioElectrodomesticos + precioLavadoras + precioTelevisores);
    }
}
