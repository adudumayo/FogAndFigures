package com.example;

import javax.swing.*;
import java.awt.*;

public class GameWindow {
    public static void main(String[] args) {
        JFrame window = new JFrame("Fog and Figures");

        window.setPreferredSize(new Dimension(800, 800));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        Figure figure = new Figure();
        window.add(figure);
    }
}
