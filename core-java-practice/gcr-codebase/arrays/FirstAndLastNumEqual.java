
import java.util.Scanner;

public class FirstAndLastNumEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter number " + (i+1));
            numbers[i] = sc.nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] ==0 ){
                System.out.println("Number " + (i+1) + " is Zero");
            }
            else if(numbers[i] <0 ){
                System.out.println("Number " + (i+1) + " is Negative");
            }
            else{
                if(numbers[i] %2 == 0){
                    System.out.println("Number " + (i+1) + " is Positive Even");
                }
                else{
                    System.out.println("Number " + (i+1) + " is Positive Odd");     
                }
                
            }
        }
        if(numbers[0] == numbers[numbers.length -1 ]){
            System.out.println("First and Last numbers are equal");
        }
        else{
            System.out.println("First and Last numbers are not equal");
        }
    }
}
