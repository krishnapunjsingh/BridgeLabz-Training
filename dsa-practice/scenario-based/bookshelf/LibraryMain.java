public class LibraryMain {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", new Book("1984", "George Orwell", "ISBN101"));
        shelf.addBook("Fiction", new Book("Animal Farm", "George Orwell", "ISBN102"));
        shelf.addBook("Science", new Book("Brief History of Time", "Stephen Hawking", "ISBN201"));

        shelf.addBook("Fiction", new Book("1984", "George Orwell", "ISBN101"));

        System.out.println("\n--- Library Catalog ---");
        shelf.displayCatalog();

        shelf.removeBook("Fiction", "ISBN102");

        System.out.println("\n--- Updated Catalog ---");
        shelf.displayCatalog();
    }
}
