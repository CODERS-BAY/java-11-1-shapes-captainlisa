package com.codersbay.gerhofer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void testRectangleConstructorWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("Blue", true, 0, 4);
        });
    }

    @Test
    void testRectangleConstructorWithNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("Orange", false, 6, -3);
        });
    }

    @Test
    void calculateRectangleAreaOne() {
        Rectangle cubert = new Rectangle("Red", true, 5, 4);

        assertEquals(Math.round(cubert.getArea()), Math.round(20));
    }

    @Test
    void calculateRectangleAreaTwo() {
        Rectangle cubert = new Rectangle("Red", true, 13, 26);

        assertEquals(Math.round(cubert.getArea()), Math.round(338));
    }

    @Test
    void calculateRectanglePerimeterOne() {
        Rectangle cubert = new Rectangle("Mustard Yellow", false, 7, 10);

        assertEquals(Math.round(cubert.getPerimeter()), Math.round(34));
    }

    @Test
    void calculateRectanglePerimeterTwo() {
        Rectangle cubert = new Rectangle("Moss Green", true, 42, 25);

        assertEquals(Math.round(cubert.getPerimeter()), Math.round(134));
    }

}