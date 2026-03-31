import java.util.Scanner;

public class InvoiceGenerator {
    static String[] parseInvoice(String input) {
        return input.split(",");
    }

    static int getTotalAmount(String[] tasks) {
        int total = 0;
        for (String task : tasks) {
            String[] parts = task.split("-");
            String amountPart = parts[1].trim();   // "3000 INR"
            String amount = amountPart.split(" ")[0]; // "3000"
            total += Integer.parseInt(amount);
        }
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter invoice details:");
        System.out.println("Example: Logo Design - 3000 INR, Web Page - 4500 INR");
        String input = sc.nextLine();

        String[] tasks = parseInvoice(input);

        System.out.println("\nInvoice Details:");
        for (String task : tasks) {
            System.out.println(task.trim());
        }

        int totalAmount = getTotalAmount(tasks);
        System.out.println("\nTotal Invoice Amount: " + totalAmount + " INR");

    }
}
