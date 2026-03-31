import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", "IT", 50000),
                new Employee("Anita", "HR", 40000),
                new Employee("Kumar", "IT", 60000),
                new Employee("Priya", "HR", 45000),
                new Employee("Suresh", "Finance", 55000)
        );

        // Group by department and calculate average salary
        Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy( Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " : " + avgSalary));
    }
}
