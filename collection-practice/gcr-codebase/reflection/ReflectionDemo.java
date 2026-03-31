import java.lang.reflect.Field;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {

        Person person = new Person(25);
        Class<?> cls = person.getClass();
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);
        int oldAge = (int) field.get(person);
        System.out.println("Old Age: " + oldAge);
        field.set(person, 30);
        int newAge = (int) field.get(person);
        System.out.println("New Age: " + newAge);
    }
}
