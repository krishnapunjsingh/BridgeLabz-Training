
import java.util.Scanner;

public class OddAndEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input<= 0){
            System.out.println("Invalid Input");
            return;
        }
        int [] oddArrays = new int[input/2 + 1];
        int [] evenArrays = new int[input/2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;;
        for(int i=1;i<=input;i++){
            if(i % 2 == 0){
                evenArrays[evenIndex] = i;
                evenIndex++;
            }
            else {
                oddArrays[oddIndex] = i;
                oddIndex++;
            }
        }
        for(int i=0;i<oddIndex;i++){
            System.out.println("Odd Number: " + oddArrays[i]);
        }
        for(int i=0;i<evenIndex;i++){
            System.out.println("Even Number: " + evenArrays[i]);
        }

    }
}
