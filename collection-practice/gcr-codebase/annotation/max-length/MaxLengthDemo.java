public class MaxLengthDemo {
    public static void main(String[] args) {

        User user1 = new User("Krishna");  
        System.out.println("User created successfully");

        User user2 = new User("VeryLongUsername"); // ❌ Exception
    }
}
