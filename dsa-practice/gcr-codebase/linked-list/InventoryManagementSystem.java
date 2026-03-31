class ItemNode {
    String name;
    int id;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    private ItemNode head;

    public void addAtBeginning(String name, int id, int qty, double price) {
        ItemNode node = new ItemNode(name, id, qty, price);
        node.next = head;
        head = node;
    }

    public void addAtEnd(String name, int id, int qty, double price) {
        ItemNode node = new ItemNode(name, id, qty, price);
        if (head == null) {
            head = node;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    public void addAtPosition(int pos, String name, int id, int qty, double price) {
        if (pos <= 1 || head == null) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;
        ItemNode node = new ItemNode(name, id, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    public void removeById(int id) {
        if (head == null)
            return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            if (temp.next.id == id) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    public void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id)
                displayItem(temp);
            temp = temp.next;
        }
    }

    public void searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                displayItem(temp);
            temp = temp.next;
        }
    }

    public double totalInventoryValue() {
        double sum = 0;
        ItemNode temp = head;
        while (temp != null) {
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        return sum;
    }

    public void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
    }

    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
    }

    private ItemNode mergeSort(ItemNode node, boolean asc, boolean byName) {
        if (node == null || node.next == null)
            return node;
        ItemNode mid = getMiddle(node);
        ItemNode nextMid = mid.next;
        mid.next = null;
        ItemNode left = mergeSort(node, asc, byName);
        ItemNode right = mergeSort(nextMid, asc, byName);
        return merge(left, right, asc, byName);
    }

    private ItemNode merge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        boolean condition;
        if (byName)
            condition = asc ? a.name.compareToIgnoreCase(b.name) <= 0
                            : a.name.compareToIgnoreCase(b.name) > 0;
        else
            condition = asc ? a.price <= b.price : a.price > b.price;

        ItemNode result;
        if (condition) {
            result = a;
            result.next = merge(a.next, b, asc, byName);
        } else {
            result = b;
            result.next = merge(a, b.next, asc, byName);
        }
        return result;
    }

    private ItemNode getMiddle(ItemNode node) {
        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void displayAll() {
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(ItemNode i) {
        System.out.println("ID: " + i.id + ", Name: " + i.name +", Qty: " + i.quantity + ", Price: " + i.price);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd("Laptop", 101, 5, 55000);
        inventory.addAtBeginning("Mouse", 102, 20, 500);
        inventory.addAtPosition(2, "Keyboard", 103, 10, 1500);

        inventory.displayAll();

        inventory.updateQuantity(101, 7);
        inventory.searchByName("Mouse");

        System.out.println("Total Inventory Value: " + inventory.totalInventoryValue());

        inventory.sortByPrice(true);
        inventory.displayAll();

        inventory.removeById(102);
        inventory.displayAll();
    }
}
