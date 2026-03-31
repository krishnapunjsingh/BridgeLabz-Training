class Reservation {
    Room room;
    Guest guest;
    int days;
    PricingStrategy pricing;

    Reservation(Room room, Guest guest, int days, PricingStrategy pricing) {
        this.room = room;
        this.guest = guest;
        this.days = days;
        this.pricing = pricing;
    }

    double generateInvoice() {
        return pricing.calculate(room.basePrice, days);
    }
}
