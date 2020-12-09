package com.rohanbari.jquick.classes;

/**
 * @author Dipak Bari
 * @since 1.0
 * @version 1.0
 * @implNote Implement this class to use make of physical box properties and calculations.
 * Use the <b>setters</b> and <b>getters</b> in case of empty constructor use.
 */

public class Box {
    private double width;
    private double height;
    private double depth;

    /**
     * Empty constructor to use make implementation of setters
     */
    public Box() {
    }

    /**
     * Constructs box while creating object
     * @param width Width of the Box in Specific Unit
     * @param height Height of the Box in Specific Unit
     * @param depth Depth of the Box in Specific Unit
     */
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    /**
     * Constructs cube by passing length
     * @param length specifies unit to make a cube
     */
    public Box(double length){
        this.width = this.height = this.depth = length;
    }

    /**
     * Method to get the volume of Box
     * @return Returns the volume of Box
     */
    public double getVolume(){
        return width * height * depth;
    }

    /**
     * Prints volume of the Box
     */
    public void printVolume(){
        System.out.println("Volume of the given Box: " + getVolume());
    }

    /**
     * Method to return whether the Box object is equal or not
     * @param box Box object
     * @return true if box object is equal
     */
    public boolean equalTo(Box box){
        return getWidth() == box.width && getHeight() == box.height && getDepth() == box.depth;
    }

    /**
     * Sets the width of the Box
     * @param width of the box
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sets the height of the Box
     * @param height of the Box
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Sets the depth of the Box
     * @param depth of the Box
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     * Get the width of the Box
     * @return width of the box
     */
    public double getWidth() {
        return width;
    }

    /**
     * Get the height of the Box
     * @return height of the Box
     */
    public double getHeight() {
        return height;
    }

    /**
     * Get the depth of the Box
     * @return depth of the Box
     */
    public double getDepth() {
        return depth;
    }
}
