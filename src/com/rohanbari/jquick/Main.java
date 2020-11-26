package com.rohanbari.jquick;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int parser = ConnectActivity.connect();

        if (parser == 100) {
            out.println("This is a localhost address.");
        } else if (parser == 1) {
            out.println("This is a private address.");
        } else {
            out.println("Looks OK.");
        }

        out.println("Thanks for using this program!");
    }
}
