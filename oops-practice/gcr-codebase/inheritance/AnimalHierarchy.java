class Animal{
    String name;
    int age;
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void makeSound(){
        System.out.println("Animal can make sound");
    }
}
class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);
    }
    void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }
    void makeSound(){
        System.out.println("cat meows");
    }
}
class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);
    }
    void makeSound(){
        System.out.println("Bird chirps");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal myDog = new Dog("bruce", 7);
        Animal myCat = new Cat("pussy" , 5);
        Animal myBird = new Bird("Lucky" , 1);

        myDog.makeSound(); // Output: Dog barks
        myCat.makeSound(); // Output: Cat meows
        myBird.makeSound(); // Output: Bird chirps
    }
}
