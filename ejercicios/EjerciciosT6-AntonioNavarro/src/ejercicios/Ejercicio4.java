package ejercicios;

public class Ejercicio4 {
    public static String invertirCadena(String cadena) {
        String cadenaFinal = "";
        for (int pos = cadena.length() - 1; pos >= 0; pos--) {
            cadenaFinal += cadena.charAt(pos);
        } return cadenaFinal;
    }

    public static void main(String[] args) {
        System.out.println(invertirCadena("íuqa enop euq ol sárbas oN"));
    }
}
