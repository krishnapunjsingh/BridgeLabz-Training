import java.util.Random;
import java.util.Scanner;

public class EligibleForVote {

    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = r.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = ages[i] + "";

            if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Age\tCan Vote");
        System.out.println("--------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] result = checkVotingEligibility(ages);

        displayTable(result);
        sc.close();
    }
}
