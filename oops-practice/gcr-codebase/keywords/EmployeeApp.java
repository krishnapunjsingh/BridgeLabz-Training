class Employee {
    private static String companyName = "Tech Solutions Inc.";
    String name;
    String designation;
    final String ID;
    public static int totalEmployees = 0;
    public Employee(String name , String designation , String ID){
        this.ID = ID;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees(){
        System.out.println("Total Employees: " + totalEmployees);
    }
    public static void displayCompanyName(){
        System.out.println("Company Name: " + companyName);
    }
    void displayDetails(){
        if(this instanceof Employee){
            System.out.println("ID: " + ID);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
        else{
            System.out.println("Invalid Employee instance. ");
        }
    }
}
public class EmployeeApp{
    public static void main(String[] args) {
        Employee e1 = new Employee("Thamarai","Software Engineer","101");
        Employee e2 = new Employee("Rohan","Project Manager","102");
        Employee.displayTotalEmployees();
        Employee.displayCompanyName();
        e1.displayDetails();
        e2.displayDetails();
    }
}