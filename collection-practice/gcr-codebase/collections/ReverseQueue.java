import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        int size = queue.size();

        for (int i = 0; i < size; i++) {
            int x = queue.remove();
            queue.add(x);
        }

        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }

        System.out.println(queue);
    }
}
