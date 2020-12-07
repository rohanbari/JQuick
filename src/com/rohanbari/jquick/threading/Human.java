package com.rohanbari.jquick.threading;

import java.util.Date;

interface Emotions {
    void sleep();
    void eat();
    void laugh();
    void cry();
    void cheer();
    void sad();
    void excited();
}

interface Survival {
    void eat();
    void kill();
    void run();
    void migrate();
}

interface Entertainment {
    void dance();
    void play();
    void music();
    void cook();
}

/**
 * Example of properties and activities of a human in the programming structure.
 */
public class Human {
    String name;
    int age;
    Date DOB;

    public static void main(String[] args) {
        Emotions emotions = new Emotions() {
            @Override
            public void sleep() {

            }

            @Override
            public void eat() {

            }

            @Override
            public void laugh() {

            }

            @Override
            public void cry() {

            }

            @Override
            public void cheer() {

            }

            @Override
            public void sad() {

            }

            @Override
            public void excited() {

            }
        };
        Survival survival = new Survival() {
            @Override
            public void eat() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void run() {

            }

            @Override
            public void migrate() {

            }
        };
        Entertainment entertainment = new Entertainment() {
            @Override
            public void dance() {

            }

            @Override
            public void play() {

            }

            @Override
            public void music() {

            }

            @Override
            public void cook() {

            }
        };

        System.exit(0);
    }
}
