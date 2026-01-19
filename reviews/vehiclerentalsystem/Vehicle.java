public class Vehicle {
    protected String name;
    protected String id;

    Vehicle(String name, String id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Vehicle Name: " + name + ", Vehicle ID: " + id);
    }
}
