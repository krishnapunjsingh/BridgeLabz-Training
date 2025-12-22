
import java.util.Scanner;

public class ArrayIndexOutOfBound {
    public static void generateException(int [] arr){
        System.out.println(arr[arr.length]);
    }
    public static void handleException(int [] arr){
        try {
            System.out.print(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] arr = new int[length];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        try {
            generateException(arr);
        } catch (Exception e) {
            System.out.print("Exception " + e);
        }

        handleException(arr);
    }
}
