package com.codersbay.gerhofer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void testSquareConstructorWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Square("Blue", true, 0);
        });
    }

    @Test
    void testSquareConstructorWithNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Square("Orange", false, -7);
        });
    }

    @Test
    void calculateSquareAreaOne() {
        Square cubert = new Square("Red", true, 8);

        assertEquals(Math.round(cubert.getArea()), Math.round(64));
    }

    @Test
    void calculateSquareAreaTwo() {
        Square cubert = new Square("Red", true, 43);

        assertEquals(Math.round(cubert.getArea()), Math.round(1849));
    }

    @Test
    void calculateSquarePerimeterOne() {
        Square cubert = new Square("Mustard Yellow", false, 10);

        assertEquals(Math.round(cubert.getPerimeter()), Math.round(40));
    }

    @Test
    void calculateSquarePerimeterTwo() {
        Square cubert = new Square("Moss Green", true, 27);

        assertEquals(Math.round(cubert.getPerimeter()), Math.round(108));
    }

}