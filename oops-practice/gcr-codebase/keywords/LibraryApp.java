class Book {
    private static String libraryName = "Egmore Library";
    String title;    
    String author;    
    final String ISBN;
    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public static void displayLibraryName(){
        System.out.println("The library name is " + libraryName);
    }
    void displayDetails(){
        if(this instanceof Book){
            System.out.println("title: " + title);
            System.out.println("author: " + author);
            System.out.println("ISBN: " + ISBN);
        }
        else{
            System.out.println("Invalid Book instance. ");
        }
    }
}
public class LibraryApp{
    public static void main(String[] args) {
        Book b1 = new Book("Effective java" , "Joshua Bloch" , "978-0134685991");
        Book.displayLibraryName();
        b1.displayDetails();
        
    }
}
