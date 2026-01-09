class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskCircularLinkedList {
    private TaskNode head;
    private TaskNode current;

    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeByTaskId(int id) {
        if (head == null)
            return;

        TaskNode curr = head;
        TaskNode prev = null;

        do {
            if (curr.taskId == id) {
                if (curr == head) {
                    TaskNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    if (head.next == head) {
                        head = null;
                        current = null;
                    } else {
                        temp.next = head.next;
                        head = head.next;
                        current = head;
                    }
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public void viewCurrentAndMoveNext() {
        if (current == null)
            return;

        displayTask(current);
        current = current.next;
    }

    public void displayAll() {
        if (head == null)
            return;

        TaskNode temp = head;
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null)
            return;

        TaskNode temp = head;
        do {
            if (temp.priority == priority) {
                displayTask(temp);
            }
            temp = temp.next;
        } while (temp != head);
    }

    private void displayTask(TaskNode t) {
        System.out.println("ID: " + t.taskId +
                ", Name: " + t.taskName +
                ", Priority: " + t.priority +
                ", Due Date: " + t.dueDate);
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtBeginning(1, "Design Module", 1, "2026-01-15");
        scheduler.addAtEnd(2, "Code Review", 2, "2026-01-18");
        scheduler.addAtPosition(2, 3, "Testing", 1, "2026-01-20");

        scheduler.displayAll();

        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(2);

        scheduler.displayAll();
    }
}
