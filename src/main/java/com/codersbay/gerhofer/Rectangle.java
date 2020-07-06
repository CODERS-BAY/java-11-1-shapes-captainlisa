package com.codersbay.gerhofer;

public class Rectangle extends Shape {

    private double width;
    private double length;

    //constructor, getter and setter

    public Rectangle(String color, boolean isFilled, double width, double length) throws IllegalArgumentException{
        super(color, isFilled);
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Width and length must not be greater than zero.");
        }
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean isFilled) {
        super(color, isFilled);
    }

    public double getWidth() { return width; }

    public void setWidth(double width) { this.width = width; }

    public double getLength() { return length; }

    public void setLength(double length) { this.length = length; }

    //methods
    @Override
    public double getArea() {
        double area = this.width * this.length;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * this.width + 2 * this.length;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
