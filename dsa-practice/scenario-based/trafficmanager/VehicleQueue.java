class VehicleQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(String vehicle) {
        if (size == capacity) {
            System.out.println("Queue Overflow! Cannot add " + vehicle);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = vehicle;
        size++;
        System.out.println(vehicle + " added to waiting queue");
    }

    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! No vehicles waiting");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % capacity;
        size--;
        return vehicle;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
