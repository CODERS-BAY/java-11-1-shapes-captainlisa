package com.codersbay.gerhofer;

public class Circle extends Shape {

    private double radius;

    // constructor, getter and setter

    public Circle(String color, boolean isFilled, double radius) throws IllegalArgumentException {
        super(color, isFilled);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero");
        } else {
            this.radius = radius;
        }
    }

    public Circle(String color, boolean isFilled) {
        super(color, isFilled);
    }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }

    // methods
    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;

    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
