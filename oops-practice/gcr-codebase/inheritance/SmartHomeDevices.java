class Device{
    String deviceId;
    String status;
    Device(String deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus(){
        System.out.println("device Id: " + deviceId);
        System.out.println("status: " + status);
    }
}
class Thermostat extends Device{
    int temperatureSetting;
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }
    void displayStatus(){
        super.displayStatus();
        System.out.println("temperature Set at: " + temperatureSetting);
    }
    
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH1001", "ON", 24);
        thermostat.displayStatus();
    }
}

    

