import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)              
@interface Author {
    String name();
}

@Author(name = "Author Name")
class Book {
}

public class AuthorDemo {
    public static void main(String[] args) {
        Class<Book> cls = Book.class;
        if(cls.isAnnotationPresent(Author.class)){
            Author author = cls.getAnnotation(Author.class);
            System.out.println(author.name());
        }
    }
}

