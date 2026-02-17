package employeewageproblem.employeewage;

import java.util.*;

public class EmpWageBuilder implements IEmpWageBuilder{
	private List<CompanyEmpWage> companies = new ArrayList<>();
    private Map<String, CompanyEmpWage> companyMap = new HashMap<>();

    @Override
    public void addCompany(String name, int wagePerHour, int days, int hours) {

        CompanyEmpWage company = new CompanyEmpWage(name, wagePerHour, days, hours);

        companies.add(company);
        companyMap.put(name, company);
    }

    @Override
    public void computeWages() {

        companies.forEach(company -> {

            int totalHours = 0;
            int totalDays = 0;

            while (totalHours < company.getMaxWorkingHours() && totalDays < company.getMaxWorkingDays()) {

                totalDays++;

                int empCheck = new Random().nextInt(3);

                int empHours;

                switch (empCheck) {
                    case 1: empHours = 8; break;  // Full Time
                    case 2: empHours = 4; break;  // Part Time
                    default: empHours = 0;        // Absent
                }

                totalHours += empHours;

                int dailyWage = empHours * company.getWagePerHour();
                company.getDailyWages().add(dailyWage);
            }

            int totalWage = company.getDailyWages()
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            company.setTotalWage(totalWage);
        });
    }

    @Override
    public int getTotalWage(String companyName) {

        CompanyEmpWage company = companyMap.get(companyName);

        if (company != null) {
            return company.getTotalWage();
        } else {
            return 0;
        }
    }
}