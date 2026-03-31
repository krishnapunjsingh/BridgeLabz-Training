
import java.util.Scanner;


public class MaxNumberOfHandShakes {
        public static int calculateHandShakes(int n){
        return ((n*(n-1))/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int totalHandShakes = calculateHandShakes(numberOfStudents);
        System.out.println("Total HandShakes "+ totalHandShakes);

    }
}
