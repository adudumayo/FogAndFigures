package com.example;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Home extends JPanel {
    private int homeX = 300;
    private int homeY = 10;
    private int homeWidth = 50;
    private int homeHeight = 50;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(homeX, homeY, homeWidth, homeHeight);
    }
}