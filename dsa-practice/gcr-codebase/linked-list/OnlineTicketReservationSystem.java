class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketCircularLinkedList {
    private TicketNode head;
    private TicketNode tail;

    public void addTicket(int id, String customer, String movie, String seat, String time) {
        TicketNode node = new TicketNode(id, customer, movie, seat, time);
        if (head == null) {
            head = tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    public void removeTicket(int id) {
        if (head == null)
            return;

        TicketNode curr = head;
        TicketNode prev = tail;

        do {
            if (curr.ticketId == id) {
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
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public void displayTickets() {
        if (head == null)
            return;

        TicketNode temp = head;
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByCustomer(String name) {
        if (head == null)
            return;

        TicketNode temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(name))
                displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByMovie(String movie) {
        if (head == null)
            return;

        TicketNode temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movie))
                displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    public int totalTickets() {
        if (head == null)
            return 0;

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    private void displayTicket(TicketNode t) {
        System.out.println("TicketID: " + t.ticketId +", Customer: " + t.customerName +", Movie: " + t.movieName +", Seat: " + t.seatNumber +", Time: " + t.bookingTime
        );
    }
}

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        TicketCircularLinkedList tickets = new TicketCircularLinkedList();

        tickets.addTicket(101, "Alice", "Inception", "A10", "10:30 AM");
        tickets.addTicket(102, "Bob", "Avatar", "B12", "11:00 AM");
        tickets.addTicket(103, "Charlie", "Inception", "C5", "11:15 AM");

        tickets.displayTickets();

        System.out.println("Total Tickets: " + tickets.totalTickets());

        tickets.searchByCustomer("Alice");
        tickets.searchByMovie("Inception");

        tickets.removeTicket(102);

        tickets.displayTickets();
    }
}
