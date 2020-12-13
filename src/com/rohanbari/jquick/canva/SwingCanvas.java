package com.rohanbari.jquick.canva;

import javax.swing.*;
import java.awt.*;

public class SwingCanvas extends JPanel {
    @Override
    public void paint(Graphics g) {
        g.drawString("Let's paint the world!", 20, 20);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("SwingCanvas");
        frame.add(new SwingCanvas());
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
