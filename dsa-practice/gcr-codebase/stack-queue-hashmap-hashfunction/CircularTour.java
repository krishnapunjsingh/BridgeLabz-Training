class PetrolPump {
    int petrol;
    int distance;

    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTour {

    static int findStartingPoint(PetrolPump[] pumps) {
        int balance = 0;
        int deficit = 0;
        int start = 0;

        for (int i = 0; i < pumps.length; i++) {
            balance += pumps[i].petrol - pumps[i].distance;

            if (balance < 0) {
                deficit += balance;
                balance = 0;
                start = i + 1;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        int start = findStartingPoint(pumps);

        if (start != -1) {
            System.out.println("Start at petrol pump: " + start);
        } else {
            System.out.println("No possible circular tour");
        }
    }
}
