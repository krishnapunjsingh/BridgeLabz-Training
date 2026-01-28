import java.util.*;

public class RestaurantReservationSystem {

    private Map<Integer, Table> tables = new HashMap<>();

    private List<Reservation> reservations = new ArrayList<>();

    public void addTable(int tableNumber, int capacity) {
        tables.put(tableNumber, new Table(tableNumber, capacity));
    }

    public void reserveTable(int tableNumber, String timeSlot)
            throws TableAlreadyReservedException {

        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber &&
                r.timeSlot.equals(timeSlot)) {

                throw new TableAlreadyReservedException(
                    "Table " + tableNumber + " is already reserved for " + timeSlot
                );
            }
        }

        reservations.add(new Reservation(tableNumber, timeSlot));
        System.out.println("Table " + tableNumber + " reserved for " + timeSlot);
    }

    public void cancelReservation(int tableNumber, String timeSlot) {
        Iterator<Reservation> it = reservations.iterator();

        while (it.hasNext()) {
            Reservation r = it.next();
            if (r.tableNumber == tableNumber &&
                r.timeSlot.equals(timeSlot)) {

                it.remove();
                System.out.println("Reservation cancelled for Table " +
                        tableNumber + " at " + timeSlot);
                return;
            }
        }

        System.out.println("No reservation found to cancel.");
    }

    public void showAvailableTables(String timeSlot) {
        System.out.println("Available tables for " + timeSlot + ":");

        for (Integer tableNo : tables.keySet()) {
            boolean reserved = false;

            for (Reservation r : reservations) {
                if (r.tableNumber == tableNo &&
                    r.timeSlot.equals(timeSlot)) {
                    reserved = true;
                    break;
                }
            }

            if (!reserved) {
                System.out.println("Table " + tableNo);
            }
        }
    }

    public static void main(String[] args) {
        RestaurantReservationSystem system =
                new RestaurantReservationSystem();

        system.addTable(1, 4);
        system.addTable(2, 6);
        system.addTable(3, 2);

        try {
            system.reserveTable(1, "7PM-8PM");
            system.reserveTable(2, "7PM-8PM");
            system.reserveTable(1, "7PM-8PM"); // ❌ double booking
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        system.showAvailableTables("7PM-8PM");

        system.cancelReservation(1, "7PM-8PM");

        system.showAvailableTables("7PM-8PM");
    }
}
