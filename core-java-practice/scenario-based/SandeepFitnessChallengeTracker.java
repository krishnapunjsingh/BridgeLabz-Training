
import java.util.Scanner;

public class SandeepFitnessChallengeTracker {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] pushUps = new int[7];
        int totalPushUps = 0;
         int activeDays = 0;
        for(int i=0;i<7;i++){
            System.out.print("Enter push-ups for day " + (i+1) + ": ");
            pushUps[i] = sc.nextInt();
        }
        for(int count : pushUps){
            if(count == 0){
                continue;
            }
            totalPushUps += count;
            activeDays++;

        }
        double averagePushUps = (activeDays == 0) ? 0: (double) totalPushUps / activeDays;

        System.out.println("Total Push-ups: " + totalPushUps);
        System.out.println("Average Push-ups: " + averagePushUps);
    }
}