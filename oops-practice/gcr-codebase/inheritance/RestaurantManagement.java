class Person{
    String name;
    String id;
    Person(String name , String id){
        this.name = name;
        this.id = id;
    }
    void displayDetails(){
        System.out.println("name: " + name);
        System.out.println("id: " + id);
    }
}
interface Worker{
    void performDuties();
}
class Chef extends Person implements  Worker{
    Chef(String name, String id){
        super(name, id);

    }
    public void performDuties(){
        System.out.println("Chef is preparing meals.");
    }
}
class Waiter extends Person implements Worker{

    public Waiter(String name, String id) {
        super(name, id);
    }
    public void performDuties(){
        System.out.println("Waiter is serving food to customers.");
    }
    
}
public class RestaurantManagement {
     public static void main(String[] args) {

        Worker chef = new Chef("Rahul", "101");
        Worker waiter = new Waiter("Amit", "102");
        ((Person) chef).displayDetails();
        chef.performDuties();
        ((Person) waiter).displayDetails();
        waiter.performDuties();


    }
}
