package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    void testSide() {
        int side = 6;
        Square square = new Square(side);
        assertEquals(square.getSide(), side);
    }
}
