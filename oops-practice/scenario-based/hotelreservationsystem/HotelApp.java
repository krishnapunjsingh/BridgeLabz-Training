public class HotelApp {

    static void book(Room room) throws RoomNotAvailableException {
        if (!room.available)
            throw new RoomNotAvailableException("Room " + room.roomNo + " is not available");
        room.available = false;
        System.out.println("Room " + room.roomNo + " booked.");
    }

    static void checkout(Room room) {
        room.available = true;
        System.out.println("Room " + room.roomNo + " checked out.");
    }

    public static void main(String[] args) {
        try {
            // Room management (Create)
            Room r1 = new StandardRoom(101);
            Room r2 = new DeluxeRoom(201);

            // Guest
            Guest g1 = new Guest(1, "Krishna");

            // Reservation booking
            book(r1);

            // Check-in + Invoice (Seasonal pricing)
            Reservation res = new Reservation(r1, g1, 3, new SeasonalPricing());

            System.out.println("Guest: " + g1.name);
            System.out.println("Room: " + r1.getType());
            System.out.println("Invoice Amount: ₹" + res.generateInvoice());

            // Check-out
            checkout(r1);

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
