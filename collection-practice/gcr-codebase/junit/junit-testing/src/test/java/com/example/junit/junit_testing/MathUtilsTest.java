package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    void testDivideByZeroThrowsException() {

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> mathUtils.divide(10, 0)
        );

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testDivideNormally() {
        assertEquals(5, mathUtils.divide(10, 2));
    }
}
