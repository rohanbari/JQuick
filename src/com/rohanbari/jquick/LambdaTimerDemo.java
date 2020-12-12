package com.rohanbari.jquick;

import javax.swing.*;

public class LambdaTimerDemo {
    private static boolean tick = true;

    public static void main(String[] args) {
        LambdaTimerDemo.enableTimer();

        JOptionPane.showMessageDialog(null, "Press OK to quit from it.");
        System.exit(0);
    }

    public static void enableTimer() {
        Timer timer = new Timer(1000, actionEvent -> {
            if (tick) {
                System.out.print("Tick ");
            } else {
                System.out.println("Tock");
            }

            tick = !tick;
        });
        timer.start();
    }
}
