package pro.sky.skyprospringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();

    @Test
    void plus() {
        var expected1 = service.plus(1, 2);
        var expected2 = service.plus(-1, -2);
        var expected3 = service.plus(-1, 2);
        var expected4 = service.plus(1, -2);


        assertEquals(3, expected1);
        assertEquals(-3, expected2);
        assertEquals(1, expected3);
        assertEquals(-1, expected4);
    }

    @Test
    void divide() {
        var expected1 = service.divide(2, 2);
        var expected2 = service.divide(3, -3);
        var expected3 = service.divide(10, 5);
        var expected4 = service.divide(-4, 2);


        assertEquals(1, expected1);
        assertEquals(-1, expected2);
        assertEquals(2, expected3);
        assertEquals(-2, expected4);
        assertThrows(IllegalArgumentException.class, () -> service.divide(12, 0));
    }

    @Test
    void multiply() {
        var expected1 = service.multiply(1, 2);
        var expected2 = service.multiply(3, -2);
        var expected3 = service.multiply(0, 0);
        var expected4 = service.multiply(-4, 3);


        assertEquals(2, expected1);
        assertEquals(-6, expected2);
        assertEquals(0, expected3);
        assertEquals(-12, expected4);
    }

    @Test
    void minus() {
        var expected1 = service.minus(1, 2);
        var expected2 = service.minus(3, -2);
        var expected3 = service.minus(0, 0);
        var expected4 = service.minus(-4, 3);


        assertEquals(-1, expected1);
        assertEquals(5, expected2);
        assertEquals(0, expected3);
        assertEquals(-7, expected4);
    }
}