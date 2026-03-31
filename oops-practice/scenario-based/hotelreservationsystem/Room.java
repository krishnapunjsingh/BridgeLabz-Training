abstract class Room {
    int roomNo;
    double basePrice;
    boolean available = true;

    Room(int roomNo, double basePrice) {
        this.roomNo = roomNo;
        this.basePrice = basePrice;
    }

    abstract String getType();
}

