package tests;

import org.junit.jupiter.api.Test;

import shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SELabTest {
    @Test
    void testWidth() {
        int width = 6;
        int height = 4;

        Rectangle rectangle = new Rectangle(width, height);

        assertEquals(rectangle.width, width);
    }

    @Test
    void testHeight() {
        int width = 6;
        int height = 4;

        Rectangle rectangle = new Rectangle(width, height);

        assertEquals(rectangle.height, height);
    }
}