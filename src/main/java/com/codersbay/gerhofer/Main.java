package com.codersbay.gerhofer;

public class Main {

    public static void main(String[] args) {

        System.out.println("Circles:");
        Shape circle1 = new Circle("green", true, 3);
        Shape circle2 = new Circle("orange", true, 6);
        Shape circle3 = new Circle("red", false, 7);

        System.out.println("The area of the green circle is : " + circle1.getArea());
        System.out.println("The area of the orange circle is : " + circle2.getArea());
        System.out.println("The perimeter of the orange circle is : " + circle2.getPerimeter());
        System.out.println("The perimeter of the red circle is : " + circle3.getPerimeter());

        System.out.println("Rectangles:");
        Shape rectangle1 = new Rectangle("green", false, 3, 7);
        Shape rectangle2 = new Rectangle("orange", true, 6, 9);
        Shape rectangle3 = new Rectangle("red", true, 7, 4);

        System.out.println("The area of the green rectangle is : " + rectangle1.getArea());
        System.out.println("The area of the orange rectangle is : " + rectangle2.getArea());
        System.out.println("The perimeter of the orange rectangle is : " + rectangle2.getPerimeter());
        System.out.println("The perimeter of the red rectangle is : " + rectangle3.getPerimeter());

        System.out.println("Squares:");
        Shape square1 = new Square("green", true, 8);
        Shape square2 = new Square("orange", false, 4);
        Shape square3 = new Square("red", false, 2);

        System.out.println("The area of the green square is : " + square1.getArea());
        System.out.println("The area of the orange square is : " + square2.getArea());
        System.out.println("The perimeter of the orange square is : " + square2.getPerimeter());
        System.out.println("The perimeter of the red square is : " + square3.getPerimeter());
    }

}
