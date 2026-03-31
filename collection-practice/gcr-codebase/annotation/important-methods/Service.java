public class Service {

    @ImportantMethod
    public void processOrder() {
        System.out.println("Processing order...");
    }

    @ImportantMethod(level = "LOW")
    public void logActivity() {
        System.out.println("Logging activity...");
    }

    public void helperMethod() {
        System.out.println("Helper method");
    }
}
