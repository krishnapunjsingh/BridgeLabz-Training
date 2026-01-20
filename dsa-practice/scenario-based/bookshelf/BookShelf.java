import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class BookShelf {

    private Map<String, LinkedList<Book>> catalog = new HashMap<>();

    private HashSet<String> isbnSet = new HashSet<>();

    public void addBook(String genre, Book book) {

        if (!isbnSet.add(book.getIsbn())) {
            System.out.println("Duplicate book not allowed: " + book.getIsbn());
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);

        System.out.println("Book added to genre: " + genre);
    }

    public void removeBook(String genre, String isbn) {

        LinkedList<Book> books = catalog.get(genre);
        if (books == null) {
            System.out.println("Genre not found.");
            return;
        }

        books.removeIf(book -> book.getIsbn().equals(isbn));
        isbnSet.remove(isbn);

        System.out.println("Book removed from genre: " + genre);
    }

    public void displayCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println(book);
            }
        }
    }
}
