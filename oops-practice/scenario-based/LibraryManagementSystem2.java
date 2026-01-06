import java.util.ArrayList;

public class LibraryManagementSystem2 {

    static class BookNotAvailableException extends Exception {
        BookNotAvailableException(String msg) {
            super(msg);
        }
    }

    static class Book {
        String title;
        String author;
        boolean available;

        Book(String title, String author, boolean available) {
            this.title = title;
            this.author = author;
            this.available = available;
        }
    }

    ArrayList<Book> bookList = new ArrayList<>();

    void addBooks(Book[] books) {
        for (Book b : books) {
            bookList.add(b);
        }
    }

    void searchBook(String keyword) {
        boolean found = false;

        for (Book b : bookList) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                displayBook(b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    void displayBook(Book b) {
        System.out.println(
            "Title: " + b.title +
            ", Author: " + b.author +
            ", Status: " + (b.available ? "Available" : "Checked Out")
        );
    }

    void checkoutBook(String title)
            throws BookNotAvailableException {

        for (Book b : bookList) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.available) {
                    throw new BookNotAvailableException(
                        "Book is not available"
                    );
                }
                b.available = false;
                System.out.println("Book checked out successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public static void main(String[] args) {

        LibraryManagementSystem2 library =
                new LibraryManagementSystem2();

        Book[] books = {
            new Book("Java Programming", "James Gosling", true),
            new Book("Data Structures", "Mark Allen", true),
            new Book("Operating System", "Silberschatz", false)
        };

        library.addBooks(books);

        System.out.println("Search result:");
        library.searchBook("Java");

        try {
            System.out.println("\nChecking out book:");
            library.checkoutBook("Operating System");

        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAfter checkout:");
        library.searchBook("Operating");
    }
}
