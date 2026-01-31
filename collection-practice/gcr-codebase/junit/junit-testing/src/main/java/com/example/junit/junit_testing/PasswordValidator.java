package com.example.junit.junit_testing;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasMinLength = password.length() >= 8;

        return hasUppercase && hasDigit && hasMinLength;
    }
}
