class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnaroundTime;
    ProcessNode next;

    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private ProcessNode head;
    private ProcessNode tail;
    private int timeQuantum;
    private int currentTime = 0;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode node = new ProcessNode(pid, burstTime, priority);
        if (head == null) {
            head = tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    public void removeProcess(ProcessNode prev, ProcessNode curr) {
        if (curr == head && curr == tail) {
            head = tail = null;
        } else if (curr == head) {
            head = head.next;
            tail.next = head;
        } else if (curr == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = curr.next;
        }
    }

    public void simulate() {
        if (head == null)
            return;

        ProcessNode curr = head;
        ProcessNode prev = tail;

        while (head != null) {
            if (curr.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= execTime;
                currentTime += execTime;

                ProcessNode temp = head;
                do {
                    if (temp != curr && temp.remainingTime > 0)
                        temp.waitingTime += execTime;
                    temp = temp.next;
                } while (temp != head);

                if (curr.remainingTime == 0) {
                    curr.turnaroundTime = currentTime;
                    ProcessNode next = curr.next;
                    removeProcess(prev, curr);
                    curr = next;
                    displayQueue();
                    continue;
                }
            }
            prev = curr;
            curr = curr.next;
            displayQueue();
        }
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue Empty");
            return;
        }
        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("[P" + temp.pid + " RT:" + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public void calculateAverages(ProcessNode[] processes) {
        double totalWT = 0;
        double totalTAT = 0;

        for (ProcessNode p : processes) {
            totalWT += p.waitingTime;
            totalTAT += p.turnaroundTime;
        }

        System.out.println("Average Waiting Time: " + (totalWT / processes.length));
        System.out.println("Average Turnaround Time: " + (totalTAT / processes.length));
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);

        ProcessNode[] processes = { new ProcessNode(1, 10, 1), new ProcessNode(2, 5, 2), new ProcessNode(3, 8, 1)
        };

        for (ProcessNode p : processes)
            scheduler.addProcess(p.pid, p.burstTime, p.priority);

        scheduler.simulate();
        scheduler.calculateAverages(processes);
    }
}
