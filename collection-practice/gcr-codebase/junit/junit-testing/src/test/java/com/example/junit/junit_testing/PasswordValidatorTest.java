package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPasswords() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("StrongPass9"));
        assertTrue(validator.isValid("JavaRocks7"));
    }

    @Test
    void testInvalidPasswords() {
        // less than 8 characters
        assertFalse(validator.isValid("Pass1"));

        // no uppercase letter
        assertFalse(validator.isValid("password1"));

        // no digit
        assertFalse(validator.isValid("Password"));

        // null input
        assertFalse(validator.isValid(null));
    }
}
