package com.rohanbari.jquick;

import com.rohanbari.jquick.classes.Sphere;

import java.util.Locale;

/**
 * Executive class where main() with a purpose of executing rest of
 * the other classes.
 */
public class ProgramExecutor {

    public static void main(String[] args) {
//        Circle circle = new Circle(10.04);
//        System.out.printf(Locale.ENGLISH, "%.2f%n", circle.getArc(90.00));
//        System.out.println(circle.getArea());
//        System.out.println(circle.getDiameter());
//        System.out.println(circle.getCircumference());

        Sphere sphere = new Sphere(7.25d);
        System.out.printf(Locale.ENGLISH, "%.2f%n", sphere.getVolume());
    }
}
