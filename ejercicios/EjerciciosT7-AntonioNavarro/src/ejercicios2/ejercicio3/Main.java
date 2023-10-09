package ejercicios2.ejercicio3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(1, 1, 0);

        File archivo = new File("fechas.txt");
        
        PrintWriter pw = null;
        
        try { // Borra el contenido del archivo
            pw = new PrintWriter(new FileWriter(archivo));
            pw.print("");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
        
        while (fecha1.getAño() != 10000) {
            try { // Crea un archivo en el cual están todas las fechas desde 01-01-0 hasta 31-12-9999
                pw = new PrintWriter(new FileWriter(archivo, true));
                pw.println(fecha1);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                pw.close();
            } fecha1.diaSiguiente();
        }
    }
}
