public class DashboardApp {

    public static void main(String[] args) {

        VehicleDashboard petrolCar = new PetrolCar();
        VehicleDashboard electricCar = new ElectricCar();

        petrolCar.displaySpeed();
        petrolCar.displayBatteryPercentage();   

        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage();
    }
}
