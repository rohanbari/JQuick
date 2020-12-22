package com.rohanbari.jquick.classes;

/**
 * Sphere class in which the things are added programmatically stuffs
 * and properties related to a mathematical sphere object.
 *
 * @author rohanbari
 * @version v1.0
 * @implNote All the methods are non-static, thus they needs to be treated
 * only after creating the instance of their parent class.
 */
public class Sphere {
    private double radius;

    /**
     * Default constructor for the class.
     */
    public Sphere() {
        this.radius = 1.0d;
    }

    /**
     * An extra overloaded class constructor. Only recommended to use
     * if need to set the radius during instantiation.
     *
     * @param radius Radius of the sphere
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return (4 * Math.PI * Math.pow(this.radius, 2));
    }

    public double getVolume() {
        return (4 * Math.PI * Math.pow(this.radius, 3) / 3);
    }
}
