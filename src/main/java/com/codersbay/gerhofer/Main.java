package com.codersbay.gerhofer;

public class Main {

    public static void main(String[] args) {

        Shape pacman = new Circle("yellow", true, 3);
        System.out.printf("The circle has the following parameters: \n Color: %s \n isFilled: %b \n Radius: %f \n", pacman.getColor(), pacman.isFilled(), ((Circle) pacman).getRadius());
        System.out.printf("It has an area of %f and a perimeter of %f.", pacman.getArea(), pacman.getPerimeter());

        Shape blockser = new Rectangle("green", true, 5, 7);
        System.out.printf("The rectangle has the following parameters: \n Color: %s \n isFilled: %b \n Width: %f \n Length: %f \n", blockser.getColor(), blockser.isFilled(), ((Rectangle) blockser).getWidth(), ((Rectangle) blockser).getLength());
        System.out.printf("It has an area of %f and a perimeter of %f.", blockser.getArea(), blockser.getPerimeter());

        Shape cubert = new Square("red", true, 6);
        System.out.printf("The square has the following parameters: \n Color: %s \n isFilled: %b \n Width: %f \n", cubert.getColor(), cubert.isFilled(), ((Square) cubert).getWidth());
        System.out.printf("It has an area of %f and a perimeter of %f.", cubert.getArea(), cubert.getPerimeter());

    }

}
