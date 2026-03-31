
import java.util.Scanner;

public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] heights = new double[11];
        double sum =0;
        for(int i=0;i<heights.length;i++){
            System.out.println("Enter height of player " + (i+1) );
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.print("Mean height of players is " + mean);
    }
}
