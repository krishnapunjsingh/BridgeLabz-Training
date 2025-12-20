
import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ages = new int[10];
        for(int i=0;i<ages.length;i++){
            System.out.println("Enter age of student " + (i+1) );
            ages[i] = sc.nextInt();
        }
        for(int i=0;i<ages.length;i++){
            if(ages[i]<=0){
                System.out.println("Invalid age ");
            }
            else if(ages[i]>=18){
                System.out.println("Student " + (i+1) + " is eligible for vote");
            }
            else{
                System.out.println("Student " + (i+1) + " is not eligible for vote");
            }
        }

    }
}
