package ejerciciospracticos.ejercicio2;

public class Esfera {
    // ^ Creamos la variable radio
    static public double radio;
    
    static double supeficie(){
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    static double volumen(){
        return (4 * Math.PI) / 3 * Math.pow(radio, 3);
    }
}
