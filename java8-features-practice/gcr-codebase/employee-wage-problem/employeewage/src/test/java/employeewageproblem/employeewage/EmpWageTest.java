package employeewageproblem.employeewage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EmpWageTest {
	
	@Test
    void testTotalWage() {

        EmpWageBuilder builder = new EmpWageBuilder();
        builder.addCompany("TestCompany", 20, 20, 100);
        builder.computeWages();

        int wage = builder.getTotalWage("TestCompany");

        assertTrue(wage >= 0);
    }
}
