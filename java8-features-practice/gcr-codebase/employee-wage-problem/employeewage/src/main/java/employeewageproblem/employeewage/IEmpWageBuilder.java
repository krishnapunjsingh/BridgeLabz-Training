package employeewageproblem.employeewage;

public interface IEmpWageBuilder {
	public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours);

	public void computeWages();

	public int getTotalWage(String companyName);
}