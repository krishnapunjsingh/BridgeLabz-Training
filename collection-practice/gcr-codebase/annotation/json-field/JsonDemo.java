public class JsonDemo {
    public static void main(String[] args) {

        User user = new User("Krishnam", 25, "secret123");

        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
