package com.codersbay.gerhofer;

public class Square extends Rectangle {

    private double width;

    //constructor, getter and setter

    public Square(String color, boolean isFilled, double width) throws IllegalArgumentException {
        super(color, isFilled, width, width);
        this.width = width;
    }

    public Square(String color, boolean isFilled) {
        super(color, isFilled);
    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    //methods

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }
}
