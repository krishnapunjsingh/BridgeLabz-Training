public class CircularBuffer {

    private int[] buffer;
    private int size;
    private int head = 0;
    private int count = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    void insert(int value) {
        buffer[head] = value;
        head = (head + 1) % size;
        if (count < size) {
            count++;
        }
    }

    void display() {
        for (int i = 0; i < count; i++) {
            int index = (head - count + i + size) % size;
            System.out.print(buffer[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();

        cb.insert(4);
        cb.display();
    }
}
