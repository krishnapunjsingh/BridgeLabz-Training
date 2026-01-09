class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean available;
    BookNode next;
    BookNode prev;

    BookNode(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

class LibraryDoublyLinkedList {
    private BookNode head;
    private BookNode tail;

    public void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        BookNode node = new BookNode(title, author, genre, id, available);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void addAtEnd(String title, String author, String genre, int id, boolean available) {
        BookNode node = new BookNode(title, author, genre, id, available);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void addAtPosition(int pos, String title, String author, String genre, int id, boolean available) {
        if (pos <= 1 || head == null) {
            addAtBeginning(title, author, genre, id, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            addAtEnd(title, author, genre, id, available);
        } else {
            BookNode node = new BookNode(title, author, genre, id, available);
            node.next = temp.next;
            node.prev = temp;
            temp.next.prev = node;
            temp.next = node;
        }
    }

    public void removeByBookId(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                    else
                        tail = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    public void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
            }
            temp = temp.next;
        }
    }

    public void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
            }
            temp = temp.next;
        }
    }

    public void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private void displayBook(BookNode b) {
        System.out.println( "ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author + ", Genre: " + b.genre + ", Available: " + b.available
        );
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtBeginning("1984", "George Orwell", "Dystopian", 1, true);
        library.addAtEnd("The Hobbit", "J.R.R. Tolkien", "Fantasy", 2, true);
        library.addAtPosition(2, "Clean Code", "Robert Martin", "Programming", 3, false);

        library.displayForward();
        System.out.println("Total Books: " + library.countBooks());

        library.searchByAuthor("George Orwell");
        library.updateAvailability(3, true);

        library.displayReverse();

        library.removeByBookId(1);
        library.displayForward();
    }
}
