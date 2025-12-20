
import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int [] multiplicationTable = new int[4];
        for(int i=6;i<=9;i++){
            multiplicationTable[i-6] = number*i;
        }
        for(int i=0;i<multiplicationTable.length;i++){
            System.out.println(number + " * " + (i+6) + " = " + multiplicationTable[i]);
        }
    }
}
