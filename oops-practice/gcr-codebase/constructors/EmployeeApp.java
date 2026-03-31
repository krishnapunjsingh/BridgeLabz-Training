// Parent class
class Employee {

    // Access modifiers
    public int employeeID;          // public
    protected String department;    // protected
    private double salary;          // private

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Public method to access salary
    public double getSalary() {
        return salary;
    }
}

// Child class
class Manager extends Employee {

    String managerLevel;

    // Constructor
    Manager(int employeeID, String department,
            double salary, String managerLevel) {
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + employeeID);     // public
        System.out.println("Department: " + department);      // protected
        System.out.println("Salary: ₹" + getSalary());        // private via getter
        System.out.println("Manager Level: " + managerLevel);
    }
}

// Main class
public class EmployeeApp {
    public static void main(String[] args) {

        Manager mgr = new Manager(
                501, "IT", 75000, "Senior Manager"
        );

        mgr.displayDetails();

        // Modify salary using public method
        mgr.setSalary(85000);

        System.out.println("\nAfter Salary Update:");
        System.out.println("Updated Salary: ₹" + mgr.getSalary());
    }
}
