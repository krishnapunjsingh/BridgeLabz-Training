import java.util.Iterator;
import java.util.LinkedList;

public class NthFromEnd {

    public static String findNthFromEnd(LinkedList<String> list, int n) {
        if (list == null || n <= 0) {
            return null;
        }

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                return null; 
            }
            fast.next();
        }

        String result = null;
        while (fast.hasNext()) {
            fast.next();
            result = slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        System.out.println(findNthFromEnd(list, n)); 
    }
}
