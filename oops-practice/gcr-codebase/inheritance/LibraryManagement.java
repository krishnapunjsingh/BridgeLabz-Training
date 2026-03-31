class Book{
    String title;
    int publishedYear;
    Book(String title, int publishedYear){
        this.title = title;
        this.publishedYear = publishedYear;
    }
    void displayInfo(){
        System.out.println("title: " + title);
        System.out.println("publishedYear: " + publishedYear);
    }
}
class Author extends Book{
    String name;
    String bio;
    Author(String title, int publishedyear, String name, String bio){
        super(title, publishedyear);
        this.name = name;
        this.bio = bio; 
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }

}
public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author(
            "Effective Java",
            2018,
            "Joshua Bloch",
            "Java expert and author"
        );

        author.displayInfo();
    }
}

