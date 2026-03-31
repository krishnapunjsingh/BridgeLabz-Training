package com.example.junit.junit_testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000.0); // initial balance
    }

    @Test
    void testDepositUpdatesBalance() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void testWithdrawUpdatesBalance() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Exception exception = assertThrows(
                IllegalStateException.class,
                () -> account.withdraw(1500.0)
        );

        assertEquals("Insufficient funds", exception.getMessage());
        assertEquals(1000.0, account.getBalance()); // balance unchanged
    }

    @Test
    void testInvalidDepositAmount() {
        assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(-100)
        );
    }

    @Test
    void testInvalidWithdrawalAmount() {
        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(0)
        );
    }
}
