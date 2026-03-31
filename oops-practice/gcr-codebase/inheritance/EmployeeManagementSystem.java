class Employee {
    String name;
    String Id;
    int salary;
    Employee(String name, String Id, int salary){
        this.name = name;
        this.Id = Id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + Id);
        System.out.println("Employee Salary: " + salary);
    }

}
class Manager extends Employee{
    int teamSize;
    Manager(String name, String Id, int salary, int teamSize){
        super(name, Id, salary);
        this.teamSize = teamSize;
    }
    void displayDetails(){
        System.out.println("Manager Details:");
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name, String Id, int salary, String programmingLanguage){
        super(name, Id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    void displayDetails(){
        System.out.println("Developer Details:");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee{
    String collegeName;
    Intern(String name, String Id, int salary, String collegeName){
        super(name, Id, salary);
        this.collegeName = collegeName;
    }
    void displayDetails(){
        System.out.println("Intern Details:");
        super.displayDetails();
        System.out.println("College Name: " + collegeName);
    }
}
class EmployeeManagementSystem{
    public static void main(String[] args) {
        Manager mgr = new Manager("mahaveer", "AB1" , 150000,30);
        mgr.displayDetails();
        System.out.println();

        Developer dev = new Developer("Arun","AB2", 100000, "java");
        dev.displayDetails();
        System.out.println();

        Intern intern = new Intern("harshit", "AB3", 50000,"GLA University");
        intern.displayDetails();    
    }
}