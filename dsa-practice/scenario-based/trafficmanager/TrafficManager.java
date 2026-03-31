public class TrafficManager {
    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        VehicleQueue waitingQueue = new VehicleQueue(3);

        waitingQueue.enqueue("KA01AB1234");
        waitingQueue.enqueue("KA02CD5678");
        waitingQueue.enqueue("KA03EF9999");
        waitingQueue.enqueue("KA04GH1111"); 

        while (!waitingQueue.isEmpty()) {
            String vehicle = waitingQueue.dequeue();
            if (vehicle != null) {
                roundabout.addVehicle(vehicle);
            }
        }

        roundabout.display();

        roundabout.removeVehicle();
        roundabout.display();

        roundabout.removeVehicle();
        roundabout.removeVehicle();
        roundabout.removeVehicle(); 
    }
}
