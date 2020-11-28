package com.rohanbari.jquick;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

class SwingCounter extends JFrame {
    private final static JButton jButton = new JButton();
    private final static JLabel jLabel = new JLabel();
    private static boolean runCounter = false;
    private static java.util.Timer timer;
    private static int counter = 0;

    /**
     * The main constructor which constitutes a Java Frame.
     */
    public SwingCounter() {
        JPanel jPanel = new JPanel();
        Listener listener = new Listener();

        this.setTitle("Swinger Swing");
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        jLabel.setVisible(true);
        jLabel.setText("Beginning to count...");

        jButton.setText("Start");
        jButton.setVisible(true);
        jButton.addActionListener(listener);

        jPanel.add(jLabel);
        jPanel.add(jButton);
        this.add(jPanel);

        jButton.doClick();
    }

    /**
     * The main function which calls the class constructor for Swing startup.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        new SwingCounter();
    }

    private static class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == jButton) {
                runCounter = !runCounter;
                jButton.setText((jButton.getText().equals("Start")) ? "Stop" : "Start");

                if (runCounter) {
                    TimerTask task = new TimerTask() {
                        @Override
                        public void run() {
                            jLabel.setText(String.valueOf(counter));
                            counter++;
                        }
                    };
                    timer = new Timer();
                    timer.schedule(task, 1000, 1000);
                } else {
                    timer.cancel();
                }
            }
        }
    }
}
