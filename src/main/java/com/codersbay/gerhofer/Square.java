package com.codersbay.gerhofer;

public class Square extends Shape {

    private double width;

    //constructor, getter and setter


    public Square(String color, boolean isFilled, double width) {
        super(color, isFilled);
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be greater than zero.");
        }
        this.width = width;
    }

    public Square(String color, boolean isFilled) {
        super(color, isFilled);
    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    //methods
    @Override
    public double getArea() {
        double area = this.width * this.width;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4 * this.width;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }
}
