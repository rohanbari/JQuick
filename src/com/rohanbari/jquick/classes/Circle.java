package com.rohanbari.jquick.classes;

/**
 * @author Dipak Bari
 * @version 1.0
 * @implNote Circle class made for calculation and related manipulation.
 * Default constructor put the radius value <b>1.0</b>. Use the parameterized constructor
 * in order to pass the user defined value.
 * @since 1.0
 */
public class Circle {
    private final double PI = Math.PI;
    private final double radius;

    /**
     * Default constructor sets the radius value to 1
     */
    public Circle() {
        this.radius = 1.0;
    }

    /**
     * Parameterized constructor to pass user defined value
     *
     * @param radius Pass the radius value in unit size
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Circumference of circle
     *
     * @return Circumference of circle
     */
    public double getCircumference() {
        return 2 * PI * radius;
    }

    /**
     * Area of circle in square unit
     *
     * @return Area of circle
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Diameter of circle in normal unit
     *
     * @return Diameter of Circle
     */
    public double getDiameter() {
        return radius * 2;
    }

    /**
     * Measurement of an arc of a circle relative to radian angle and radius.
     *
     * @param theta The required angle in rad.
     * @return Length of the arc
     */
    public double getArc(double theta) {
        return this.radius * theta;
    }
}
