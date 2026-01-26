import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + department + " | " + salary;
    }
}

public class EmployeeSerialization {

    static void serializeEmployees(List<Employee> employees) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("employees.dat"))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }
    }

    static void deserializeEmployees() {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("employees.dat"))) {

            List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employees:");
            for (Employee e : employees) {
                System.out.println(e);
            }

        } catch (IOException e) {
            System.out.println("IO error during deserialization.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 50000));
        employees.add(new Employee(102, "Bob", "IT", 65000));
        employees.add(new Employee(103, "Carol", "Finance", 60000));

        serializeEmployees(employees);
        deserializeEmployees();
    }
}
