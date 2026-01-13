class DeluxeRoom extends Room {
    DeluxeRoom(int roomNo) {
        super(roomNo, 4000);
    }

    String getType() {
        return "Deluxe Room";
    }
}
