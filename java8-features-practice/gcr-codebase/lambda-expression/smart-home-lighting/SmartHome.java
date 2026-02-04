public class SmartHome {
    public static void main(String[] args) {
        SmartLightControll controller = new SmartLightControll(); 
        LightAction motionTriggered = () -> System.out.println("Light on at full brightness (Motion detected)");
        LightAction eveningTriggered = () -> System.out.println("Warm deam light on (Evening Move)");
        LightAction voiceTriggered = () -> System.out.println("Voice command received: Turn on the lights");
        controller.activate(motionTriggered);
        controller.activate(eveningTriggered);
        controller.activate(voiceTriggered);
    }
}
