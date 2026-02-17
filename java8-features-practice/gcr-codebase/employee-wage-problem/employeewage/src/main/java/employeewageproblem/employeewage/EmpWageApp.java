package employeewageproblem.employeewage;

public class EmpWageApp {

	public static void main(String[] args) {
		EmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany("TCS", 20, 20, 100);
        builder.addCompany("Infosys", 25, 22, 120);

        builder.computeWages();

        System.out.println("TCS Total Wage: " +
                builder.getTotalWage("TCS"));

        System.out.println("Infosys Total Wage: " +
                builder.getTotalWage("Infosys"));
    }

	

}