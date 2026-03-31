package com.example.junit.junit_testing;

public class UserRegistration {

    public static String registerUser(String username, String email, String password) {

        if (username == null || username.length() < 5) {
            throw new IllegalArgumentException("Invalid username");
        }

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Invalid password");
        }

        return "User registered successfully";
    }
}
