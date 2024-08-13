package com.example;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Figure extends JPanel {

    private int figureX = 10;
    private int figureY = 10;
    private int figureWidth = 20;
    private int figureHeight = 20;

    public Figure() {
        // constructor
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillRect(figureX, figureY, figureWidth, figureHeight);
    }
}
