
import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int smallest = number3;
        int largest = number3;
        if(number1 > largest){
            largest = number1;
        }
        if(number2 > largest){
            largest = number2;
        }
        if(number1 < smallest){
            smallest = number1;

        }
        if(number2 < smallest){
            smallest = number2;
        }
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();                          
        int n2 = sc.nextInt();                          
        int n3 = sc.nextInt(); 
        int [] arr = findSmallestAndLargest(n1, n2, n3);
        System.out.println("the samlest number is " + arr[0] + " and the largest is " + arr[1]);         

    }
}
