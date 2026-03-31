
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String [] array = new String[number];
        for(int i=0;i<number;i++){
            if((i+1)%3==0 && (i+1)%5==0){
                array[i] = "FizzBuzz";
            } else if((i+1)%3 == 0){
                array[i] = "Fizz";
            }else if((i+1)%5 == 0){
                array[i] = "Buzz";
            }else {
                array[i] = Integer.toString(i+1);
            }
        }
        for(int i=0;i<number;i++){
            System.out.println("Position " + (i+1) + " = " + array[i]);
        }
    }
}
