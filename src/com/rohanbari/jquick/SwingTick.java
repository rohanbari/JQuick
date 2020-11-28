package com.rohanbari.jquick;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTick extends JFrame {
    private static JButton jButton = new JButton();
    private static Timer timer;
    private static boolean stateEnabled = true;

    // Constructor to construct a swing frame
    public SwingTick() {
        JPanel jPanel = new JPanel();
        ListenAction listenAction = new ListenAction();

        this.setTitle("SwingTick");
        this.setSize(300, 150);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

        jButton = new JButton("Start");
        jButton.addActionListener(listenAction);
        jButton.setVisible(true);

        jPanel.add(jButton);
        this.add(jPanel);

        timer = new Timer(1000, listenAction);
    }

    // main() to create an instance of the framed application
    public static void main(String[] args) {
        new SwingTick();
    }

    // Inner Class to listen the ActionEvent
    public static class ListenAction implements ActionListener {
        private static boolean tick = true;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jButton) {
                stateEnabled = !stateEnabled;
                jButton.setText(jButton.getText().equals("Start") ? "Stop" : "Start");

                // Toggles the timer
                if (stateEnabled) {
                    timer.stop();
                    return;
                } else {
                    timer.start();
                }
            }

            if (tick) {
                System.out.print("Tick ");
            } else {
                System.out.println("Tock");
            }

            // Flip the boolean idea
            tick = !tick;
        }
    }
}