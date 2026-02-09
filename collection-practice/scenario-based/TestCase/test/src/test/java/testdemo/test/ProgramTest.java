package testdemo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ProgramTest {
	@Test
    public void Test_Deposit_ValidAmount() throws Exception {
        Program account = new Program(1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.0);
    }

    @Test
    public void Test_Deposit_NegativeAmount() {
        Program account = new Program(1000.0);

        Exception exception = assertThrows(
                Exception.class,
                () -> account.deposit(-200.0)
        );

        assertEquals("Deposit amount cannot be negative", exception.getMessage());
    }

    @Test
    public void Test_Withdraw_ValidAmount() throws Exception {
        Program account = new Program(1000.0);
        account.withdraw(400.0);
        assertEquals(600.0, account.getBalance(), 0.0);
    }

    @Test
    public void Test_Withdraw_InsufficientFunds() {
        Program account = new Program(500.0);

        Exception exception = assertThrows(
                Exception.class,
                () -> account.withdraw(800.0)
        );

        assertEquals("Insufficient funds.", exception.getMessage());
    }
}
