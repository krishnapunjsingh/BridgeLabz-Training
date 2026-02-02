import java.util.ArrayList;

public class SuppressWarningDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // unchecked warning normally

        list.add("Java");
        list.add(100);   // mixed types allowed

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
