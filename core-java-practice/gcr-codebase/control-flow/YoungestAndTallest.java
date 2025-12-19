
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ages and the height of Amar");
        int amarAge = sc.nextInt();
        int amarHeight = sc.nextInt();
        System.out.println("Enter the ages and the height of Akbar");
        int akbarAge = sc.nextInt();
        int akbarHeight = sc.nextInt();
        System.out.println("Enter the ages and the height of Anthony");
        int anthonyAge = sc.nextInt();
        int anthonyHeight = sc.nextInt();
        // Finding the youngest
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is the youngest");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }
        // Finding the tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {   
            System.out.println("Amar is the tallest");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }   
    }
}
