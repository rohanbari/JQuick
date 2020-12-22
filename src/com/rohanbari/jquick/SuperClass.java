package com.rohanbari.jquick;

/**
 * Main class or parent class or super class.
 */
public class SuperClass {
    // Super Class's function declaration & definition
    public void test() {
        System.out.println("Super Class called it.");
    }

    public static void main(String[] args) {
        // Creating an instance of the child class and executing the method
        LowerClass lowerClass = new LowerClass();
        lowerClass.test();
    }
}

/**
 * Child class that inherits super class.
 */
class LowerClass extends SuperClass {
    public void test() {
        // When the method executes, it shows two messages
        // First one is of the first line and the second one executes
        // the test() of SuperClass actually.
        System.out.println("Lower class called it.");
        super.test();
    }
}
