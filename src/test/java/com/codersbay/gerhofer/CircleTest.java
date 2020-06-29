package com.codersbay.gerhofer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testCircleConstructorWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Circle("Blue", true, 0);
        });
    }

    @Test
    void testCircleConstructorWithNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Circle("Orange", false, -4);
        });
    }

    @Test
    void calculateCircleAreaOne() {
        Circle pacman = new Circle("Red", true, 5);

        assertEquals(Math.round(pacman.getArea()), Math.round(78.53982));
    }

    @Test
    void calculateCircleAreaTwo() {
        Circle pacman = new Circle("Red", true, 13);

        assertEquals(Math.round(pacman.getArea()), Math.round(530.92916));
    }

    @Test
    void calculateCirclePerimeterOne() {
        Circle pacman = new Circle("Mustard Yellow", false, 7);

        assertEquals(Math.round(pacman.getPerimeter()), Math.round(43.9823));
    }

    @Test
    void calculateCirclePerimeterTwo() {
        Circle pacman = new Circle("Moss Green", true, 42);

        assertEquals(Math.round(pacman.getPerimeter()), Math.round(263.89378));
    }

}