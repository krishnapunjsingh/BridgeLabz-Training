import java.util.Arrays;
import java.util.Collections;
class Employees{
    String name;
    double salary;
    Employees(String name, double salary){
        this.name = name;
        this.salary = salary;   
    }
    public void display(){
        System.out.println("name of the employee: " + name);
        System.out.println("salary of the employees: " + salary);
    }

}
public class EmployeesSalary{
    public static void main(String[] args) {
        Employees[] employees = {
            new Employees("Yash", 50000),
            new Employees("siddharth", 75000),
            new Employees("Ankit", 60000),
            new Employees("Anuj", 76000),
            new Employees("Krishna", 50000)
        };

        double secondLargestSalary = Arrays.stream(employees)
            .map(e -> e.salary)
            .distinct()
            .sorted(Collections.reverseOrder())
            .skip(1)
            .findFirst()
            .orElse(0.0);

        System.out.println("Second Largest Salary: " + secondLargestSalary);
    }
}