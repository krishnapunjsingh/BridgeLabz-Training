interface Department{
    void assignDepartment(String departmentName);
    String getDepartmentdetails();
}
abstract class Employee{
    private String name;
    private String id;
    protected int baseSalary;
    private String department;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public int getSalary(){
        return baseSalary;
    }
    public void setSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }
    public void assignDepartment(String deptName){
        this.department = deptName;
    }
    public String getDepartment(){
        return department;
    }
    public Employee(String name, String id, int baseSalary){
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    abstract int calculateSalary();
    void displayDetails(){
        System.out.println("name: " + name);
        System.out.println("id: " + id);
        System.out.println("baseSalary: " + baseSalary);
    }
}

class partTimeEmployee extends Employee{
    int workHour;
    int hourRate;
    public partTimeEmployee(String name, String id, int workHour, int hourRate){
        super(name, id, 0);
        this.hourRate = hourRate;
        this.workHour = workHour;
    }
    public int calculateSalary(){
        return hourRate*workHour;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("workHours: " + workHour);
        System.out.println("hourrate: " + hourRate);
    }
}
class fullTimeEmployee extends Employee{
    public fullTimeEmployee(String name, String id, int baseSalary){
        super(name, id, baseSalary);
    }
    int calculateSalary(){
        return baseSalary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new fullTimeEmployee("Krishna ", "A101", 2000000);
        e1.assignDepartment("IT");
        Employee e2 = new partTimeEmployee("lakhan ", "A102", 4 , 10000);
        e2.assignDepartment("Machenical ");
        e1.displayDetails();
        int salary1 = e1.calculateSalary();
        System.out.println(salary1);
        e2.displayDetails();
        int salary2 = e2.calculateSalary();
        System.out.println(salary2);
    }
}
