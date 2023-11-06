package basics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import funciones.ConsoleManager;
import funciones.Mathematics;

public class BotonColores extends JFrame {
    private static final boolean DEV = false;

    public BotonColores(String title) {
        setTitle(title);
        setSize(300, 200);
        setDefaultCloseOperation(3);
        setVisible(true);
        
        JButton button = new JButton("Boton 1");
        button.setSize(95, 30);
        add(button);
        button.setVisible(true);
        button.addActionListener(new ActionListener() {
            int veces = 0;
            int mode = 0;

            public void actionPerformed(ActionEvent e) {
                mode = Mathematics.rng(6);

                if (DEV) {
                    System.out.printf("%sMode: %d%s\n", ConsoleManager.RED, mode, ConsoleManager.RESET);
                } switch (mode) {
                    case 0:
                    System.out.print(ConsoleManager.RED);
                    break;

                    case 1:
                    System.out.print(ConsoleManager.GREEN);
                    break;

                    case 2:
                    System.out.print(ConsoleManager.YELLOW);
                    break;

                    case 3:
                    System.out.print(ConsoleManager.BLUE);
                    break;

                    case 4:
                    System.out.print(ConsoleManager.WHITE);
                    break;

                    case 5:
                    System.out.print(ConsoleManager.CYAN);
                    break;

                    case 6:
                    System.out.print(ConsoleManager.PURPLE);
                    break;

                    default:
                    System.out.print(ConsoleManager.RESET);
                    break;
                } button.setBackground(new Color(Mathematics.rng(255), Mathematics.rng(255), Mathematics.rng(255)));

                System.out.printf("Boton \"%s\" accionado: %s veces\n", button.getText(), veces++);
                System.out.print(ConsoleManager.RESET);
                System.out.printf("Color actual del Boton: %s\n\n", button.getBackground());
            }
        });
    }

    public static void main(String[] args) {
        BotonColores v = new BotonColores("Boton Colores Consola");

        System.out.println("El ancho de la ventana es " + v.getWidth());
        System.out.println("El alto de la ventana es " + v.getHeight());

        System.out.println("La posición x de la ventana es " + v.getX());
        System.out.println("La posición y de la ventana es " + v.getY());

        System.out.println("El ancho de la pantalla es " + v.getToolkit().getScreenSize().width);
        System.out.println("El alto de la pantalla es " + v.getToolkit().getScreenSize().height);

        System.out.println("El color del Boton es " + v.getContentPane().getBackground());
        
        // ? Salto de Línea Triple
        System.out.println("\n----------------------------------------\n");
    }
}
