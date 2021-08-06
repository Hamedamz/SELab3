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

    @Test
    void testSetWidth() {
        int width = 12;
        rectangle.setWidth(width);
        assertEquals(rectangle.getWidth(), width);
    }

    @Test
    void testSetHeight() {
        int height = 4;
        rectangle.setHeight(height);
        assertEquals(rectangle.getHeight(), height);
    }

    @Test
    void testArea() {
        assertEquals(rectangle.computeArea(), width * height);
    }
}