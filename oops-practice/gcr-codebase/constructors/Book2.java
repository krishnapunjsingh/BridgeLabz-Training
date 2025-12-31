class Book2 {
    String title;
    String author;
    double price;
    boolean isAvailable;

    // Constructor
    Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Book is available initially
    }

    // Method to borrow a book
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book is already borrowed.");
        }
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + isAvailable);
    }
    public static void main(String[] args) {
        Book2 book = new Book2("The Alchemist", "Paulo Coelho", 300.0);
        book.displayDetails();
        book.borrowBook();
        book.displayDetails();
        book.borrowBook();
    }
}
