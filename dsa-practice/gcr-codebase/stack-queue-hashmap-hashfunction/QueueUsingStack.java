import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }

    int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }

    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();

        q.enqueue(2);
        q.enqueue(10);
        q.enqueue(5);
        q.enqueue(17);

        System.out.println("Front element: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front element: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());

        q.enqueue(14);

        System.out.println("Front element: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front element: " + q.peek());
    }
}
