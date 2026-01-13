class Roundabout {
    private VehicleNode tail = null;

    public void addVehicle(String vehicleNumber) {
        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(vehicleNumber + " entered roundabout");
    }

    public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode head = tail.next;

        if (head == tail) {
            System.out.println(head.vehicleNumber + " exited roundabout");
            tail = null;
        } else {
            System.out.println(head.vehicleNumber + " exited roundabout");
            tail.next = head.next;
        }
    }

    public void display() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        VehicleNode temp = tail.next;
        System.out.print("Roundabout Vehicles: ");
        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("(back to start)");
    }

    public boolean isEmpty() {
        return tail == null;
    }
}
