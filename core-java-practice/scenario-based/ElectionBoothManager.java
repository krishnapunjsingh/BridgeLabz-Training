import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vote1 = 0, vote2 = 0, vote3 = 0;

        while (true) {

            System.out.print("Enter age (or -1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (age < 18) {
                System.out.println("Not eligible to vote.");
            } else {
                System.out.print("Vote (1-Candidate A, 2-Candidate B, 3-Candidate C): ");
                int vote = sc.nextInt();

                if (vote == 1)
                    vote1++;
                else if (vote == 2)
                    vote2++;
                else if (vote == 3)
                    vote3++;
                else
                    System.out.println("Invalid vote.");
            }
        }

        System.out.println("Candidate A: " + vote1);
        System.out.println("Candidate B: " + vote2);
        System.out.println("Candidate C: " + vote3);

    }
}
