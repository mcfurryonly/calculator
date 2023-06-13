package pro.sky.skyprospringcalculator;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParametersTest {
    CalculatorService service = new CalculatorService();

    private static Collection<Arguments> parameters() {
        return List.of(
                Arguments.of(1,2),
                Arguments.of(-5,-5),
                Arguments.of(-5,6),
                Arguments.of(4,-5));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void plus(int num1, int num2) {
        var actual = service.plus(num1, num2);
        var expected = num1 + num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void divide(int num1, int num2) {
        var actual = service.divide(num1, num2);
        var expected = num1 / num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void multiply(int num1, int num2) {
        var actual = service.multiply(num1, num2);
        var expected = num1 * num2;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void minus(int num1, int num2) {
        var actual = service.minus(num1, num2);
        var expected = num1 - num2;
        assertEquals(expected, actual);
    }
}