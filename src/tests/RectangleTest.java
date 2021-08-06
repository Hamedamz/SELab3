package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SELabTest {
    Rectangle rectangle;
    int height;
    int width;

    @BeforeEach
    void setup() {
        height = 4;
        width = 6;
        rectangle = new Rectangle(width, height);
    }

    @Test
    void testWidth() {
        assertEquals(rectangle.getWidth(), width);
    }

    @Test
    void testHeight() {
        assertEquals(rectangle.getHeight(), height);
    }
}