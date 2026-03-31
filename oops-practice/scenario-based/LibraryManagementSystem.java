public class LibraryManagementSystem {

    // Arrays to store book details
    static String[] titles = {
            "Java Programming",
            "Data Structures",
            "Python Basics"
    };

    static String[] authors = {
            "James Gosling",
            "Mark Weiss",
            "Guido van Rossum"
    };

    static boolean[] status = {
            true, false, true   // true = available, false = checked out
    };

    // Method to display all books
    static void displayBooks() {
        for (int i = 0; i < titles.length; i++) {
            System.out.println(
                titles[i] + " | " +
                authors[i] + " | " +
                (status[i] ? "Available" : "Checked Out")
            );
        }
    }

    // Method to search book by partial title
    static void searchBook(String keyword) {
        for (int i = 0; i < titles.length; i++) {
            if (titles[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(
                    titles[i] + " | " +
                    authors[i] + " | " +
                    (status[i] ? "Available" : "Checked Out")
                );
            }
        }
    }

    // Method to update book status (checkout / return)
    static void updateStatus(int index, boolean newStatus) {
        if (index >= 0 && index < status.length) {
            status[index] = newStatus;
        }
    }

    // Main method (testing)
    public static void main(String[] args) {

        System.out.println("All Books:");
        displayBooks();

        System.out.println("\nSearch Result (\"Java\"):");
        searchBook("Java");

        System.out.println("\nUpdating status of first book:");
        updateStatus(0, false); // checkout book

        System.out.println("\nBooks After Update:");
        displayBooks();
    }
}
