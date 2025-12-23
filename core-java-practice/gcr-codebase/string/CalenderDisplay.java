import java.util.Scanner;

public class CalenderDisplay {

    static String[] months = { "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December" };

    static int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2) { 
            return isLeapYear(year) ? 29 : 28;
        } else {
            return daysInMonth[month - 1];
        }
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        int d = 1; 
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;

        return d0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.println("\n   " + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int totalDays = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); 
        }

        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); 
            }
        }

        scanner.close();
    }
}
