public class Employee {
    String name;
    int id;
    double salary;
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Rohan";
        emp.id = 1;
        emp.salary = 500000.0;
        emp.displayDetails();
    }
}
