package com.rohanbari.jquick;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainActivity extends JFrame {
    private final static JButton jButton = new JButton();
    private final static JLabel jLabel = new JLabel();
    private static int counter = 0;

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
        this.setResizable(false);

        jButton.setText("Swing Me");
        jButton.setVisible(true);

        Listener listener = new Listener();

        jButton.addActionListener(listener);
        jButton.setToolTipText("Click me to do nothing.");

        jLabel.setText("Click on the Button to change the text");
        jLabel.setVisible(true);

        jPanel.add(jButton);
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

    public static class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jButton) {
//            JOptionPane.showMessageDialog(null,
//                    String.format("You have clicked this button %d time(s).", ++counter),
//                    "Button Click Listened",
//                    JOptionPane.INFORMATION_MESSAGE);
                jLabel.setText("You have clicked this button " + ++counter +" time(s).");
            }
        }
    }
}