package rockpaperscissors;

// ? Imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import funciones.ConsoleManager;
import funciones.Mathematics;

public class RockPaperScissors extends JFrame {
    private final int WIDTH = 600;
    private final int HEIGHT = 400;

    private final int BUTTON_X = 70;
    private final int BUTTON_Y = 30;

    private boolean resizable = false;
    
    public RockPaperScissors () {
        setTitle("Rock Paper Scissors " + Info.state + Info.version);
        setDefaultCloseOperation(3);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setResizable(resizable);

        JButton buttonRock = new JButton("Rock");
        JButton buttonPaper = new JButton("Paper");
        JButton buttonScissors = new JButton("Scissors");

        JPanel panel = new JPanel(new GridLayout(1, 3));
        panel.add(buttonRock);
        panel.add(buttonPaper);
        panel.add(buttonScissors);

        buttonRock.setSize(BUTTON_X, BUTTON_Y);
        buttonPaper.setSize(BUTTON_X, BUTTON_Y);
        buttonScissors.setSize(BUTTON_X, BUTTON_Y);
        
        buttonRock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Piedra");
            }
        });
        
        buttonPaper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Papel");
            }
        });

        buttonScissors.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tijera");
            }
        });

        panel.setSize(600, 400);

        add(panel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();

        System.out.printf("El titulo del juego es: %s\n", game.getTitle());
        System.out.printf("La dimensión: %s\n", game.getSize());
    }
}
