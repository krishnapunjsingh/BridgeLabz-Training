import java.util.Scanner;

public class CafeteriaMenuApp {

    static void displayMenu(String[] items) {
        System.out.println("----- Cafeteria Menu -----");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + " : " + items[i]);
        }
    }

    static String getItemByIndex(String[] items, int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        } else {
            return "Invalid selection";
        }
    }

    public static void main(String[] args) {

        // Store 10 items
        String[] menuItems = {"Veg Sandwich","Cheese Burger","Pasta","Pizza Slice","French Fries","Samosa","Idli","Dosa","Cold Coffee","Tea"
        };

        Scanner sc = new Scanner(System.in);

        displayMenu(menuItems);

        System.out.print("Enter item index to order: ");
        int choice = sc.nextInt();

        String selectedItem = getItemByIndex(menuItems, choice);

        if (!selectedItem.equals("Invalid selection")) {
            System.out.println("You ordered: " + selectedItem);
        } else {
            System.out.println("Please select a valid menu number.");
        }

        sc.close();
    }
}
