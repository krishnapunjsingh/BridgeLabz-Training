public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378.0; 
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume of the Earth in cubic kilometers is " + volume + " and cubic miles is " + (volume * 0.239912));
    }
}
