package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();   // runs BEFORE each test
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect(); // runs AFTER each test
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected());
    }

    @Test
    void testConnectionIsClosedAfterEach() {
        assertTrue(dbConnection.isConnected());
    }
}
