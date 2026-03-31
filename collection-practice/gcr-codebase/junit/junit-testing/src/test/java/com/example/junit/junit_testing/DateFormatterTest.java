package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    @Test
    void testValidDate() {
        assertEquals("25-12-2024",
                DateFormatter.formatDate("2024-12-25"));
    }

    @Test
    void testAnotherValidDate() {
        assertEquals("01-01-2023",
                DateFormatter.formatDate("2023-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("25-12-2024");
        });
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("2024-13-40");
        });
    }
}
