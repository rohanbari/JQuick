package com.rohanbari.jquick;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        /*
        First Method
        for (int itP = 1; itP <= 5; itP++) {
            for (int itS = 1; itS <= itP; itS++) {
                out.print("* ");
            }
            out.println();
        }
        */

        int itP = 1;
        while (itP <= 5) {
            int itS = 1;

            while (itS <= itP) {
                out.print("* ");
                itS++;
            }
            out.println();

            itP++;
        }

        out.println("Thanks for using this program!");
    }
}
