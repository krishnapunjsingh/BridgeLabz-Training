package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void testValidUserRegistration() {
        String result = UserRegistration.registerUser(
                "krishna",
                "krishna@gmail.com",
                "password123"
        );
        assertEquals("User registered successfully", result);
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser(
                    "abc",
                    "abc@gmail.com",
                    "password123"
            );
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser(
                    "krishna",
                    "krishnagmail.com",
                    "password123"
            );
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser(
                    "krishna",
                    "krishna@gmail.com",
                    "pass"
            );
        });
    }

    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser(
                    null,
                    null,
                    null
            );
        });
    }
}
