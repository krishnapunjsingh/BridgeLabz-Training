public class Person {
    String name;
    int age;
    Person(int age, String name){ // Parameterized Constructor
        this.name = name;
        this.age = age;
    }
    Person(Person p){ // Copy Constructor
        this.name = p.name;
        this.age = p.age;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person p1 = new Person( 22 , "Krishna"); // Using Parameterized Constructor
        Person p2 = new Person(p1); // Using Copy Constructor
        p1.display();
        p2.display();
    }
}
