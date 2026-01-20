public class ParcelMain {

    public static void main(String[] args) {

        ParcelRoute route = new ParcelRoute();

        route.initializeRoute();

        System.out.println("Initial Parcel Tracking:");
        route.trackParcel();

        System.out.println("\nAdding Custom Checkpoint:");
        route.addCheckpoint("Shipped", "Warehouse Scan");

        System.out.println("\nUpdated Parcel Tracking:");
        route.trackParcel();
    }
}
