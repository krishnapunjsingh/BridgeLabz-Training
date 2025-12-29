import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class RohanLibraryReminderApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        int finePerDay = 5;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBook " + i + ":");

            System.out.print("Enter due date (yyyy-mm-dd): ");
            LocalDate dueDate = LocalDate.parse(sc.nextLine(), formatter);

            System.out.print("Enter return date (yyyy-mm-dd): ");
            LocalDate returnDate = LocalDate.parse(sc.nextLine(), formatter);

            long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);

            if (daysLate > 0) {
                long fine = daysLate * finePerDay;
                System.out.println("Returned late by " + daysLate + " days. Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine!");
            }
        }
    }
}
