package interfaces.ejercicio1;

public class MainComparacion {
    public static void main(String[] args) {
        Socio s1 = new Socio(0, "Antonio", 18);
        Socio s2 = new Socio(1, "Pepe", 18);
        Socio s3 = new Socio(2, "Pedro", 18);
        Socio s4 = new Socio(0, "Juan", 18);

        System.out.printf("%s comparado a %s es: %s\n", s1.nombre, s2.nombre, s1.compareTo(s2));
        System.out.printf("%s comparado a %s es: %s\n", s1.nombre, s3.nombre, s1.compareTo(s3));
        System.out.printf("%s comparado a %s es: %s\n", s1.nombre, s4.nombre, s1.compareTo(s4));
        
        // ? Salto de Línea Triple
        System.out.println("\n--------------------------------------------\n");

        System.out.printf("%s comparado a %s es: %s\n", s2.nombre, s1.nombre, s2.compareTo(s1));
        System.out.printf("%s comparado a %s es: %s\n", s2.nombre, s3.nombre, s2.compareTo(s3));
        System.out.printf("%s comparado a %s es: %s\n", s2.nombre, s4.nombre, s2.compareTo(s4));
        
        // ? Salto de Línea Triple
        System.out.println("\n--------------------------------------------\n");

        System.out.printf("%s comparado a %s es: %s\n", s3.nombre, s1.nombre, s3.compareTo(s1));
        System.out.printf("%s comparado a %s es: %s\n", s3.nombre, s2.nombre, s3.compareTo(s2));
        System.out.printf("%s comparado a %s es: %s\n", s3.nombre, s4.nombre, s3.compareTo(s4));
        
        // ? Salto de Línea Triple
        System.out.println("\n--------------------------------------------\n");

        System.out.printf("%s comparado a %s es: %s\n", s4.nombre, s1.nombre, s4.compareTo(s1));
        System.out.printf("%s comparado a %s es: %s\n", s4.nombre, s2.nombre, s4.compareTo(s2));
        System.out.printf("%s comparado a %s es: %s\n", s4.nombre, s3.nombre, s4.compareTo(s3));
    }
}
