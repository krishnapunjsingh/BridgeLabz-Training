// Parent class
class Book {

    // Access modifiers
    public String ISBN;        // public
    protected String title;    // protected
    private String author;     // private

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for author (private variable)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author (private variable)
    public String getAuthor() {
        return author;
    }
}

// Child class
class EBook extends Book {

    double fileSize; // in MB

    // Constructor
    EBook(String ISBN, String title,
          String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Display method
    void displayDetails() {
        System.out.println("ISBN: " + ISBN);           // public
        System.out.println("Title: " + title);         // protected
        System.out.println("Author: " + getAuthor());  // private via getter
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class
public class LibraryApp {
    public static void main(String[] args) {

        EBook ebook = new EBook(
                "978-0135166307",
                "Effective Java",
                "Joshua Bloch",
                5.2
        );

        ebook.displayDetails();

        // Modify author using setter
        ebook.setAuthor("J. Bloch");

        System.out.println("\nAfter Author Update:");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
