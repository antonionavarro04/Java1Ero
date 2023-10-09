package interfaces.ejercicio4;

public class Main {
    public static void main(String[] args) {
        AnimalDomestico animales[] = {
            new Perro("Toby", "Pastor Alemán", 20, "Negro"),
            new Gato("Mittens", "Egipcio", 5.0f, "Marron"),
        };

        for (int pos = 0; pos < animales.length; pos++) {
            boolean caso, target;
            final String CLASE = animales[pos].getClass().getSimpleName();

            switch (CLASE) {
                case "Perro":
                    target = true;
                    break;

                case "Gato":
                    target = false;
                    break;
            
                default:
                    target = false;
                    break;
            }

            System.out.printf("%s:\n", pos + 1);
            System.out.printf("Clase: %s\n", CLASE);
            System.out.println(animales[pos]);

            do { // ? Se ejecutara hasta que el perro no te haga caso y el gato si lo haga
                caso = animales[pos].hacerCaso();
                System.out.printf("El animal %ste ha hecho caso\n", (caso ? "" : "no "));
            } while (caso == target);

            if (pos != animales.length - 1) {
                System.out.println();
            }
        }
        
        // ? Salto de Línea Triple
        System.out.println("\n----------------------------------------\n");
        
        // ! Cada animal con todos sus métodos
        System.out.println("Perro:");
        animales[0].comer();
        animales[0].dormir();
        animales[0].vacunar();
        animales[0].hacerRuido();
        ((Perro) animales[0]).sacarAPasear();

        System.out.println("\nGato:");
        animales[1].comer();
        animales[1].dormir();
        animales[1].vacunar();
        animales[1].hacerRuido();
        ((Gato) animales[1]).toserBolaDePelo();
    }
}
