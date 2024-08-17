package com.example;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Figure extends JPanel {

    private int figureX = 10;
    private int figureY = 10;
    private int figureWidth = 20;
    private int figureHeight = 20;

    public Figure() {
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                moveFigure(e);
            }
        });
    }

    private void moveFigure(KeyEvent e) {
        int key = e.getKeyCode();
        int steps = 20;

        if (key == KeyEvent.VK_RIGHT) {
            figureX += steps;
        } else if (key == KeyEvent.VK_DOWN) {
            figureY += steps;
        } else if (key == KeyEvent.VK_LEFT) {
            figureX -= steps;
        } else if (key == KeyEvent.VK_UP) {
            figureY -= steps;
        }

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.fillRect(figureX, figureY, figureWidth, figureHeight);
    }
}
