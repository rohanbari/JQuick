package com.rohanbari.jquick;

import javax.swing.*;

public class MainActivity extends JFrame {
    /**
     * The main constructor which constitutes a Java Frame.
     */
    public MainActivity() {
        JPanel jPanel = new JPanel();

        this.setTitle("Swinger Swing");
        this.setSize(300, 100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("This is my first label on Swing.");
        jLabel.setVisible(true);

        jPanel.add(jLabel);
        this.add(jPanel);
    }

    /**
     * The main function which calls the class constructor for Swing startup.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        new MainActivity();
    }
}
