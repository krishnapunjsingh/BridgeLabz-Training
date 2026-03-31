package employeewageproblem.employeewage;
import java.util.*;
public class CompanyEmpWage {
	private String companyName;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;

    private int totalWage;
    private List<Integer> dailyWages = new ArrayList<>();

    public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {

        if (!companyName.matches("^[A-Za-z ]+$")) {
            throw new IllegalArgumentException("Invalid Company Name (Regex Failed)");
        }

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getMaxWorkingDays() {
        return maxWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public List<Integer> getDailyWages() {
        return dailyWages;
    }
}