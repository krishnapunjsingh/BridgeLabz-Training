interface VehicleDashboard {

    void displaySpeed();

    default void displayBatteryPercentage() {
        System.out.println("Battery information not available");
    }
}
