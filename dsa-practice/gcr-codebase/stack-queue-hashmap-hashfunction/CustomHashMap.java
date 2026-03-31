public class CustomHashMap {

    static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int SIZE = 10;
    private Node[] buckets;

    public CustomHashMap() {
        buckets = new Node[SIZE];
    }

    private int getIndex(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                head.value = value; 
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    public int get(int key) {
        int index = getIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = getIndex(key);
        Node head = buckets[index];
        Node prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        map.put(1, 100);
        map.put(2, 200);
        map.put(12, 300); 

        System.out.println(map.get(1));  
        System.out.println(map.get(2));  
        System.out.println(map.get(12)); 
        map.remove(2);
        System.out.println(map.get(2));   // -1
    }
}
