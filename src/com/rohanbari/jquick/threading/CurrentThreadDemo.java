package com.rohanbari.jquick.threading;

// Main thread control
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();  // Main thread
        System.out.println("Current Thread: " + t);

        // Changed thread name
        t.setName("My thread");

        System.out.println("After name change: " + t);

        try {
            for (int it = 5; it > 0; it--) {
                System.out.println(it);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
