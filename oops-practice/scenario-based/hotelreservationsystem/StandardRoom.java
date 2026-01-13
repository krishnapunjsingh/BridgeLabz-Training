class StandardRoom extends Room {
    StandardRoom(int roomNo) {
        super(roomNo, 2000);
    }

    String getType() {
        return "Standard Room";
    }
}

