
public class HotelBooking {
    String GuestName;
    String roomType;
    int night;

    public HotelBooking() {
        this.GuestName = "Default Guest";
        this.roomType = "Standard";
        this.night = 1;
    }
    
    HotelBooking(String GuestName, String roomType, int night) {
        this.GuestName = GuestName;
        this.roomType = roomType;
        this.night = night;
    }
    HotelBooking(HotelBooking hb){
        this.GuestName = hb.GuestName;
        this.roomType = hb.roomType;
        this.night = hb.night;
    }
    void displayDetails(){
        System.out.println("Guest Name: " + GuestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + night);
    }
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Krishna", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2);
        booking1.displayDetails();
        booking2.displayDetails();
        booking3.displayDetails();
    }
}
